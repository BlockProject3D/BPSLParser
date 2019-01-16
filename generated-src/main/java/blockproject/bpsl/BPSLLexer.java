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
		WS=1, AT=2, IMPORT=3, STRUCT=4, CLASS=5, CONST=6, RETURN=7, IF=8, FOR=9, 
		WHILE=10, QUALIFIER_CBUF=11, QUALIFIER_VL=12, CBRACE_OPEN=13, CBRACE_CLOSE=14, 
		PAR_OPEN=15, PAR_CLOSE=16, QUOTE=17, SBRACE_OPEN=18, SBRACE_CLOSE=19, 
		COMA=20, SEMICOLON=21, DOT=22, AND=23, OR=24, NOT=25, DIV=26, MUL=27, 
		MOD=28, LESS=29, GREATER=30, PLUS=31, MINUS=32, EQUAL=33, MUL_EQUAL=34, 
		DIV_EQUAL=35, MOD_EQUAL=36, PLUS_EQUAL=37, MINUS_EQUAL=38, GREATER_EQUAL=39, 
		LESS_EQUAL=40, EQUAL_EQUAL=41, NOT_EQUAL=42, AND_AND=43, OR_OR=44, SHIFT_LEFT=45, 
		SHIFT_RIGHT=46, INCREMENT=47, DECREMENT=48, L_INT=49, L_FLOAT=50, L_DOUBLE=51, 
		L_STRING=52, IDENTIFIER=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "AT", "IMPORT", "STRUCT", "CLASS", "CONST", "RETURN", "IF", "FOR", 
		"WHILE", "QUALIFIER_CBUF", "QUALIFIER_VL", "CBRACE_OPEN", "CBRACE_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "QUOTE", "SBRACE_OPEN", "SBRACE_CLOSE", "COMA", 
		"SEMICOLON", "DOT", "AND", "OR", "NOT", "DIV", "MUL", "MOD", "LESS", "GREATER", 
		"PLUS", "MINUS", "EQUAL", "MUL_EQUAL", "DIV_EQUAL", "MOD_EQUAL", "PLUS_EQUAL", 
		"MINUS_EQUAL", "GREATER_EQUAL", "LESS_EQUAL", "EQUAL_EQUAL", "NOT_EQUAL", 
		"AND_AND", "OR_OR", "SHIFT_LEFT", "SHIFT_RIGHT", "INCREMENT", "DECREMENT", 
		"NUMERIC", "UPPER", "LOWER", "OPERATOR", "L_INT", "L_FLOAT", "L_DOUBLE", 
		"L_STRING", "IDENTIFIER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0166\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\6\2w\n\2\r\2"+
		"\16\2x\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u012e"+
		"\n\65\3\66\6\66\u0131\n\66\r\66\16\66\u0132\3\67\6\67\u0136\n\67\r\67"+
		"\16\67\u0137\3\67\3\67\6\67\u013c\n\67\r\67\16\67\u013d\3\67\3\67\38\6"+
		"8\u0143\n8\r8\168\u0144\38\38\68\u0149\n8\r8\168\u014a\39\39\79\u014f"+
		"\n9\f9\169\u0152\139\39\39\3:\3:\3:\5:\u0159\n:\3:\3:\3:\3:\7:\u015f\n"+
		":\f:\16:\u0162\13:\3:\5:\u0165\n:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\2e\2g\2i\2k\63m\64o\65q\66s\67\3\2\7\5\2\13\f\17\17\"\""+
		"\3\2\62;\3\2C\\\3\2c|\3\2\2\u0101\2\u017f\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3v\3\2\2\2\5|\3\2\2\2\7~\3\2\2\2\t\u0085"+
		"\3\2\2\2\13\u008c\3\2\2\2\r\u0092\3\2\2\2\17\u0098\3\2\2\2\21\u009f\3"+
		"\2\2\2\23\u00a2\3\2\2\2\25\u00a6\3\2\2\2\27\u00ac\3\2\2\2\31\u00b5\3\2"+
		"\2\2\33\u00bd\3\2\2\2\35\u00bf\3\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2\2"+
		"#\u00c5\3\2\2\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00cd\3"+
		"\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00d7\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e3\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G"+
		"\u00ea\3\2\2\2I\u00ed\3\2\2\2K\u00f0\3\2\2\2M\u00f3\3\2\2\2O\u00f6\3\2"+
		"\2\2Q\u00f9\3\2\2\2S\u00fc\3\2\2\2U\u00ff\3\2\2\2W\u0102\3\2\2\2Y\u0105"+
		"\3\2\2\2[\u0108\3\2\2\2]\u010b\3\2\2\2_\u010e\3\2\2\2a\u0111\3\2\2\2c"+
		"\u0114\3\2\2\2e\u0116\3\2\2\2g\u0118\3\2\2\2i\u012d\3\2\2\2k\u0130\3\2"+
		"\2\2m\u0135\3\2\2\2o\u0142\3\2\2\2q\u014c\3\2\2\2s\u0158\3\2\2\2uw\t\2"+
		"\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\2\2\2{\4\3"+
		"\2\2\2|}\7B\2\2}\6\3\2\2\2~\177\7k\2\2\177\u0080\7o\2\2\u0080\u0081\7"+
		"r\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2\u0083\u0084\7v\2\2\u0084\b"+
		"\3\2\2\2\u0085\u0086\7u\2\2\u0086\u0087\7v\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7w\2\2\u0089\u008a\7e\2\2\u008a\u008b\7v\2\2\u008b\n\3\2\2\2\u008c"+
		"\u008d\7e\2\2\u008d\u008e\7n\2\2\u008e\u008f\7c\2\2\u008f\u0090\7u\2\2"+
		"\u0090\u0091\7u\2\2\u0091\f\3\2\2\2\u0092\u0093\7e\2\2\u0093\u0094\7q"+
		"\2\2\u0094\u0095\7p\2\2\u0095\u0096\7u\2\2\u0096\u0097\7v\2\2\u0097\16"+
		"\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7w\2\2\u009c\u009d\7t\2\2\u009d\u009e\7p\2\2\u009e\20\3\2\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7h\2\2\u00a1\22\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7t\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7y\2\2\u00a7"+
		"\u00a8\7j\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\26\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7"+
		"p\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3"+
		"\7w\2\2\u00b3\u00b4\7h\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7{\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7w\2\2\u00bb\u00bc\7v\2\2\u00bc\32\3\2\2\2\u00bd\u00be\7}\2\2\u00be"+
		"\34\3\2\2\2\u00bf\u00c0\7\177\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\7*\2\2"+
		"\u00c2 \3\2\2\2\u00c3\u00c4\7+\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7$\2\2"+
		"\u00c6$\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7_\2\2\u00ca"+
		"(\3\2\2\2\u00cb\u00cc\7.\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7=\2\2\u00ce,"+
		"\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7(\2\2\u00d2"+
		"\60\3\2\2\2\u00d3\u00d4\7~\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7#\2\2\u00d6"+
		"\64\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7,\2\2\u00da"+
		"8\3\2\2\2\u00db\u00dc\7\'\2\2\u00dc:\3\2\2\2\u00dd\u00de\7>\2\2\u00de"+
		"<\3\2\2\2\u00df\u00e0\7@\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2@"+
		"\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6D\3"+
		"\2\2\2\u00e7\u00e8\5\67\34\2\u00e8\u00e9\5C\"\2\u00e9F\3\2\2\2\u00ea\u00eb"+
		"\5\65\33\2\u00eb\u00ec\5C\"\2\u00ecH\3\2\2\2\u00ed\u00ee\59\35\2\u00ee"+
		"\u00ef\5C\"\2\u00efJ\3\2\2\2\u00f0\u00f1\5? \2\u00f1\u00f2\5C\"\2\u00f2"+
		"L\3\2\2\2\u00f3\u00f4\5A!\2\u00f4\u00f5\5C\"\2\u00f5N\3\2\2\2\u00f6\u00f7"+
		"\5=\37\2\u00f7\u00f8\5C\"\2\u00f8P\3\2\2\2\u00f9\u00fa\5;\36\2\u00fa\u00fb"+
		"\5C\"\2\u00fbR\3\2\2\2\u00fc\u00fd\5C\"\2\u00fd\u00fe\5C\"\2\u00feT\3"+
		"\2\2\2\u00ff\u0100\5\63\32\2\u0100\u0101\5C\"\2\u0101V\3\2\2\2\u0102\u0103"+
		"\5/\30\2\u0103\u0104\5/\30\2\u0104X\3\2\2\2\u0105\u0106\5\61\31\2\u0106"+
		"\u0107\5\61\31\2\u0107Z\3\2\2\2\u0108\u0109\5;\36\2\u0109\u010a\5;\36"+
		"\2\u010a\\\3\2\2\2\u010b\u010c\5=\37\2\u010c\u010d\5=\37\2\u010d^\3\2"+
		"\2\2\u010e\u010f\5? \2\u010f\u0110\5? \2\u0110`\3\2\2\2\u0111\u0112\5"+
		"A!\2\u0112\u0113\5A!\2\u0113b\3\2\2\2\u0114\u0115\t\3\2\2\u0115d\3\2\2"+
		"\2\u0116\u0117\t\4\2\2\u0117f\3\2\2\2\u0118\u0119\t\5\2\2\u0119h\3\2\2"+
		"\2\u011a\u012e\5? \2\u011b\u012e\5A!\2\u011c\u012e\5\67\34\2\u011d\u012e"+
		"\5\65\33\2\u011e\u012e\5K&\2\u011f\u012e\5M\'\2\u0120\u012e\5E#\2\u0121"+
		"\u012e\5G$\2\u0122\u012e\5;\36\2\u0123\u012e\5Q)\2\u0124\u012e\5=\37\2"+
		"\u0125\u012e\5O(\2\u0126\u012e\5S*\2\u0127\u012e\5U+\2\u0128\u012e\5_"+
		"\60\2\u0129\u012e\5a\61\2\u012a\u012b\5%\23\2\u012b\u012c\5\'\24\2\u012c"+
		"\u012e\3\2\2\2\u012d\u011a\3\2\2\2\u012d\u011b\3\2\2\2\u012d\u011c\3\2"+
		"\2\2\u012d\u011d\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u011f\3\2\2\2\u012d"+
		"\u0120\3\2\2\2\u012d\u0121\3\2\2\2\u012d\u0122\3\2\2\2\u012d\u0123\3\2"+
		"\2\2\u012d\u0124\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012d"+
		"\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012ej\3\2\2\2\u012f\u0131\5c\62\2\u0130\u012f\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133l\3\2\2\2\u0134"+
		"\u0136\5c\62\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\5-\27\2\u013a"+
		"\u013c\5c\62\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7h\2\2\u0140"+
		"n\3\2\2\2\u0141\u0143\5c\62\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148"+
		"\5-\27\2\u0147\u0149\5c\62\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bp\3\2\2\2\u014c\u0150\5#\22\2"+
		"\u014d\u014f\t\6\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\5#\22\2\u0154r\3\2\2\2\u0155\u0159\5e\63\2\u0156\u0159\5g\64\2"+
		"\u0157\u0159\7a\2\2\u0158\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159\u0160\3\2\2\2\u015a\u015f\5e\63\2\u015b\u015f\5g\64\2\u015c"+
		"\u015f\5c\62\2\u015d\u015f\7a\2\2\u015e\u015a\3\2\2\2\u015e\u015b\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0163\u0165\5i\65\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"t\3\2\2\2\17\2x\u012d\u0132\u0137\u013d\u0144\u014a\u0150\u0158\u015e"+
		"\u0160\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}