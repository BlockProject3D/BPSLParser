// Generated from blockproject\bpsl\BPSL.g4 by ANTLR 4.7.1

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
		WS=1, COMMENT=2, LINE_COMMENT=3, AT=4, IMPORT=5, STRUCT=6, CLASS=7, CONST=8, 
		RETURN=9, IF=10, FOR=11, WHILE=12, QUALIFIER_CBUF=13, QUALIFIER_VL=14, 
		CBRACE_OPEN=15, CBRACE_CLOSE=16, PAR_OPEN=17, PAR_CLOSE=18, QUOTE=19, 
		SBRACE_OPEN=20, SBRACE_CLOSE=21, COMA=22, SEMICOLON=23, DOT=24, AND=25, 
		OR=26, NOT=27, DIV=28, MUL=29, MOD=30, LESS=31, GREATER=32, PLUS=33, MINUS=34, 
		EQUAL=35, MUL_EQUAL=36, DIV_EQUAL=37, MOD_EQUAL=38, PLUS_EQUAL=39, MINUS_EQUAL=40, 
		GREATER_EQUAL=41, LESS_EQUAL=42, EQUAL_EQUAL=43, NOT_EQUAL=44, AND_AND=45, 
		OR_OR=46, SHIFT_LEFT=47, SHIFT_RIGHT=48, INCREMENT=49, DECREMENT=50, L_INT=51, 
		L_FLOAT=52, L_DOUBLE=53, L_STRING=54, L_STRING_1=55, IDENTIFIER=56;
	public static final int
		RULE_bpsl = 0, RULE_block = 1, RULE_importBlock = 2, RULE_sysImport = 3, 
		RULE_userImport = 4, RULE_annotation = 5, RULE_structure = 6, RULE_classFucker = 7, 
		RULE_constantDefinition = 8, RULE_function = 9, RULE_constructor = 10, 
		RULE_attribute = 11, RULE_functionParameter = 12, RULE_qualifier = 13, 
		RULE_constantExpr = 14, RULE_constantFunctionCall = 15, RULE_statement = 16, 
		RULE_ifStatement = 17, RULE_whileStatement = 18, RULE_forStatement = 19, 
		RULE_compoundStatement = 20, RULE_returnStatement = 21, RULE_variableDeclaration = 22, 
		RULE_expr = 23, RULE_functionCall = 24;
	public static final String[] ruleNames = {
		"bpsl", "block", "importBlock", "sysImport", "userImport", "annotation", 
		"structure", "classFucker", "constantDefinition", "function", "constructor", 
		"attribute", "functionParameter", "qualifier", "constantExpr", "constantFunctionCall", 
		"statement", "ifStatement", "whileStatement", "forStatement", "compoundStatement", 
		"returnStatement", "variableDeclaration", "expr", "functionCall"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'@'", "'import'", "'struct'", "'class'", "'const'", 
		"'return'", "'if'", "'for'", "'while'", "'constbuf'", "'vlayout'", "'{'", 
		"'}'", "'('", "')'", "'\"'", "'['", "']'", "','", "';'", "'.'", "'&'", 
		"'|'", "'!'", "'/'", "'*'", "'%'", "'<'", "'>'", "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LINE_COMMENT", "AT", "IMPORT", "STRUCT", "CLASS", 
		"CONST", "RETURN", "IF", "FOR", "WHILE", "QUALIFIER_CBUF", "QUALIFIER_VL", 
		"CBRACE_OPEN", "CBRACE_CLOSE", "PAR_OPEN", "PAR_CLOSE", "QUOTE", "SBRACE_OPEN", 
		"SBRACE_CLOSE", "COMA", "SEMICOLON", "DOT", "AND", "OR", "NOT", "DIV", 
		"MUL", "MOD", "LESS", "GREATER", "PLUS", "MINUS", "EQUAL", "MUL_EQUAL", 
		"DIV_EQUAL", "MOD_EQUAL", "PLUS_EQUAL", "MINUS_EQUAL", "GREATER_EQUAL", 
		"LESS_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", "AND_AND", "OR_OR", "SHIFT_LEFT", 
		"SHIFT_RIGHT", "INCREMENT", "DECREMENT", "L_INT", "L_FLOAT", "L_DOUBLE", 
		"L_STRING", "L_STRING_1", "IDENTIFIER"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << IMPORT) | (1L << STRUCT) | (1L << CLASS) | (1L << CONST) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(50);
				block();
				}
				}
				setState(55);
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
		public ClassFuckerContext classFucker() {
			return getRuleContext(ClassFuckerContext.class,0);
		}
		public ConstantDefinitionContext constantDefinition() {
			return getRuleContext(ConstantDefinitionContext.class,0);
		}
		public ImportBlockContext importBlock() {
			return getRuleContext(ImportBlockContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				structure();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				classFucker();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				constantDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				importBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				function();
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

	public static class ImportBlockContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(BPSLParser.IMPORT, 0); }
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
		public SysImportContext sysImport() {
			return getRuleContext(SysImportContext.class,0);
		}
		public UserImportContext userImport() {
			return getRuleContext(UserImportContext.class,0);
		}
		public ImportBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBlockContext importBlock() throws RecognitionException {
		ImportBlockContext _localctx = new ImportBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IMPORT);
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_STRING_1:
				{
				setState(64);
				sysImport();
				}
				break;
			case L_STRING:
				{
				setState(65);
				userImport();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68);
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

	public static class SysImportContext extends ParserRuleContext {
		public Token name;
		public TerminalNode L_STRING_1() { return getToken(BPSLParser.L_STRING_1, 0); }
		public SysImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sysImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterSysImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitSysImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitSysImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SysImportContext sysImport() throws RecognitionException {
		SysImportContext _localctx = new SysImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sysImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((SysImportContext)_localctx).name = match(L_STRING_1);
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

	public static class UserImportContext extends ParserRuleContext {
		public Token name;
		public TerminalNode L_STRING() { return getToken(BPSLParser.L_STRING, 0); }
		public UserImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).enterUserImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BPSLListener ) ((BPSLListener)listener).exitUserImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BPSLVisitor ) return ((BPSLVisitor<? extends T>)visitor).visitUserImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserImportContext userImport() throws RecognitionException {
		UserImportContext _localctx = new UserImportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_userImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((UserImportContext)_localctx).name = match(L_STRING);
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
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
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
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(AT);
			setState(75);
			((AnnotationContext)_localctx).name = match(IDENTIFIER);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAR_OPEN) {
				{
				setState(76);
				match(PAR_OPEN);
				setState(77);
				((AnnotationContext)_localctx).value = match(L_STRING);
				setState(78);
				match(PAR_CLOSE);
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
		enterRule(_localctx, 12, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(81);
				annotation();
				}
			}

			setState(84);
			match(STRUCT);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUALIFIER_CBUF || _la==QUALIFIER_VL) {
				{
				setState(85);
				qualifier();
				}
			}

			setState(88);
			((StructureContext)_localctx).name = match(IDENTIFIER);
			setState(89);
			match(CBRACE_OPEN);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(90);
				attribute();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
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
		enterRule(_localctx, 14, RULE_classFucker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(98);
				annotation();
				}
			}

			setState(101);
			match(CLASS);
			setState(102);
			((ClassFuckerContext)_localctx).name = match(IDENTIFIER);
			setState(103);
			match(CBRACE_OPEN);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(104);
					attribute();
					}
					break;
				case 2:
					{
					setState(105);
					constructor();
					}
					break;
				case 3:
					{
					setState(106);
					function();
					}
					break;
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
		enterRule(_localctx, 16, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CONST);
			setState(115);
			((ConstantDefinitionContext)_localctx).type = match(IDENTIFIER);
			setState(116);
			((ConstantDefinitionContext)_localctx).name = match(IDENTIFIER);
			setState(117);
			match(EQUAL);
			setState(118);
			constantExpr(0);
			setState(119);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(BPSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(BPSLParser.IDENTIFIER, i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(121);
				annotation();
				}
			}

			setState(124);
			((FunctionContext)_localctx).type = match(IDENTIFIER);
			setState(125);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			setState(126);
			match(PAR_OPEN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(127);
				functionParameter();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(128);
					match(COMA);
					}
				}

				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(PAR_CLOSE);
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CBRACE_OPEN:
				{
				setState(137);
				compoundStatement();
				}
				break;
			case SEMICOLON:
				{
				setState(138);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstructorContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PAR_OPEN() { return getToken(BPSLParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BPSLParser.PAR_CLOSE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BPSLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 20, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(141);
				annotation();
				}
			}

			setState(144);
			((ConstructorContext)_localctx).name = match(IDENTIFIER);
			setState(145);
			match(PAR_OPEN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(146);
				functionParameter();
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CBRACE_OPEN:
				{
				setState(156);
				compoundStatement();
				}
				break;
			case SEMICOLON:
				{
				setState(157);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 22, RULE_attribute);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(160);
					annotation();
					}
				}

				setState(163);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(164);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(165);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(166);
					annotation();
					}
				}

				setState(169);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(170);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(171);
				match(SBRACE_OPEN);
				setState(172);
				constantExpr(0);
				setState(173);
				match(SBRACE_CLOSE);
				setState(174);
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
		enterRule(_localctx, 24, RULE_functionParameter);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(179);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(181);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				setState(182);
				match(EQUAL);
				setState(183);
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
		enterRule(_localctx, 26, RULE_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_constantExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(189);
				((ConstantExprContext)_localctx).value = match(L_INT);
				}
				break;
			case 2:
				{
				setState(190);
				((ConstantExprContext)_localctx).value = match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(191);
				((ConstantExprContext)_localctx).value = match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(192);
				((ConstantExprContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(193);
				match(PAR_OPEN);
				setState(194);
				constantExpr(0);
				setState(195);
				match(PAR_CLOSE);
				}
				break;
			case 6:
				{
				setState(197);
				constantFunctionCall();
				}
				break;
			case 7:
				{
				setState(198);
				((ConstantExprContext)_localctx).op = match(MINUS);
				setState(199);
				constantExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
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
						setState(204);
						constantExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(205);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(206);
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
						setState(207);
						constantExpr(3);
						}
						break;
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 30, RULE_constantFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			((ConstantFunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(214);
			match(PAR_OPEN);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(215);
				constantExpr(0);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(216);
					match(COMA);
					}
				}

				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
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
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				expr(0);
				setState(232);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
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
		enterRule(_localctx, 34, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(IF);
			setState(238);
			match(PAR_OPEN);
			setState(239);
			expr(0);
			setState(240);
			match(PAR_CLOSE);
			setState(241);
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
		enterRule(_localctx, 36, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(WHILE);
			setState(244);
			match(PAR_OPEN);
			setState(245);
			expr(0);
			setState(246);
			match(PAR_CLOSE);
			setState(247);
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
		enterRule(_localctx, 38, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(FOR);
			setState(250);
			match(PAR_OPEN);
			setState(251);
			expr(0);
			setState(252);
			match(SEMICOLON);
			setState(253);
			expr(0);
			setState(254);
			match(SEMICOLON);
			setState(255);
			expr(0);
			setState(256);
			match(PAR_CLOSE);
			setState(257);
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
		enterRule(_localctx, 40, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(CBRACE_OPEN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CBRACE_OPEN) | (1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(260);
				statement();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
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
		enterRule(_localctx, 42, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(RETURN);
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(269);
				match(PAR_OPEN);
				setState(270);
				expr(0);
				setState(271);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				setState(273);
				expr(0);
				}
				break;
			}
			setState(276);
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
		enterRule(_localctx, 44, RULE_variableDeclaration);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(279);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(280);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(282);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(283);
				match(EQUAL);
				setState(284);
				expr(0);
				setState(285);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(288);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(289);
				match(SBRACE_OPEN);
				setState(290);
				constantExpr(0);
				setState(291);
				match(SBRACE_CLOSE);
				setState(292);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(297);
				match(L_INT);
				}
				break;
			case 2:
				{
				setState(298);
				match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(299);
				match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(300);
				match(L_STRING);
				}
				break;
			case 5:
				{
				setState(301);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(302);
				match(PAR_OPEN);
				setState(303);
				expr(0);
				setState(304);
				match(PAR_CLOSE);
				}
				break;
			case 7:
				{
				setState(306);
				functionCall();
				}
				break;
			case 8:
				{
				setState(307);
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
				setState(308);
				expr(3);
				}
				break;
			case 9:
				{
				setState(309);
				((ExprContext)_localctx).op = match(MINUS);
				setState(310);
				expr(2);
				}
				break;
			case 10:
				{
				setState(311);
				((ExprContext)_localctx).op = match(NOT);
				setState(312);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(316);
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
						setState(317);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(319);
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
						setState(320);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(322);
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
						setState(323);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(325);
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
						setState(326);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(328);
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
						setState(329);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(331);
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
						setState(332);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(334);
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
						setState(335);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(337);
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
						setState(338);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(340);
						((ExprContext)_localctx).op = match(EQUAL);
						setState(341);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(343);
						((ExprContext)_localctx).op = match(SBRACE_OPEN);
						setState(344);
						expr(0);
						setState(345);
						match(SBRACE_CLOSE);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(347);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(348);
						((ExprContext)_localctx).op = match(DOT);
						setState(349);
						match(IDENTIFIER);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(350);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(351);
						((ExprContext)_localctx).op = match(DOT);
						setState(352);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 48, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(359);
			match(PAR_OPEN);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(360);
				expr(0);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(361);
					match(COMA);
					}
				}

				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
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
		case 14:
			return constantExpr_sempred((ConstantExprContext)_localctx, predIndex);
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\3\4\5\4E\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"R\n\7\3\b\5\bU\n\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13"+
		"\b\3\b\3\b\3\t\5\tf\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13}\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0084\n\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13"+
		"\3\13\3\13\5\13\u008e\n\13\3\f\5\f\u0091\n\f\3\f\3\f\3\f\3\f\5\f\u0097"+
		"\n\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f\3\f\3\f\5\f\u00a1\n\f\3\r\5"+
		"\r\u00a4\n\r\3\r\3\r\3\r\3\r\5\r\u00aa\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00b3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bb\n\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cb"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d3\n\20\f\20\16\20\u00d6\13"+
		"\20\3\21\3\21\3\21\3\21\5\21\u00dc\n\21\7\21\u00de\n\21\f\21\16\21\u00e1"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00ee"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u0108\n\26"+
		"\f\26\16\26\u010b\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0115"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0129\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u013c\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0164\n\31\f\31"+
		"\16\31\u0167\13\31\3\32\3\32\3\32\3\32\5\32\u016d\n\32\7\32\u016f\n\32"+
		"\f\32\16\32\u0172\13\32\3\32\3\32\3\32\2\4\36\60\33\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\r\3\2\658\3\2\17\20\3\2\36 \3\2"+
		"#$\3\2\63\64\3\2&(\3\2)*\4\2!\"+,\3\2-.\3\2/\60\4\2\33\34\61\62\2\u01a2"+
		"\2\67\3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fL\3\2\2\2\16"+
		"T\3\2\2\2\20e\3\2\2\2\22t\3\2\2\2\24|\3\2\2\2\26\u0090\3\2\2\2\30\u00b2"+
		"\3\2\2\2\32\u00ba\3\2\2\2\34\u00bc\3\2\2\2\36\u00ca\3\2\2\2 \u00d7\3\2"+
		"\2\2\"\u00ed\3\2\2\2$\u00ef\3\2\2\2&\u00f5\3\2\2\2(\u00fb\3\2\2\2*\u0105"+
		"\3\2\2\2,\u010e\3\2\2\2.\u0128\3\2\2\2\60\u013b\3\2\2\2\62\u0168\3\2\2"+
		"\2\64\66\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"\3\3\2\2\29\67\3\2\2\2:@\5\16\b\2;@\5\20\t\2<@\5\22\n\2=@\5\6\4\2>@\5"+
		"\24\13\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2"+
		"AD\7\7\2\2BE\5\b\5\2CE\5\n\6\2DB\3\2\2\2DC\3\2\2\2EF\3\2\2\2FG\7\31\2"+
		"\2G\7\3\2\2\2HI\79\2\2I\t\3\2\2\2JK\78\2\2K\13\3\2\2\2LM\7\6\2\2MQ\7:"+
		"\2\2NO\7\23\2\2OP\78\2\2PR\7\24\2\2QN\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SU\5"+
		"\f\7\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7\b\2\2WY\5\34\17\2XW\3\2\2\2X"+
		"Y\3\2\2\2YZ\3\2\2\2Z[\7:\2\2[_\7\21\2\2\\^\5\30\r\2]\\\3\2\2\2^a\3\2\2"+
		"\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\22\2\2c\17\3\2\2\2df\5"+
		"\f\7\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\t\2\2hi\7:\2\2io\7\21\2\2jn\5"+
		"\30\r\2kn\5\26\f\2ln\5\24\13\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2"+
		"om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\22\2\2s\21\3\2\2\2tu\7\n"+
		"\2\2uv\7:\2\2vw\7:\2\2wx\7%\2\2xy\5\36\20\2yz\7\31\2\2z\23\3\2\2\2{}\5"+
		"\f\7\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7:\2\2\177\u0080\7:\2\2\u0080"+
		"\u0087\7\23\2\2\u0081\u0083\5\32\16\2\u0082\u0084\7\30\2\2\u0083\u0082"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\u008d\7\24\2\2\u008b\u008e\5*\26\2\u008c"+
		"\u008e\7\31\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\25\3\2\2"+
		"\2\u008f\u0091\5\f\7\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\7:\2\2\u0093\u009a\7\23\2\2\u0094\u0096\5\32\16\2"+
		"\u0095\u0097\7\30\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\7\24"+
		"\2\2\u009e\u00a1\5*\26\2\u009f\u00a1\7\31\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\27\3\2\2\2\u00a2\u00a4\5\f\7\2\u00a3\u00a2\3\2\2"+
		"\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7:\2\2\u00a6\u00a7"+
		"\7:\2\2\u00a7\u00b3\7\31\2\2\u00a8\u00aa\5\f\7\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7:\2\2\u00ac\u00ad\7:\2"+
		"\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\5\36\20\2\u00af\u00b0\7\27\2\2\u00b0"+
		"\u00b1\7\31\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00a3\3\2\2\2\u00b2\u00a9\3"+
		"\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\7:\2\2\u00b5\u00bb\7:\2\2\u00b6\u00b7"+
		"\7:\2\2\u00b7\u00b8\7:\2\2\u00b8\u00b9\7%\2\2\u00b9\u00bb\t\2\2\2\u00ba"+
		"\u00b4\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\t\3\2"+
		"\2\u00bd\35\3\2\2\2\u00be\u00bf\b\20\1\2\u00bf\u00cb\7\65\2\2\u00c0\u00cb"+
		"\7\66\2\2\u00c1\u00cb\7\67\2\2\u00c2\u00cb\7:\2\2\u00c3\u00c4\7\23\2\2"+
		"\u00c4\u00c5\5\36\20\2\u00c5\u00c6\7\24\2\2\u00c6\u00cb\3\2\2\2\u00c7"+
		"\u00cb\5 \21\2\u00c8\u00c9\7$\2\2\u00c9\u00cb\5\36\20\3\u00ca\u00be\3"+
		"\2\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00c3\3\2\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d4\3\2"+
		"\2\2\u00cc\u00cd\f\5\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00d3\5\36\20\6\u00cf"+
		"\u00d0\f\4\2\2\u00d0\u00d1\t\5\2\2\u00d1\u00d3\5\36\20\5\u00d2\u00cc\3"+
		"\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\37\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7:\2\2"+
		"\u00d8\u00df\7\23\2\2\u00d9\u00db\5\36\20\2\u00da\u00dc\7\30\2\2\u00db"+
		"\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\24\2\2\u00e3!\3\2\2\2"+
		"\u00e4\u00ee\5$\23\2\u00e5\u00ee\5&\24\2\u00e6\u00ee\5(\25\2\u00e7\u00ee"+
		"\5*\26\2\u00e8\u00ee\5.\30\2\u00e9\u00ea\5\60\31\2\u00ea\u00eb\7\31\2"+
		"\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\5,\27\2\u00ed\u00e4\3\2\2\2\u00ed\u00e5"+
		"\3\2\2\2\u00ed\u00e6\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee#\3\2\2\2\u00ef\u00f0\7\f\2\2"+
		"\u00f0\u00f1\7\23\2\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\7\24\2\2\u00f3"+
		"\u00f4\5\"\22\2\u00f4%\3\2\2\2\u00f5\u00f6\7\16\2\2\u00f6\u00f7\7\23\2"+
		"\2\u00f7\u00f8\5\60\31\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\5\"\22\2\u00fa"+
		"\'\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\5\60\31"+
		"\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\5\60\31\2\u0100\u0101\7\31\2\2\u0101"+
		"\u0102\5\60\31\2\u0102\u0103\7\24\2\2\u0103\u0104\5\"\22\2\u0104)\3\2"+
		"\2\2\u0105\u0109\7\21\2\2\u0106\u0108\5\"\22\2\u0107\u0106\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\22\2\2\u010d+\3\2\2\2\u010e\u0114"+
		"\7\13\2\2\u010f\u0110\7\23\2\2\u0110\u0111\5\60\31\2\u0111\u0112\7\24"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0115\5\60\31\2\u0114\u010f\3\2\2\2\u0114"+
		"\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\31"+
		"\2\2\u0117-\3\2\2\2\u0118\u0119\7:\2\2\u0119\u011a\7:\2\2\u011a\u0129"+
		"\7\31\2\2\u011b\u011c\7:\2\2\u011c\u011d\7:\2\2\u011d\u011e\7%\2\2\u011e"+
		"\u011f\5\60\31\2\u011f\u0120\7\31\2\2\u0120\u0129\3\2\2\2\u0121\u0122"+
		"\7:\2\2\u0122\u0123\7:\2\2\u0123\u0124\7\26\2\2\u0124\u0125\5\36\20\2"+
		"\u0125\u0126\7\27\2\2\u0126\u0127\7\31\2\2\u0127\u0129\3\2\2\2\u0128\u0118"+
		"\3\2\2\2\u0128\u011b\3\2\2\2\u0128\u0121\3\2\2\2\u0129/\3\2\2\2\u012a"+
		"\u012b\b\31\1\2\u012b\u013c\7\65\2\2\u012c\u013c\7\66\2\2\u012d\u013c"+
		"\7\67\2\2\u012e\u013c\78\2\2\u012f\u013c\7:\2\2\u0130\u0131\7\23\2\2\u0131"+
		"\u0132\5\60\31\2\u0132\u0133\7\24\2\2\u0133\u013c\3\2\2\2\u0134\u013c"+
		"\5\62\32\2\u0135\u0136\t\6\2\2\u0136\u013c\5\60\31\5\u0137\u0138\7$\2"+
		"\2\u0138\u013c\5\60\31\4\u0139\u013a\7\35\2\2\u013a\u013c\5\60\31\3\u013b"+
		"\u012a\3\2\2\2\u013b\u012c\3\2\2\2\u013b\u012d\3\2\2\2\u013b\u012e\3\2"+
		"\2\2\u013b\u012f\3\2\2\2\u013b\u0130\3\2\2\2\u013b\u0134\3\2\2\2\u013b"+
		"\u0135\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0165\3\2"+
		"\2\2\u013d\u013e\f\16\2\2\u013e\u013f\t\4\2\2\u013f\u0164\5\60\31\17\u0140"+
		"\u0141\f\r\2\2\u0141\u0142\t\5\2\2\u0142\u0164\5\60\31\16\u0143\u0144"+
		"\f\f\2\2\u0144\u0145\t\7\2\2\u0145\u0164\5\60\31\r\u0146\u0147\f\13\2"+
		"\2\u0147\u0148\t\b\2\2\u0148\u0164\5\60\31\f\u0149\u014a\f\n\2\2\u014a"+
		"\u014b\t\t\2\2\u014b\u0164\5\60\31\13\u014c\u014d\f\t\2\2\u014d\u014e"+
		"\t\n\2\2\u014e\u0164\5\60\31\n\u014f\u0150\f\b\2\2\u0150\u0151\t\13\2"+
		"\2\u0151\u0164\5\60\31\t\u0152\u0153\f\7\2\2\u0153\u0154\t\f\2\2\u0154"+
		"\u0164\5\60\31\b\u0155\u0156\f\6\2\2\u0156\u0157\7%\2\2\u0157\u0164\5"+
		"\60\31\7\u0158\u0159\f\22\2\2\u0159\u015a\7\26\2\2\u015a\u015b\5\60\31"+
		"\2\u015b\u015c\7\27\2\2\u015c\u0164\3\2\2\2\u015d\u015e\f\21\2\2\u015e"+
		"\u015f\7\32\2\2\u015f\u0164\7:\2\2\u0160\u0161\f\20\2\2\u0161\u0162\7"+
		"\32\2\2\u0162\u0164\5\62\32\2\u0163\u013d\3\2\2\2\u0163\u0140\3\2\2\2"+
		"\u0163\u0143\3\2\2\2\u0163\u0146\3\2\2\2\u0163\u0149\3\2\2\2\u0163\u014c"+
		"\3\2\2\2\u0163\u014f\3\2\2\2\u0163\u0152\3\2\2\2\u0163\u0155\3\2\2\2\u0163"+
		"\u0158\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0167\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\61\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u0169\7:\2\2\u0169\u0170\7\23\2\2\u016a\u016c\5\60\31\2"+
		"\u016b\u016d\7\30\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u016a\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7\24"+
		"\2\2\u0174\63\3\2\2\2&\67?DQTX_emo|\u0083\u0087\u008d\u0090\u0096\u009a"+
		"\u00a0\u00a3\u00a9\u00b2\u00ba\u00ca\u00d2\u00d4\u00db\u00df\u00ed\u0109"+
		"\u0114\u0128\u013b\u0163\u0165\u016c\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}