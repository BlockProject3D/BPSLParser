package blockproject.bpsl.optimizer;

import java.util.Stack;

import blockproject.bpsl.Scope;
import blockproject.bpsl.ast.Class;
import blockproject.bpsl.ast.Function;
import blockproject.bpsl.ast.expr.ArraySubscript;
import blockproject.bpsl.ast.expr.BinaryExpr;
import blockproject.bpsl.ast.expr.ConstructorCall;
import blockproject.bpsl.ast.expr.Expr;
import blockproject.bpsl.ast.expr.FunctionCall;
import blockproject.bpsl.ast.expr.Identifier;
import blockproject.bpsl.ast.expr.MemberAccess;
import blockproject.bpsl.ast.expr.MemberFunctionCall;
import blockproject.bpsl.ast.expr.PrimaryExpr;
import blockproject.bpsl.ast.expr.UnaryExpr;
import blockproject.bpsl.ast.statement.Compound;
import blockproject.bpsl.ast.statement.Expression;
import blockproject.bpsl.ast.statement.For;
import blockproject.bpsl.ast.statement.If;
import blockproject.bpsl.ast.statement.Return;
import blockproject.bpsl.ast.statement.Statement;
import blockproject.bpsl.ast.statement.Variable;
import blockproject.bpsl.ast.statement.While;

public class FunctionReducer implements IOptimizerPass {

    private void runOnExpression(Scope newScope, Scope oldScope, Expr expr)
    {
        Stack<Expr> stack = new Stack<>();
        Stack<Function> toRun = new Stack<>();

        stack.push(expr);
        while (!stack.empty())
        {
            Expr ex = stack.pop();
            switch (ex.type)
            {
                case BINARY_OPERATION:
                    BinaryExpr bin = (BinaryExpr)ex;
                    stack.push(bin.left);
                    stack.push(bin.right);
                    break;
                case UNARY_OPERATION:
                    UnaryExpr un = (UnaryExpr)ex;
                    stack.push(un.left);
                    break;
                case FUNCTION_CALL:
                    FunctionCall fcall = (FunctionCall)ex;
                    Function func = oldScope.functions.get(fcall.name);
                    newScope.functions.put(fcall.name, func);
                    toRun.push(func);
                    for (Expr e : fcall.parameters)
                        stack.push(e);
                    break;
                case CONSTRUCTOR_CALL:
                    ConstructorCall ccall = (ConstructorCall)ex;
                    newScope.classes.put(ccall.linkClass.name, ccall.linkClass);
                    for (Expr e : ccall.parameters)
                        stack.push(e);
                    break;
                case ARRAY_SUBSCRIPT:
                    ArraySubscript arr = (ArraySubscript)ex;
                    
                    break;
                case MEMBER_ACCESS:
                    MemberAccess ma = (MemberAccess)ex;
                    break;
                case MEMBER_FUNCTION_CALL:
                    MemberFunctionCall mcall = (MemberFunctionCall)ex;
                    break;
                case PRIMARY:
                    PrimaryExpr prim = (PrimaryExpr)ex;
                    break;
                case IDENTIFIER:
                    Identifier id = (Identifier)ex;
                    break;
            }    
        }

        while (!toRun.empty())
            runOnFunction(newScope, oldScope, toRun.pop());
    }

    private void runOnStatement(Scope newScope, Scope oldScope, Statement init)
    {
        Stack<Statement> stack = new Stack<>();

        stack.push(init);
        while (!stack.empty())
        {
            Statement st = stack.pop();
            switch (st.type)
            {
                case EXPRESSION:
                    Expression expr = (Expression)st;
                    runOnExpression(newScope, oldScope, expr.expr);
                    break;
                case RETURN:
                    Return ret = (Return)st;
                    runOnExpression(newScope, oldScope, ret.value);
                    break;
                case IF:
                    If iff = (If)st;
                    runOnExpression(newScope, oldScope, iff.condition);
                    stack.push(iff.statement);
                    break;
                case FOR:
                    For fro = (For)st;
                    runOnExpression(newScope, oldScope, fro.init);
                    runOnExpression(newScope, oldScope, fro.condition);
                    runOnExpression(newScope, oldScope, fro.end);
                    stack.push(fro.statement);
                    break;
                case WHILE:
                    While whl = (While)st;
                    runOnExpression(newScope, oldScope, whl.condition);
                    stack.push(whl.statement);
                    break;
                case VARIABLE_DECLARATION:
                    Variable var = (Variable)st;
                    runOnExpression(newScope, oldScope, var.value);
                    break;
                case COMPOUND:
                    Compound cmp = (Compound)st;
                    for (Statement st1 : cmp.statements)
                        stack.push(st1);
                    break;
            }    
        }
    }

    private void runOnFunction(Scope newScope, Scope oldScope, Function func)
    {
        for (Statement st : func.statements)
            runOnStatement(newScope, oldScope, st);
    }

    @Override
    public Scope run(Scope scope)
    {
        if (!scope.functions.containsKey("main"))
            throw new RuntimeException("This shader has no main functions");
        Scope newScope = new Scope();
        Function func = scope.functions.get("main");
        newScope.functions.put("main", func);
        runOnFunction(newScope, scope, func);
        return (scope);
    }

}