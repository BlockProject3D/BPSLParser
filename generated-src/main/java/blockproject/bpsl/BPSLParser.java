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
		MINUS=30, EQUAL=31, MUL_EQUAL=32, DIV_EQUAL=33, MOD_EQUAL=34, PLUS_EQUAL=35, 
		MINUS_EQUAL=36, GREATER_EQUAL=37, LESS_EQUAL=38, EQUAL_EQUAL=39, NOT_EQUAL=40, 
		AND_AND=41, OR_OR=42, SHIFT_LEFT=43, SHIFT_RIGHT=44, INCREMENT=45, DECREMENT=46, 
		L_INT=47, L_FLOAT=48, L_DOUBLE=49, L_STRING=50, IDENTIFIER=51;
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
		public Token name;
		public TerminalNode STRUCT() { return getToken(BPSLParser.STRUCT, 0); }
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
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
			((StructureContext)_localctx).name = match(IDENTIFIER);
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
		public Token name;
		public TerminalNode CLASS() { return getToken(BPSLParser.CLASS, 0); }
		public TerminalNode CBRACE_OPEN() { return getToken(BPSLParser.CBRACE_OPEN, 0); }
		public TerminalNode CBRACE_CLOSE() { return getToken(BPSLParser.CBRACE_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
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
			((ClassFuckerContext)_localctx).name = match(IDENTIFIER);
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
		enterRule(_localctx, 8, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(CONST);
			setState(77);
			((ConstantDefinitionContext)_localctx).type = match(IDENTIFIER);
			setState(78);
			((ConstantDefinitionContext)_localctx).name = match(IDENTIFIER);
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
			((FunctionContext)_localctx).type = match(IDENTIFIER);
			setState(84);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
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
		public Token type;
		public Token name;
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
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
		enterRule(_localctx, 12, RULE_attribute);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(98);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(99);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(101);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(102);
				match(SBRACE_OPEN);
				setState(103);
				constantExpr(0);
				setState(104);
				match(SBRACE_CLOSE);
				setState(105);
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
		enterRule(_localctx, 14, RULE_functionParameter);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(110);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(112);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				setState(113);
				match(EQUAL);
				setState(114);
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
			setState(117);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_constantExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(120);
				((ConstantExprContext)_localctx).value = match(L_INT);
				}
				break;
			case 2:
				{
				setState(121);
				((ConstantExprContext)_localctx).value = match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(122);
				((ConstantExprContext)_localctx).value = match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(123);
				((ConstantExprContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(124);
				match(PAR_OPEN);
				setState(125);
				constantExpr(0);
				setState(126);
				match(PAR_CLOSE);
				}
				break;
			case 6:
				{
				setState(128);
				constantFunctionCall();
				}
				break;
			case 7:
				{
				setState(129);
				((ConstantExprContext)_localctx).op = match(MINUS);
				setState(130);
				constantExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(134);
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
						setState(135);
						constantExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(137);
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
						setState(138);
						constantExpr(3);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 20, RULE_constantFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((ConstantFunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(145);
			match(PAR_OPEN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(146);
				constantExpr(0);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(147);
					match(COMA);
					}
				}

				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				expr(0);
				setState(163);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
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
			setState(168);
			match(IF);
			setState(169);
			match(PAR_OPEN);
			setState(170);
			expr(0);
			setState(171);
			match(PAR_CLOSE);
			setState(172);
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
			setState(174);
			match(WHILE);
			setState(175);
			match(PAR_OPEN);
			setState(176);
			expr(0);
			setState(177);
			match(PAR_CLOSE);
			setState(178);
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
			setState(180);
			match(FOR);
			setState(181);
			match(PAR_OPEN);
			setState(182);
			expr(0);
			setState(183);
			match(PAR_CLOSE);
			setState(184);
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
			setState(186);
			match(CBRACE_OPEN);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CBRACE_OPEN) | (1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(187);
				statement();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
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
			setState(195);
			match(RETURN);
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(196);
				match(PAR_OPEN);
				setState(197);
				expr(0);
				setState(198);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				setState(200);
				expr(0);
				}
				break;
			}
			setState(203);
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
		enterRule(_localctx, 34, RULE_variableDeclaration);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(206);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(207);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(209);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(210);
				match(EQUAL);
				setState(211);
				expr(0);
				setState(212);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(215);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(216);
				match(SBRACE_OPEN);
				setState(217);
				constantExpr(0);
				setState(218);
				match(SBRACE_CLOSE);
				setState(219);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(224);
				match(L_INT);
				}
				break;
			case 2:
				{
				setState(225);
				match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(226);
				match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(227);
				match(L_STRING);
				}
				break;
			case 5:
				{
				setState(228);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(229);
				match(PAR_OPEN);
				setState(230);
				expr(0);
				setState(231);
				match(PAR_CLOSE);
				}
				break;
			case 7:
				{
				setState(233);
				functionCall();
				}
				break;
			case 8:
				{
				setState(234);
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
				setState(235);
				expr(3);
				}
				break;
			case 9:
				{
				setState(236);
				((ExprContext)_localctx).op = match(MINUS);
				setState(237);
				expr(2);
				}
				break;
			case 10:
				{
				setState(238);
				((ExprContext)_localctx).op = match(NOT);
				setState(239);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(243);
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
						setState(244);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(246);
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
						setState(247);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(249);
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
						setState(250);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(252);
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
						setState(253);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(255);
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
						setState(256);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(258);
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
						setState(259);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
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
						setState(262);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
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
						setState(265);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(267);
						((ExprContext)_localctx).op = match(SBRACE_OPEN);
						setState(268);
						expr(0);
						setState(269);
						match(SBRACE_CLOSE);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(272);
						((ExprContext)_localctx).op = match(DOT);
						setState(273);
						match(IDENTIFIER);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(275);
						((ExprContext)_localctx).op = match(DOT);
						setState(276);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(281);
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
		enterRule(_localctx, 38, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(283);
			match(PAR_OPEN);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(284);
				expr(0);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(285);
					match(COMA);
					}
				}

				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tv\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0086\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u008e\n"+
		"\13\f\13\16\13\u0091\13\13\3\f\3\f\3\f\3\f\5\f\u0097\n\f\7\f\u0099\n\f"+
		"\f\f\16\f\u009c\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a9"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21\u00bf\n\21\f\21\16\21\u00c2\13"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00e0\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f3\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0118\n\24\f\24\16\24\u011b\13\24\3\25\3\25"+
		"\3\25\3\25\5\25\u0121\n\25\7\25\u0123\n\25\f\25\16\25\u0126\13\25\3\25"+
		"\3\25\3\25\2\4\24&\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\r"+
		"\3\2\61\64\3\2\13\f\3\2\32\34\3\2\37 \3\2/\60\3\2\"$\3\2%&\4\2\35\36\'"+
		"(\3\2)*\3\2+,\4\2\27\30-.\2\u014a\2-\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2"+
		"\bB\3\2\2\2\nN\3\2\2\2\fU\3\2\2\2\16m\3\2\2\2\20u\3\2\2\2\22w\3\2\2\2"+
		"\24\u0085\3\2\2\2\26\u0092\3\2\2\2\30\u00a8\3\2\2\2\32\u00aa\3\2\2\2\34"+
		"\u00b0\3\2\2\2\36\u00b6\3\2\2\2 \u00bc\3\2\2\2\"\u00c5\3\2\2\2$\u00df"+
		"\3\2\2\2&\u00f2\3\2\2\2(\u011c\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/-\3\2\2\2\60\65\5\6\4\2\61\65\5\f\7\2\62"+
		"\65\5\b\5\2\63\65\5\n\6\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64"+
		"\63\3\2\2\2\65\5\3\2\2\2\66\67\7\4\2\2\678\5\22\n\289\7\65\2\29=\7\r\2"+
		"\2:<\5\16\b\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2"+
		"\2\2@A\7\16\2\2A\7\3\2\2\2BC\7\5\2\2CD\7\65\2\2DI\7\r\2\2EH\5\16\b\2F"+
		"H\5\f\7\2GE\3\2\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2"+
		"KI\3\2\2\2LM\7\16\2\2M\t\3\2\2\2NO\7\6\2\2OP\7\65\2\2PQ\7\65\2\2QR\7!"+
		"\2\2RS\5\24\13\2ST\7\25\2\2T\13\3\2\2\2UV\7\65\2\2VW\7\65\2\2W]\7\17\2"+
		"\2XY\5\20\t\2YZ\7\24\2\2Z\\\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\20\2\2ab\5 \21\2b\r\3\2\2\2cd\7\65\2\2"+
		"de\7\65\2\2en\7\25\2\2fg\7\65\2\2gh\7\65\2\2hi\7\22\2\2ij\5\24\13\2jk"+
		"\7\23\2\2kl\7\25\2\2ln\3\2\2\2mc\3\2\2\2mf\3\2\2\2n\17\3\2\2\2op\7\65"+
		"\2\2pv\7\65\2\2qr\7\65\2\2rs\7\65\2\2st\7!\2\2tv\t\2\2\2uo\3\2\2\2uq\3"+
		"\2\2\2v\21\3\2\2\2wx\t\3\2\2x\23\3\2\2\2yz\b\13\1\2z\u0086\7\61\2\2{\u0086"+
		"\7\62\2\2|\u0086\7\63\2\2}\u0086\7\65\2\2~\177\7\17\2\2\177\u0080\5\24"+
		"\13\2\u0080\u0081\7\20\2\2\u0081\u0086\3\2\2\2\u0082\u0086\5\26\f\2\u0083"+
		"\u0084\7 \2\2\u0084\u0086\5\24\13\3\u0085y\3\2\2\2\u0085{\3\2\2\2\u0085"+
		"|\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083"+
		"\3\2\2\2\u0086\u008f\3\2\2\2\u0087\u0088\f\5\2\2\u0088\u0089\t\4\2\2\u0089"+
		"\u008e\5\24\13\6\u008a\u008b\f\4\2\2\u008b\u008c\t\5\2\2\u008c\u008e\5"+
		"\24\13\5\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2"+
		"\2\u0092\u0093\7\65\2\2\u0093\u009a\7\17\2\2\u0094\u0096\5\24\13\2\u0095"+
		"\u0097\7\24\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3"+
		"\2\2\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\20"+
		"\2\2\u009e\27\3\2\2\2\u009f\u00a9\5\32\16\2\u00a0\u00a9\5\34\17\2\u00a1"+
		"\u00a9\5\36\20\2\u00a2\u00a9\5 \21\2\u00a3\u00a9\5$\23\2\u00a4\u00a5\5"+
		"&\24\2\u00a5\u00a6\7\25\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a9\5\"\22\2\u00a8"+
		"\u009f\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\31\3\2\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5&\24"+
		"\2\u00ad\u00ae\7\20\2\2\u00ae\u00af\5\30\r\2\u00af\33\3\2\2\2\u00b0\u00b1"+
		"\7\n\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\7\20\2\2"+
		"\u00b4\u00b5\5\30\r\2\u00b5\35\3\2\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8"+
		"\7\17\2\2\u00b8\u00b9\5&\24\2\u00b9\u00ba\7\20\2\2\u00ba\u00bb\5\30\r"+
		"\2\u00bb\37\3\2\2\2\u00bc\u00c0\7\r\2\2\u00bd\u00bf\5\30\r\2\u00be\u00bd"+
		"\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\16\2\2\u00c4!\3\2\2\2"+
		"\u00c5\u00cb\7\7\2\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\5&\24\2\u00c8\u00c9"+
		"\7\20\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cc\5&\24\2\u00cb\u00c6\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\7\25\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7\65\2\2\u00d0\u00d1\7\65\2\2\u00d1"+
		"\u00e0\7\25\2\2\u00d2\u00d3\7\65\2\2\u00d3\u00d4\7\65\2\2\u00d4\u00d5"+
		"\7!\2\2\u00d5\u00d6\5&\24\2\u00d6\u00d7\7\25\2\2\u00d7\u00e0\3\2\2\2\u00d8"+
		"\u00d9\7\65\2\2\u00d9\u00da\7\65\2\2\u00da\u00db\7\22\2\2\u00db\u00dc"+
		"\5\24\13\2\u00dc\u00dd\7\23\2\2\u00dd\u00de\7\25\2\2\u00de\u00e0\3\2\2"+
		"\2\u00df\u00cf\3\2\2\2\u00df\u00d2\3\2\2\2\u00df\u00d8\3\2\2\2\u00e0%"+
		"\3\2\2\2\u00e1\u00e2\b\24\1\2\u00e2\u00f3\7\61\2\2\u00e3\u00f3\7\62\2"+
		"\2\u00e4\u00f3\7\63\2\2\u00e5\u00f3\7\64\2\2\u00e6\u00f3\7\65\2\2\u00e7"+
		"\u00e8\7\17\2\2\u00e8\u00e9\5&\24\2\u00e9\u00ea\7\20\2\2\u00ea\u00f3\3"+
		"\2\2\2\u00eb\u00f3\5(\25\2\u00ec\u00ed\t\6\2\2\u00ed\u00f3\5&\24\5\u00ee"+
		"\u00ef\7 \2\2\u00ef\u00f3\5&\24\4\u00f0\u00f1\7\31\2\2\u00f1\u00f3\5&"+
		"\24\3\u00f2\u00e1\3\2\2\2\u00f2\u00e3\3\2\2\2\u00f2\u00e4\3\2\2\2\u00f2"+
		"\u00e5\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00eb\3\2"+
		"\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u0119\3\2\2\2\u00f4\u00f5\f\r\2\2\u00f5\u00f6\t\4\2\2\u00f6\u0118\5&"+
		"\24\16\u00f7\u00f8\f\f\2\2\u00f8\u00f9\t\5\2\2\u00f9\u0118\5&\24\r\u00fa"+
		"\u00fb\f\13\2\2\u00fb\u00fc\t\7\2\2\u00fc\u0118\5&\24\f\u00fd\u00fe\f"+
		"\n\2\2\u00fe\u00ff\t\b\2\2\u00ff\u0118\5&\24\13\u0100\u0101\f\t\2\2\u0101"+
		"\u0102\t\t\2\2\u0102\u0118\5&\24\n\u0103\u0104\f\b\2\2\u0104\u0105\t\n"+
		"\2\2\u0105\u0118\5&\24\t\u0106\u0107\f\7\2\2\u0107\u0108\t\13\2\2\u0108"+
		"\u0118\5&\24\b\u0109\u010a\f\6\2\2\u010a\u010b\t\f\2\2\u010b\u0118\5&"+
		"\24\7\u010c\u010d\f\21\2\2\u010d\u010e\7\22\2\2\u010e\u010f\5&\24\2\u010f"+
		"\u0110\7\23\2\2\u0110\u0118\3\2\2\2\u0111\u0112\f\20\2\2\u0112\u0113\7"+
		"\26\2\2\u0113\u0118\7\65\2\2\u0114\u0115\f\17\2\2\u0115\u0116\7\26\2\2"+
		"\u0116\u0118\5(\25\2\u0117\u00f4\3\2\2\2\u0117\u00f7\3\2\2\2\u0117\u00fa"+
		"\3\2\2\2\u0117\u00fd\3\2\2\2\u0117\u0100\3\2\2\2\u0117\u0103\3\2\2\2\u0117"+
		"\u0106\3\2\2\2\u0117\u0109\3\2\2\2\u0117\u010c\3\2\2\2\u0117\u0111\3\2"+
		"\2\2\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\'\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\65\2"+
		"\2\u011d\u0124\7\17\2\2\u011e\u0120\5&\24\2\u011f\u0121\7\24\2\2\u0120"+
		"\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011e\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\20\2\2\u0128)\3\2\2\2"+
		"\30-\64=GI]mu\u0085\u008d\u008f\u0096\u009a\u00a8\u00c0\u00cb\u00df\u00f2"+
		"\u0117\u0119\u0120\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}