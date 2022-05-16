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
		OPERATOR=1, BLOCK_START=2, BLOCK_END=3, TRAIT=4, INT=5, PCT=6, REAL=7, 
		DATE=8, STRING=9, SYMBOL=10, WHITESPACE=11, LINE_COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATOR", "BLOCK_START", "BLOCK_END", "TRAIT", "INT", "PCT", "REAL", 
			"DATE", "STRING", "SYMBOL", "WHITESPACE", "LINE_COMMENT", "STRING_DELIM", 
			"NEGATION"
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
			null, "OPERATOR", "BLOCK_START", "BLOCK_END", "TRAIT", "INT", "PCT", 
			"REAL", "DATE", "STRING", "SYMBOL", "WHITESPACE", "LINE_COMMENT"
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
		"\u0004\u0000\f\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000&\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u00046\b\u0004\u0001"+
		"\u0004\u0004\u00049\b\u0004\u000b\u0004\f\u0004:\u0001\u0005\u0003\u0005"+
		">\b\u0005\u0001\u0005\u0004\u0005A\b\u0005\u000b\u0005\f\u0005B\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0003\u0006H\b\u0006\u0001\u0006\u0004"+
		"\u0006K\b\u0006\u000b\u0006\f\u0006L\u0001\u0006\u0001\u0006\u0004\u0006"+
		"Q\b\u0006\u000b\u0006\f\u0006R\u0001\u0007\u0004\u0007V\b\u0007\u000b"+
		"\u0007\f\u0007W\u0001\u0007\u0001\u0007\u0004\u0007\\\b\u0007\u000b\u0007"+
		"\f\u0007]\u0001\u0007\u0001\u0007\u0004\u0007b\b\u0007\u000b\u0007\f\u0007"+
		"c\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bj\b\b\n\b\f\bm\t\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0005\ts\b\t\n\t\f\tv\t\t\u0001\n\u0004\ny\b\n\u000b"+
		"\n\f\nz\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u0081\b\u000b"+
		"\n\u000b\f\u000b\u0084\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\u0000\u001b\u0000\u0001\u0000\u000b\u0002\u0000<"+
		"<>>\u0002\u0000TTtt\u0002\u0000RRrr\u0002\u0000AAaa\u0002\u0000IIii\u0001"+
		"\u000009\u0002\u0000\"\"\\\\\u0003\u000009AZaz\u0006\u0000%%-.0:@Z__a"+
		"z\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u009b\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003"+
		"\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001"+
		"\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b=\u0001\u0000\u0000"+
		"\u0000\rG\u0001\u0000\u0000\u0000\u000fU\u0001\u0000\u0000\u0000\u0011"+
		"e\u0001\u0000\u0000\u0000\u0013p\u0001\u0000\u0000\u0000\u0015x\u0001"+
		"\u0000\u0000\u0000\u0017~\u0001\u0000\u0000\u0000\u0019\u0087\u0001\u0000"+
		"\u0000\u0000\u001b\u0089\u0001\u0000\u0000\u0000\u001d&\u0005=\u0000\u0000"+
		"\u001e\u001f\u0005<\u0000\u0000\u001f&\u0005>\u0000\u0000 &\u0007\u0000"+
		"\u0000\u0000!\"\u0005<\u0000\u0000\"&\u0005=\u0000\u0000#$\u0005>\u0000"+
		"\u0000$&\u0005=\u0000\u0000%\u001d\u0001\u0000\u0000\u0000%\u001e\u0001"+
		"\u0000\u0000\u0000% \u0001\u0000\u0000\u0000%!\u0001\u0000\u0000\u0000"+
		"%#\u0001\u0000\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005{\u0000"+
		"\u0000(\u0004\u0001\u0000\u0000\u0000)*\u0005}\u0000\u0000*\u0006\u0001"+
		"\u0000\u0000\u0000+,\u0007\u0001\u0000\u0000,-\u0007\u0002\u0000\u0000"+
		"-.\u0007\u0003\u0000\u0000./\u0007\u0004\u0000\u0000/0\u0007\u0001\u0000"+
		"\u000001\u0005_\u0000\u000012\u0001\u0000\u0000\u000023\u0003\u0013\t"+
		"\u00003\b\u0001\u0000\u0000\u000046\u0003\u001b\r\u000054\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000079\u0007"+
		"\u0005\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\n\u0001\u0000\u0000"+
		"\u0000<>\u0003\u001b\r\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?A\u0007\u0005\u0000\u0000@?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005%\u0000\u0000E\f\u0001"+
		"\u0000\u0000\u0000FH\u0003\u001b\r\u0000GF\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IK\u0007\u0005\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0005.\u0000"+
		"\u0000OQ\u0007\u0005\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u000e"+
		"\u0001\u0000\u0000\u0000TV\u0007\u0005\u0000\u0000UT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0005.\u0000\u0000Z\\\u0007\u0005"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_a\u0005.\u0000\u0000`b\u0007\u0005\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000d\u0010\u0001\u0000\u0000\u0000ek\u0003\u0019\f\u0000fj\b\u0006"+
		"\u0000\u0000gh\u0005\\\u0000\u0000hj\u0007\u0006\u0000\u0000if\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000no\u0003\u0019\f\u0000o\u0012\u0001\u0000\u0000"+
		"\u0000pt\u0007\u0007\u0000\u0000qs\u0007\b\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000u\u0014\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"wy\u0007\t\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|}\u0006\n\u0000\u0000}\u0016\u0001\u0000\u0000\u0000~\u0082\u0005"+
		"#\u0000\u0000\u007f\u0081\b\n\u0000\u0000\u0080\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0006\u000b\u0001"+
		"\u0000\u0086\u0018\u0001\u0000\u0000\u0000\u0087\u0088\u0005\"\u0000\u0000"+
		"\u0088\u001a\u0001\u0000\u0000\u0000\u0089\u008a\u0005-\u0000\u0000\u008a"+
		"\u001c\u0001\u0000\u0000\u0000\u0011\u0000%5:=BGLRW]ciktz\u0082\u0002"+
		"\u0006\u0000\u0000\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}