// Generated from c:\UFLA\compiladores\delta\antlr\GramaticaDeltagrama.g4 by ANTLR 4.9.2

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaDeltagramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ENT=2, SAI=3, OP_COMP=4, OP_LOG=5, TIPO=6, SE=7, SENAO=8, NUM_INT=9, 
		NUM_REAL=10, ENQ=11, OP_ARIT=12, OP_ATRI=13, PONT=14, ABRE_COMEN=15, FECHA_COMEN=16, 
		INI=17, FIM=18, AP=19, FP=20, VAR=21, WS=22;
	public static final int
		RULE_programa = 0, RULE_valor = 1, RULE_exp_sa = 2, RULE_exp_se = 3, RULE_exp_senao = 4, 
		RULE_inicio = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "valor", "exp_sa", "exp_se", "exp_senao", "inicio"
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

	@Override
	public String getGrammarFileName() { return "GramaticaDeltagrama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaDeltagramaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaDeltagramaParser.TIPO, 0); }
		public TerminalNode SAI() { return getToken(GramaticaDeltagramaParser.SAI, 0); }
		public Exp_saContext exp_sa() {
			return getRuleContext(Exp_saContext.class,0);
		}
		public TerminalNode ENT() { return getToken(GramaticaDeltagramaParser.ENT, 0); }
		public TerminalNode VAR() { return getToken(GramaticaDeltagramaParser.VAR, 0); }
		public TerminalNode SE() { return getToken(GramaticaDeltagramaParser.SE, 0); }
		public Exp_seContext exp_se() {
			return getRuleContext(Exp_seContext.class,0);
		}
		public TerminalNode SENAO() { return getToken(GramaticaDeltagramaParser.SENAO, 0); }
		public Exp_senaoContext exp_senao() {
			return getRuleContext(Exp_senaoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(TIPO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(SAI);
				setState(14);
				match(T__0);
				setState(15);
				exp_sa();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(16);
				match(ENT);
				setState(17);
				match(T__0);
				setState(18);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(19);
				match(SE);
				setState(20);
				match(T__0);
				{
				setState(21);
				exp_se();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(SE);
				setState(23);
				match(T__0);
				{
				setState(24);
				exp_se();
				}
				setState(25);
				match(SENAO);
				setState(26);
				match(T__0);
				{
				setState(27);
				exp_senao();
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaDeltagramaParser.VAR, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaticaDeltagramaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(GramaticaDeltagramaParser.NUM_REAL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_INT) | (1L << NUM_REAL) | (1L << VAR))) != 0)) ) {
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

	public static class Exp_saContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Exp_saContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_sa; }
	}

	public final Exp_saContext exp_sa() throws RecognitionException {
		Exp_saContext _localctx = new Exp_saContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp_sa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			valor();
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

	public static class Exp_seContext extends ParserRuleContext {
		public TerminalNode OP_LOG() { return getToken(GramaticaDeltagramaParser.OP_LOG, 0); }
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> OP_COMP() { return getTokens(GramaticaDeltagramaParser.OP_COMP); }
		public TerminalNode OP_COMP(int i) {
			return getToken(GramaticaDeltagramaParser.OP_COMP, i);
		}
		public Exp_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_se; }
	}

	public final Exp_seContext exp_se() throws RecognitionException {
		Exp_seContext _localctx = new Exp_seContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exp_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(35);
			valor();
			setState(36);
			match(OP_COMP);
			setState(37);
			valor();
			}
			setState(39);
			match(OP_LOG);
			{
			setState(40);
			valor();
			setState(41);
			match(OP_COMP);
			setState(42);
			valor();
			}
			setState(44);
			inicio();
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

	public static class Exp_senaoContext extends ParserRuleContext {
		public Exp_seContext exp_se() {
			return getRuleContext(Exp_seContext.class,0);
		}
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public Exp_senaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_senao; }
	}

	public final Exp_senaoContext exp_senao() throws RecognitionException {
		Exp_senaoContext _localctx = new Exp_senaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp_senao);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				exp_se();
				}
				break;
			case INI:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				inicio();
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode INI() { return getToken(GramaticaDeltagramaParser.INI, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode FIM() { return getToken(GramaticaDeltagramaParser.FIM, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(INI);
			setState(51);
			programa();
			setState(52);
			match(FIM);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\309\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\63\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\2\2\b\2\4\6\b\n\f\2\3\4\2\13\f\27\27\2\67\2\37\3\2\2\2\4!\3\2\2\2\6"+
		"#\3\2\2\2\b%\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16 \7\b\2\2\17\20\7\5\2"+
		"\2\20\21\7\3\2\2\21 \5\6\4\2\22\23\7\4\2\2\23\24\7\3\2\2\24 \7\27\2\2"+
		"\25\26\7\t\2\2\26\27\7\3\2\2\27 \5\b\5\2\30\31\7\t\2\2\31\32\7\3\2\2\32"+
		"\33\5\b\5\2\33\34\7\n\2\2\34\35\7\3\2\2\35\36\5\n\6\2\36 \3\2\2\2\37\16"+
		"\3\2\2\2\37\17\3\2\2\2\37\22\3\2\2\2\37\25\3\2\2\2\37\30\3\2\2\2 \3\3"+
		"\2\2\2!\"\t\2\2\2\"\5\3\2\2\2#$\5\4\3\2$\7\3\2\2\2%&\5\4\3\2&\'\7\6\2"+
		"\2\'(\5\4\3\2()\3\2\2\2)*\7\7\2\2*+\5\4\3\2+,\7\6\2\2,-\5\4\3\2-.\3\2"+
		"\2\2./\5\f\7\2/\t\3\2\2\2\60\63\5\b\5\2\61\63\5\f\7\2\62\60\3\2\2\2\62"+
		"\61\3\2\2\2\63\13\3\2\2\2\64\65\7\23\2\2\65\66\5\2\2\2\66\67\7\24\2\2"+
		"\67\r\3\2\2\2\4\37\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}