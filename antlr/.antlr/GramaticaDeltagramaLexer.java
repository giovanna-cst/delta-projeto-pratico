// Generated from c:\UFLA\compiladores\delta\antlr\GramaticaDeltagrama.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaDeltagramaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ENT=2, SAI=3, OP_COMP=4, OP_LOG=5, TIPO=6, SE=7, SENAO=8, NUM_INT=9, 
		NUM_REAL=10, ENQ=11, OP_ARIT=12, OP_ATRI=13, PONT=14, ABRE_COMEN=15, FECHA_COMEN=16, 
		INI=17, FIM=18, AP=19, FP=20, VAR=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "NUM", "LET", "ENT", "SAI", "OP_COMP", "OP_LOG", "TIPO", "SE", 
			"SENAO", "NUM_INT", "NUM_REAL", "ENQ", "OP_ARIT", "OP_ATRI", "PONT", 
			"ABRE_COMEN", "FECHA_COMEN", "INI", "FIM", "AP", "FP", "VAR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'entrada:'", "'saida:'", null, null, null, "'se'", "'senao'", 
			null, null, "'enquanto:'", null, null, null, "'/\"'", "'\"/'", "'<'", 
			"'>'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ENT", "SAI", "OP_COMP", "OP_LOG", "TIPO", "SE", "SENAO", 
			"NUM_INT", "NUM_REAL", "ENQ", "OP_ARIT", "OP_ATRI", "PONT", "ABRE_COMEN", 
			"FECHA_COMEN", "INI", "FIM", "AP", "FP", "VAR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GramaticaDeltagramaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GramaticaDeltagrama.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tv\n"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u0082\n\f\r\f\16"+
		"\f\u0083\3\r\6\r\u0087\n\r\r\r\16\r\u0088\3\r\3\r\6\r\u008d\n\r\r\r\16"+
		"\r\u008e\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u00b2\n\30\f\30\16\30\u00b5\13"+
		"\30\3\31\7\31\u00b8\n\31\f\31\16\31\u00bb\13\31\3\31\3\31\2\2\32\3\3\5"+
		"\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26/\27\61\30\3\2\b\3\2\62;\4\2C\\c|\5\2,-//\61"+
		"\61\4\2<<??\7\2##..\60\60==AA\5\2\13\f\17\17\"\"\2\u00c8\2\3\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\5\65\3\2\2"+
		"\2\7\67\3\2\2\2\t9\3\2\2\2\13B\3\2\2\2\rX\3\2\2\2\17`\3\2\2\2\21u\3\2"+
		"\2\2\23w\3\2\2\2\25z\3\2\2\2\27\u0081\3\2\2\2\31\u0086\3\2\2\2\33\u0090"+
		"\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2"+
		"\2%\u00a3\3\2\2\2\'\u00a6\3\2\2\2)\u00a8\3\2\2\2+\u00aa\3\2\2\2-\u00ac"+
		"\3\2\2\2/\u00ae\3\2\2\2\61\u00b9\3\2\2\2\63\64\7<\2\2\64\4\3\2\2\2\65"+
		"\66\t\2\2\2\66\6\3\2\2\2\678\t\3\2\28\b\3\2\2\29:\7g\2\2:;\7p\2\2;<\7"+
		"v\2\2<=\7t\2\2=>\7c\2\2>?\7f\2\2?@\7c\2\2@A\7<\2\2A\n\3\2\2\2BC\7u\2\2"+
		"CD\7c\2\2DE\7k\2\2EF\7f\2\2FG\7c\2\2GH\7<\2\2H\f\3\2\2\2IJ\7O\2\2JK\7"+
		"C\2\2KL\7K\2\2LM\7Q\2\2MY\7T\2\2NO\7O\2\2OP\7G\2\2PQ\7P\2\2QR\7Q\2\2R"+
		"Y\7T\2\2ST\7K\2\2TU\7I\2\2UV\7W\2\2VW\7C\2\2WY\7N\2\2XI\3\2\2\2XN\3\2"+
		"\2\2XS\3\2\2\2Y\16\3\2\2\2Za\7G\2\2[\\\7Q\2\2\\a\7W\2\2]^\7P\2\2^_\7C"+
		"\2\2_a\7Q\2\2`Z\3\2\2\2`[\3\2\2\2`]\3\2\2\2a\20\3\2\2\2bc\7k\2\2cd\7p"+
		"\2\2dv\7v\2\2ef\7f\2\2fg\7q\2\2gh\7w\2\2hi\7d\2\2ij\7n\2\2jv\7g\2\2kl"+
		"\7d\2\2lm\7q\2\2mn\7q\2\2nv\7n\2\2op\7u\2\2pq\7v\2\2qr\7t\2\2rs\7k\2\2"+
		"st\7p\2\2tv\7i\2\2ub\3\2\2\2ue\3\2\2\2uk\3\2\2\2uo\3\2\2\2v\22\3\2\2\2"+
		"wx\7u\2\2xy\7g\2\2y\24\3\2\2\2z{\7u\2\2{|\7g\2\2|}\7p\2\2}~\7c\2\2~\177"+
		"\7q\2\2\177\26\3\2\2\2\u0080\u0082\5\5\3\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0087\5\5\3\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\7\60\2\2\u008b"+
		"\u008d\5\5\3\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\32\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7s\2\2\u0093\u0094\7w\2\2\u0094\u0095\7c\2\2\u0095"+
		"\u0096\7p\2\2\u0096\u0097\7v\2\2\u0097\u0098\7q\2\2\u0098\u0099\7<\2\2"+
		"\u0099\34\3\2\2\2\u009a\u009b\t\4\2\2\u009b\36\3\2\2\2\u009c\u009d\t\5"+
		"\2\2\u009d \3\2\2\2\u009e\u009f\t\6\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7"+
		"\61\2\2\u00a1\u00a2\7$\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a5"+
		"\7\61\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7(\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab,\3\2\2\2\u00ac\u00ad\7"+
		"+\2\2\u00ad.\3\2\2\2\u00ae\u00b3\5\7\4\2\u00af\u00b2\5\5\3\2\u00b0\u00b2"+
		"\5\7\4\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\60\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b6\u00b8\t\7\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\b\31\2\2\u00bd\62\3\2\2\2\f\2X`u\u0083\u0088\u008e\u00b1\u00b3"+
		"\u00b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}