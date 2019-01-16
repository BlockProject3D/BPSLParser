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
		WS=1, AT=2, STRUCT=3, CLASS=4, CONST=5, RETURN=6, IF=7, FOR=8, WHILE=9, 
		QUALIFIER_CBUF=10, QUALIFIER_VL=11, CBRACE_OPEN=12, CBRACE_CLOSE=13, PAR_OPEN=14, 
		PAR_CLOSE=15, QUOTE=16, SBRACE_OPEN=17, SBRACE_CLOSE=18, COMA=19, SEMICOLON=20, 
		DOT=21, AND=22, OR=23, NOT=24, DIV=25, MUL=26, MOD=27, LESS=28, GREATER=29, 
		PLUS=30, MINUS=31, EQUAL=32, MUL_EQUAL=33, DIV_EQUAL=34, MOD_EQUAL=35, 
		PLUS_EQUAL=36, MINUS_EQUAL=37, GREATER_EQUAL=38, LESS_EQUAL=39, EQUAL_EQUAL=40, 
		NOT_EQUAL=41, AND_AND=42, OR_OR=43, SHIFT_LEFT=44, SHIFT_RIGHT=45, INCREMENT=46, 
		DECREMENT=47, L_INT=48, L_FLOAT=49, L_DOUBLE=50, L_STRING=51, IDENTIFIER=52;
	public static final int
		RULE_bpsl = 0, RULE_annotation = 1, RULE_block = 2, RULE_structure = 3, 
		RULE_classFucker = 4, RULE_constantDefinition = 5, RULE_function = 6, 
		RULE_constructor = 7, RULE_attribute = 8, RULE_functionParameter = 9, 
		RULE_qualifier = 10, RULE_constantExpr = 11, RULE_constantFunctionCall = 12, 
		RULE_statement = 13, RULE_ifStatement = 14, RULE_whileStatement = 15, 
		RULE_forStatement = 16, RULE_compoundStatement = 17, RULE_returnStatement = 18, 
		RULE_variableDeclaration = 19, RULE_expr = 20, RULE_functionCall = 21;
	public static final String[] ruleNames = {
		"bpsl", "annotation", "block", "structure", "classFucker", "constantDefinition", 
		"function", "constructor", "attribute", "functionParameter", "qualifier", 
		"constantExpr", "constantFunctionCall", "statement", "ifStatement", "whileStatement", 
		"forStatement", "compoundStatement", "returnStatement", "variableDeclaration", 
		"expr", "functionCall"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'@'", "'struct'", "'class'", "'const'", "'return'", "'if'", 
		"'for'", "'while'", "'constbuf'", "'vlayout'", "'{'", "'}'", "'('", "')'", 
		"'\"'", "'['", "']'", "','", "';'", "'.'", "'&'", "'|'", "'!'", "'/'", 
		"'*'", "'%'", "'<'", "'>'", "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AT", "STRUCT", "CLASS", "CONST", "RETURN", "IF", "FOR", "WHILE", 
		"QUALIFIER_CBUF", "QUALIFIER_VL", "CBRACE_OPEN", "CBRACE_CLOSE", "PAR_OPEN", 
		"PAR_CLOSE", "QUOTE", "SBRACE_OPEN", "SBRACE_CLOSE", "COMA", "SEMICOLON", 
		"DOT", "AND", "OR", "NOT", "DIV", "MUL", "MOD", "LESS", "GREATER", "PLUS", 
		"MINUS", "EQUAL", "MUL_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "PLUS_EQUAL", 
		"MINUS_EQUAL", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", 
		"AND_AND", "OR_OR", "SHIFT_LEFT", "SHIFT_RIGHT", "INCREMENT", "DECREMENT", 
		"L_INT", "L_FLOAT", "L_DOUBLE", "L_STRING", "IDENTIFIER"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << STRUCT) | (1L << CLASS) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(44);
				block();
				}
				}
				setState(49);
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

	public static class AnnotationContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public TerminalNode AT() { return getToken(BPSLParser.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public TerminalNode L_DOUBLE() { return getToken(BPSLParser.L_DOUBLE, 0); }
		public TerminalNode L_FLOAT() { return getToken(BPSLParser.L_FLOAT, 0); }
		public TerminalNode L_INT() { return getToken(BPSLParser.L_INT, 0); }
		public TerminalNode L_STRING() { return getToken(BPSLParser.L_STRING, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(AT);
			setState(51);
			((AnnotationContext)_localctx).name = match(IDENTIFIER);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING))) != 0)) {
				{
				setState(52);
				((AnnotationContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING))) != 0)) ) {
					((AnnotationContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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
		enterRule(_localctx, 4, RULE_block);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				structure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				classFucker();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				constantDefinition();
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

	public static class StructureContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STRUCT() { return getToken(BPSLParser.STRUCT, 0); }
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(61);
				annotation();
				}
			}

			setState(64);
			match(STRUCT);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUALIFIER_CBUF || _la==QUALIFIER_VL) {
				{
				setState(65);
				qualifier();
				}
			}

			setState(68);
			((StructureContext)_localctx).name = match(IDENTIFIER);
			setState(69);
			match(CBRACE_OPEN);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(70);
				attribute();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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
		public Token name;
		public TerminalNode CLASS() { return getToken(BPSLParser.CLASS, 0); }
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_classFucker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(78);
				annotation();
				}
			}

			setState(81);
			match(CLASS);
			setState(82);
			((ClassFuckerContext)_localctx).name = match(IDENTIFIER);
			setState(83);
			match(CBRACE_OPEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(84);
					attribute();
					}
					break;
				case 2:
					{
					setState(85);
					function();
					}
					break;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		public Token type;
		public Token name;
		public TerminalNode CONST() { return getToken(BPSLParser.CONST, 0); }
		public TerminalNode EQUAL() { return getToken(BPSLParser.EQUAL, 0); }
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 10, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(CONST);
			setState(94);
			((ConstantDefinitionContext)_localctx).type = match(IDENTIFIER);
			setState(95);
			((ConstantDefinitionContext)_localctx).name = match(IDENTIFIER);
			setState(96);
			match(EQUAL);
			setState(97);
			constantExpr(0);
			setState(98);
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
		public Token type;
		public Token name;
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
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
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(100);
				annotation();
				}
			}

			setState(103);
			((FunctionContext)_localctx).type = match(IDENTIFIER);
			setState(104);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			setState(105);
			match(PAR_OPEN);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(106);
				functionParameter();
				setState(107);
				match(COMA);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			match(PAR_CLOSE);
			setState(115);
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

	public static class ConstructorContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
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
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(117);
				annotation();
				}
			}

			setState(120);
			((ConstructorContext)_localctx).name = match(IDENTIFIER);
			setState(121);
			match(PAR_OPEN);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(122);
				functionParameter();
				setState(123);
				match(COMA);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(PAR_CLOSE);
			setState(131);
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
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode SBRACE_OPEN() { return getToken(BPSLParser.SBRACE_OPEN, 0); }
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public TerminalNode SBRACE_CLOSE() { return getToken(BPSLParser.SBRACE_CLOSE, 0); }
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
		enterRule(_localctx, 16, RULE_attribute);
		int _la;
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(133);
					annotation();
					}
				}

				setState(136);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(137);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(138);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(139);
					annotation();
					}
				}

				setState(142);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(143);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(144);
				match(SBRACE_OPEN);
				setState(145);
				constantExpr(0);
				setState(146);
				match(SBRACE_CLOSE);
				setState(147);
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

	public static class FunctionParameterContext extends ParserRuleContext {
		public Token type;
		public Token name;
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
		enterRule(_localctx, 18, RULE_functionParameter);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(152);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(154);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				setState(155);
				match(EQUAL);
				setState(156);
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
		enterRule(_localctx, 20, RULE_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
		public Token value;
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_constantExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(162);
				((ConstantExprContext)_localctx).value = match(L_INT);
				}
				break;
			case 2:
				{
				setState(163);
				((ConstantExprContext)_localctx).value = match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(164);
				((ConstantExprContext)_localctx).value = match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(165);
				((ConstantExprContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(166);
				match(PAR_OPEN);
				setState(167);
				constantExpr(0);
				setState(168);
				match(PAR_CLOSE);
				}
				break;
			case 6:
				{
				setState(170);
				constantFunctionCall();
				}
				break;
			case 7:
				{
				setState(171);
				((ConstantExprContext)_localctx).op = match(MINUS);
				setState(172);
				constantExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(175);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(176);
						((ConstantExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
							((ConstantExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						constantExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(178);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(179);
						((ConstantExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ConstantExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						constantExpr(3);
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public Token name;
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 24, RULE_constantFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((ConstantFunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(187);
			match(PAR_OPEN);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(188);
				constantExpr(0);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(189);
					match(COMA);
					}
				}

				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204);
				expr(0);
				setState(205);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
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
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(IF);
			setState(211);
			match(PAR_OPEN);
			setState(212);
			expr(0);
			setState(213);
			match(PAR_CLOSE);
			setState(214);
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
		enterRule(_localctx, 30, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WHILE);
			setState(217);
			match(PAR_OPEN);
			setState(218);
			expr(0);
			setState(219);
			match(PAR_CLOSE);
			setState(220);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(BPSLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(BPSLParser.SEMICOLON, i);
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
		enterRule(_localctx, 32, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(FOR);
			setState(223);
			match(PAR_OPEN);
			setState(224);
			expr(0);
			setState(225);
			match(SEMICOLON);
			setState(226);
			expr(0);
			setState(227);
			match(SEMICOLON);
			setState(228);
			expr(0);
			setState(229);
			match(PAR_CLOSE);
			setState(230);
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
		enterRule(_localctx, 34, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(CBRACE_OPEN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CBRACE_OPEN) | (1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(233);
				statement();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(RETURN);
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(242);
				match(PAR_OPEN);
				setState(243);
				expr(0);
				setState(244);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				setState(246);
				expr(0);
				}
				break;
			}
			setState(249);
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
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public TerminalNode EQUAL() { return getToken(BPSLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SBRACE_OPEN() { return getToken(BPSLParser.SBRACE_OPEN, 0); }
		public ConstantExprContext constantExpr() {
			return getRuleContext(ConstantExprContext.class,0);
		}
		public TerminalNode SBRACE_CLOSE() { return getToken(BPSLParser.SBRACE_CLOSE, 0); }
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
		enterRule(_localctx, 38, RULE_variableDeclaration);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(252);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(253);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(255);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(256);
				match(EQUAL);
				setState(257);
				expr(0);
				setState(258);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(261);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(262);
				match(SBRACE_OPEN);
				setState(263);
				constantExpr(0);
				setState(264);
				match(SBRACE_CLOSE);
				setState(265);
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
		public TerminalNode DECREMENT() { return getToken(BPSLParser.DECREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(BPSLParser.INCREMENT, 0); }
		public TerminalNode MINUS() { return getToken(BPSLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(BPSLParser.NOT, 0); }
		public TerminalNode MUL() { return getToken(BPSLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(BPSLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BPSLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(BPSLParser.PLUS, 0); }
		public TerminalNode MUL_EQUAL() { return getToken(BPSLParser.MUL_EQUAL, 0); }
		public TerminalNode DIV_EQUAL() { return getToken(BPSLParser.DIV_EQUAL, 0); }
		public TerminalNode MOD_EQUAL() { return getToken(BPSLParser.MOD_EQUAL, 0); }
		public TerminalNode PLUS_EQUAL() { return getToken(BPSLParser.PLUS_EQUAL, 0); }
		public TerminalNode MINUS_EQUAL() { return getToken(BPSLParser.MINUS_EQUAL, 0); }
		public TerminalNode LESS_EQUAL() { return getToken(BPSLParser.LESS_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(BPSLParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(BPSLParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(BPSLParser.LESS, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(BPSLParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(BPSLParser.NOT_EQUAL, 0); }
		public TerminalNode OR_OR() { return getToken(BPSLParser.OR_OR, 0); }
		public TerminalNode AND_AND() { return getToken(BPSLParser.AND_AND, 0); }
		public TerminalNode SHIFT_LEFT() { return getToken(BPSLParser.SHIFT_LEFT, 0); }
		public TerminalNode SHIFT_RIGHT() { return getToken(BPSLParser.SHIFT_RIGHT, 0); }
		public TerminalNode AND() { return getToken(BPSLParser.AND, 0); }
		public TerminalNode OR() { return getToken(BPSLParser.OR, 0); }
		public TerminalNode EQUAL() { return getToken(BPSLParser.EQUAL, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(270);
				match(L_INT);
				}
				break;
			case 2:
				{
				setState(271);
				match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(272);
				match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(273);
				match(L_STRING);
				}
				break;
			case 5:
				{
				setState(274);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(275);
				match(PAR_OPEN);
				setState(276);
				expr(0);
				setState(277);
				match(PAR_CLOSE);
				}
				break;
			case 7:
				{
				setState(279);
				functionCall();
				}
				break;
			case 8:
				{
				setState(280);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(281);
				expr(3);
				}
				break;
			case 9:
				{
				setState(282);
				((ExprContext)_localctx).op = match(MINUS);
				setState(283);
				expr(2);
				}
				break;
			case 10:
				{
				setState(284);
				((ExprContext)_localctx).op = match(NOT);
				setState(285);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(289);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(290);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(292);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(294);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(295);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_EQUAL) | (1L << DIV_EQUAL) | (1L << MOD_EQUAL))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(298);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS_EQUAL || _la==MINUS_EQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(299);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(300);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(301);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << GREATER) | (1L << GREATER_EQUAL) | (1L << LESS_EQUAL))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(302);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(304);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==NOT_EQUAL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(306);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(307);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND_AND || _la==OR_OR) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(308);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(310);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << SHIFT_LEFT) | (1L << SHIFT_RIGHT))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(311);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313);
						((ExprContext)_localctx).op = match(EQUAL);
						setState(314);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(316);
						((ExprContext)_localctx).op = match(SBRACE_OPEN);
						setState(317);
						expr(0);
						setState(318);
						match(SBRACE_CLOSE);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(321);
						((ExprContext)_localctx).op = match(DOT);
						setState(322);
						match(IDENTIFIER);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(324);
						((ExprContext)_localctx).op = match(DOT);
						setState(325);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public Token name;
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 42, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(332);
			match(PAR_OPEN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(333);
				expr(0);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(334);
					match(COMA);
					}
				}

				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
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
		case 11:
			return constantExpr_sempred((ConstantExprContext)_localctx, predIndex);
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constantExpr_sempred(ConstantExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 16);
		case 12:
			return precpred(_ctx, 15);
		case 13:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u015b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\5\5A\n"+
		"\5\3\5\3\5\5\5E\n\5\3\5\3\5\3\5\7\5J\n\5\f\5\16\5M\13\5\3\5\3\5\3\6\5"+
		"\6R\n\6\3\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\5\bh\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16"+
		"\bs\13\b\3\b\3\b\3\b\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u0080\n\t\f"+
		"\t\16\t\u0083\13\t\3\t\3\t\3\t\3\n\5\n\u0089\n\n\3\n\3\n\3\n\3\n\5\n\u008f"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00a0\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00b0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r"+
		"\u00bb\13\r\3\16\3\16\3\16\3\16\5\16\u00c1\n\16\7\16\u00c3\n\16\f\16\16"+
		"\16\u00c6\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00d3\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23"+
		"\u00ed\n\23\f\23\16\23\u00f0\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00fa\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010e\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0121\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0149\n\26\f\26\16\26\u014c\13\26\3\27\3\27\3\27\3\27\5\27\u0152\n\27"+
		"\7\27\u0154\n\27\f\27\16\27\u0157\13\27\3\27\3\27\3\27\2\4\30*\30\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\r\3\2\62\65\3\2\f\r\3\2"+
		"\33\35\3\2 !\3\2\60\61\3\2#%\3\2&\'\4\2\36\37()\3\2*+\3\2,-\4\2\30\31"+
		"./\2\u0183\2\61\3\2\2\2\4\64\3\2\2\2\6=\3\2\2\2\b@\3\2\2\2\nQ\3\2\2\2"+
		"\f_\3\2\2\2\16g\3\2\2\2\20x\3\2\2\2\22\u0097\3\2\2\2\24\u009f\3\2\2\2"+
		"\26\u00a1\3\2\2\2\30\u00af\3\2\2\2\32\u00bc\3\2\2\2\34\u00d2\3\2\2\2\36"+
		"\u00d4\3\2\2\2 \u00da\3\2\2\2\"\u00e0\3\2\2\2$\u00ea\3\2\2\2&\u00f3\3"+
		"\2\2\2(\u010d\3\2\2\2*\u0120\3\2\2\2,\u014d\3\2\2\2.\60\5\6\4\2/.\3\2"+
		"\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2"+
		"\2\64\65\7\4\2\2\65\67\7\66\2\2\668\t\2\2\2\67\66\3\2\2\2\678\3\2\2\2"+
		"8\5\3\2\2\29>\5\b\5\2:>\5\16\b\2;>\5\n\6\2<>\5\f\7\2=9\3\2\2\2=:\3\2\2"+
		"\2=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?A\5\4\3\2@?\3\2\2\2@A\3\2\2\2AB\3\2"+
		"\2\2BD\7\5\2\2CE\5\26\f\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\66\2\2GK\7"+
		"\16\2\2HJ\5\22\n\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2M"+
		"K\3\2\2\2NO\7\17\2\2O\t\3\2\2\2PR\5\4\3\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2"+
		"\2ST\7\6\2\2TU\7\66\2\2UZ\7\16\2\2VY\5\22\n\2WY\5\16\b\2XV\3\2\2\2XW\3"+
		"\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\17\2\2"+
		"^\13\3\2\2\2_`\7\7\2\2`a\7\66\2\2ab\7\66\2\2bc\7\"\2\2cd\5\30\r\2de\7"+
		"\26\2\2e\r\3\2\2\2fh\5\4\3\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\66\2\2"+
		"jk\7\66\2\2kq\7\20\2\2lm\5\24\13\2mn\7\25\2\2np\3\2\2\2ol\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\21\2\2uv\5$\23\2v\17"+
		"\3\2\2\2wy\5\4\3\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\66\2\2{\u0081\7\20"+
		"\2\2|}\5\24\13\2}~\7\25\2\2~\u0080\3\2\2\2\177|\3\2\2\2\u0080\u0083\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\5$\23\2\u0086\21\3\2\2"+
		"\2\u0087\u0089\5\4\3\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\7\66\2\2\u008b\u008c\7\66\2\2\u008c\u0098\7\26\2"+
		"\2\u008d\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\7\66\2\2\u0091\u0092\7\66\2\2\u0092\u0093\7\23\2"+
		"\2\u0093\u0094\5\30\r\2\u0094\u0095\7\24\2\2\u0095\u0096\7\26\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0088\3\2\2\2\u0097\u008e\3\2\2\2\u0098\23\3\2\2"+
		"\2\u0099\u009a\7\66\2\2\u009a\u00a0\7\66\2\2\u009b\u009c\7\66\2\2\u009c"+
		"\u009d\7\66\2\2\u009d\u009e\7\"\2\2\u009e\u00a0\t\2\2\2\u009f\u0099\3"+
		"\2\2\2\u009f\u009b\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2"+
		"\27\3\2\2\2\u00a3\u00a4\b\r\1\2\u00a4\u00b0\7\62\2\2\u00a5\u00b0\7\63"+
		"\2\2\u00a6\u00b0\7\64\2\2\u00a7\u00b0\7\66\2\2\u00a8\u00a9\7\20\2\2\u00a9"+
		"\u00aa\5\30\r\2\u00aa\u00ab\7\21\2\2\u00ab\u00b0\3\2\2\2\u00ac\u00b0\5"+
		"\32\16\2\u00ad\u00ae\7!\2\2\u00ae\u00b0\5\30\r\3\u00af\u00a3\3\2\2\2\u00af"+
		"\u00a5\3\2\2\2\u00af\u00a6\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00a8\3\2"+
		"\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b2\f\5\2\2\u00b2\u00b3\t\4\2\2\u00b3\u00b8\5\30\r\6\u00b4\u00b5\f"+
		"\4\2\2\u00b5\u00b6\t\5\2\2\u00b6\u00b8\5\30\r\5\u00b7\u00b1\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\31\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\66\2\2\u00bd\u00c4"+
		"\7\20\2\2\u00be\u00c0\5\30\r\2\u00bf\u00c1\7\25\2\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6"+
		"\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\7\21\2\2\u00c8\33\3\2\2\2\u00c9\u00d3\5\36"+
		"\20\2\u00ca\u00d3\5 \21\2\u00cb\u00d3\5\"\22\2\u00cc\u00d3\5$\23\2\u00cd"+
		"\u00d3\5(\25\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\26\2\2\u00d0\u00d3\3"+
		"\2\2\2\u00d1\u00d3\5&\24\2\u00d2\u00c9\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00cb\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2"+
		"\2\2\u00d2\u00d1\3\2\2\2\u00d3\35\3\2\2\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6"+
		"\7\20\2\2\u00d6\u00d7\5*\26\2\u00d7\u00d8\7\21\2\2\u00d8\u00d9\5\34\17"+
		"\2\u00d9\37\3\2\2\2\u00da\u00db\7\13\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd"+
		"\5*\26\2\u00dd\u00de\7\21\2\2\u00de\u00df\5\34\17\2\u00df!\3\2\2\2\u00e0"+
		"\u00e1\7\n\2\2\u00e1\u00e2\7\20\2\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\7"+
		"\26\2\2\u00e4\u00e5\5*\26\2\u00e5\u00e6\7\26\2\2\u00e6\u00e7\5*\26\2\u00e7"+
		"\u00e8\7\21\2\2\u00e8\u00e9\5\34\17\2\u00e9#\3\2\2\2\u00ea\u00ee\7\16"+
		"\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\7\17\2\2\u00f2%\3\2\2\2\u00f3\u00f9\7\b\2\2\u00f4\u00f5"+
		"\7\20\2\2\u00f5\u00f6\5*\26\2\u00f6\u00f7\7\21\2\2\u00f7\u00fa\3\2\2\2"+
		"\u00f8\u00fa\5*\26\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\26\2\2\u00fc\'\3\2\2\2\u00fd"+
		"\u00fe\7\66\2\2\u00fe\u00ff\7\66\2\2\u00ff\u010e\7\26\2\2\u0100\u0101"+
		"\7\66\2\2\u0101\u0102\7\66\2\2\u0102\u0103\7\"\2\2\u0103\u0104\5*\26\2"+
		"\u0104\u0105\7\26\2\2\u0105\u010e\3\2\2\2\u0106\u0107\7\66\2\2\u0107\u0108"+
		"\7\66\2\2\u0108\u0109\7\23\2\2\u0109\u010a\5\30\r\2\u010a\u010b\7\24\2"+
		"\2\u010b\u010c\7\26\2\2\u010c\u010e\3\2\2\2\u010d\u00fd\3\2\2\2\u010d"+
		"\u0100\3\2\2\2\u010d\u0106\3\2\2\2\u010e)\3\2\2\2\u010f\u0110\b\26\1\2"+
		"\u0110\u0121\7\62\2\2\u0111\u0121\7\63\2\2\u0112\u0121\7\64\2\2\u0113"+
		"\u0121\7\65\2\2\u0114\u0121\7\66\2\2\u0115\u0116\7\20\2\2\u0116\u0117"+
		"\5*\26\2\u0117\u0118\7\21\2\2\u0118\u0121\3\2\2\2\u0119\u0121\5,\27\2"+
		"\u011a\u011b\t\6\2\2\u011b\u0121\5*\26\5\u011c\u011d\7!\2\2\u011d\u0121"+
		"\5*\26\4\u011e\u011f\7\32\2\2\u011f\u0121\5*\26\3\u0120\u010f\3\2\2\2"+
		"\u0120\u0111\3\2\2\2\u0120\u0112\3\2\2\2\u0120\u0113\3\2\2\2\u0120\u0114"+
		"\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0119\3\2\2\2\u0120\u011a\3\2\2\2\u0120"+
		"\u011c\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u014a\3\2\2\2\u0122\u0123\f\16"+
		"\2\2\u0123\u0124\t\4\2\2\u0124\u0149\5*\26\17\u0125\u0126\f\r\2\2\u0126"+
		"\u0127\t\5\2\2\u0127\u0149\5*\26\16\u0128\u0129\f\f\2\2\u0129\u012a\t"+
		"\7\2\2\u012a\u0149\5*\26\r\u012b\u012c\f\13\2\2\u012c\u012d\t\b\2\2\u012d"+
		"\u0149\5*\26\f\u012e\u012f\f\n\2\2\u012f\u0130\t\t\2\2\u0130\u0149\5*"+
		"\26\13\u0131\u0132\f\t\2\2\u0132\u0133\t\n\2\2\u0133\u0149\5*\26\n\u0134"+
		"\u0135\f\b\2\2\u0135\u0136\t\13\2\2\u0136\u0149\5*\26\t\u0137\u0138\f"+
		"\7\2\2\u0138\u0139\t\f\2\2\u0139\u0149\5*\26\b\u013a\u013b\f\6\2\2\u013b"+
		"\u013c\7\"\2\2\u013c\u0149\5*\26\7\u013d\u013e\f\22\2\2\u013e\u013f\7"+
		"\23\2\2\u013f\u0140\5*\26\2\u0140\u0141\7\24\2\2\u0141\u0149\3\2\2\2\u0142"+
		"\u0143\f\21\2\2\u0143\u0144\7\27\2\2\u0144\u0149\7\66\2\2\u0145\u0146"+
		"\f\20\2\2\u0146\u0147\7\27\2\2\u0147\u0149\5,\27\2\u0148\u0122\3\2\2\2"+
		"\u0148\u0125\3\2\2\2\u0148\u0128\3\2\2\2\u0148\u012b\3\2\2\2\u0148\u012e"+
		"\3\2\2\2\u0148\u0131\3\2\2\2\u0148\u0134\3\2\2\2\u0148\u0137\3\2\2\2\u0148"+
		"\u013a\3\2\2\2\u0148\u013d\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0145\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"+\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\66\2\2\u014e\u0155\7\20\2"+
		"\2\u014f\u0151\5*\26\2\u0150\u0152\7\25\2\2\u0151\u0150\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u014f\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0158\u0159\7\21\2\2\u0159-\3\2\2\2!\61\67=@DKQXZgqx\u0081"+
		"\u0088\u008e\u0097\u009f\u00af\u00b7\u00b9\u00c0\u00c4\u00d2\u00ee\u00f9"+
		"\u010d\u0120\u0148\u014a\u0151\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}