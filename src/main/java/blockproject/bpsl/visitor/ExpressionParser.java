package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLLexer;
import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Struct;
import blockproject.bpsl.ast.expr.ArraySubscript;
import blockproject.bpsl.ast.expr.BinaryExpr;
import blockproject.bpsl.ast.expr.DoubleLitteral;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.FloatLitteral;
import blockproject.bpsl.ast.expr.FunctionCall;
import blockproject.bpsl.ast.expr.Identifier;
import blockproject.bpsl.ast.expr.IntegerLitteral;
import blockproject.bpsl.ast.expr.MemberAccess;
import blockproject.bpsl.ast.expr.MemberFunctionCall;
import blockproject.bpsl.ast.expr.PrimaryExpr;
import blockproject.bpsl.ast.expr.StringLitteral;
import blockproject.bpsl.ast.expr.UnaryExpr;

public class ExpressionParser
{
    private static ArraySubscript parseSubscript(BPSLParser.ExprContext ctx, Scope scope)
    {
        ArraySubscript sub = new ArraySubscript();

        sub.array = parseExpr(ctx.expr(0), scope);
        sub.index = parseExpr(ctx.expr(1), scope);
        sub.typeName = sub.array.typeName;
        return (sub);
    }

    private static MemberAccess parseMemberAccess(BPSLParser.ExprContext ctx, Scope scope)
    {
        MemberAccess acc = new MemberAccess();

        acc.data = parseExpr(ctx.expr(0), scope);
        if (scope.resolve(acc.data.typeName) == null
            || (!(scope.resolve(acc.data.typeName) instanceof Class) && !(scope.resolve(acc.data.typeName) instanceof Struct)))
            Scope.Error(ctx, "Attempt to access attribute on undefined type '" + acc.data.typeName + "'");
        acc.name = ctx.IDENTIFIER().getText();
        if (scope.resolve(acc.data.typeName) instanceof Struct)
        {
            Struct st = (Struct) scope.resolve(acc.data.typeName);
            if (st.findAttributeByName(acc.name) == null)
                Scope.Error(ctx, "Attempt to access undefined attribute '" + acc.data.typeName + "::" + acc.name + "'");
            acc.typeName = st.findAttributeByName(acc.name).type;
        }
        else
        {
            Class cl = (Class) scope.resolve(acc.data.typeName);
            if (cl.findAttributeByName(acc.name) == null)
                Scope.Error(ctx, "Attempt to access undefined attribute '" + acc.data.typeName + "::" + acc.name + "'");
            acc.typeName = cl.findAttributeByName(acc.name).type;
        }
        return (acc);
    }

    private static MemberFunctionCall parseMemberFunctionCall(BPSLParser.ExprContext ctx, Scope scope)
    {
        MemberFunctionCall fc = new MemberFunctionCall();

        fc.data = parseExpr(ctx.expr(0), scope);
        if (scope.resolve(fc.data.typeName) == null || !(scope.resolve(fc.data.typeName) instanceof Class))
            Scope.Error(ctx, "Attempt to call function on undefined type '" + fc.data.typeName + "'");
        Class cl = (Class) scope.resolve(fc.data.typeName);
        fc.name = ctx.functionCall().name.getText();
        if (cl.findFunctionByName(fc.name) == null)
            Scope.Error(ctx, "Attempt to call undefined function '" + fc.data.typeName + "::" + fc.name + "'");
        fc.typeName = cl.findFunctionByName(fc.name).typeName.type;
        for (int i = 0 ; i < ctx.functionCall().expr().size() ; ++i)
            fc.parameters.add(parseExpr(ctx.functionCall().expr(i), scope));
        return (fc);
    }

    private static FunctionCall parseFunctionCall(BPSLParser.FunctionCallContext ctx, Scope scope)
    {
        FunctionCall fc = new FunctionCall();

        fc.name = ctx.name.getText();
        if (scope.resolve(fc.name) == null)
            Scope.Error(ctx, "Attempt to call undefined function '" + fc.name + "'");
        fc.typeName = scope.resolveTypeName(fc.name);
        for (int i = 0 ; i < ctx.expr().size() ; ++i)
            fc.parameters.add(parseExpr(ctx.expr(i), scope));
        return (fc);
    }

    private static PrimaryExpr parsePrimary(BPSLParser.ExprContext ctx, Scope scope)
    {
        PrimaryExpr expr = new PrimaryExpr();

        expr.expr = parseExpr(ctx.expr(0), scope);
        expr.typeName = expr.expr.typeName;
        return (expr);
    }

    private static Expr parseLitteralOrID(BPSLParser.ExprContext ctx, Scope scope)
    {
        Expr ex = null;

        if (ctx.L_INT() != null)
            ex = new IntegerLitteral(Integer.parseInt(ctx.L_INT().getText()));
        else if (ctx.L_FLOAT() != null)
            ex = new FloatLitteral(Float.parseFloat(ctx.L_FLOAT().getText()));
        else if (ctx.L_DOUBLE() != null)
            ex = new DoubleLitteral(Double.parseDouble(ctx.L_DOUBLE().getText()));
        else if (ctx.L_STRING() != null)
            ex = new StringLitteral(ctx.L_STRING().getText());
        else
        {
            ex = new Identifier(ctx.IDENTIFIER().getText());
            if (scope.resolve(ctx.IDENTIFIER().getText()) == null)
                Scope.Error(ctx, "Use of undeclared identifier '" + ctx.IDENTIFIER().getText() + "'");
            ex.typeName = scope.resolveTypeName(ctx.IDENTIFIER().getText());
        }
        return (ex);
    }

