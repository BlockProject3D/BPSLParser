// Generated from blockproject/bpsl/BPSL.g4 by ANTLR 4.7.1

    package blockproject.bpsl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BPSLParser}.
 */
public interface BPSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BPSLParser#bpsl}.
	 * @param ctx the parse tree
	 */
	void enterBpsl(BPSLParser.BpslContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#bpsl}.
	 * @param ctx the parse tree
	 */
	void exitBpsl(BPSLParser.BpslContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BPSLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BPSLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(BPSLParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(BPSLParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#classFucker}.
	 * @param ctx the parse tree
	 */
	void enterClassFucker(BPSLParser.ClassFuckerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#classFucker}.
	 * @param ctx the parse tree
	 */
	void exitClassFucker(BPSLParser.ClassFuckerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(BPSLParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(BPSLParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BPSLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BPSLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(BPSLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(BPSLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(BPSLParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(BPSLParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(BPSLParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(BPSLParser.QualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#constantExpr}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(BPSLParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#constantExpr}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(BPSLParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#constantFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterConstantFunctionCall(BPSLParser.ConstantFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#constantFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitConstantFunctionCall(BPSLParser.ConstantFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BPSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BPSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(BPSLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(BPSLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(BPSLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(BPSLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(BPSLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(BPSLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(BPSLParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(BPSLParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(BPSLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(BPSLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(BPSLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(BPSLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BPSLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BPSLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BPSLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BPSLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BPSLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BPSLParser.FunctionCallContext ctx);
}