// Generated from blockproject\bpsl\BPSL.g4 by ANTLR 4.7.1

    package blockproject.bpsl;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BPSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BPSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BPSLParser#bpsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBpsl(BPSLParser.BpslContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BPSLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#importBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportBlock(BPSLParser.ImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#sysImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSysImport(BPSLParser.SysImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#userImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserImport(BPSLParser.UserImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(BPSLParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructure(BPSLParser.StructureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#classFucker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFucker(BPSLParser.ClassFuckerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(BPSLParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BPSLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(BPSLParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(BPSLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(BPSLParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifier(BPSLParser.QualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#constantExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(BPSLParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#constantFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantFunctionCall(BPSLParser.ConstantFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BPSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(BPSLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(BPSLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(BPSLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(BPSLParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(BPSLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(BPSLParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BPSLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BPSLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BPSLParser.FunctionCallContext ctx);
}