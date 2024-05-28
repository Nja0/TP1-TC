// Generated from c:/Users/torus/OneDrive/Documentos/GitHub/TP1-TC/src/main/java/primerproyecto/compiladores.g4 by ANTLR 4.13.1

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
		MULTIPLICACION=11, DIVISION=12, MODULO=13, INT=14, DOUBLE=15, BOOL=16, 
		IWHILE=17, IIF=18, IFOR=19, IRETURN=20, TRUE=21, FALSE=22, AND=23, OR=24, 
		EQUAL=25, MAY=26, MAYIG=27, MEN=28, MENIG=29, DESIG=30, NUMERO=31, ID=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "PA", "PC", "LLA", "LLC", "PYC", "COMA", "IGUAL", 
			"SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "INT", "DOUBLE", 
			"BOOL", "IWHILE", "IIF", "IFOR", "IRETURN", "TRUE", "FALSE", "AND", "OR", 
			"EQUAL", "MAY", "MAYIG", "MEN", "MENIG", "DESIG", "NUMERO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'int'", "'double'", "'boolean'", "'while'", "'if'", 
			"'for'", "'return'", "'true'", "'false'", "'&&'", "'||'", "'=='", "'>'", 
			"'>='", "'<'", "'<='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "COMA", "IGUAL", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "INT", "DOUBLE", "BOOL", 
			"IWHILE", "IIF", "IFOR", "IRETURN", "TRUE", "FALSE", "AND", "OR", "EQUAL", 
			"MAY", "MAYIG", "MEN", "MENIG", "DESIG", "NUMERO", "ID"
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
		"\u0004\u0000 \u00be\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0004 \u00af"+
		"\b \u000b \f \u00b0\u0001!\u0001!\u0003!\u00b5\b!\u0001!\u0001!\u0001"+
		"!\u0005!\u00ba\b!\n!\f!\u00bd\t!\u0000\u0000\"\u0001\u0000\u0003\u0000"+
		"\u0005\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011"+
		"\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e"+
		"!\u000f#\u0010%\u0011\'\u0012)\u0013+\u0014-\u0015/\u00161\u00173\u0018"+
		"5\u00197\u001a9\u001b;\u001c=\u001d?\u001eA\u001fC \u0001\u0000\u0003"+
		"\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u00c0\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000"+
		"C\u0001\u0000\u0000\u0000\u0001E\u0001\u0000\u0000\u0000\u0003G\u0001"+
		"\u0000\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000"+
		"\u0000\tO\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000\u0000\rS\u0001"+
		"\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000"+
		"\u0000\u0013Y\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017"+
		"]\u0001\u0000\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001ba\u0001"+
		"\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001fe\u0001\u0000\u0000"+
		"\u0000!i\u0001\u0000\u0000\u0000#p\u0001\u0000\u0000\u0000%x\u0001\u0000"+
		"\u0000\u0000\'~\u0001\u0000\u0000\u0000)\u0081\u0001\u0000\u0000\u0000"+
		"+\u0085\u0001\u0000\u0000\u0000-\u008c\u0001\u0000\u0000\u0000/\u0091"+
		"\u0001\u0000\u0000\u00001\u0097\u0001\u0000\u0000\u00003\u009a\u0001\u0000"+
		"\u0000\u00005\u009d\u0001\u0000\u0000\u00007\u00a0\u0001\u0000\u0000\u0000"+
		"9\u00a2\u0001\u0000\u0000\u0000;\u00a5\u0001\u0000\u0000\u0000=\u00a7"+
		"\u0001\u0000\u0000\u0000?\u00aa\u0001\u0000\u0000\u0000A\u00ae\u0001\u0000"+
		"\u0000\u0000C\u00b4\u0001\u0000\u0000\u0000EF\u0007\u0000\u0000\u0000"+
		"F\u0002\u0001\u0000\u0000\u0000GH\u0007\u0001\u0000\u0000H\u0004\u0001"+
		"\u0000\u0000\u0000IJ\u0007\u0002\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KL\u0006\u0002\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005(\u0000"+
		"\u0000N\b\u0001\u0000\u0000\u0000OP\u0005)\u0000\u0000P\n\u0001\u0000"+
		"\u0000\u0000QR\u0005{\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005}"+
		"\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005;\u0000\u0000V\u0010"+
		"\u0001\u0000\u0000\u0000WX\u0005,\u0000\u0000X\u0012\u0001\u0000\u0000"+
		"\u0000YZ\u0005=\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[\\\u0005+\u0000"+
		"\u0000\\\u0016\u0001\u0000\u0000\u0000]^\u0005-\u0000\u0000^\u0018\u0001"+
		"\u0000\u0000\u0000_`\u0005*\u0000\u0000`\u001a\u0001\u0000\u0000\u0000"+
		"ab\u0005/\u0000\u0000b\u001c\u0001\u0000\u0000\u0000cd\u0005%\u0000\u0000"+
		"d\u001e\u0001\u0000\u0000\u0000ef\u0005i\u0000\u0000fg\u0005n\u0000\u0000"+
		"gh\u0005t\u0000\u0000h \u0001\u0000\u0000\u0000ij\u0005d\u0000\u0000j"+
		"k\u0005o\u0000\u0000kl\u0005u\u0000\u0000lm\u0005b\u0000\u0000mn\u0005"+
		"l\u0000\u0000no\u0005e\u0000\u0000o\"\u0001\u0000\u0000\u0000pq\u0005"+
		"b\u0000\u0000qr\u0005o\u0000\u0000rs\u0005o\u0000\u0000st\u0005l\u0000"+
		"\u0000tu\u0005e\u0000\u0000uv\u0005a\u0000\u0000vw\u0005n\u0000\u0000"+
		"w$\u0001\u0000\u0000\u0000xy\u0005w\u0000\u0000yz\u0005h\u0000\u0000z"+
		"{\u0005i\u0000\u0000{|\u0005l\u0000\u0000|}\u0005e\u0000\u0000}&\u0001"+
		"\u0000\u0000\u0000~\u007f\u0005i\u0000\u0000\u007f\u0080\u0005f\u0000"+
		"\u0000\u0080(\u0001\u0000\u0000\u0000\u0081\u0082\u0005f\u0000\u0000\u0082"+
		"\u0083\u0005o\u0000\u0000\u0083\u0084\u0005r\u0000\u0000\u0084*\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005r\u0000\u0000\u0086\u0087\u0005e\u0000"+
		"\u0000\u0087\u0088\u0005t\u0000\u0000\u0088\u0089\u0005u\u0000\u0000\u0089"+
		"\u008a\u0005r\u0000\u0000\u008a\u008b\u0005n\u0000\u0000\u008b,\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005t\u0000\u0000\u008d\u008e\u0005r\u0000"+
		"\u0000\u008e\u008f\u0005u\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090"+
		".\u0001\u0000\u0000\u0000\u0091\u0092\u0005f\u0000\u0000\u0092\u0093\u0005"+
		"a\u0000\u0000\u0093\u0094\u0005l\u0000\u0000\u0094\u0095\u0005s\u0000"+
		"\u0000\u0095\u0096\u0005e\u0000\u0000\u00960\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005&\u0000\u0000\u0098\u0099\u0005&\u0000\u0000\u00992\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005|\u0000\u0000\u009b\u009c\u0005|\u0000"+
		"\u0000\u009c4\u0001\u0000\u0000\u0000\u009d\u009e\u0005=\u0000\u0000\u009e"+
		"\u009f\u0005=\u0000\u0000\u009f6\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		">\u0000\u0000\u00a18\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005>\u0000"+
		"\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4:\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005<\u0000\u0000\u00a6<\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"<\u0000\u0000\u00a8\u00a9\u0005=\u0000\u0000\u00a9>\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005!\u0000\u0000\u00ab\u00ac\u0005=\u0000\u0000\u00ac"+
		"@\u0001\u0000\u0000\u0000\u00ad\u00af\u0003\u0003\u0001\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1B\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0003\u0001\u0000\u0000\u00b3\u00b5\u0005"+
		"_\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00bb\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003\u0001"+
		"\u0000\u0000\u00b7\u00ba\u0003\u0003\u0001\u0000\u00b8\u00ba\u0005_\u0000"+
		"\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bcD\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u0005\u0000\u00b0\u00b4\u00b9\u00bb\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}