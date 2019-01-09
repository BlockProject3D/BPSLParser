package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLParser;
import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.statement.Compound;
import blockproject.bpsl.ast.statement.Expression;
import blockproject.bpsl.ast.statement.For;
import blockproject.bpsl.ast.statement.If;
import blockproject.bpsl.ast.statement.Return;
import blockproject.bpsl.ast.statement.Statement;
import blockproject.bpsl.ast.statement.Variable;
import blockproject.bpsl.ast.statement.While;

public class StatementParser
{
    private static If parseIf(BPSLParser.IfStatementContext ctx, Scope scope)
    {
        If f = new If();

        f.condition = ExpressionParser.parseExpr(ctx.expr(), scope);
        f.statement = parseStatement(ctx.statement(), scope);
        return (f);
    }

    private static While parseWhile(BPSLParser.WhileStatementContext ctx, Scope scope)
    {
        While w = new While();

        w.condition = ExpressionParser.parseExpr(ctx.expr(), scope);
        w.statement = parseStatement(ctx.statement(), scope);
        return (w);
    }

    private static For parseFor(BPSLParser.ForStatementContext ctx, Scope scope)
    {
        For fs = new For();

        fs.init = ExpressionParser.parseExpr(ctx.expr(0), scope);
        fs.condition = ExpressionParser.parseExpr(ctx.expr(1), scope);
        fs.end = ExpressionParser.parseExpr(ctx.expr(2), scope);
        fs.statement = parseStatement(ctx.statement(), scope);
        return (fs);
    }

    private static Compound parseCompound(BPSLParser.CompoundStatementContext ctx, Scope scope)
    {
        Compound comp = new Compound();
        Scope sc = new Scope(scope);

        for (int i = 0 ; i < ctx.statement().size() ; ++i)
            comp.statements.add(parseStatement(ctx.statement(i), sc));
        return (comp);
    }

    private static Variable parseVar(BPSLParser.VariableDeclarationContext ctx, Scope scope)
    {
        Variable v = new Variable();

        v.typeName.type = ctx.type.getText();
        v.typeName.name = ctx.name.getText();
        v.value = ExpressionParser.parseExpr(ctx.expr(), scope);
        scope.variables.put(v.typeName.name, v);
        return (v);
    }

    private static Return parseReturn(BPSLParser.ReturnStatementContext ctx, Scope scope)
    {
        Return ret = new Return();

        ret.value = ExpressionParser.parseExpr(ctx.expr(), scope);
        return (ret);
    }

    public static Statement parseStatement(BPSLParser.StatementContext ctx, Scope scope)
    {
        Statement st;

        if (ctx.ifStatement() != null)
            st = parseIf(ctx.ifStatement(), scope);
        else if (ctx.whileStatement() != null)
            st = parseWhile(ctx.whileStatement(), scope);
        else if (ctx.forStatement() != null)
            st = parseFor(ctx.forStatement(), scope);
        else if (ctx.compoundStatement() != null)
            st = parseCompound(ctx.compoundStatement(), scope);
        else if (ctx.variableDeclaration() != null)
            st = parseVar(ctx.variableDeclaration(), scope);
        else if (ctx.returnStatement() != null)
            st = parseReturn(ctx.returnStatement(), scope);
        else
        {
            Expression st1 = new Expression();
            st1.expr = ExpressionParser.parseExpr(ctx.expr(), scope);
            st = st1;
        }
        return (st);
    }
}