    private static BinaryExpr parseBinary(BPSLParser.ExprContext ctx, Scope scope)
    {
        BinaryExpr expr = new BinaryExpr();

        switch (ctx.op.getType())
        {
        case (BPSLLexer.MUL):
            expr.optype = BinaryExpr.EType.MUL;
            break;
        case (BPSLLexer.DIV):
            expr.optype = BinaryExpr.EType.DIV;
            break;
        case (BPSLLexer.MOD):
            expr.optype = BinaryExpr.EType.MOD;
            break;
        case (BPSLLexer.PLUS):
            expr.optype = BinaryExpr.EType.PLUS;
            break;
        case (BPSLLexer.MINUS):
            expr.optype = BinaryExpr.EType.MINUS;
            break;
        case (BPSLLexer.MUL_EQUAL):
            expr.optype = BinaryExpr.EType.MUL_EQ;
            break;
        case (BPSLLexer.DIV_EQUAL):
            expr.optype = BinaryExpr.EType.DIV_EQ;
            break;
        case (BPSLLexer.MOD_EQUAL):
            expr.optype = BinaryExpr.EType.MOD_EQ;
            break;
        case (BPSLLexer.PLUS_EQUAL):
            expr.optype = BinaryExpr.EType.PLUS_EQ;
            break;
        case (BPSLLexer.MINUS_EQUAL):
            expr.optype = BinaryExpr.EType.MINUS_EQ;
            break;
        case (BPSLLexer.LESS_EQUAL):
            expr.optype = BinaryExpr.EType.LESS_EQ;
            break;
        case (BPSLLexer.GREATER_EQUAL):
            expr.optype = BinaryExpr.EType.GREATER_EQ;
            break;
        case (BPSLLexer.GREATER):
            expr.optype = BinaryExpr.EType.GREATER;
            break;
        case (BPSLLexer.LESS):
            expr.optype = BinaryExpr.EType.LESS;
            break;
        case (BPSLLexer.EQUAL_EQUAL):
            expr.optype = BinaryExpr.EType.EQUAL;
            break;
        case (BPSLLexer.NOT_EQUAL):
            expr.optype = BinaryExpr.EType.NOT_EQUAL;
            break;
        case (BPSLLexer.OR_OR):
            expr.optype = BinaryExpr.EType.OR;
            break;
        case (BPSLLexer.AND_AND):
            expr.optype = BinaryExpr.EType.AND;
            break;
        case (BPSLLexer.SHIFT_LEFT):
            expr.optype = BinaryExpr.EType.BIT_SHIFT_LEFT;
            break;
        case (BPSLLexer.SHIFT_RIGHT):
            expr.optype = BinaryExpr.EType.BIT_SHIFT_RIGHT;
            break;
        case (BPSLLexer.AND):
            expr.optype = BinaryExpr.EType.BIT_AND;
            break;
        case (BPSLLexer.OR):
            expr.optype = BinaryExpr.EType.BIT_OR;
            break;
        case (BPSLLexer.EQUAL):
            expr.optype = BinaryExpr.EType.ASSIGNMENT;
            break;
        }
        expr.left = parseExpr(ctx.expr(0), scope);
        expr.right = parseExpr(ctx.expr(1), scope);
        Object obj = scope.resolve(expr.left.typeName);
        if (obj == null || !(obj instanceof Class))
            Scope.Error(ctx, "Attempt to perform binary operation on non-type '" + expr.left.typeName + "'");
        if (expr.left.typeName != expr.right.typeName)
            Scope.Warning(ctx, "Conversion from '" + expr.right.typeName + "' to '" + expr.left.typeName + "'");
        expr.typeName = expr.right.typeName;
        return (expr);
    }

    private static UnaryExpr parseUnary(BPSLParser.ExprContext ctx, Scope scope)
    {
        UnaryExpr expr = new UnaryExpr();

        switch (ctx.op.getType())
        {
        case (BPSLLexer.DECREMENT):
            expr.optype = UnaryExpr.EType.DECREMENT;
            break;
        case (BPSLLexer.INCREMENT):
            expr.optype = UnaryExpr.EType.INCREMENT;
            break;
        case (BPSLLexer.MINUS):
            expr.optype = UnaryExpr.EType.NEGATE;
            break;
        case (BPSLLexer.NOT):
            expr.optype = UnaryExpr.EType.NOT;
            break;
        }
        expr.left = parseExpr(ctx.expr(0), scope);
        Object obj = scope.resolve(expr.left.typeName);
        if (obj == null || !(obj instanceof Class))
            Scope.Error(ctx, "Attempt to perform binary operation on non-type '" + expr.left.typeName + "'");
        expr.typeName = expr.left.typeName;
        return (expr);
    }

    public static Expr parseExpr(BPSLParser.ExprContext ctx, Scope scope)
    {
        Expr ex = null;

        if (ctx.op != null)
        {
            if (ctx.op.getType() == BPSLLexer.SBRACE_OPEN)
                ex = parseSubscript(ctx, scope);
            else if (ctx.op.getType() == BPSLLexer.DOT)
            {
                if (ctx.functionCall() == null)
                    ex = parseMemberAccess(ctx, scope);
                else
                    ex = parseMemberFunctionCall(ctx, scope);
            }
            else if (ctx.expr(0) != null && ctx.expr(1) != null)
                ex = parseBinary(ctx, scope);
            else
                ex = parseUnary(ctx, scope);
        }
        else if (ctx.functionCall() != null)
            ex = parseFunctionCall(ctx.functionCall(), scope);
        else if (ctx.expr(0) != null)
            ex = parsePrimary(ctx, scope);
        else
            ex = parseLitteralOrID(ctx, scope);
        return (ex);
    }
}