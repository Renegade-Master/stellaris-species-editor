// Generated from /home/renegade/workspace/stellaris-species-editor/src/main/resources/antlr/Stellaris.g4 by ANTLR 4.10.1
package antlr.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StellarisLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, BLOCK_START=2, BLOCK_END=3, INT=4, PCT=5, REAL=6, DATE=7,
		STRING=8, SYMBOL=9, WHITESPACE=10, LINE_COMMENT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATOR", "BLOCK_START", "BLOCK_END", "INT", "PCT", "REAL", "DATE",
			"STRING", "SYMBOL", "WHITESPACE", "LINE_COMMENT", "STRING_DELIM", "NEGATION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "BLOCK_START", "BLOCK_END", "INT", "PCT", "REAL", "DATE",
			"STRING", "SYMBOL", "WHITESPACE", "LINE_COMMENT"
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


	public StellarisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stellaris.g4"; }

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
		"\u0004\u0000\u000b\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"$\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0003\u0003+\b\u0003\u0001\u0003\u0004\u0003.\b\u0003\u000b\u0003\f\u0003"+
		"/\u0001\u0004\u0003\u00043\b\u0004\u0001\u0004\u0004\u00046\b\u0004\u000b"+
		"\u0004\f\u00047\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005=\b\u0005"+
		"\u0001\u0005\u0004\u0005@\b\u0005\u000b\u0005\f\u0005A\u0001\u0005\u0001"+
		"\u0005\u0004\u0005F\b\u0005\u000b\u0005\f\u0005G\u0001\u0006\u0004\u0006"+
		"K\b\u0006\u000b\u0006\f\u0006L\u0001\u0006\u0001\u0006\u0004\u0006Q\b"+
		"\u0006\u000b\u0006\f\u0006R\u0001\u0006\u0001\u0006\u0004\u0006W\b\u0006"+
		"\u000b\u0006\f\u0006X\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007_\b\u0007\n\u0007\f\u0007b\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0005\bh\b\b\n\b\f\bk\t\b\u0001\t\u0004\tn\b\t\u000b"+
		"\t\f\to\u0001\t\u0001\t\u0001\n\u0001\n\u0005\nv\b\n\n\n\f\ny\t\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0000\u0000\r\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\u0000\u0019\u0000\u0001\u0000"+
		"\u0007\u0002\u0000<<>>\u0001\u000009\u0002\u0000\"\"\\\\\u0003\u00000"+
		"9AZaz\u0006\u0000%%-.0:@Z__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r"+
		"\r\u0090\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%\u0001"+
		"\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007*\u0001\u0000"+
		"\u0000\u0000\t2\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000"+
		"\rJ\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000\u0000\u0000\u0011e\u0001"+
		"\u0000\u0000\u0000\u0013m\u0001\u0000\u0000\u0000\u0015s\u0001\u0000\u0000"+
		"\u0000\u0017|\u0001\u0000\u0000\u0000\u0019~\u0001\u0000\u0000\u0000\u001b"+
		"$\u0005=\u0000\u0000\u001c\u001d\u0005<\u0000\u0000\u001d$\u0005>\u0000"+
		"\u0000\u001e$\u0007\u0000\u0000\u0000\u001f \u0005<\u0000\u0000 $\u0005"+
		"=\u0000\u0000!\"\u0005>\u0000\u0000\"$\u0005=\u0000\u0000#\u001b\u0001"+
		"\u0000\u0000\u0000#\u001c\u0001\u0000\u0000\u0000#\u001e\u0001\u0000\u0000"+
		"\u0000#\u001f\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%&\u0005{\u0000\u0000&\u0004\u0001\u0000\u0000"+
		"\u0000\'(\u0005}\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)+\u0003\u0019"+
		"\f\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000"+
		"\u0000\u0000,.\u0007\u0001\u0000\u0000-,\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\b\u0001\u0000\u0000\u000013\u0003\u0019\f\u000021\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000046\u0007\u0001"+
		"\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000075\u0001"+
		"\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0005%\u0000\u0000:\n\u0001\u0000\u0000\u0000;=\u0003\u0019\f\u0000"+
		"<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000"+
		"\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0005.\u0000\u0000DF\u0007\u0001\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\f\u0001\u0000\u0000\u0000IK\u0007\u0001\u0000"+
		"\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0005"+
		".\u0000\u0000OQ\u0007\u0001\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"ST\u0001\u0000\u0000\u0000TV\u0005.\u0000\u0000UW\u0007\u0001\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z`\u0003"+
		"\u0017\u000b\u0000[_\b\u0002\u0000\u0000\\]\u0005\\\u0000\u0000]_\u0007"+
		"\u0002\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0003\u0017"+
		"\u000b\u0000d\u0010\u0001\u0000\u0000\u0000ei\u0007\u0003\u0000\u0000"+
		"fh\u0007\u0004\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0012\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0007\u0005\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\t\u0000"+
		"\u0000r\u0014\u0001\u0000\u0000\u0000sw\u0005#\u0000\u0000tv\b\u0006\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0006\n\u0001\u0000{\u0016\u0001\u0000\u0000\u0000"+
		"|}\u0005\"\u0000\u0000}\u0018\u0001\u0000\u0000\u0000~\u007f\u0005-\u0000"+
		"\u0000\u007f\u001a\u0001\u0000\u0000\u0000\u0011\u0000#*/27<AGLRX^`io"+
		"w\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
