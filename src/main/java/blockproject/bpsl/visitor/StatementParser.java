package blockproject.bpsl.visitor;

import blockproject.bpsl.BPSLParser;
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
    private static If parseIf(BPSLParser.IfStatementContext ctx)
    {
        If f = new If();

        f.condition = ExpressionParser.parseExpr(ctx.expr());
        f.statement = parseStatement(ctx.statement());
        return (f);
    }

    private static While parseWhile(BPSLParser.WhileStatementContext ctx)
    {
        While w = new While();

        w.condition = ExpressionParser.parseExpr(ctx.expr());
        w.statement = parseStatement(ctx.statement());
        return (w);
    }

    private static For parseFor(BPSLParser.ForStatementContext ctx)
    {
        For fs = new For();

        fs.init = ExpressionParser.parseExpr(ctx.expr(0));
        fs.condition = ExpressionParser.parseExpr(ctx.expr(1));
        fs.end = ExpressionParser.parseExpr(ctx.expr(2));
        fs.statement = parseStatement(ctx.statement());
        return (fs);
    }

    private static Compound parseCompound(BPSLParser.CompoundStatementContext ctx)
    {
        Compound comp = new Compound();

        for (int i = 0 ; i < ctx.statement().size() ; ++i)
            comp.statements.add(parseStatement(ctx.statement(i)));
        return (comp);
    }

    private static Variable parseVar(BPSLParser.VariableDeclarationContext ctx)
    {
        Variable v = new Variable();

        v.typeName.type = ctx.type.getText();
        v.typeName.name = ctx.name.getText();
        v.value = ExpressionParser.parseExpr(ctx.expr());
        return (v);
    }

    private static Return parseReturn(BPSLParser.ReturnStatementContext ctx)
    {
        Return ret = new Return();

        ret.value = ExpressionParser.parseExpr(ctx.expr());
        return (ret);
    }

    public static Statement parseStatement(BPSLParser.StatementContext ctx)
    {
        Statement st;

        if (ctx.ifStatement() != null)
            st = parseIf(ctx.ifStatement());
        else if (ctx.whileStatement() != null)
            st = parseWhile(ctx.whileStatement());
        else if (ctx.forStatement() != null)
            st = parseFor(ctx.forStatement());
        else if (ctx.compoundStatement() != null)
            st = parseCompound(ctx.compoundStatement());
        else if (ctx.variableDeclaration() != null)
            st = parseVar(ctx.variableDeclaration());
        else if (ctx.returnStatement() != null)
            st = parseReturn(ctx.returnStatement());
        else
        {
            Expression st1 = new Expression();
            st1.expr = ExpressionParser.parseExpr(ctx.expr());
            st = st1;
        }
        return (st);
    }
}