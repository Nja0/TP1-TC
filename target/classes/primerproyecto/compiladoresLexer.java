// Generated from c:/Users/torus/OneDrive/Documentos/GitHub/TP1-TC/target/classes/primerproyecto/compiladores.g4 by ANTLR 4.13.1

package primerproyecto;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PA=2, PC=3, LLA=4, LLC=5, PYC=6, COMA=7, IGUAL=8, SUMA=9, RESTA=10, 
		MULTIPLICACION=11, DIVISION=12, MODULO=13, PUNT=14, INT=15, DOUBLE=16, 
		BOOL=17, VOID=18, IWHILE=19, IIF=20, IELSE=21, IFOR=22, IRETURN=23, ID=24, 
		NUM=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "PA", "PC", "LLA", "LLC", "PYC", "COMA", "IGUAL", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "PUNT", "INT", 
			"DOUBLE", "BOOL", "VOID", "IWHILE", "IIF", "IELSE", "IFOR", "IRETURN", 
			"ID", "NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'.'", "'int'", "'double'", "'bool'", "'void'", 
			"'while'", "'if'", "'else'", "'for'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "COMA", "IGUAL", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "PUNT", "INT", "DOUBLE", 
			"BOOL", "VOID", "IWHILE", "IIF", "IELSE", "IFOR", "IRETURN", "ID", "NUM"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\u0019\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u008b\b\u0019\n\u0019\f\u0019\u008e\t\u0019"+
		"\u0001\u001a\u0004\u001a\u0091\b\u001a\u000b\u001a\f\u001a\u0092\u0000"+
		"\u0000\u001b\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b"+
		"\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b"+
		"\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014"+
		"-\u0015/\u00161\u00173\u00185\u0019\u0001\u0000\u0003\u0002\u0000AZaz"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u0094\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000"+
		"\u0005;\u0001\u0000\u0000\u0000\u0007?\u0001\u0000\u0000\u0000\tA\u0001"+
		"\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000"+
		"\u0000\u000fG\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013"+
		"K\u0001\u0000\u0000\u0000\u0015M\u0001\u0000\u0000\u0000\u0017O\u0001"+
		"\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000\u0000\u001bS\u0001\u0000\u0000"+
		"\u0000\u001dU\u0001\u0000\u0000\u0000\u001fW\u0001\u0000\u0000\u0000!"+
		"Y\u0001\u0000\u0000\u0000#]\u0001\u0000\u0000\u0000%d\u0001\u0000\u0000"+
		"\u0000\'i\u0001\u0000\u0000\u0000)n\u0001\u0000\u0000\u0000+t\u0001\u0000"+
		"\u0000\u0000-w\u0001\u0000\u0000\u0000/|\u0001\u0000\u0000\u00001\u0080"+
		"\u0001\u0000\u0000\u00003\u0087\u0001\u0000\u0000\u00005\u0090\u0001\u0000"+
		"\u0000\u000078\u0007\u0000\u0000\u00008\u0002\u0001\u0000\u0000\u0000"+
		"9:\u0007\u0001\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0007\u0002"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0006\u0002\u0000\u0000>\u0006"+
		"\u0001\u0000\u0000\u0000?@\u0005(\u0000\u0000@\b\u0001\u0000\u0000\u0000"+
		"AB\u0005)\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005{\u0000\u0000"+
		"D\f\u0001\u0000\u0000\u0000EF\u0005}\u0000\u0000F\u000e\u0001\u0000\u0000"+
		"\u0000GH\u0005;\u0000\u0000H\u0010\u0001\u0000\u0000\u0000IJ\u0005,\u0000"+
		"\u0000J\u0012\u0001\u0000\u0000\u0000KL\u0005=\u0000\u0000L\u0014\u0001"+
		"\u0000\u0000\u0000MN\u0005+\u0000\u0000N\u0016\u0001\u0000\u0000\u0000"+
		"OP\u0005-\u0000\u0000P\u0018\u0001\u0000\u0000\u0000QR\u0005*\u0000\u0000"+
		"R\u001a\u0001\u0000\u0000\u0000ST\u0005/\u0000\u0000T\u001c\u0001\u0000"+
		"\u0000\u0000UV\u0005%\u0000\u0000V\u001e\u0001\u0000\u0000\u0000WX\u0005"+
		".\u0000\u0000X \u0001\u0000\u0000\u0000YZ\u0005i\u0000\u0000Z[\u0005n"+
		"\u0000\u0000[\\\u0005t\u0000\u0000\\\"\u0001\u0000\u0000\u0000]^\u0005"+
		"d\u0000\u0000^_\u0005o\u0000\u0000_`\u0005u\u0000\u0000`a\u0005b\u0000"+
		"\u0000ab\u0005l\u0000\u0000bc\u0005e\u0000\u0000c$\u0001\u0000\u0000\u0000"+
		"de\u0005b\u0000\u0000ef\u0005o\u0000\u0000fg\u0005o\u0000\u0000gh\u0005"+
		"l\u0000\u0000h&\u0001\u0000\u0000\u0000ij\u0005v\u0000\u0000jk\u0005o"+
		"\u0000\u0000kl\u0005i\u0000\u0000lm\u0005d\u0000\u0000m(\u0001\u0000\u0000"+
		"\u0000no\u0005w\u0000\u0000op\u0005h\u0000\u0000pq\u0005i\u0000\u0000"+
		"qr\u0005l\u0000\u0000rs\u0005e\u0000\u0000s*\u0001\u0000\u0000\u0000t"+
		"u\u0005i\u0000\u0000uv\u0005f\u0000\u0000v,\u0001\u0000\u0000\u0000wx"+
		"\u0005e\u0000\u0000xy\u0005l\u0000\u0000yz\u0005s\u0000\u0000z{\u0005"+
		"e\u0000\u0000{.\u0001\u0000\u0000\u0000|}\u0005f\u0000\u0000}~\u0005o"+
		"\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f0\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005r\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0083"+
		"\u0005t\u0000\u0000\u0083\u0084\u0005u\u0000\u0000\u0084\u0085\u0005r"+
		"\u0000\u0000\u0085\u0086\u0005n\u0000\u0000\u00862\u0001\u0000\u0000\u0000"+
		"\u0087\u008c\u0003\u0001\u0000\u0000\u0088\u008b\u0003\u0001\u0000\u0000"+
		"\u0089\u008b\u0003\u0003\u0001\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d4\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0003\u0003\u0001\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u00936\u0001\u0000\u0000\u0000\u0004\u0000"+
		"\u008a\u008c\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}