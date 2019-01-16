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
		WS=1, AT=2, IMPORT=3, STRUCT=4, CLASS=5, CONST=6, RETURN=7, IF=8, FOR=9, 
		WHILE=10, QUALIFIER_CBUF=11, QUALIFIER_VL=12, CBRACE_OPEN=13, CBRACE_CLOSE=14, 
		PAR_OPEN=15, PAR_CLOSE=16, QUOTE=17, SBRACE_OPEN=18, SBRACE_CLOSE=19, 
		COMA=20, SEMICOLON=21, DOT=22, AND=23, OR=24, NOT=25, DIV=26, MUL=27, 
		MOD=28, LESS=29, GREATER=30, PLUS=31, MINUS=32, EQUAL=33, MUL_EQUAL=34, 
		DIV_EQUAL=35, MOD_EQUAL=36, PLUS_EQUAL=37, MINUS_EQUAL=38, GREATER_EQUAL=39, 
		LESS_EQUAL=40, EQUAL_EQUAL=41, NOT_EQUAL=42, AND_AND=43, OR_OR=44, SHIFT_LEFT=45, 
		SHIFT_RIGHT=46, INCREMENT=47, DECREMENT=48, L_INT=49, L_FLOAT=50, L_DOUBLE=51, 
		L_STRING=52, IDENTIFIER=53;
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
		null, null, "'@'", "'import'", "'struct'", "'class'", "'const'", "'return'", 
		"'if'", "'for'", "'while'", "'constbuf'", "'vlayout'", "'{'", "'}'", "'('", 
		"')'", "'\"'", "'['", "']'", "','", "';'", "'.'", "'&'", "'|'", "'!'", 
		"'/'", "'*'", "'%'", "'<'", "'>'", "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "AT", "IMPORT", "STRUCT", "CLASS", "CONST", "RETURN", "IF", 
		"FOR", "WHILE", "QUALIFIER_CBUF", "QUALIFIER_VL", "CBRACE_OPEN", "CBRACE_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "QUOTE", "SBRACE_OPEN", "SBRACE_CLOSE", "COMA", 
		"SEMICOLON", "DOT", "AND", "OR", "NOT", "DIV", "MUL", "MOD", "LESS", "GREATER", 
		"PLUS", "MINUS", "EQUAL", "MUL_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "PLUS_EQUAL", 
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				classFucker();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				constantDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				importBlock();
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
			case LESS:
				{
				setState(64);
				sysImport();
				}
				break;
			case QUOTE:
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
		public TerminalNode LESS() { return getToken(BPSLParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(BPSLParser.GREATER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
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
			match(LESS);
			setState(71);
			((SysImportContext)_localctx).name = match(IDENTIFIER);
			setState(72);
			match(GREATER);
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
		public List<TerminalNode> QUOTE() { return getTokens(BPSLParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(BPSLParser.QUOTE, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(BPSLParser.IDENTIFIER, 0); }
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
			setState(74);
			match(QUOTE);
			setState(75);
			((UserImportContext)_localctx).name = match(IDENTIFIER);
			setState(76);
			match(QUOTE);
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
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(AT);
			setState(79);
			((AnnotationContext)_localctx).name = match(IDENTIFIER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING))) != 0)) {
				{
				setState(80);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(83);
				annotation();
				}
			}

			setState(86);
			match(STRUCT);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUALIFIER_CBUF || _la==QUALIFIER_VL) {
				{
				setState(87);
				qualifier();
				}
			}

			setState(90);
			((StructureContext)_localctx).name = match(IDENTIFIER);
			setState(91);
			match(CBRACE_OPEN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				{
				setState(92);
				attribute();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
		enterRule(_localctx, 14, RULE_classFucker);
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
			match(CLASS);
			setState(104);
			((ClassFuckerContext)_localctx).name = match(IDENTIFIER);
			setState(105);
			match(CBRACE_OPEN);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==IDENTIFIER) {
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(106);
					attribute();
					}
					break;
				case 2:
					{
					setState(107);
					function();
					}
					break;
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
			setState(115);
			match(CONST);
			setState(116);
			((ConstantDefinitionContext)_localctx).type = match(IDENTIFIER);
			setState(117);
			((ConstantDefinitionContext)_localctx).name = match(IDENTIFIER);
			setState(118);
			match(EQUAL);
			setState(119);
			constantExpr(0);
			setState(120);
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
		enterRule(_localctx, 18, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(122);
				annotation();
				}
			}

			setState(125);
			((FunctionContext)_localctx).type = match(IDENTIFIER);
			setState(126);
			((FunctionContext)_localctx).name = match(IDENTIFIER);
			setState(127);
			match(PAR_OPEN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(128);
				functionParameter();
				setState(129);
				match(COMA);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(PAR_CLOSE);
			setState(137);
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
		enterRule(_localctx, 20, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			((ConstructorContext)_localctx).name = match(IDENTIFIER);
			setState(143);
			match(PAR_OPEN);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(144);
				functionParameter();
				setState(145);
				match(COMA);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(PAR_CLOSE);
			setState(153);
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
		enterRule(_localctx, 22, RULE_attribute);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(155);
					annotation();
					}
				}

				setState(158);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(159);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(160);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(161);
					annotation();
					}
				}

				setState(164);
				((AttributeContext)_localctx).type = match(IDENTIFIER);
				setState(165);
				((AttributeContext)_localctx).name = match(IDENTIFIER);
				setState(166);
				match(SBRACE_OPEN);
				setState(167);
				constantExpr(0);
				setState(168);
				match(SBRACE_CLOSE);
				setState(169);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(174);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((FunctionParameterContext)_localctx).type = match(IDENTIFIER);
				setState(176);
				((FunctionParameterContext)_localctx).name = match(IDENTIFIER);
				setState(177);
				match(EQUAL);
				setState(178);
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
			setState(181);
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
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(184);
				((ConstantExprContext)_localctx).value = match(L_INT);
				}
				break;
			case 2:
				{
				setState(185);
				((ConstantExprContext)_localctx).value = match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(186);
				((ConstantExprContext)_localctx).value = match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(187);
				((ConstantExprContext)_localctx).value = match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(188);
				match(PAR_OPEN);
				setState(189);
				constantExpr(0);
				setState(190);
				match(PAR_CLOSE);
				}
				break;
			case 6:
				{
				setState(192);
				constantFunctionCall();
				}
				break;
			case 7:
				{
				setState(193);
				((ConstantExprContext)_localctx).op = match(MINUS);
				setState(194);
				constantExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(197);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(198);
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
						setState(199);
						constantExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new ConstantExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_constantExpr);
						setState(200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(201);
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
						setState(202);
						constantExpr(3);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
			setState(208);
			((ConstantFunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(209);
			match(PAR_OPEN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << MINUS) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(210);
				constantExpr(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(211);
					match(COMA);
					}
				}

				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				whileStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				compoundStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				variableDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				expr(0);
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
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
			setState(232);
			match(IF);
			setState(233);
			match(PAR_OPEN);
			setState(234);
			expr(0);
			setState(235);
			match(PAR_CLOSE);
			setState(236);
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
			setState(238);
			match(WHILE);
			setState(239);
			match(PAR_OPEN);
			setState(240);
			expr(0);
			setState(241);
			match(PAR_CLOSE);
			setState(242);
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
			setState(244);
			match(FOR);
			setState(245);
			match(PAR_OPEN);
			setState(246);
			expr(0);
			setState(247);
			match(SEMICOLON);
			setState(248);
			expr(0);
			setState(249);
			match(SEMICOLON);
			setState(250);
			expr(0);
			setState(251);
			match(PAR_CLOSE);
			setState(252);
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
			setState(254);
			match(CBRACE_OPEN);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << CBRACE_OPEN) | (1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(255);
				statement();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
			setState(263);
			match(RETURN);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(264);
				match(PAR_OPEN);
				setState(265);
				expr(0);
				setState(266);
				match(PAR_CLOSE);
				}
				break;
			case 2:
				{
				setState(268);
				expr(0);
				}
				break;
			}
			setState(271);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(274);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(275);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(277);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(278);
				match(EQUAL);
				setState(279);
				expr(0);
				setState(280);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				((VariableDeclarationContext)_localctx).type = match(IDENTIFIER);
				setState(283);
				((VariableDeclarationContext)_localctx).name = match(IDENTIFIER);
				setState(284);
				match(SBRACE_OPEN);
				setState(285);
				constantExpr(0);
				setState(286);
				match(SBRACE_CLOSE);
				setState(287);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(292);
				match(L_INT);
				}
				break;
			case 2:
				{
				setState(293);
				match(L_FLOAT);
				}
				break;
			case 3:
				{
				setState(294);
				match(L_DOUBLE);
				}
				break;
			case 4:
				{
				setState(295);
				match(L_STRING);
				}
				break;
			case 5:
				{
				setState(296);
				match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(297);
				match(PAR_OPEN);
				setState(298);
				expr(0);
				setState(299);
				match(PAR_CLOSE);
				}
				break;
			case 7:
				{
				setState(301);
				functionCall();
				}
				break;
			case 8:
				{
				setState(302);
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
				setState(303);
				expr(3);
				}
				break;
			case 9:
				{
				setState(304);
				((ExprContext)_localctx).op = match(MINUS);
				setState(305);
				expr(2);
				}
				break;
			case 10:
				{
				setState(306);
				((ExprContext)_localctx).op = match(NOT);
				setState(307);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(310);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(311);
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
						setState(312);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(313);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(314);
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
						setState(315);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(316);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(317);
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
						setState(318);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(320);
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
						setState(321);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(323);
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
						setState(324);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(326);
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
						setState(327);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(329);
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
						setState(330);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(331);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(332);
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
						setState(333);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(335);
						((ExprContext)_localctx).op = match(EQUAL);
						setState(336);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(338);
						((ExprContext)_localctx).op = match(SBRACE_OPEN);
						setState(339);
						expr(0);
						setState(340);
						match(SBRACE_CLOSE);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(342);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(343);
						((ExprContext)_localctx).op = match(DOT);
						setState(344);
						match(IDENTIFIER);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(345);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(346);
						((ExprContext)_localctx).op = match(DOT);
						setState(347);
						functionCall();
						}
						break;
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(353);
			((FunctionCallContext)_localctx).name = match(IDENTIFIER);
			setState(354);
			match(PAR_OPEN);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_OPEN) | (1L << NOT) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << L_INT) | (1L << L_FLOAT) | (1L << L_DOUBLE) | (1L << L_STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(355);
				expr(0);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(356);
					match(COMA);
					}
				}

				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0171\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\5\3@\n\3"+
		"\3\4\3\4\3\4\5\4E\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\5\7T\n\7\3\b\5\bW\n\b\3\b\3\b\5\b[\n\b\3\b\3\b\3\b\7\b`\n\b\f\b\16"+
		"\bc\13\b\3\b\3\b\3\t\5\th\n\t\3\t\3\t\3\t\3\t\3\t\7\to\n\t\f\t\16\tr\13"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\5\13~\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\13\3\13\3\13"+
		"\3\f\5\f\u008f\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13"+
		"\f\3\f\3\f\3\f\3\r\5\r\u009f\n\r\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00b6\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00c6\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00ce\n"+
		"\20\f\20\16\20\u00d1\13\20\3\21\3\21\3\21\3\21\5\21\u00d7\n\21\7\21\u00d9"+
		"\n\21\f\21\16\21\u00dc\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00e9\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\7\26\u0103\n\26\f\26\16\26\u0106\13\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0110\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0124\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0137\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u015f\n\31\f\31\16\31\u0162\13\31\3\32\3\32\3\32\3\32"+
		"\5\32\u0168\n\32\7\32\u016a\n\32\f\32\16\32\u016d\13\32\3\32\3\32\3\32"+
		"\2\4\36\60\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2"+
		"\r\3\2\63\66\3\2\r\16\3\2\34\36\3\2!\"\3\2\61\62\3\2$&\3\2\'(\4\2\37 "+
		")*\3\2+,\3\2-.\4\2\31\32/\60\2\u0198\2\67\3\2\2\2\4?\3\2\2\2\6A\3\2\2"+
		"\2\bH\3\2\2\2\nL\3\2\2\2\fP\3\2\2\2\16V\3\2\2\2\20g\3\2\2\2\22u\3\2\2"+
		"\2\24}\3\2\2\2\26\u008e\3\2\2\2\30\u00ad\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7"+
		"\3\2\2\2\36\u00c5\3\2\2\2 \u00d2\3\2\2\2\"\u00e8\3\2\2\2$\u00ea\3\2\2"+
		"\2&\u00f0\3\2\2\2(\u00f6\3\2\2\2*\u0100\3\2\2\2,\u0109\3\2\2\2.\u0123"+
		"\3\2\2\2\60\u0136\3\2\2\2\62\u0163\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:@\5\16\b"+
		"\2;@\5\24\13\2<@\5\20\t\2=@\5\22\n\2>@\5\6\4\2?:\3\2\2\2?;\3\2\2\2?<\3"+
		"\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AD\7\5\2\2BE\5\b\5\2CE\5\n\6\2DB"+
		"\3\2\2\2DC\3\2\2\2EF\3\2\2\2FG\7\27\2\2G\7\3\2\2\2HI\7\37\2\2IJ\7\67\2"+
		"\2JK\7 \2\2K\t\3\2\2\2LM\7\23\2\2MN\7\67\2\2NO\7\23\2\2O\13\3\2\2\2PQ"+
		"\7\4\2\2QS\7\67\2\2RT\t\2\2\2SR\3\2\2\2ST\3\2\2\2T\r\3\2\2\2UW\5\f\7\2"+
		"VU\3\2\2\2VW\3\2\2\2WX\3\2\2\2XZ\7\6\2\2Y[\5\34\17\2ZY\3\2\2\2Z[\3\2\2"+
		"\2[\\\3\2\2\2\\]\7\67\2\2]a\7\17\2\2^`\5\30\r\2_^\3\2\2\2`c\3\2\2\2a_"+
		"\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\20\2\2e\17\3\2\2\2fh\5\f\7"+
		"\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\7\2\2jk\7\67\2\2kp\7\17\2\2lo\5\30"+
		"\r\2mo\5\24\13\2nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3"+
		"\2\2\2rp\3\2\2\2st\7\20\2\2t\21\3\2\2\2uv\7\b\2\2vw\7\67\2\2wx\7\67\2"+
		"\2xy\7#\2\2yz\5\36\20\2z{\7\27\2\2{\23\3\2\2\2|~\5\f\7\2}|\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\7\67\2\2\u0080\u0081\7\67\2\2\u0081\u0087"+
		"\7\21\2\2\u0082\u0083\5\32\16\2\u0083\u0084\7\26\2\2\u0084\u0086\3\2\2"+
		"\2\u0085\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\22\2\2"+
		"\u008b\u008c\5*\26\2\u008c\25\3\2\2\2\u008d\u008f\5\f\7\2\u008e\u008d"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\67\2\2"+
		"\u0091\u0097\7\21\2\2\u0092\u0093\5\32\16\2\u0093\u0094\7\26\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\7\22\2\2\u009b\u009c\5*\26\2\u009c\27\3\2\2\2\u009d\u009f\5\f\7"+
		"\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7\67\2\2\u00a1\u00a2\7\67\2\2\u00a2\u00ae\7\27\2\2\u00a3\u00a5\5\f\7"+
		"\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\7\67\2\2\u00a7\u00a8\7\67\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\5\36\20"+
		"\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac\7\27\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u009e\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b0\7\67\2"+
		"\2\u00b0\u00b6\7\67\2\2\u00b1\u00b2\7\67\2\2\u00b2\u00b3\7\67\2\2\u00b3"+
		"\u00b4\7#\2\2\u00b4\u00b6\t\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2"+
		"\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\t\3\2\2\u00b8\35\3\2\2\2\u00b9\u00ba"+
		"\b\20\1\2\u00ba\u00c6\7\63\2\2\u00bb\u00c6\7\64\2\2\u00bc\u00c6\7\65\2"+
		"\2\u00bd\u00c6\7\67\2\2\u00be\u00bf\7\21\2\2\u00bf\u00c0\5\36\20\2\u00c0"+
		"\u00c1\7\22\2\2\u00c1\u00c6\3\2\2\2\u00c2\u00c6\5 \21\2\u00c3\u00c4\7"+
		"\"\2\2\u00c4\u00c6\5\36\20\3\u00c5\u00b9\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5"+
		"\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8\f\5\2\2\u00c8"+
		"\u00c9\t\4\2\2\u00c9\u00ce\5\36\20\6\u00ca\u00cb\f\4\2\2\u00cb\u00cc\t"+
		"\5\2\2\u00cc\u00ce\5\36\20\5\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\37\3\2\2"+
		"\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\67\2\2\u00d3\u00da\7\21\2\2\u00d4"+
		"\u00d6\5\36\20\2\u00d5\u00d7\7\26\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\22\2\2\u00de!\3\2\2\2\u00df\u00e9\5$\23\2\u00e0\u00e9"+
		"\5&\24\2\u00e1\u00e9\5(\25\2\u00e2\u00e9\5*\26\2\u00e3\u00e9\5.\30\2\u00e4"+
		"\u00e5\5\60\31\2\u00e5\u00e6\7\27\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e9"+
		"\5,\27\2\u00e8\u00df\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e1\3\2\2\2\u00e8"+
		"\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e7\3\2"+
		"\2\2\u00e9#\3\2\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed"+
		"\5\60\31\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5\"\22\2\u00ef%\3\2\2\2\u00f0"+
		"\u00f1\7\f\2\2\u00f1\u00f2\7\21\2\2\u00f2\u00f3\5\60\31\2\u00f3\u00f4"+
		"\7\22\2\2\u00f4\u00f5\5\"\22\2\u00f5\'\3\2\2\2\u00f6\u00f7\7\13\2\2\u00f7"+
		"\u00f8\7\21\2\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\7\27\2\2\u00fa\u00fb"+
		"\5\60\31\2\u00fb\u00fc\7\27\2\2\u00fc\u00fd\5\60\31\2\u00fd\u00fe\7\22"+
		"\2\2\u00fe\u00ff\5\"\22\2\u00ff)\3\2\2\2\u0100\u0104\7\17\2\2\u0101\u0103"+
		"\5\"\22\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108"+
		"\7\20\2\2\u0108+\3\2\2\2\u0109\u010f\7\t\2\2\u010a\u010b\7\21\2\2\u010b"+
		"\u010c\5\60\31\2\u010c\u010d\7\22\2\2\u010d\u0110\3\2\2\2\u010e\u0110"+
		"\5\60\31\2\u010f\u010a\3\2\2\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u0111\3\2\2\2\u0111\u0112\7\27\2\2\u0112-\3\2\2\2\u0113\u0114\7"+
		"\67\2\2\u0114\u0115\7\67\2\2\u0115\u0124\7\27\2\2\u0116\u0117\7\67\2\2"+
		"\u0117\u0118\7\67\2\2\u0118\u0119\7#\2\2\u0119\u011a\5\60\31\2\u011a\u011b"+
		"\7\27\2\2\u011b\u0124\3\2\2\2\u011c\u011d\7\67\2\2\u011d\u011e\7\67\2"+
		"\2\u011e\u011f\7\24\2\2\u011f\u0120\5\36\20\2\u0120\u0121\7\25\2\2\u0121"+
		"\u0122\7\27\2\2\u0122\u0124\3\2\2\2\u0123\u0113\3\2\2\2\u0123\u0116\3"+
		"\2\2\2\u0123\u011c\3\2\2\2\u0124/\3\2\2\2\u0125\u0126\b\31\1\2\u0126\u0137"+
		"\7\63\2\2\u0127\u0137\7\64\2\2\u0128\u0137\7\65\2\2\u0129\u0137\7\66\2"+
		"\2\u012a\u0137\7\67\2\2\u012b\u012c\7\21\2\2\u012c\u012d\5\60\31\2\u012d"+
		"\u012e\7\22\2\2\u012e\u0137\3\2\2\2\u012f\u0137\5\62\32\2\u0130\u0131"+
		"\t\6\2\2\u0131\u0137\5\60\31\5\u0132\u0133\7\"\2\2\u0133\u0137\5\60\31"+
		"\4\u0134\u0135\7\33\2\2\u0135\u0137\5\60\31\3\u0136\u0125\3\2\2\2\u0136"+
		"\u0127\3\2\2\2\u0136\u0128\3\2\2\2\u0136\u0129\3\2\2\2\u0136\u012a\3\2"+
		"\2\2\u0136\u012b\3\2\2\2\u0136\u012f\3\2\2\2\u0136\u0130\3\2\2\2\u0136"+
		"\u0132\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0160\3\2\2\2\u0138\u0139\f\16"+
		"\2\2\u0139\u013a\t\4\2\2\u013a\u015f\5\60\31\17\u013b\u013c\f\r\2\2\u013c"+
		"\u013d\t\5\2\2\u013d\u015f\5\60\31\16\u013e\u013f\f\f\2\2\u013f\u0140"+
		"\t\7\2\2\u0140\u015f\5\60\31\r\u0141\u0142\f\13\2\2\u0142\u0143\t\b\2"+
		"\2\u0143\u015f\5\60\31\f\u0144\u0145\f\n\2\2\u0145\u0146\t\t\2\2\u0146"+
		"\u015f\5\60\31\13\u0147\u0148\f\t\2\2\u0148\u0149\t\n\2\2\u0149\u015f"+
		"\5\60\31\n\u014a\u014b\f\b\2\2\u014b\u014c\t\13\2\2\u014c\u015f\5\60\31"+
		"\t\u014d\u014e\f\7\2\2\u014e\u014f\t\f\2\2\u014f\u015f\5\60\31\b\u0150"+
		"\u0151\f\6\2\2\u0151\u0152\7#\2\2\u0152\u015f\5\60\31\7\u0153\u0154\f"+
		"\22\2\2\u0154\u0155\7\24\2\2\u0155\u0156\5\60\31\2\u0156\u0157\7\25\2"+
		"\2\u0157\u015f\3\2\2\2\u0158\u0159\f\21\2\2\u0159\u015a\7\30\2\2\u015a"+
		"\u015f\7\67\2\2\u015b\u015c\f\20\2\2\u015c\u015d\7\30\2\2\u015d\u015f"+
		"\5\62\32\2\u015e\u0138\3\2\2\2\u015e\u013b\3\2\2\2\u015e\u013e\3\2\2\2"+
		"\u015e\u0141\3\2\2\2\u015e\u0144\3\2\2\2\u015e\u0147\3\2\2\2\u015e\u014a"+
		"\3\2\2\2\u015e\u014d\3\2\2\2\u015e\u0150\3\2\2\2\u015e\u0153\3\2\2\2\u015e"+
		"\u0158\3\2\2\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\61\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164"+
		"\7\67\2\2\u0164\u016b\7\21\2\2\u0165\u0167\5\60\31\2\u0166\u0168\7\26"+
		"\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169"+
		"\u0165\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\22\2\2\u016f"+
		"\63\3\2\2\2\"\67?DSVZagnp}\u0087\u008e\u0097\u009e\u00a4\u00ad\u00b5\u00c5"+
		"\u00cd\u00cf\u00d6\u00da\u00e8\u0104\u010f\u0123\u0136\u015e\u0160\u0167"+
		"\u016b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}