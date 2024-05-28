// Generated from c:/Users/torus/OneDrive/Documentos/GitHub/TP1-TC/src/main/java/primerproyecto/compiladores.g4 by ANTLR 4.13.1

package primerproyecto;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PA=2, PC=3, LLA=4, LLC=5, PYC=6, IGUAL=7, SUMA=8, RESTA=9, MULTIPLICACION=10, 
		DIVISION=11, MODULO=12, INT=13, DOUBLE=14, BOOL=15, IWHILE=16, IIF=17, 
		IFOR=18, IRETURN=19, TRUE=20, FALSE=21, AND=22, OR=23, EQUAL=24, MAY=25, 
		MAYIG=26, MEN=27, MENIG=28, DESIG=29, NUMERO=30, ID=31;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_instruccion = 3, 
		RULE_declaracion = 4, RULE_variable = 5, RULE_asignacion = 6, RULE_expresiones = 7, 
		RULE_exp = 8, RULE_term = 9, RULE_t = 10, RULE_factor = 11, RULE_f = 12, 
		RULE_condicional_if = 13, RULE_bucle_for = 14, RULE_bucle_while = 15, 
		RULE_econdicion = 16, RULE_comparadores = 17, RULE_operadores_log = 18, 
		RULE_operadores_bool = 19, RULE_incrementos = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "instruccion", "declaracion", 
			"variable", "asignacion", "expresiones", "exp", "term", "t", "factor", 
			"f", "condicional_if", "bucle_for", "bucle_while", "econdicion", "comparadores", 
			"operadores_log", "operadores_bool", "incrementos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'int'", "'double'", "'boolean'", "'while'", "'if'", "'for'", 
			"'return'", "'true'", "'false'", "'&&'", "'||'", "'=='", "'>'", "'>='", 
			"'<'", "'<='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "SUMA", "RESTA", 
			"MULTIPLICACION", "DIVISION", "MODULO", "INT", "DOUBLE", "BOOL", "IWHILE", 
			"IIF", "IFOR", "IRETURN", "TRUE", "FALSE", "AND", "OR", "EQUAL", "MAY", 
			"MAYIG", "MEN", "MENIG", "DESIG", "NUMERO", "ID"
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
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			instrucciones();
			setState(43);
			match(EOF);
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
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case BOOL:
			case IWHILE:
			case IIF:
			case IFOR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				instruccion();
				setState(46);
				instrucciones();
				}
				break;
			case EOF:
			case LLC:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(compiladoresParser.LLA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(compiladoresParser.LLC, 0); }
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LLA);
			setState(52);
			instrucciones();
			setState(53);
			match(LLC);
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				{
				setState(54);
				match(PYC);
				}
				break;
			case EOF:
			case LLC:
			case INT:
			case DOUBLE:
			case BOOL:
			case IWHILE:
			case IIF:
			case IFOR:
			case ID:
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Condicional_ifContext condicional_if() {
			return getRuleContext(Condicional_ifContext.class,0);
		}
		public Bucle_forContext bucle_for() {
			return getRuleContext(Bucle_forContext.class,0);
		}
		public Bucle_whileContext bucle_while() {
			return getRuleContext(Bucle_whileContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				declaracion();
				setState(59);
				match(PYC);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				asignacion();
				setState(62);
				match(PYC);
				}
				break;
			case IIF:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				condicional_if();
				}
				break;
			case IFOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				bucle_for();
				}
				break;
			case IWHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				bucle_while();
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
	public static class DeclaracionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				variable();
				setState(70);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				variable();
				setState(73);
				match(ID);
				setState(74);
				match(IGUAL);
				setState(75);
				exp();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladoresParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladoresParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(compiladoresParser.BOOL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ID);
			setState(82);
			match(IGUAL);
			setState(83);
			exp();
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
	public static class ExpresionesContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladoresParser.PYC, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public ExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionesContext expresiones() throws RecognitionException {
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresiones);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case NUMERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				exp();
				setState(86);
				match(PYC);
				setState(87);
				expresiones();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(EOF);
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
	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			term();
			setState(93);
			t();
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
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			factor();
			setState(96);
			t();
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
	public static class TContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladoresParser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(compiladoresParser.RESTA, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_t);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(SUMA);
				setState(99);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(RESTA);
				setState(101);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(NUMERO);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(PA);
				setState(108);
				exp();
				setState(109);
				match(PC);
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
	public static class FContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(compiladoresParser.MULTIPLICACION, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode DIVISION() { return getToken(compiladoresParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(compiladoresParser.MODULO, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_f);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(MULTIPLICACION);
				setState(114);
				factor();
				setState(115);
				f();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(DIVISION);
				setState(118);
				factor();
				setState(119);
				f();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(MODULO);
				setState(122);
				factor();
				setState(123);
				f();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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
	public static class Condicional_ifContext extends ParserRuleContext {
		public TerminalNode IIF() { return getToken(compiladoresParser.IIF, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public EcondicionContext econdicion() {
			return getRuleContext(EcondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Condicional_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterCondicional_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitCondicional_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitCondicional_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicional_ifContext condicional_if() throws RecognitionException {
		Condicional_ifContext _localctx = new Condicional_ifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicional_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IIF);
			setState(129);
			match(PA);
			setState(130);
			econdicion(0);
			setState(131);
			match(PC);
			setState(132);
			bloque();
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
	public static class Bucle_forContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(compiladoresParser.IFOR, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<TerminalNode> PYC() { return getTokens(compiladoresParser.PYC); }
		public TerminalNode PYC(int i) {
			return getToken(compiladoresParser.PYC, i);
		}
		public EcondicionContext econdicion() {
			return getRuleContext(EcondicionContext.class,0);
		}
		public IncrementosContext incrementos() {
			return getRuleContext(IncrementosContext.class,0);
		}
		public Bucle_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBucle_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBucle_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitBucle_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_forContext bucle_for() throws RecognitionException {
		Bucle_forContext _localctx = new Bucle_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bucle_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IFOR);
			setState(135);
			match(PA);
			{
			setState(136);
			declaracion();
			setState(137);
			match(PYC);
			setState(138);
			econdicion(0);
			setState(139);
			match(PYC);
			setState(140);
			incrementos();
			}
			setState(142);
			match(PC);
			setState(143);
			bloque();
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
	public static class Bucle_whileContext extends ParserRuleContext {
		public TerminalNode IWHILE() { return getToken(compiladoresParser.IWHILE, 0); }
		public TerminalNode PA() { return getToken(compiladoresParser.PA, 0); }
		public EcondicionContext econdicion() {
			return getRuleContext(EcondicionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladoresParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bucle_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterBucle_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitBucle_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitBucle_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_whileContext bucle_while() throws RecognitionException {
		Bucle_whileContext _localctx = new Bucle_whileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bucle_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IWHILE);
			setState(146);
			match(PA);
			setState(147);
			econdicion(0);
			setState(148);
			match(PC);
			setState(149);
			bloque();
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
	public static class EcondicionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ComparadoresContext comparadores() {
			return getRuleContext(ComparadoresContext.class,0);
		}
		public Operadores_boolContext operadores_bool() {
			return getRuleContext(Operadores_boolContext.class,0);
		}
		public List<EcondicionContext> econdicion() {
			return getRuleContexts(EcondicionContext.class);
		}
		public EcondicionContext econdicion(int i) {
			return getRuleContext(EcondicionContext.class,i);
		}
		public Operadores_logContext operadores_log() {
			return getRuleContext(Operadores_logContext.class,0);
		}
		public EcondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_econdicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterEcondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitEcondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitEcondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EcondicionContext econdicion() throws RecognitionException {
		return econdicion(0);
	}

	private EcondicionContext econdicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EcondicionContext _localctx = new EcondicionContext(_ctx, _parentState);
		EcondicionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_econdicion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(152);
				exp();
				setState(153);
				comparadores();
				setState(154);
				exp();
				}
				break;
			case 2:
				{
				setState(156);
				operadores_bool();
				}
				break;
			case 3:
				{
				setState(157);
				exp();
				setState(158);
				comparadores();
				setState(159);
				operadores_bool();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EcondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_econdicion);
					setState(163);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(164);
					operadores_log();
					setState(165);
					econdicion(4);
					}
					} 
				}
				setState(171);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparadoresContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(compiladoresParser.EQUAL, 0); }
		public TerminalNode MAY() { return getToken(compiladoresParser.MAY, 0); }
		public TerminalNode MAYIG() { return getToken(compiladoresParser.MAYIG, 0); }
		public TerminalNode MEN() { return getToken(compiladoresParser.MEN, 0); }
		public TerminalNode MENIG() { return getToken(compiladoresParser.MENIG, 0); }
		public TerminalNode DESIG() { return getToken(compiladoresParser.DESIG, 0); }
		public ComparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterComparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitComparadores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitComparadores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadoresContext comparadores() throws RecognitionException {
		ComparadoresContext _localctx = new ComparadoresContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
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
	public static class Operadores_logContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(compiladoresParser.AND, 0); }
		public TerminalNode OR() { return getToken(compiladoresParser.OR, 0); }
		public Operadores_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOperadores_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOperadores_log(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitOperadores_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operadores_logContext operadores_log() throws RecognitionException {
		Operadores_logContext _localctx = new Operadores_logContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operadores_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
	public static class Operadores_boolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(compiladoresParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(compiladoresParser.FALSE, 0); }
		public Operadores_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadores_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterOperadores_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitOperadores_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitOperadores_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operadores_boolContext operadores_bool() throws RecognitionException {
		Operadores_boolContext _localctx = new Operadores_boolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operadores_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class IncrementosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public List<TerminalNode> SUMA() { return getTokens(compiladoresParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(compiladoresParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(compiladoresParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(compiladoresParser.RESTA, i);
		}
		public TerminalNode IGUAL() { return getToken(compiladoresParser.IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IncrementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterIncrementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitIncrementos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitIncrementos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementosContext incrementos() throws RecognitionException {
		IncrementosContext _localctx = new IncrementosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_incrementos);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				setState(179);
				match(SUMA);
				setState(180);
				match(SUMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				setState(182);
				match(RESTA);
				setState(183);
				match(RESTA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(SUMA);
				setState(185);
				match(SUMA);
				setState(186);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				match(RESTA);
				setState(188);
				match(RESTA);
				setState(189);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				match(ID);
				setState(191);
				match(IGUAL);
				setState(192);
				exp();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return econdicion_sempred((EcondicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean econdicion_sempred(EcondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00c4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003D\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007[\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\nh\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bp\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u007f\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a2\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00a8\b\u0010"+
		"\n\u0010\f\u0010\u00ab\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u00c2\b\u0014\u0001\u0014\u0000\u0001 \u0015\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(\u0000\u0004\u0001\u0000\r\u000f\u0001\u0000\u0018\u001d\u0001\u0000"+
		"\u0016\u0017\u0001\u0000\u0014\u0015\u00c4\u0000*\u0001\u0000\u0000\u0000"+
		"\u00021\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006C"+
		"\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000"+
		"\u0000\fQ\u0001\u0000\u0000\u0000\u000eZ\u0001\u0000\u0000\u0000\u0010"+
		"\\\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014g\u0001"+
		"\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000"+
		"\u0000\u001a\u0080\u0001\u0000\u0000\u0000\u001c\u0086\u0001\u0000\u0000"+
		"\u0000\u001e\u0091\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000"+
		"\"\u00ac\u0001\u0000\u0000\u0000$\u00ae\u0001\u0000\u0000\u0000&\u00b0"+
		"\u0001\u0000\u0000\u0000(\u00c1\u0001\u0000\u0000\u0000*+\u0003\u0002"+
		"\u0001\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0006\u0003\u0000./\u0003\u0002\u0001\u0000/2\u0001\u0000\u0000"+
		"\u000002\u0001\u0000\u0000\u00001-\u0001\u0000\u0000\u000010\u0001\u0000"+
		"\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005\u0004\u0000\u0000"+
		"45\u0003\u0002\u0001\u000058\u0005\u0005\u0000\u000069\u0005\u0006\u0000"+
		"\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000087\u0001\u0000"+
		"\u0000\u00009\u0005\u0001\u0000\u0000\u0000:;\u0003\b\u0004\u0000;<\u0005"+
		"\u0006\u0000\u0000<D\u0001\u0000\u0000\u0000=>\u0003\f\u0006\u0000>?\u0005"+
		"\u0006\u0000\u0000?D\u0001\u0000\u0000\u0000@D\u0003\u001a\r\u0000AD\u0003"+
		"\u001c\u000e\u0000BD\u0003\u001e\u000f\u0000C:\u0001\u0000\u0000\u0000"+
		"C=\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CB\u0001\u0000\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0003"+
		"\n\u0005\u0000FG\u0005\u001f\u0000\u0000GN\u0001\u0000\u0000\u0000HI\u0003"+
		"\n\u0005\u0000IJ\u0005\u001f\u0000\u0000JK\u0005\u0007\u0000\u0000KL\u0003"+
		"\u0010\b\u0000LN\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000MH\u0001"+
		"\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000"+
		"P\u000b\u0001\u0000\u0000\u0000QR\u0005\u001f\u0000\u0000RS\u0005\u0007"+
		"\u0000\u0000ST\u0003\u0010\b\u0000T\r\u0001\u0000\u0000\u0000UV\u0003"+
		"\u0010\b\u0000VW\u0005\u0006\u0000\u0000WX\u0003\u000e\u0007\u0000X[\u0001"+
		"\u0000\u0000\u0000Y[\u0005\u0000\u0000\u0001ZU\u0001\u0000\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0003\u0012"+
		"\t\u0000]^\u0003\u0014\n\u0000^\u0011\u0001\u0000\u0000\u0000_`\u0003"+
		"\u0016\u000b\u0000`a\u0003\u0014\n\u0000a\u0013\u0001\u0000\u0000\u0000"+
		"bc\u0005\b\u0000\u0000ch\u0003\u0012\t\u0000de\u0005\t\u0000\u0000eh\u0003"+
		"\u0012\t\u0000fh\u0001\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000gd\u0001"+
		"\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0015\u0001\u0000\u0000"+
		"\u0000ip\u0005\u001e\u0000\u0000jp\u0005\u001f\u0000\u0000kl\u0005\u0002"+
		"\u0000\u0000lm\u0003\u0010\b\u0000mn\u0005\u0003\u0000\u0000np\u0001\u0000"+
		"\u0000\u0000oi\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000ok\u0001"+
		"\u0000\u0000\u0000p\u0017\u0001\u0000\u0000\u0000qr\u0005\n\u0000\u0000"+
		"rs\u0003\u0016\u000b\u0000st\u0003\u0018\f\u0000t\u007f\u0001\u0000\u0000"+
		"\u0000uv\u0005\u000b\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0003\u0018"+
		"\f\u0000x\u007f\u0001\u0000\u0000\u0000yz\u0005\f\u0000\u0000z{\u0003"+
		"\u0016\u000b\u0000{|\u0003\u0018\f\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}\u007f\u0001\u0000\u0000\u0000~q\u0001\u0000\u0000\u0000~u\u0001\u0000"+
		"\u0000\u0000~y\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\u0019\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0011\u0000\u0000\u0081"+
		"\u0082\u0005\u0002\u0000\u0000\u0082\u0083\u0003 \u0010\u0000\u0083\u0084"+
		"\u0005\u0003\u0000\u0000\u0084\u0085\u0003\u0004\u0002\u0000\u0085\u001b"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087\u0088"+
		"\u0005\u0002\u0000\u0000\u0088\u0089\u0003\b\u0004\u0000\u0089\u008a\u0005"+
		"\u0006\u0000\u0000\u008a\u008b\u0003 \u0010\u0000\u008b\u008c\u0005\u0006"+
		"\u0000\u0000\u008c\u008d\u0003(\u0014\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090\u0003\u0004\u0002"+
		"\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0010\u0000"+
		"\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093\u0094\u0003 \u0010\u0000"+
		"\u0094\u0095\u0005\u0003\u0000\u0000\u0095\u0096\u0003\u0004\u0002\u0000"+
		"\u0096\u001f\u0001\u0000\u0000\u0000\u0097\u0098\u0006\u0010\uffff\uffff"+
		"\u0000\u0098\u0099\u0003\u0010\b\u0000\u0099\u009a\u0003\"\u0011\u0000"+
		"\u009a\u009b\u0003\u0010\b\u0000\u009b\u00a2\u0001\u0000\u0000\u0000\u009c"+
		"\u00a2\u0003&\u0013\u0000\u009d\u009e\u0003\u0010\b\u0000\u009e\u009f"+
		"\u0003\"\u0011\u0000\u009f\u00a0\u0003&\u0013\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a1\u009c\u0001"+
		"\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\n\u0003\u0000\u0000\u00a4\u00a5\u0003$"+
		"\u0012\u0000\u00a5\u00a6\u0003 \u0010\u0004\u00a6\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa!\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0007\u0001\u0000\u0000\u00ad#\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0007\u0002\u0000\u0000\u00af%\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0007\u0003\u0000\u0000\u00b1\'\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001f\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00c2\u0005\b"+
		"\u0000\u0000\u00b5\u00b6\u0005\u001f\u0000\u0000\u00b6\u00b7\u0005\t\u0000"+
		"\u0000\u00b7\u00c2\u0005\t\u0000\u0000\u00b8\u00b9\u0005\b\u0000\u0000"+
		"\u00b9\u00ba\u0005\b\u0000\u0000\u00ba\u00c2\u0005\u001f\u0000\u0000\u00bb"+
		"\u00bc\u0005\t\u0000\u0000\u00bc\u00bd\u0005\t\u0000\u0000\u00bd\u00c2"+
		"\u0005\u001f\u0000\u0000\u00be\u00bf\u0005\u001f\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0007\u0000\u0000\u00c0\u00c2\u0003\u0010\b\u0000\u00c1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00c1\u00b5\u0001\u0000\u0000\u0000\u00c1\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c1\u00be\u0001"+
		"\u0000\u0000\u0000\u00c2)\u0001\u0000\u0000\u0000\u000b18CMZgo~\u00a1"+
		"\u00a9\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}