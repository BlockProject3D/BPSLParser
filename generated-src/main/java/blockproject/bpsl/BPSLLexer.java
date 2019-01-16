// Generated from blockproject/bpsl/BPSL.g4 by ANTLR 4.7.1

    package blockproject.bpsl;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BPSLLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "AT", "STRUCT", "CLASS", "CONST", "RETURN", "IF", "FOR", "WHILE", 
		"QUALIFIER_CBUF", "QUALIFIER_VL", "CBRACE_OPEN", "CBRACE_CLOSE", "PAR_OPEN", 
		"PAR_CLOSE", "QUOTE", "SBRACE_OPEN", "SBRACE_CLOSE", "COMA", "SEMICOLON", 
		"DOT", "AND", "OR", "NOT", "DIV", "MUL", "MOD", "LESS", "GREATER", "PLUS", 
		"MINUS", "EQUAL", "MUL_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "PLUS_EQUAL", 
		"MINUS_EQUAL", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", 
		"AND_AND", "OR_OR", "SHIFT_LEFT", "SHIFT_RIGHT", "INCREMENT", "DECREMENT", 
		"NUMERIC", "UPPER", "LOWER", "OPERATOR", "L_INT", "L_FLOAT", "L_DOUBLE", 
		"L_STRING", "IDENTIFIER"
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


	public BPSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BPSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u015d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\6\2u\n\2\r\2\16\2"+
		"v\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		"-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\5\64\u0125\n\64\3\65\6\65\u0128\n\65\r\65\16"+
		"\65\u0129\3\66\6\66\u012d\n\66\r\66\16\66\u012e\3\66\3\66\6\66\u0133\n"+
		"\66\r\66\16\66\u0134\3\66\3\66\3\67\6\67\u013a\n\67\r\67\16\67\u013b\3"+
		"\67\3\67\6\67\u0140\n\67\r\67\16\67\u0141\38\38\78\u0146\n8\f8\168\u0149"+
		"\138\38\38\39\39\39\59\u0150\n9\39\39\39\39\79\u0156\n9\f9\169\u0159\13"+
		"9\39\59\u015c\n9\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e"+
		"\2g\2i\62k\63m\64o\65q\66\3\2\7\5\2\13\f\17\17\"\"\3\2\62;\3\2C\\\3\2"+
		"c|\3\2\2\u0101\2\u0176\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\3t\3\2\2\2\5z\3\2\2\2\7|\3\2\2\2\t\u0083\3\2\2\2\13\u0089\3\2\2\2\r"+
		"\u008f\3\2\2\2\17\u0096\3\2\2\2\21\u0099\3\2\2\2\23\u009d\3\2\2\2\25\u00a3"+
		"\3\2\2\2\27\u00ac\3\2\2\2\31\u00b4\3\2\2\2\33\u00b6\3\2\2\2\35\u00b8\3"+
		"\2\2\2\37\u00ba\3\2\2\2!\u00bc\3\2\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'"+
		"\u00c2\3\2\2\2)\u00c4\3\2\2\2+\u00c6\3\2\2\2-\u00c8\3\2\2\2/\u00ca\3\2"+
		"\2\2\61\u00cc\3\2\2\2\63\u00ce\3\2\2\2\65\u00d0\3\2\2\2\67\u00d2\3\2\2"+
		"\29\u00d4\3\2\2\2;\u00d6\3\2\2\2=\u00d8\3\2\2\2?\u00da\3\2\2\2A\u00dc"+
		"\3\2\2\2C\u00de\3\2\2\2E\u00e1\3\2\2\2G\u00e4\3\2\2\2I\u00e7\3\2\2\2K"+
		"\u00ea\3\2\2\2M\u00ed\3\2\2\2O\u00f0\3\2\2\2Q\u00f3\3\2\2\2S\u00f6\3\2"+
		"\2\2U\u00f9\3\2\2\2W\u00fc\3\2\2\2Y\u00ff\3\2\2\2[\u0102\3\2\2\2]\u0105"+
		"\3\2\2\2_\u0108\3\2\2\2a\u010b\3\2\2\2c\u010d\3\2\2\2e\u010f\3\2\2\2g"+
		"\u0124\3\2\2\2i\u0127\3\2\2\2k\u012c\3\2\2\2m\u0139\3\2\2\2o\u0143\3\2"+
		"\2\2q\u014f\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2"+
		"wx\3\2\2\2xy\b\2\2\2y\4\3\2\2\2z{\7B\2\2{\6\3\2\2\2|}\7u\2\2}~\7v\2\2"+
		"~\177\7t\2\2\177\u0080\7w\2\2\u0080\u0081\7e\2\2\u0081\u0082\7v\2\2\u0082"+
		"\b\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085\7n\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7u\2\2\u0087\u0088\7u\2\2\u0088\n\3\2\2\2\u0089\u008a\7e\2\2\u008a"+
		"\u008b\7q\2\2\u008b\u008c\7p\2\2\u008c\u008d\7u\2\2\u008d\u008e\7v\2\2"+
		"\u008e\f\3\2\2\2\u008f\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092\7v"+
		"\2\2\u0092\u0093\7w\2\2\u0093\u0094\7t\2\2\u0094\u0095\7p\2\2\u0095\16"+
		"\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7h\2\2\u0098\20\3\2\2\2\u0099"+
		"\u009a\7h\2\2\u009a\u009b\7q\2\2\u009b\u009c\7t\2\2\u009c\22\3\2\2\2\u009d"+
		"\u009e\7y\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7n\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7"+
		"q\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9"+
		"\7d\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7h\2\2\u00ab\26\3\2\2\2\u00ac\u00ad"+
		"\7x\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7{\2\2\u00b0"+
		"\u00b1\7q\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7v\2\2\u00b3\30\3\2\2\2\u00b4"+
		"\u00b5\7}\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7\34\3\2\2\2"+
		"\u00b8\u00b9\7*\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7+\2\2\u00bb \3\2\2\2"+
		"\u00bc\u00bd\7$\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7]\2\2\u00bf$\3\2\2\2"+
		"\u00c0\u00c1\7_\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3(\3\2\2\2\u00c4"+
		"\u00c5\7=\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7\60\2\2\u00c7,\3\2\2\2\u00c8"+
		"\u00c9\7(\2\2\u00c9.\3\2\2\2\u00ca\u00cb\7~\2\2\u00cb\60\3\2\2\2\u00cc"+
		"\u00cd\7#\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\64\3\2\2\2\u00d0"+
		"\u00d1\7,\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7\'\2\2\u00d38\3\2\2\2\u00d4"+
		"\u00d5\7>\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7<\3\2\2\2\u00d8\u00d9"+
		"\7-\2\2\u00d9>\3\2\2\2\u00da\u00db\7/\2\2\u00db@\3\2\2\2\u00dc\u00dd\7"+
		"?\2\2\u00ddB\3\2\2\2\u00de\u00df\5\65\33\2\u00df\u00e0\5A!\2\u00e0D\3"+
		"\2\2\2\u00e1\u00e2\5\63\32\2\u00e2\u00e3\5A!\2\u00e3F\3\2\2\2\u00e4\u00e5"+
		"\5\67\34\2\u00e5\u00e6\5A!\2\u00e6H\3\2\2\2\u00e7\u00e8\5=\37\2\u00e8"+
		"\u00e9\5A!\2\u00e9J\3\2\2\2\u00ea\u00eb\5? \2\u00eb\u00ec\5A!\2\u00ec"+
		"L\3\2\2\2\u00ed\u00ee\5;\36\2\u00ee\u00ef\5A!\2\u00efN\3\2\2\2\u00f0\u00f1"+
		"\59\35\2\u00f1\u00f2\5A!\2\u00f2P\3\2\2\2\u00f3\u00f4\5A!\2\u00f4\u00f5"+
		"\5A!\2\u00f5R\3\2\2\2\u00f6\u00f7\5\61\31\2\u00f7\u00f8\5A!\2\u00f8T\3"+
		"\2\2\2\u00f9\u00fa\5-\27\2\u00fa\u00fb\5-\27\2\u00fbV\3\2\2\2\u00fc\u00fd"+
		"\5/\30\2\u00fd\u00fe\5/\30\2\u00feX\3\2\2\2\u00ff\u0100\59\35\2\u0100"+
		"\u0101\59\35\2\u0101Z\3\2\2\2\u0102\u0103\5;\36\2\u0103\u0104\5;\36\2"+
		"\u0104\\\3\2\2\2\u0105\u0106\5=\37\2\u0106\u0107\5=\37\2\u0107^\3\2\2"+
		"\2\u0108\u0109\5? \2\u0109\u010a\5? \2\u010a`\3\2\2\2\u010b\u010c\t\3"+
		"\2\2\u010cb\3\2\2\2\u010d\u010e\t\4\2\2\u010ed\3\2\2\2\u010f\u0110\t\5"+
		"\2\2\u0110f\3\2\2\2\u0111\u0125\5=\37\2\u0112\u0125\5? \2\u0113\u0125"+
		"\5\65\33\2\u0114\u0125\5\63\32\2\u0115\u0125\5I%\2\u0116\u0125\5K&\2\u0117"+
		"\u0125\5C\"\2\u0118\u0125\5E#\2\u0119\u0125\59\35\2\u011a\u0125\5O(\2"+
		"\u011b\u0125\5;\36\2\u011c\u0125\5M\'\2\u011d\u0125\5Q)\2\u011e\u0125"+
		"\5S*\2\u011f\u0125\5]/\2\u0120\u0125\5_\60\2\u0121\u0122\5#\22\2\u0122"+
		"\u0123\5%\23\2\u0123\u0125\3\2\2\2\u0124\u0111\3\2\2\2\u0124\u0112\3\2"+
		"\2\2\u0124\u0113\3\2\2\2\u0124\u0114\3\2\2\2\u0124\u0115\3\2\2\2\u0124"+
		"\u0116\3\2\2\2\u0124\u0117\3\2\2\2\u0124\u0118\3\2\2\2\u0124\u0119\3\2"+
		"\2\2\u0124\u011a\3\2\2\2\u0124\u011b\3\2\2\2\u0124\u011c\3\2\2\2\u0124"+
		"\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2"+
		"\2\2\u0124\u0121\3\2\2\2\u0125h\3\2\2\2\u0126\u0128\5a\61\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"j\3\2\2\2\u012b\u012d\5a\61\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\5+\26\2\u0131\u0133\5a\61\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7h"+
		"\2\2\u0137l\3\2\2\2\u0138\u013a\5a\61\2\u0139\u0138\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\5+\26\2\u013e\u0140\5a\61\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142n\3\2\2\2\u0143\u0147"+
		"\5!\21\2\u0144\u0146\t\6\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014b\5!\21\2\u014bp\3\2\2\2\u014c\u0150\5c\62\2\u014d\u0150"+
		"\5e\63\2\u014e\u0150\7a\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0157\3\2\2\2\u0151\u0156\5c\62\2\u0152\u0156\5e"+
		"\63\2\u0153\u0156\5a\61\2\u0154\u0156\7a\2\2\u0155\u0151\3\2\2\2\u0155"+
		"\u0152\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u015a\u015c\5g\64\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015cr\3\2\2\2\17\2v\u0124\u0129\u012e\u0134\u013b\u0141\u0147\u014f"+
		"\u0155\u0157\u015b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}