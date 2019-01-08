// Generated from blockproject/bpsl/BPSL.g4 by ANTLR 4.7.1

    package blockproject.bpsl;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BPSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, STRUCT=2, CLASS=3, CONST=4, RETURN=5, IF=6, FOR=7, WHILE=8, QUALIFIER_CBUF=9, 
		QUALIFIER_VL=10, CBRACE_OPEN=11, CBRACE_CLOSE=12, PAR_OPEN=13, PAR_CLOSE=14, 
		QUOTE=15, SBRACE_OPEN=16, SBRACE_CLOSE=17, COMA=18, SEMICOLON=19, DOT=20, 
		AND=21, OR=22, NOT=23, DIV=24, MUL=25, MOD=26, LESS=27, GREATER=28, PLUS=29, 
		MINUS=30, EQUAL=31, L_INT=32, L_FLOAT=33, L_DOUBLE=34, L_STRING=35, IDENTIFIER=36;
	public static final int
		RULE_bpsl = 0, RULE_block = 1, RULE_structure = 2, RULE_classFucker = 3, 
		RULE_constantDefinition = 4, RULE_function = 5, RULE_attribute = 6, RULE_functionParameter = 7, 
		RULE_qualifier = 8, RULE_constantExpr = 9, RULE_constantFunctionCall = 10, 
		RULE_statement = 11, RULE_ifStatement = 12, RULE_whileStatement = 13, 
		RULE_forStatement = 14, RULE_compoundStatement = 15, RULE_returnStatement = 16, 
		RULE_variableDeclaration = 17, RULE_expr = 18, RULE_functionCall = 19;
	public static final String[] ruleNames = {
		"bpsl", "block", "structure", "classFucker", "constantDefinition", "function", 
		"attribute", "functionParameter", "qualifier", "constantExpr", "constantFunctionCall", 
		"statement", "ifStatement", "whileStatement", "forStatement", "compoundStatement", 
		"returnStatement", "variableDeclaration", "expr", "functionCall"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'struct'", "'class'", "'const'", "'return'", "'if'", "'for'", 
		"'while'", "'constbuf'", "'vlayout'", "'{'", "'}'", "'('", "')'", "'\"'", 
		"'['", "']'", "','", "';'", "'.'", "'&'", "'|'", "'!'", "'/'", "'*'", 
		"'%'", "'<'", "'>'", "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "STRUCT", "CLASS", "CONST", "RETURN", "IF", "FOR", "WHILE", 
		"QUALIFIER_CBUF", "QUALIFIER_VL", "CBRACE_OPEN", "CBRACE_CLOSE", "PAR_OPEN", 
		"PAR_CLOSE", "QUOTE", "SBRACE_OPEN", "SBRACE_CLOSE", "COMA", "SEMICOLON", 
		"DOT", "AND", "OR", "NOT", "DIV", "MUL", "MOD", "LESS", "GREATER", "PLUS", 
		"MINUS", "EQUAL", "L_INT", "L_FLOAT", "L_DOUBLE", "L_STRING", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BPSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BPSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BpslContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public BpslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bpsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterBpsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitBpsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitBpsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BpslContext bpsl() throws RecognitionException {
		BpslContext _localctx = new BpslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bpsl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << CLASS) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(40);
				block();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ClassFuckerContext classFucker() {
			return getRuleContext(ClassFuckerContext.class,0);
		}
		public ConstantDefinitionContext constantDefinition() {
			return getRuleContext(ConstantDefinitionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				structure();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				function();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				classFucker();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				constantDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(BPSLParser.STRUCT, 0); }
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(STRUCT);
			setState(53);
			qualifier();
			setState(54);
			match(IDENTIFIER);
			setState(55);
			match(CBRACE_OPEN);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(56);
				attribute();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(CBRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassFuckerContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(BPSLParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ClassFuckerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classFucker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterClassFucker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitClassFucker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitClassFucker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassFuckerContext classFucker() throws RecognitionException {
		ClassFuckerContext _localctx = new ClassFuckerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classFucker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CLASS);
			setState(65);
			match(IDENTIFIER);
			setState(66);
			match(CBRACE_OPEN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					attribute();
					}
					break;
				case 2:
					{
					setState(68);
					function();
					}
					break;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(CBRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(BPSLParser.CONST, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(BPSLParser.EQUAL, 0); }
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitConstantDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CONST);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(IDENTIFIER);
			setState(79);
			match(EQUAL);
			setState(80);
			constantExpr(0);
			setState(81);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<FunctionParameterContext> functionParameter() {
			return getRuleContexts(FunctionParameterContext.class);
		}
		public FunctionParameterContext functionParameter(int i) {
			return getRuleContext(FunctionParameterContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(BPSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(BPSLParser.COMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IDENTIFIER);
			setState(84);
			match(IDENTIFIER);
			setState(85);
			match(PAR_OPEN);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(86);
				functionParameter();
				setState(87);
				match(COMA);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(PAR_CLOSE);
			setState(95);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			setState(98);
			match(IDENTIFIER);
			setState(99);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(BPSLParser.EQUAL, 0); }
		public TerminalNode L_INT() { return getToken(BPSLParser.L_INT, 0); }
		public TerminalNode L_FLOAT() { return getToken(BPSLParser.L_FLOAT, 0); }
		public TerminalNode L_DOUBLE() { return getToken(BPSLParser.L_DOUBLE, 0); }
		public TerminalNode L_STRING() { return getToken(BPSLParser.L_STRING, 0); }
		public FunctionParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterContext functionParameter() throws RecognitionException {
		FunctionParameterContext _localctx = new FunctionParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionParameter);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(IDENTIFIER);
				setState(102);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(IDENTIFIER);
				setState(104);
				match(IDENTIFIER);
				setState(105);
				match(EQUAL);
				setState(106);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierContext extends ParserRuleContext {
		public TerminalNode QUALIFIER_CBUF() { return getToken(BPSLParser.QUALIFIER_CBUF, 0); }
		public TerminalNode QUALIFIER_VL() { return getToken(BPSLParser.QUALIFIER_VL, 0); }
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==QUALIFIER_CBUF || _la==QUALIFIER_VL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode L_INT() { return getToken(BPSLParser.L_INT, 0); }
		public TerminalNode L_FLOAT() { return getToken(BPSLParser.L_FLOAT, 0); }
		public TerminalNode L_DOUBLE() { return getToken(BPSLParser.L_DOUBLE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public List<ConstantExprContext> constantExpr() {
			return getRuleContexts(ConstantExprContext.class);
		}
		public ConstantExprContext constantExpr(int i) {
			return getRuleContext(ConstantExprContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public ConstantFunctionCallContext constantFunctionCall() {
			return getRuleContext(ConstantFunctionCallContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(BPSLParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(BPSLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BPSLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BPSLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(BPSLParser.PLUS, 0); }
		public ConstantExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitConstantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExprContext constantExpr() throws RecognitionException {
		return constantExpr(0);
	}

	private ConstantExprContext constantExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConstantExprContext _localctx = new ConstantExprContext(_ctx, _parentState);
		ConstantExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_constantExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(112);
				match(L_INT);
				}
				break;
			case 2:
				{
				setState(113);
				match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(114);
				match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(115);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(116);
				match(PAR_OPEN);
				setState(117);
				constantExpr(0);
				setState(118);
				match(PAR_CLOSE);
				}
				break;
			case 6:
				{
				setState(120);
				constantFunctionCall();
				}
				break;
			case 7:
				{
				setState(121);
				((ConstantExprContext)_localctx).op = match(MINUS);
				setState(122);
				constantExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(125);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(126);
						((ConstantExprContext)_localctx).op = match(MUL);
						setState(127);
						constantExpr(7);
						}
						break;
					case 2:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(129);
						((ConstantExprContext)_localctx).op = match(DIV);
						setState(130);
						constantExpr(6);
						}
						break;
					case 3:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(132);
						((ConstantExprContext)_localctx).op = match(MOD);
						setState(133);
						constantExpr(5);
						}
						break;
					case 4:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(134);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(135);
						((ConstantExprContext)_localctx).op = match(PLUS);
						setState(136);
						constantExpr(4);
						}
						break;
					case 5:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(137);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(138);
						((ConstantExprContext)_localctx).op = match(MINUS);
						setState(139);
						constantExpr(3);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantFunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public List<ConstantExprContext> constantExpr() {
			return getRuleContexts(ConstantExprContext.class);
		}
		public ConstantExprContext constantExpr(int i) {
			return getRuleContext(ConstantExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(BPSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(BPSLParser.COMA, i);
		}
		public ConstantFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterConstantFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitConstantFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitConstantFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantFunctionCallContext constantFunctionCall() throws RecognitionException {
		ConstantFunctionCallContext _localctx = new ConstantFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(PAR_OPEN);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(147);
				constantExpr(0);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(148);
					match(COMA);
					}
				}

				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				expr(0);
				setState(164);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				returnStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BPSLParser.IF, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(IF);
			setState(170);
			match(PAR_OPEN);
			setState(171);
			expr(0);
			setState(172);
			match(PAR_CLOSE);
			setState(173);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BPSLParser.WHILE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WHILE);
			setState(176);
			match(PAR_OPEN);
			setState(177);
			expr(0);
			setState(178);
			match(PAR_CLOSE);
			setState(179);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BPSLParser.FOR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(FOR);
			setState(182);
			match(PAR_OPEN);
			setState(183);
			expr(0);
			setState(184);
			match(PAR_CLOSE);
			setState(185);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(CBRACE_OPEN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CBRACE_OPEN) | (1L << PAR_OPEN) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(188);
				statement();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(CBRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BPSLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(RETURN);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(197);
				match(PAR_OPEN);
				setState(198);
				expr(0);
				setState(199);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				setState(201);
				expr(0);
				}
				break;
			}
			setState(204);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public TerminalNode EQUAL() { return getToken(BPSLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(IDENTIFIER);
				setState(207);
				match(IDENTIFIER);
				setState(208);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(IDENTIFIER);
				setState(210);
				match(IDENTIFIER);
				setState(211);
				match(EQUAL);
				setState(212);
				expr(0);
				setState(213);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public Token op1;
		public TerminalNode L_INT() { return getToken(BPSLParser.L_INT, 0); }
		public TerminalNode L_FLOAT() { return getToken(BPSLParser.L_FLOAT, 0); }
		public TerminalNode L_DOUBLE() { return getToken(BPSLParser.L_DOUBLE, 0); }
		public TerminalNode L_STRING() { return getToken(BPSLParser.L_STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(BPSLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BPSLParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BPSLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BPSLParser.PLUS, i);
		}
		public TerminalNode NOT() { return getToken(BPSLParser.NOT, 0); }
		public TerminalNode MUL() { return getToken(BPSLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BPSLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BPSLParser.MOD, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(BPSLParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(BPSLParser.EQUAL, i);
		}
		public List<TerminalNode> GREATER() { return getTokens(BPSLParser.GREATER); }
		public TerminalNode GREATER(int i) {
			return getToken(BPSLParser.GREATER, i);
		}
		public List<TerminalNode> LESS() { return getTokens(BPSLParser.LESS); }
		public TerminalNode LESS(int i) {
			return getToken(BPSLParser.LESS, i);
		}
		public List<TerminalNode> OR() { return getTokens(BPSLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BPSLParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(BPSLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BPSLParser.AND, i);
		}
		public TerminalNode SBRACE_CLOSE() { return getToken(BPSLParser.SBRACE_CLOSE, 0); }
		public TerminalNode SBRACE_OPEN() { return getToken(BPSLParser.SBRACE_OPEN, 0); }
		public TerminalNode DOT() { return getToken(BPSLParser.DOT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(218);
				match(L_INT);
				}
				break;
			case 2:
				{
				setState(219);
				match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(220);
				match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(221);
				match(L_STRING);
				}
				break;
			case 5:
				{
				setState(222);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(223);
				match(PAR_OPEN);
				setState(224);
				expr(0);
				setState(225);
				match(PAR_CLOSE);
				}
				break;
			case 7:
				{
				setState(227);
				functionCall();
				}
				break;
			case 8:
				{
				setState(228);
				((ExprContext)_localctx).op = match(MINUS);
				setState(229);
				((ExprContext)_localctx).op1 = match(MINUS);
				setState(230);
				expr(4);
				}
				break;
			case 9:
				{
				setState(231);
				((ExprContext)_localctx).op = match(PLUS);
				setState(232);
				((ExprContext)_localctx).op1 = match(PLUS);
				setState(233);
				expr(3);
				}
				break;
			case 10:
				{
				setState(234);
				((ExprContext)_localctx).op = match(MINUS);
				setState(235);
				expr(2);
				}
				break;
			case 11:
				{
				setState(236);
				((ExprContext)_localctx).op = match(NOT);
				setState(237);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(240);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(241);
						((ExprContext)_localctx).op = match(MUL);
						setState(242);
						expr(27);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(244);
						((ExprContext)_localctx).op = match(DIV);
						setState(245);
						expr(26);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(247);
						((ExprContext)_localctx).op = match(MOD);
						setState(248);
						expr(25);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(250);
						((ExprContext)_localctx).op = match(PLUS);
						setState(251);
						expr(24);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(253);
						((ExprContext)_localctx).op = match(MINUS);
						setState(254);
						expr(23);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(256);
						((ExprContext)_localctx).op = match(MUL);
						setState(257);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(258);
						expr(22);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(259);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(260);
						((ExprContext)_localctx).op = match(DIV);
						setState(261);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(262);
						expr(21);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(264);
						((ExprContext)_localctx).op = match(MOD);
						setState(265);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(266);
						expr(20);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(267);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(268);
						((ExprContext)_localctx).op = match(PLUS);
						setState(269);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(270);
						expr(19);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(272);
						((ExprContext)_localctx).op = match(MINUS);
						setState(273);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(274);
						expr(18);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(275);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(276);
						((ExprContext)_localctx).op = match(GREATER);
						setState(277);
						expr(17);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(278);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(279);
						((ExprContext)_localctx).op = match(LESS);
						setState(280);
						expr(16);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(282);
						((ExprContext)_localctx).op = match(GREATER);
						setState(283);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(284);
						expr(15);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(286);
						((ExprContext)_localctx).op = match(LESS);
						setState(287);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(288);
						expr(14);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(290);
						((ExprContext)_localctx).op = match(EQUAL);
						setState(291);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(292);
						expr(13);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(294);
						((ExprContext)_localctx).op = match(NOT);
						setState(295);
						((ExprContext)_localctx).op1 = match(EQUAL);
						setState(296);
						expr(12);
						}
						break;
					case 17:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(298);
						((ExprContext)_localctx).op = match(OR);
						setState(299);
						((ExprContext)_localctx).op1 = match(OR);
						setState(300);
						expr(11);
						}
						break;
					case 18:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(302);
						((ExprContext)_localctx).op = match(AND);
						setState(303);
						((ExprContext)_localctx).op1 = match(AND);
						setState(304);
						expr(10);
						}
						break;
					case 19:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(306);
						((ExprContext)_localctx).op = match(GREATER);
						setState(307);
						((ExprContext)_localctx).op1 = match(GREATER);
						setState(308);
						expr(9);
						}
						break;
					case 20:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(310);
						((ExprContext)_localctx).op = match(LESS);
						setState(311);
						((ExprContext)_localctx).op1 = match(LESS);
						setState(312);
						expr(8);
						}
						break;
					case 21:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(314);
						((ExprContext)_localctx).op = match(AND);
						setState(315);
						expr(7);
						}
						break;
					case 22:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(317);
						((ExprContext)_localctx).op = match(OR);
						setState(318);
						expr(6);
						}
						break;
					case 23:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(320);
						((ExprContext)_localctx).op = match(SBRACE_OPEN);
						setState(321);
						expr(0);
						setState(322);
						match(SBRACE_CLOSE);
						}
						break;
					case 24:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(325);
						((ExprContext)_localctx).op = match(DOT);
						setState(326);
						match(IDENTIFIER);
						}
						break;
					case 25:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(328);
						((ExprContext)_localctx).op = match(DOT);
						setState(329);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(BPSLParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(BPSLParser.COMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(IDENTIFIER);
			setState(336);
			match(PAR_OPEN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(337);
				expr(0);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(338);
					match(COMA);
					}
				}

				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			match(PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return constantExpr_sempred((ConstantExprContext)_localctx, predIndex);
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constantExpr_sempred(ConstantExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 26);
		case 6:
			return precpred(_ctx, 25);
		case 7:
			return precpred(_ctx, 24);
		case 8:
			return precpred(_ctx, 23);
		case 9:
			return precpred(_ctx, 22);
		case 10:
			return precpred(_ctx, 21);
		case 11:
			return precpred(_ctx, 20);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 15);
		case 17:
			return precpred(_ctx, 14);
		case 18:
			return precpred(_ctx, 13);
		case 19:
			return precpred(_ctx, 12);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 9);
		case 23:
			return precpred(_ctx, 8);
		case 24:
			return precpred(_ctx, 7);
		case 25:
			return precpred(_ctx, 6);
		case 26:
			return precpred(_ctx, 5);
		case 27:
			return precpred(_ctx, 30);
		case 28:
			return precpred(_ctx, 29);
		case 29:
			return precpred(_ctx, 28);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13~\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u008f\n\13\f\13\16\13\u0092\13\13\3\f\3\f\3\f\3\f\5\f\u0098\n\f\7\f\u009a"+
		"\n\f\f\f\16\f\u009d\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00aa\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u00c0\n\21\f\21\16\21"+
		"\u00c3\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cd\n\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00da\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f1\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u014d\n\24\f\24\16\24\u0150\13\24\3\25\3\25\3\25\3\25"+
		"\5\25\u0156\n\25\7\25\u0158\n\25\f\25\16\25\u015b\13\25\3\25\3\25\3\25"+
		"\2\4\24&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\2\"%\3"+
		"\2\13\f\2\u018f\2-\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\bB\3\2\2\2\nN\3\2"+
		"\2\2\fU\3\2\2\2\16c\3\2\2\2\20m\3\2\2\2\22o\3\2\2\2\24}\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u00a9\3\2\2\2\32\u00ab\3\2\2\2\34\u00b1\3\2\2\2\36\u00b7\3"+
		"\2\2\2 \u00bd\3\2\2\2\"\u00c6\3\2\2\2$\u00d9\3\2\2\2&\u00f0\3\2\2\2(\u0151"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2"+
		"/-\3\2\2\2\60\65\5\6\4\2\61\65\5\f\7\2\62\65\5\b\5\2\63\65\5\n\6\2\64"+
		"\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66"+
		"\67\7\4\2\2\678\5\22\n\289\7&\2\29=\7\r\2\2:<\5\16\b\2;:\3\2\2\2<?\3\2"+
		"\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\16\2\2A\7\3\2\2\2BC\7"+
		"\5\2\2CD\7&\2\2DI\7\r\2\2EH\5\16\b\2FH\5\f\7\2GE\3\2\2\2GF\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\16\2\2M\t\3\2\2\2N"+
		"O\7\6\2\2OP\7&\2\2PQ\7&\2\2QR\7!\2\2RS\5\24\13\2ST\7\25\2\2T\13\3\2\2"+
		"\2UV\7&\2\2VW\7&\2\2W]\7\17\2\2XY\5\20\t\2YZ\7\24\2\2Z\\\3\2\2\2[X\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\20\2\2ab\5"+
		" \21\2b\r\3\2\2\2cd\7&\2\2de\7&\2\2ef\7\25\2\2f\17\3\2\2\2gh\7&\2\2hn"+
		"\7&\2\2ij\7&\2\2jk\7&\2\2kl\7!\2\2ln\t\2\2\2mg\3\2\2\2mi\3\2\2\2n\21\3"+
		"\2\2\2op\t\3\2\2p\23\3\2\2\2qr\b\13\1\2r~\7\"\2\2s~\7#\2\2t~\7$\2\2u~"+
		"\7&\2\2vw\7\17\2\2wx\5\24\13\2xy\7\20\2\2y~\3\2\2\2z~\5\26\f\2{|\7 \2"+
		"\2|~\5\24\13\3}q\3\2\2\2}s\3\2\2\2}t\3\2\2\2}u\3\2\2\2}v\3\2\2\2}z\3\2"+
		"\2\2}{\3\2\2\2~\u0090\3\2\2\2\177\u0080\f\b\2\2\u0080\u0081\7\33\2\2\u0081"+
		"\u008f\5\24\13\t\u0082\u0083\f\7\2\2\u0083\u0084\7\32\2\2\u0084\u008f"+
		"\5\24\13\b\u0085\u0086\f\6\2\2\u0086\u0087\7\34\2\2\u0087\u008f\5\24\13"+
		"\7\u0088\u0089\f\5\2\2\u0089\u008a\7\37\2\2\u008a\u008f\5\24\13\6\u008b"+
		"\u008c\f\4\2\2\u008c\u008d\7 \2\2\u008d\u008f\5\24\13\5\u008e\177\3\2"+
		"\2\2\u008e\u0082\3\2\2\2\u008e\u0085\3\2\2\2\u008e\u0088\3\2\2\2\u008e"+
		"\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7&\2\2\u0094\u009b"+
		"\7\17\2\2\u0095\u0097\5\24\13\2\u0096\u0098\7\24\2\2\u0097\u0096\3\2\2"+
		"\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\20\2\2\u009f\27\3\2\2\2\u00a0\u00aa\5\32"+
		"\16\2\u00a1\u00aa\5\34\17\2\u00a2\u00aa\5\36\20\2\u00a3\u00aa\5 \21\2"+
		"\u00a4\u00aa\5$\23\2\u00a5\u00a6\5&\24\2\u00a6\u00a7\7\25\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00aa\5\"\22\2\u00a9\u00a0\3\2\2\2\u00a9\u00a1\3\2\2\2"+
		"\u00a9\u00a2\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\7\b\2\2\u00ac"+
		"\u00ad\7\17\2\2\u00ad\u00ae\5&\24\2\u00ae\u00af\7\20\2\2\u00af\u00b0\5"+
		"\30\r\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00b3\7\17\2\2\u00b3"+
		"\u00b4\5&\24\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5\30\r\2\u00b6\35\3\2"+
		"\2\2\u00b7\u00b8\7\t\2\2\u00b8\u00b9\7\17\2\2\u00b9\u00ba\5&\24\2\u00ba"+
		"\u00bb\7\20\2\2\u00bb\u00bc\5\30\r\2\u00bc\37\3\2\2\2\u00bd\u00c1\7\r"+
		"\2\2\u00be\u00c0\5\30\r\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\7\16\2\2\u00c5!\3\2\2\2\u00c6\u00cc\7\7\2\2\u00c7\u00c8"+
		"\7\17\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\7\20\2\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00cd\5&\24\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf#\3\2\2\2\u00d0"+
		"\u00d1\7&\2\2\u00d1\u00d2\7&\2\2\u00d2\u00da\7\25\2\2\u00d3\u00d4\7&\2"+
		"\2\u00d4\u00d5\7&\2\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\5&\24\2\u00d7\u00d8"+
		"\7\25\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2"+
		"\u00da%\3\2\2\2\u00db\u00dc\b\24\1\2\u00dc\u00f1\7\"\2\2\u00dd\u00f1\7"+
		"#\2\2\u00de\u00f1\7$\2\2\u00df\u00f1\7%\2\2\u00e0\u00f1\7&\2\2\u00e1\u00e2"+
		"\7\17\2\2\u00e2\u00e3\5&\24\2\u00e3\u00e4\7\20\2\2\u00e4\u00f1\3\2\2\2"+
		"\u00e5\u00f1\5(\25\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\7 \2\2\u00e8\u00f1"+
		"\5&\24\6\u00e9\u00ea\7\37\2\2\u00ea\u00eb\7\37\2\2\u00eb\u00f1\5&\24\5"+
		"\u00ec\u00ed\7 \2\2\u00ed\u00f1\5&\24\4\u00ee\u00ef\7\31\2\2\u00ef\u00f1"+
		"\5&\24\3\u00f0\u00db\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00de\3\2\2\2\u00f0"+
		"\u00df\3\2\2\2\u00f0\u00e0\3\2\2\2\u00f0\u00e1\3\2\2\2\u00f0\u00e5\3\2"+
		"\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u014e\3\2\2\2\u00f2\u00f3\f\34\2\2\u00f3\u00f4\7"+
		"\33\2\2\u00f4\u014d\5&\24\35\u00f5\u00f6\f\33\2\2\u00f6\u00f7\7\32\2\2"+
		"\u00f7\u014d\5&\24\34\u00f8\u00f9\f\32\2\2\u00f9\u00fa\7\34\2\2\u00fa"+
		"\u014d\5&\24\33\u00fb\u00fc\f\31\2\2\u00fc\u00fd\7\37\2\2\u00fd\u014d"+
		"\5&\24\32\u00fe\u00ff\f\30\2\2\u00ff\u0100\7 \2\2\u0100\u014d\5&\24\31"+
		"\u0101\u0102\f\27\2\2\u0102\u0103\7\33\2\2\u0103\u0104\7!\2\2\u0104\u014d"+
		"\5&\24\30\u0105\u0106\f\26\2\2\u0106\u0107\7\32\2\2\u0107\u0108\7!\2\2"+
		"\u0108\u014d\5&\24\27\u0109\u010a\f\25\2\2\u010a\u010b\7\34\2\2\u010b"+
		"\u010c\7!\2\2\u010c\u014d\5&\24\26\u010d\u010e\f\24\2\2\u010e\u010f\7"+
		"\37\2\2\u010f\u0110\7!\2\2\u0110\u014d\5&\24\25\u0111\u0112\f\23\2\2\u0112"+
		"\u0113\7 \2\2\u0113\u0114\7!\2\2\u0114\u014d\5&\24\24\u0115\u0116\f\22"+
		"\2\2\u0116\u0117\7\36\2\2\u0117\u014d\5&\24\23\u0118\u0119\f\21\2\2\u0119"+
		"\u011a\7\35\2\2\u011a\u014d\5&\24\22\u011b\u011c\f\20\2\2\u011c\u011d"+
		"\7\36\2\2\u011d\u011e\7!\2\2\u011e\u014d\5&\24\21\u011f\u0120\f\17\2\2"+
		"\u0120\u0121\7\35\2\2\u0121\u0122\7!\2\2\u0122\u014d\5&\24\20\u0123\u0124"+
		"\f\16\2\2\u0124\u0125\7!\2\2\u0125\u0126\7!\2\2\u0126\u014d\5&\24\17\u0127"+
		"\u0128\f\r\2\2\u0128\u0129\7\31\2\2\u0129\u012a\7!\2\2\u012a\u014d\5&"+
		"\24\16\u012b\u012c\f\f\2\2\u012c\u012d\7\30\2\2\u012d\u012e\7\30\2\2\u012e"+
		"\u014d\5&\24\r\u012f\u0130\f\13\2\2\u0130\u0131\7\27\2\2\u0131\u0132\7"+
		"\27\2\2\u0132\u014d\5&\24\f\u0133\u0134\f\n\2\2\u0134\u0135\7\36\2\2\u0135"+
		"\u0136\7\36\2\2\u0136\u014d\5&\24\13\u0137\u0138\f\t\2\2\u0138\u0139\7"+
		"\35\2\2\u0139\u013a\7\35\2\2\u013a\u014d\5&\24\n\u013b\u013c\f\b\2\2\u013c"+
		"\u013d\7\27\2\2\u013d\u014d\5&\24\t\u013e\u013f\f\7\2\2\u013f\u0140\7"+
		"\30\2\2\u0140\u014d\5&\24\b\u0141\u0142\f \2\2\u0142\u0143\7\22\2\2\u0143"+
		"\u0144\5&\24\2\u0144\u0145\7\23\2\2\u0145\u014d\3\2\2\2\u0146\u0147\f"+
		"\37\2\2\u0147\u0148\7\26\2\2\u0148\u014d\7&\2\2\u0149\u014a\f\36\2\2\u014a"+
		"\u014b\7\26\2\2\u014b\u014d\5(\25\2\u014c\u00f2\3\2\2\2\u014c\u00f5\3"+
		"\2\2\2\u014c\u00f8\3\2\2\2\u014c\u00fb\3\2\2\2\u014c\u00fe\3\2\2\2\u014c"+
		"\u0101\3\2\2\2\u014c\u0105\3\2\2\2\u014c\u0109\3\2\2\2\u014c\u010d\3\2"+
		"\2\2\u014c\u0111\3\2\2\2\u014c\u0115\3\2\2\2\u014c\u0118\3\2\2\2\u014c"+
		"\u011b\3\2\2\2\u014c\u011f\3\2\2\2\u014c\u0123\3\2\2\2\u014c\u0127\3\2"+
		"\2\2\u014c\u012b\3\2\2\2\u014c\u012f\3\2\2\2\u014c\u0133\3\2\2\2\u014c"+
		"\u0137\3\2\2\2\u014c\u013b\3\2\2\2\u014c\u013e\3\2\2\2\u014c\u0141\3\2"+
		"\2\2\u014c\u0146\3\2\2\2\u014c\u0149\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\'\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u0152\7&\2\2\u0152\u0159\7\17\2\2\u0153\u0155\5&\24\2\u0154\u0156"+
		"\7\24\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2"+
		"\u0157\u0153\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\20\2\2"+
		"\u015d)\3\2\2\2\27-\64=GI]m}\u008e\u0090\u0097\u009b\u00a9\u00c1\u00cc"+
		"\u00d9\u00f0\u014c\u014e\u0155\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}