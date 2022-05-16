// Generated from /home/renegade/workspace/stellaris-species-editor/src/main/resources/antlr/Stellaris.g4 by ANTLR 4.10.1
package antlr.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StellarisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, BLOCK_START=2, BLOCK_END=3, TRAIT=4, INT=5, PCT=6, REAL=7, 
		DATE=8, STRING=9, SYMBOL=10, WHITESPACE=11, LINE_COMMENT=12;
	public static final int
		RULE_empires = 0, RULE_empire = 1, RULE_assignment = 2, RULE_field = 3, 
		RULE_value = 4, RULE_trait = 5, RULE_symbol = 6, RULE_string = 7, RULE_integer = 8, 
		RULE_real = 9, RULE_date = 10, RULE_percent = 11, RULE_map = 12, RULE_array = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"empires", "empire", "assignment", "field", "value", "trait", "symbol", 
			"string", "integer", "real", "date", "percent", "map", "array"
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

	@Override
	public String getGrammarFileName() { return "Stellaris.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StellarisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class EmpiresContext extends ParserRuleContext {
		public List<dao.empire.UserEmpire> empireList;
		public TerminalNode EOF() { return getToken(StellarisParser.EOF, 0); }
		public List<EmpireContext> empire() {
			return getRuleContexts(EmpireContext.class);
		}
		public EmpireContext empire(int i) {
			return getRuleContext(EmpireContext.class,i);
		}
		public EmpiresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empires; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterEmpires(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitEmpires(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitEmpires(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmpiresContext empires() throws RecognitionException {
		EmpiresContext _localctx = new EmpiresContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_empires);
		((EmpiresContext)_localctx).empireList =  new ArrayList<dao.empire.UserEmpire>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(28);
				empire();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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

	public static class EmpireContext extends ParserRuleContext {
		public dao.empire.UserEmpire userEmpire;
		public MapContext map;
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(StellarisParser.OPERATOR, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public EmpireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterEmpire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitEmpire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitEmpire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmpireContext empire() throws RecognitionException {
		EmpireContext _localctx = new EmpireContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_empire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			string();
			setState(37);
			match(OPERATOR);
			setState(38);
			((EmpireContext)_localctx).map = map();
			((EmpireContext)_localctx).userEmpire =  new dao.empire.UserEmpire((((EmpireContext)_localctx).map!=null?_input.getText(((EmpireContext)_localctx).map.start,((EmpireContext)_localctx).map.stop):null));
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

	public static class AssignmentContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(StellarisParser.OPERATOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			field();
			setState(42);
			match(OPERATOR);
			setState(43);
			value();
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

	public static class FieldContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				symbol();
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

	public static class ValueContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PercentContext percent() {
			return getRuleContext(PercentContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				integer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				percent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				real();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				date();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				symbol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				map();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				array();
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

	public static class TraitContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(StellarisParser.TRAIT, 0); }
		public TraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitTrait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitTrait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraitContext trait() throws RecognitionException {
		TraitContext _localctx = new TraitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_trait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(TRAIT);
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StellarisParser.STRING, 0); }
		public TerminalNode INT() { return getToken(StellarisParser.INT, 0); }
		public TerminalNode SYMBOL() { return getToken(StellarisParser.SYMBOL, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << SYMBOL))) != 0)) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StellarisParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(STRING);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(StellarisParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(INT);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(StellarisParser.REAL, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(REAL);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(StellarisParser.DATE, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(DATE);
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

	public static class PercentContext extends ParserRuleContext {
		public TerminalNode PCT() { return getToken(StellarisParser.PCT, 0); }
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitPercent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitPercent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_percent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(PCT);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(StellarisParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(StellarisParser.BLOCK_END, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BLOCK_START);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << SYMBOL))) != 0)) {
				{
				{
				setState(74);
				assignment();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(BLOCK_END);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(StellarisParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(StellarisParser.BLOCK_END, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StellarisListener ) ((StellarisListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StellarisVisitor ) return ((StellarisVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(BLOCK_START);
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				value();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLOCK_START) | (1L << INT) | (1L << PCT) | (1L << REAL) | (1L << DATE) | (1L << STRING) | (1L << SYMBOL))) != 0) );
			setState(88);
			match(BLOCK_END);
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
		"\u0004\u0001\f[\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0003\u00030\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fL\b\f\n\f\f\f"+
		"O\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0004\rU\b\r\u000b\r\f\rV\u0001"+
		"\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0002\u0000\u0005\u0005"+
		"\t\nW\u0000\u001f\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000"+
		"\u0004)\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000\u0000\b9\u0001"+
		"\u0000\u0000\u0000\n;\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000\u0000"+
		"\u000e?\u0001\u0000\u0000\u0000\u0010A\u0001\u0000\u0000\u0000\u0012C"+
		"\u0001\u0000\u0000\u0000\u0014E\u0001\u0000\u0000\u0000\u0016G\u0001\u0000"+
		"\u0000\u0000\u0018I\u0001\u0000\u0000\u0000\u001aR\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000"+
		"$%\u0003\u000e\u0007\u0000%&\u0005\u0001\u0000\u0000&\'\u0003\u0018\f"+
		"\u0000\'(\u0006\u0001\uffff\uffff\u0000(\u0003\u0001\u0000\u0000\u0000"+
		")*\u0003\u0006\u0003\u0000*+\u0005\u0001\u0000\u0000+,\u0003\b\u0004\u0000"+
		",\u0005\u0001\u0000\u0000\u0000-0\u0003\u000e\u0007\u0000.0\u0003\f\u0006"+
		"\u0000/-\u0001\u0000\u0000\u0000/.\u0001\u0000\u0000\u00000\u0007\u0001"+
		"\u0000\u0000\u00001:\u0003\u0010\b\u00002:\u0003\u0016\u000b\u00003:\u0003"+
		"\u0012\t\u00004:\u0003\u0014\n\u00005:\u0003\u000e\u0007\u00006:\u0003"+
		"\f\u0006\u00007:\u0003\u0018\f\u00008:\u0003\u001a\r\u000091\u0001\u0000"+
		"\u0000\u000092\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000094\u0001"+
		"\u0000\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0004\u0000\u0000<\u000b\u0001\u0000\u0000\u0000=>\u0007"+
		"\u0000\u0000\u0000>\r\u0001\u0000\u0000\u0000?@\u0005\t\u0000\u0000@\u000f"+
		"\u0001\u0000\u0000\u0000AB\u0005\u0005\u0000\u0000B\u0011\u0001\u0000"+
		"\u0000\u0000CD\u0005\u0007\u0000\u0000D\u0013\u0001\u0000\u0000\u0000"+
		"EF\u0005\b\u0000\u0000F\u0015\u0001\u0000\u0000\u0000GH\u0005\u0006\u0000"+
		"\u0000H\u0017\u0001\u0000\u0000\u0000IM\u0005\u0002\u0000\u0000JL\u0003"+
		"\u0004\u0002\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0003\u0000\u0000Q\u0019\u0001"+
		"\u0000\u0000\u0000RT\u0005\u0002\u0000\u0000SU\u0003\b\u0004\u0000TS\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0005\u0003\u0000"+
		"\u0000Y\u001b\u0001\u0000\u0000\u0000\u0005\u001f/9MV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}