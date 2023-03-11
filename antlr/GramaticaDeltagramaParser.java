// Generated from java-escape by ANTLR 4.11.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaDeltagramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, LET=2, ENT=3, SAI=4, OP_COMP=5, OP_LOG=6, TIPO=7, SE=8, SENAO=9, 
		NUM_INT=10, NUM_REAL=11, ENQ=12, OP_ARIT=13, OP_ATRI=14, PONT=15, ABRE_COMEN=16, 
		FECHA_COMEN=17, INI=18, FIM=19, AP=20, FP=21, VAR=22, WS=23;
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).exitPrograma(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(GramaticaDeltagramaParser.VAR, 0); }
		public TerminalNode NUM_INT() { return getToken(GramaticaDeltagramaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(GramaticaDeltagramaParser.NUM_REAL, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).exitValor(this);
		}
	}

	public final  valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2098688L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_saContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Exp_saContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_sa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).enterExp_sa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).exitExp_sa(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).enterExp_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).exitExp_se(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).enterExp_senao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).exitExp_senao(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaDeltagramaListener ) ((GramaticaDeltagramaListener)listener).exitInicio(this);
		}
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
		"\u0004\u0001\u00167\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u001e\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u00041\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006"+
		"\b\n\u0000\u0001\u0002\u0000\t\n\u0015\u00155\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000"+
		"\u0000\u0006#\u0001\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001"+
		"\u0000\u0000\u0000\f\u001e\u0005\u0006\u0000\u0000\r\u000e\u0005\u0003"+
		"\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f\u001e\u0003\u0004"+
		"\u0002\u0000\u0010\u0011\u0005\u0002\u0000\u0000\u0011\u0012\u0005\u0001"+
		"\u0000\u0000\u0012\u001e\u0005\u0015\u0000\u0000\u0013\u0014\u0005\u0007"+
		"\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u001e\u0003\u0006"+
		"\u0003\u0000\u0016\u0017\u0005\u0007\u0000\u0000\u0017\u0018\u0005\u0001"+
		"\u0000\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005\b\u0000"+
		"\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0003\b\u0004\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\f\u0001\u0000\u0000\u0000\u001d"+
		"\r\u0001\u0000\u0000\u0000\u001d\u0010\u0001\u0000\u0000\u0000\u001d\u0013"+
		"\u0001\u0000\u0000\u0000\u001d\u0016\u0001\u0000\u0000\u0000\u001e\u0001"+
		"\u0001\u0000\u0000\u0000\u001f \u0007\u0000\u0000\u0000 \u0003\u0001\u0000"+
		"\u0000\u0000!\"\u0003\u0002\u0001\u0000\"\u0005\u0001\u0000\u0000\u0000"+
		"#$\u0003\u0002\u0001\u0000$%\u0005\u0004\u0000\u0000%&\u0003\u0002\u0001"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0005\u0000\u0000()\u0003\u0002"+
		"\u0001\u0000)*\u0005\u0004\u0000\u0000*+\u0003\u0002\u0001\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0003\n\u0005\u0000-\u0007\u0001\u0000\u0000\u0000"+
		".1\u0003\u0006\u0003\u0000/1\u0003\n\u0005\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000\u000023\u0005\u0011\u0000"+
		"\u000034\u0003\u0000\u0000\u000045\u0005\u0012\u0000\u00005\u000b\u0001"+
		"\u0000\u0000\u0000\u0002\u001d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}