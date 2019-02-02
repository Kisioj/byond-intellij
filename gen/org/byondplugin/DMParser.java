// Generated from DM.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, NEWLINE=3, SWITCH=4, IF=5, ELSE=6, FOR=7, WHILE=8, 
		DO=9, BREAK=10, CONTINUE=11, IN=12, VAR=13, CONST=14, DEL=15, RETURN=16, 
		SET=17, TO=18, AS=19, GOTO=20, NEW=21, SPAWN=22, TRY=23, CATCH=24, VERB=25, 
		PROC=26, GLOBAL=27, STATIC=28, ARG=29, TMP=30, OPEN_BRACK=31, CLOSE_BRACK=32, 
		OPEN_PAREN=33, CLOSE_PAREN=34, DOUBLE_DOT=35, DOT=36, COMMA=37, STAR=38, 
		PERCENT=39, SLASH=40, COLON=41, QUESTION_MARK=42, NOT_OP=43, NEG_OP=44, 
		MINUS=45, PLUS=46, INCREMENT=47, DECREMENT=48, POWER=49, LESS_THAN=50, 
		GREATER_THAN=51, LESS_THAN_OR_EQUAL=52, GREATER_THAN_OR_EQUAL=53, SHIFT_LEFT=54, 
		SHIFT_RIGHT=55, EQUAL=56, NOT_EQUAL=57, NOT_EQUAL_2=58, BIT_AND=59, BIT_OR=60, 
		BIT_XOR=61, LOG_AND=62, LOG_OR=63, ASSIGN=64, ADD_ASSIGN=65, SUB_ASSIGN=66, 
		MULT_ASSIGN=67, DIV_ASSIGN=68, MOD_ASSIGN=69, BIT_AND_ASSIGN=70, BIT_OR_ASSIGN=71, 
		XOR_ASSIGN=72, LEFT_SHIFT_ASSIGN=73, RIGHT_SHIFT_ASSIGN=74, SEMICOLON=75, 
		NAME=76, STRING_LITERAL=77, ICON_PATH=78, NUMBER=79, INTEGER=80, FLOAT=81, 
		SKIP_=82, COMMENT=83, UNKNOWN_CHAR=84;
	public static final int
		RULE_start = 0, RULE_var_stmt = 1, RULE_var_path = 2, RULE_vardef = 3, 
		RULE_inline_var_stmt = 4, RULE_inline_var_path = 5, RULE_classdef = 6, 
		RULE_class_body = 7, RULE_funcdefs = 8, RULE_func_type = 9, RULE_funcdef = 10, 
		RULE_parameters = 11, RULE_parameter = 12, RULE_suite = 13, RULE_stmt = 14, 
		RULE_simple_stmt = 15, RULE_small_stmt = 16, RULE_set_stmt = 17, RULE_del_stmt = 18, 
		RULE_flow_stmt = 19, RULE_compound_stmt = 20, RULE_if_stmt = 21, RULE_dowhile_stmt = 22, 
		RULE_while_stmt = 23, RULE_spawn_stmt = 24, RULE_for_stmt = 25, RULE_foreach_stmt = 26, 
		RULE_break_stmt = 27, RULE_continue_stmt = 28, RULE_return_stmt = 29, 
		RULE_expr = 30, RULE_trailer = 31, RULE_arglist = 32, RULE_value = 33, 
		RULE_new_stmt = 34, RULE_path = 35, RULE_name = 36;
	public static final String[] ruleNames = {
		"start", "var_stmt", "var_path", "vardef", "inline_var_stmt", "inline_var_path", 
		"classdef", "class_body", "funcdefs", "func_type", "funcdef", "parameters", 
		"parameter", "suite", "stmt", "simple_stmt", "small_stmt", "set_stmt", 
		"del_stmt", "flow_stmt", "compound_stmt", "if_stmt", "dowhile_stmt", "while_stmt", 
		"spawn_stmt", "for_stmt", "foreach_stmt", "break_stmt", "continue_stmt", 
		"return_stmt", "expr", "trailer", "arglist", "value", "new_stmt", "path", 
		"name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'switch'", "'if'", "'else'", "'for'", "'while'", 
		"'do'", "'break'", "'continue'", "'in'", "'var'", "'const'", "'del'", 
		"'return'", "'set'", "'to'", "'as'", "'goto'", "'new'", "'spawn'", "'try'", 
		"'catch'", "'verb'", "'proc'", "'global'", "'static'", "'arg'", "'tmp'", 
		"'['", "']'", "'('", "')'", "'..'", "'.'", "','", "'*'", "'%'", "'/'", 
		"':'", "'?'", "'~'", "'!'", "'-'", "'+'", "'++'", "'--'", "'**'", "'<'", 
		"'>'", "'<='", "'>='", "'<<'", "'>>'", "'=='", "'!='", "'<>'", "'&'", 
		"'|'", "'^'", "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'&='", "'|='", "'^='", "'<<='", "'>>='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "NEWLINE", "SWITCH", "IF", "ELSE", "FOR", "WHILE", 
		"DO", "BREAK", "CONTINUE", "IN", "VAR", "CONST", "DEL", "RETURN", "SET", 
		"TO", "AS", "GOTO", "NEW", "SPAWN", "TRY", "CATCH", "VERB", "PROC", "GLOBAL", 
		"STATIC", "ARG", "TMP", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", "CLOSE_PAREN", 
		"DOUBLE_DOT", "DOT", "COMMA", "STAR", "PERCENT", "SLASH", "COLON", "QUESTION_MARK", 
		"NOT_OP", "NEG_OP", "MINUS", "PLUS", "INCREMENT", "DECREMENT", "POWER", 
		"LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", 
		"SHIFT_LEFT", "SHIFT_RIGHT", "EQUAL", "NOT_EQUAL", "NOT_EQUAL_2", "BIT_AND", 
		"BIT_OR", "BIT_XOR", "LOG_AND", "LOG_OR", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "BIT_AND_ASSIGN", "BIT_OR_ASSIGN", 
		"XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "SEMICOLON", 
		"NAME", "STRING_LITERAL", "ICON_PATH", "NUMBER", "INTEGER", "FLOAT", "SKIP_", 
		"COMMENT", "UNKNOWN_CHAR"
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

	@Override
	public String getGrammarFileName() { return "DM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<Var_stmtContext> var_stmt() {
			return getRuleContexts(Var_stmtContext.class);
		}
		public Var_stmtContext var_stmt(int i) {
			return getRuleContext(Var_stmtContext.class,i);
		}
		public List<FuncdefsContext> funcdefs() {
			return getRuleContexts(FuncdefsContext.class);
		}
		public FuncdefsContext funcdefs(int i) {
			return getRuleContext(FuncdefsContext.class,i);
		}
		public List<ClassdefContext> classdef() {
			return getRuleContexts(ClassdefContext.class);
		}
		public ClassdefContext classdef(int i) {
			return getRuleContext(ClassdefContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DMParser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << VAR) | (1L << VERB) | (1L << PROC))) != 0) || _la==NAME) {
				{
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					var_stmt();
					}
					break;
				case 2:
					{
					setState(75);
					funcdefs();
					}
					break;
				case 3:
					{
					setState(76);
					classdef();
					}
					break;
				case 4:
					{
					setState(77);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Var_stmtContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(DMParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DMParser.DEDENT, 0); }
		public List<Var_pathContext> var_path() {
			return getRuleContexts(Var_pathContext.class);
		}
		public Var_pathContext var_path(int i) {
			return getRuleContext(Var_pathContext.class,i);
		}
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterVar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitVar_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitVar_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_stmt);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(VAR);
				setState(84);
				match(NEWLINE);
				setState(85);
				match(INDENT);
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					var_path();
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TMP || _la==NAME );
				setState(91);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(VAR);
				setState(94);
				match(SLASH);
				setState(95);
				var_path();
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

	public static class Var_pathContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(DMParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DMParser.DEDENT, 0); }
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public List<Var_pathContext> var_path() {
			return getRuleContexts(Var_pathContext.class);
		}
		public Var_pathContext var_path(int i) {
			return getRuleContext(Var_pathContext.class,i);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Var_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterVar_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitVar_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitVar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_pathContext var_path() throws RecognitionException {
		Var_pathContext _localctx = new Var_pathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_path);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==TMP || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(99);
				match(NEWLINE);
				setState(100);
				match(INDENT);
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(101);
					var_path();
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TMP || _la==NAME );
				setState(106);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==TMP || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				match(SLASH);
				setState(110);
				var_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				vardef();
				setState(112);
				match(NEWLINE);
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

	public static class VardefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitVardef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitVardef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(NAME);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(117);
				match(ASSIGN);
				setState(118);
				expr(0);
				}
				break;
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

	public static class Inline_var_stmtContext extends ParserRuleContext {
		public Inline_var_pathContext inline_var_path() {
			return getRuleContext(Inline_var_pathContext.class,0);
		}
		public Inline_var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterInline_var_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitInline_var_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitInline_var_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_var_stmtContext inline_var_stmt() throws RecognitionException {
		Inline_var_stmtContext _localctx = new Inline_var_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inline_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(VAR);
			setState(122);
			match(SLASH);
			setState(123);
			inline_var_path();
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

	public static class Inline_var_pathContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public Inline_var_pathContext inline_var_path() {
			return getRuleContext(Inline_var_pathContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public Inline_var_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_var_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterInline_var_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitInline_var_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitInline_var_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_var_pathContext inline_var_path() throws RecognitionException {
		Inline_var_pathContext _localctx = new Inline_var_pathContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inline_var_path);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(NAME);
				setState(126);
				match(SLASH);
				setState(127);
				inline_var_path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				vardef();
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

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(DMParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DMParser.DEDENT, 0); }
		public List<Class_bodyContext> class_body() {
			return getRuleContexts(Class_bodyContext.class);
		}
		public Class_bodyContext class_body(int i) {
			return getRuleContext(Class_bodyContext.class,i);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterClassdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitClassdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classdef);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(NAME);
				setState(132);
				match(NEWLINE);
				setState(133);
				match(INDENT);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					class_body();
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << VAR) | (1L << VERB) | (1L << PROC))) != 0) || _la==NAME );
				setState(139);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(NAME);
				setState(142);
				match(SLASH);
				setState(143);
				class_body();
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public FuncdefsContext funcdefs() {
			return getRuleContext(FuncdefsContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_body);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				funcdefs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				classdef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				vardef();
				setState(150);
				match(NEWLINE);
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

	public static class FuncdefsContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(DMParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DMParser.DEDENT, 0); }
		public Func_typeContext func_type() {
			return getRuleContext(Func_typeContext.class,0);
		}
		public List<FuncdefContext> funcdef() {
			return getRuleContexts(FuncdefContext.class);
		}
		public FuncdefContext funcdef(int i) {
			return getRuleContext(FuncdefContext.class,i);
		}
		public FuncdefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterFuncdefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitFuncdefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitFuncdefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefsContext funcdefs() throws RecognitionException {
		FuncdefsContext _localctx = new FuncdefsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcdefs);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERB || _la==PROC) {
					{
					setState(154);
					func_type();
					}
				}

				setState(157);
				match(NEWLINE);
				setState(158);
				match(INDENT);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					funcdef();
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(164);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERB || _la==PROC) {
					{
					setState(166);
					func_type();
					setState(167);
					match(SLASH);
					}
				}

				setState(171);
				funcdef();
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

	public static class Func_typeContext extends ParserRuleContext {
		public Func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterFunc_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitFunc_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitFunc_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !(_la==VERB || _la==PROC) ) {
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterFuncdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitFuncdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(NAME);
			setState(177);
			match(OPEN_PAREN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==NAME) {
				{
				setState(178);
				parameters();
				}
			}

			setState(181);
			match(CLOSE_PAREN);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(182);
				suite();
				}
				break;
			case 2:
				{
				setState(183);
				match(NEWLINE);
				}
				break;
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			parameter();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					parameter();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
				match(COMMA);
				}
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

	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(DMParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DMParser.NAME, i);
		}
		public Inline_var_pathContext inline_var_path() {
			return getRuleContext(Inline_var_pathContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(197);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(198);
					match(VAR);
					setState(199);
					match(SLASH);
					}
				}

				setState(202);
				inline_var_path();
				}
				break;
			}
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(205);
				match(ASSIGN);
				setState(206);
				expr(0);
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(209);
				match(AS);
				setState(210);
				match(NAME);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BIT_OR) {
					{
					{
					setState(211);
					match(BIT_OR);
					setState(212);
					match(NAME);
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(220);
				match(IN);
				setState(221);
				expr(0);
				}
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

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(DMParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(DMParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterSuite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitSuite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_suite);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case CONTINUE:
			case DEL:
			case RETURN:
			case SET:
			case NEW:
			case OPEN_PAREN:
			case DOUBLE_DOT:
			case DOT:
			case SLASH:
			case NOT_OP:
			case NEG_OP:
			case MINUS:
			case INCREMENT:
			case DECREMENT:
			case POWER:
			case NAME:
			case STRING_LITERAL:
			case ICON_PATH:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(NEWLINE);
				setState(226);
				match(INDENT);
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					stmt();
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << BREAK) | (1L << CONTINUE) | (1L << VAR) | (1L << DEL) | (1L << RETURN) | (1L << SET) | (1L << NEW) | (1L << SPAWN) | (1L << OPEN_PAREN) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0) );
				setState(232);
				match(DEDENT);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case CONTINUE:
			case DEL:
			case RETURN:
			case SET:
			case NEW:
			case OPEN_PAREN:
			case DOUBLE_DOT:
			case DOT:
			case SLASH:
			case NOT_OP:
			case NEG_OP:
			case MINUS:
			case INCREMENT:
			case DECREMENT:
			case POWER:
			case NAME:
			case STRING_LITERAL:
			case ICON_PATH:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				simple_stmt();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
			case DO:
			case VAR:
			case SPAWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				compound_stmt();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public Small_stmtContext small_stmt() {
			return getRuleContext(Small_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			small_stmt();
			setState(241);
			match(NEWLINE);
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

	public static class Small_stmtContext extends ParserRuleContext {
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterSmall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitSmall_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_small_stmt);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				del_stmt();
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				flow_stmt();
				}
				break;
			case NEW:
			case OPEN_PAREN:
			case DOUBLE_DOT:
			case DOT:
			case SLASH:
			case NOT_OP:
			case NEG_OP:
			case MINUS:
			case INCREMENT:
			case DECREMENT:
			case POWER:
			case NAME:
			case STRING_LITERAL:
			case ICON_PATH:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				expr(0);
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

	public static class Set_stmtContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterSet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitSet_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitSet_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_stmtContext set_stmt() throws RecognitionException {
		Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_set_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(SET);
			setState(249);
			match(NAME);
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(251);
			expr(0);
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

	public static class Del_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterDel_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitDel_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(DEL);
			setState(254);
			expr(0);
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

	public static class Flow_stmtContext extends ParserRuleContext {
		public Set_stmtContext set_stmt() {
			return getRuleContext(Set_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterFlow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitFlow_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_flow_stmt);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				set_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				return_stmt();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Dowhile_stmtContext dowhile_stmt() {
			return getRuleContext(Dowhile_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public Spawn_stmtContext spawn_stmt() {
			return getRuleContext(Spawn_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compound_stmt);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				dowhile_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				foreach_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				spawn_stmt();
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

	public static class If_stmtContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(IF);
			setState(272);
			match(OPEN_PAREN);
			setState(273);
			expr(0);
			setState(274);
			match(CLOSE_PAREN);
			setState(275);
			suite();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(ELSE);
					setState(277);
					match(IF);
					setState(278);
					match(OPEN_PAREN);
					setState(279);
					expr(0);
					setState(280);
					match(CLOSE_PAREN);
					setState(281);
					suite();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(288);
				match(ELSE);
				setState(289);
				suite();
				}
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

	public static class Dowhile_stmtContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dowhile_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterDowhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitDowhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitDowhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_stmtContext dowhile_stmt() throws RecognitionException {
		Dowhile_stmtContext _localctx = new Dowhile_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dowhile_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(DO);
			setState(293);
			suite();
			setState(294);
			match(WHILE);
			setState(295);
			match(OPEN_PAREN);
			setState(296);
			expr(0);
			setState(297);
			match(CLOSE_PAREN);
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WHILE);
			setState(300);
			match(OPEN_PAREN);
			setState(301);
			expr(0);
			setState(302);
			match(CLOSE_PAREN);
			setState(303);
			suite();
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

	public static class Spawn_stmtContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Spawn_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spawn_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterSpawn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitSpawn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitSpawn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spawn_stmtContext spawn_stmt() throws RecognitionException {
		Spawn_stmtContext _localctx = new Spawn_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_spawn_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(SPAWN);
			setState(306);
			match(OPEN_PAREN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (NEW - 21)) | (1L << (OPEN_PAREN - 21)) | (1L << (DOUBLE_DOT - 21)) | (1L << (DOT - 21)) | (1L << (SLASH - 21)) | (1L << (NOT_OP - 21)) | (1L << (NEG_OP - 21)) | (1L << (MINUS - 21)) | (1L << (INCREMENT - 21)) | (1L << (DECREMENT - 21)) | (1L << (POWER - 21)) | (1L << (NAME - 21)) | (1L << (STRING_LITERAL - 21)) | (1L << (ICON_PATH - 21)) | (1L << (NUMBER - 21)))) != 0)) {
				{
				setState(307);
				expr(0);
				}
			}

			setState(310);
			match(CLOSE_PAREN);
			setState(311);
			suite();
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

	public static class For_stmtContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Inline_var_stmtContext inline_var_stmt() {
			return getRuleContext(Inline_var_stmtContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(FOR);
			setState(314);
			match(OPEN_PAREN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << NEW) | (1L << OPEN_PAREN) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << COMMA) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (SEMICOLON - 75)) | (1L << (NAME - 75)) | (1L << (STRING_LITERAL - 75)) | (1L << (ICON_PATH - 75)) | (1L << (NUMBER - 75)))) != 0)) {
				{
				setState(317);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEW:
				case OPEN_PAREN:
				case DOUBLE_DOT:
				case DOT:
				case SLASH:
				case NOT_OP:
				case NEG_OP:
				case MINUS:
				case INCREMENT:
				case DECREMENT:
				case POWER:
				case NAME:
				case STRING_LITERAL:
				case ICON_PATH:
				case NUMBER:
					{
					setState(315);
					expr(0);
					}
					break;
				case VAR:
					{
					setState(316);
					inline_var_stmt();
					}
					break;
				case COMMA:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(319);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (NEW - 21)) | (1L << (OPEN_PAREN - 21)) | (1L << (DOUBLE_DOT - 21)) | (1L << (DOT - 21)) | (1L << (SLASH - 21)) | (1L << (NOT_OP - 21)) | (1L << (NEG_OP - 21)) | (1L << (MINUS - 21)) | (1L << (INCREMENT - 21)) | (1L << (DECREMENT - 21)) | (1L << (POWER - 21)) | (1L << (NAME - 21)) | (1L << (STRING_LITERAL - 21)) | (1L << (ICON_PATH - 21)) | (1L << (NUMBER - 21)))) != 0)) {
					{
					setState(320);
					expr(0);
					}
				}

				setState(323);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (NEW - 21)) | (1L << (OPEN_PAREN - 21)) | (1L << (DOUBLE_DOT - 21)) | (1L << (DOT - 21)) | (1L << (SLASH - 21)) | (1L << (NOT_OP - 21)) | (1L << (NEG_OP - 21)) | (1L << (MINUS - 21)) | (1L << (INCREMENT - 21)) | (1L << (DECREMENT - 21)) | (1L << (POWER - 21)) | (1L << (NAME - 21)) | (1L << (STRING_LITERAL - 21)) | (1L << (ICON_PATH - 21)) | (1L << (NUMBER - 21)))) != 0)) {
					{
					setState(324);
					expr(0);
					}
				}

				}
			}

			setState(329);
			match(CLOSE_PAREN);
			setState(330);
			suite();
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

	public static class Foreach_stmtContext extends ParserRuleContext {
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Inline_var_stmtContext inline_var_stmt() {
			return getRuleContext(Inline_var_stmtContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(DMParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DMParser.NAME, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterForeach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitForeach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitForeach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_foreach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FOR);
			setState(333);
			match(OPEN_PAREN);
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(334);
				inline_var_stmt();
				}
				break;
			case NAME:
				{
				setState(335);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(338);
				match(AS);
				setState(339);
				match(NAME);
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(342);
				match(IN);
				setState(343);
				expr(0);
				}
			}

			setState(346);
			match(CLOSE_PAREN);
			setState(347);
			suite();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitBreak_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(BREAK);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(CONTINUE);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(RETURN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (NEW - 21)) | (1L << (OPEN_PAREN - 21)) | (1L << (DOUBLE_DOT - 21)) | (1L << (DOT - 21)) | (1L << (SLASH - 21)) | (1L << (NOT_OP - 21)) | (1L << (NEG_OP - 21)) | (1L << (MINUS - 21)) | (1L << (INCREMENT - 21)) | (1L << (DECREMENT - 21)) | (1L << (POWER - 21)) | (1L << (NAME - 21)) | (1L << (STRING_LITERAL - 21)) | (1L << (ICON_PATH - 21)) | (1L << (NUMBER - 21)))) != 0)) {
				{
				setState(354);
				expr(0);
				}
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class In_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public In_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterIn_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitIn_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitIn_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Trailer_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TrailerContext trailer() {
			return getRuleContext(TrailerContext.class,0);
		}
		public Trailer_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterTrailer_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitTrailer_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitTrailer_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Add_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Add_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitAdd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class New_exprContext extends ExprContext {
		public New_stmtContext new_stmt() {
			return getRuleContext(New_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterNew_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitNew_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitNew_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assign_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Assign_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitAssign_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitAssign_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class As_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public As_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterAs_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitAs_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitAs_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bitmove_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bitmove_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterBitmove_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitBitmove_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitBitmove_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logor_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logor_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterLogor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitLogor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitLogor_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logand_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logand_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterLogand_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitLogand_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitLogand_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Comp_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterComp_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitComp_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitComp_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Power_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Power_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterPower_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitPower_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitPower_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mult_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mult_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitMult_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitMult_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Val_exprContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Val_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterVal_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitVal_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitVal_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tenary_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Tenary_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterTenary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitTenary_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitTenary_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Onearg_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Onearg_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterOnearg_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitOnearg_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitOnearg_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bit_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bit_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterBit_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitBit_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitBit_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Eq_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterEq_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitEq_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitEq_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bracket_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bracket_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterBracket_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitBracket_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitBracket_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new Bracket_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(358);
				match(OPEN_PAREN);
				setState(359);
				expr(0);
				setState(360);
				match(CLOSE_PAREN);
				}
				break;
			case NOT_OP:
			case NEG_OP:
			case MINUS:
			case INCREMENT:
			case DECREMENT:
				{
				_localctx = new Onearg_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(362);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(363);
				expr(16);
				}
				break;
			case POWER:
				{
				_localctx = new Power_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				match(POWER);
				setState(365);
				expr(15);
				}
				break;
			case NEW:
				{
				_localctx = new New_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				new_stmt();
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(367);
					expr(0);
					}
					break;
				}
				}
				break;
			case DOUBLE_DOT:
			case DOT:
			case SLASH:
			case NAME:
			case STRING_LITERAL:
			case ICON_PATH:
			case NUMBER:
				{
				_localctx = new Val_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new Mult_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(373);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(374);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PERCENT) | (1L << SLASH))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(375);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new Add_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(376);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(377);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(378);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new Comp_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(379);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(380);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(381);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new Bitmove_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(382);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(383);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(384);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new Eq_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(385);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(386);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << NOT_EQUAL_2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(387);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new Bit_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(388);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(389);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(390);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new Logand_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(391);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(392);
						match(LOG_AND);
						setState(393);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new Logor_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(394);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(395);
						match(LOG_OR);
						setState(396);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new Tenary_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(397);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(398);
						match(QUESTION_MARK);
						setState(399);
						expr(0);
						setState(400);
						match(COLON);
						setState(401);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new In_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(403);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(404);
						match(IN);
						setState(405);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new Assign_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(406);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(407);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSIGN - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MULT_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (BIT_AND_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (LEFT_SHIFT_ASSIGN - 64)) | (1L << (RIGHT_SHIFT_ASSIGN - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(408);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new Trailer_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(409);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(410);
						trailer();
						}
						break;
					case 13:
						{
						_localctx = new As_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(411);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(412);
						match(AS);
						setState(413);
						match(NAME);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class TrailerContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_trailer);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(OPEN_PAREN);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (NEW - 21)) | (1L << (OPEN_PAREN - 21)) | (1L << (DOUBLE_DOT - 21)) | (1L << (DOT - 21)) | (1L << (SLASH - 21)) | (1L << (NOT_OP - 21)) | (1L << (NEG_OP - 21)) | (1L << (MINUS - 21)) | (1L << (INCREMENT - 21)) | (1L << (DECREMENT - 21)) | (1L << (POWER - 21)) | (1L << (NAME - 21)) | (1L << (STRING_LITERAL - 21)) | (1L << (ICON_PATH - 21)) | (1L << (NUMBER - 21)))) != 0)) {
					{
					setState(420);
					arglist();
					}
				}

				setState(423);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				match(OPEN_BRACK);
				setState(425);
				expr(0);
				setState(426);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				match(NAME);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			expr(0);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					expr(0);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(440);
				match(COMMA);
				}
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(DMParser.STRING_LITERAL, 0); }
		public TerminalNode ICON_PATH() { return getToken(DMParser.ICON_PATH, 0); }
		public TerminalNode NUMBER() { return getToken(DMParser.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(STRING_LITERAL);
				}
				break;
			case ICON_PATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(ICON_PATH);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(NUMBER);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
				match(NAME);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(447);
				path();
				}
				break;
			case DOUBLE_DOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(448);
				match(DOUBLE_DOT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				match(DOT);
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

	public static class New_stmtContext extends ParserRuleContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public New_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterNew_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitNew_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitNew_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_stmtContext new_stmt() throws RecognitionException {
		New_stmtContext _localctx = new New_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_new_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(NEW);
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(453);
				path();
				}
				break;
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

	public static class PathContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(458); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(456);
					match(SLASH);
					setState(457);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(460); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(462);
				match(SLASH);
				}
				break;
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DMListener ) ((DMListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMVisitor ) return ((DMVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (VERB - 25)) | (1L << (PROC - 25)) | (1L << (NAME - 25)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 17);
		case 12:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u01d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\3\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\3\3\3\3\3\3\3\3\3\5\3c\n\3"+
		"\3\4\3\4\3\4\3\4\6\4i\n\4\r\4\16\4j\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4u\n\4\3\5\3\5\3\5\5\5z\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0084"+
		"\n\7\3\b\3\b\3\b\3\b\6\b\u008a\n\b\r\b\16\b\u008b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0093\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\5\n\u009e\n\n"+
		"\3\n\3\n\3\n\6\n\u00a3\n\n\r\n\16\n\u00a4\3\n\3\n\3\n\3\n\3\n\5\n\u00ac"+
		"\n\n\3\n\5\n\u00af\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\3\f"+
		"\5\f\u00bb\n\f\3\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3\13\r\3\r\5\r\u00c6"+
		"\n\r\3\16\3\16\3\16\5\16\u00cb\n\16\3\16\5\16\u00ce\n\16\3\16\3\16\5\16"+
		"\u00d2\n\16\3\16\3\16\3\16\3\16\7\16\u00d8\n\16\f\16\16\16\u00db\13\16"+
		"\5\16\u00dd\n\16\3\16\3\16\5\16\u00e1\n\16\3\17\3\17\3\17\3\17\6\17\u00e7"+
		"\n\17\r\17\16\17\u00e8\3\17\3\17\5\17\u00ed\n\17\3\20\3\20\5\20\u00f1"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00f9\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0107\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0110\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\7\27\u011e\n\27\f\27\16\27\u0121\13\27\3\27"+
		"\3\27\5\27\u0125\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0137\n\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\5\33\u0140\n\33\3\33\3\33\5\33\u0144\n\33\3\33\3\33\5\33\u0148"+
		"\n\33\5\33\u014a\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0153\n"+
		"\34\3\34\3\34\5\34\u0157\n\34\3\34\3\34\5\34\u015b\n\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u0166\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u0173\n \3 \5 \u0176\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \7 \u01a1\n \f \16 \u01a4\13 \3!\3!\5!\u01a8\n!"+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u01b1\n!\3\"\3\"\3\"\7\"\u01b6\n\"\f\"\16\"\u01b9"+
		"\13\"\3\"\5\"\u01bc\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u01c5\n#\3$\3$\5$\u01c9"+
		"\n$\3%\3%\6%\u01cd\n%\r%\16%\u01ce\3%\5%\u01d2\n%\3&\3&\3&\2\3>\'\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\20"+
		"\4\2  NN\3\2\33\34\4\2\16\16BB\4\2\'\'MM\4\2-/\61\62\3\2(*\3\2/\60\3\2"+
		"\64\67\3\289\3\2:<\3\2=?\4\2BFHL\4\2&&++\4\2\33\34NN\2\u0208\2R\3\2\2"+
		"\2\4b\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n{\3\2\2\2\f\u0083\3\2\2\2\16\u0092"+
		"\3\2\2\2\20\u009a\3\2\2\2\22\u00ae\3\2\2\2\24\u00b0\3\2\2\2\26\u00b2\3"+
		"\2\2\2\30\u00bc\3\2\2\2\32\u00cd\3\2\2\2\34\u00ec\3\2\2\2\36\u00f0\3\2"+
		"\2\2 \u00f2\3\2\2\2\"\u00f8\3\2\2\2$\u00fa\3\2\2\2&\u00ff\3\2\2\2(\u0106"+
		"\3\2\2\2*\u010f\3\2\2\2,\u0111\3\2\2\2.\u0126\3\2\2\2\60\u012d\3\2\2\2"+
		"\62\u0133\3\2\2\2\64\u013b\3\2\2\2\66\u014e\3\2\2\28\u015f\3\2\2\2:\u0161"+
		"\3\2\2\2<\u0163\3\2\2\2>\u0175\3\2\2\2@\u01b0\3\2\2\2B\u01b2\3\2\2\2D"+
		"\u01c4\3\2\2\2F\u01c6\3\2\2\2H\u01cc\3\2\2\2J\u01d3\3\2\2\2LQ\5\4\3\2"+
		"MQ\5\22\n\2NQ\5\16\b\2OQ\7\5\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2"+
		"\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\3\3\2\2\2TR\3\2\2\2UV\7\17\2\2VW\7\5"+
		"\2\2WY\7\3\2\2XZ\5\6\4\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3"+
		"\2\2\2]^\7\4\2\2^c\3\2\2\2_`\7\17\2\2`a\7*\2\2ac\5\6\4\2bU\3\2\2\2b_\3"+
		"\2\2\2c\5\3\2\2\2de\t\2\2\2ef\7\5\2\2fh\7\3\2\2gi\5\6\4\2hg\3\2\2\2ij"+
		"\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\4\2\2mu\3\2\2\2no\t\2\2\2o"+
		"p\7*\2\2pu\5\6\4\2qr\5\b\5\2rs\7\5\2\2su\3\2\2\2td\3\2\2\2tn\3\2\2\2t"+
		"q\3\2\2\2u\7\3\2\2\2vy\7N\2\2wx\7B\2\2xz\5> \2yw\3\2\2\2yz\3\2\2\2z\t"+
		"\3\2\2\2{|\7\17\2\2|}\7*\2\2}~\5\f\7\2~\13\3\2\2\2\177\u0080\7N\2\2\u0080"+
		"\u0081\7*\2\2\u0081\u0084\5\f\7\2\u0082\u0084\5\b\5\2\u0083\177\3\2\2"+
		"\2\u0083\u0082\3\2\2\2\u0084\r\3\2\2\2\u0085\u0086\7N\2\2\u0086\u0087"+
		"\7\5\2\2\u0087\u0089\7\3\2\2\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008e\7\4\2\2\u008e\u0093\3\2\2\2\u008f\u0090\7N\2\2\u0090"+
		"\u0091\7*\2\2\u0091\u0093\5\20\t\2\u0092\u0085\3\2\2\2\u0092\u008f\3\2"+
		"\2\2\u0093\17\3\2\2\2\u0094\u009b\5\4\3\2\u0095\u009b\5\22\n\2\u0096\u009b"+
		"\5\16\b\2\u0097\u0098\5\b\5\2\u0098\u0099\7\5\2\2\u0099\u009b\3\2\2\2"+
		"\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009b\21\3\2\2\2\u009c\u009e\5\24\13\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a2\7\3"+
		"\2\2\u00a1\u00a3\5\26\f\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\4"+
		"\2\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\5\24\13\2\u00a9\u00aa\7*\2\2\u00aa"+
		"\u00ac\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\5\26\f\2\u00ae\u009d\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af"+
		"\23\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7N\2\2\u00b3"+
		"\u00b5\7#\2\2\u00b4\u00b6\5\30\r\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\7$\2\2\u00b8\u00bb\5\34\17\2\u00b9"+
		"\u00bb\7\5\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2\2"+
		"\2\u00bc\u00c1\5\32\16\2\u00bd\u00be\7\'\2\2\u00be\u00c0\5\32\16\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\'\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00ce\7N\2\2"+
		"\u00c8\u00c9\7\17\2\2\u00c9\u00cb\7*\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\5\f\7\2\u00cd\u00c7\3\2\2\2\u00cd"+
		"\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00d0\7B\2\2\u00d0\u00d2\5> "+
		"\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00dc\3\2\2\2\u00d3\u00d4"+
		"\7\25\2\2\u00d4\u00d9\7N\2\2\u00d5\u00d6\7>\2\2\u00d6\u00d8\7N\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\7\16\2\2\u00df\u00e1\5"+
		"> \2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u00ed"+
		"\5 \21\2\u00e3\u00e4\7\5\2\2\u00e4\u00e6\7\3\2\2\u00e5\u00e7\5\36\20\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\7\4\2\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e2\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00f1\5 \21"+
		"\2\u00ef\u00f1\5*\26\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\37"+
		"\3\2\2\2\u00f2\u00f3\5\"\22\2\u00f3\u00f4\7\5\2\2\u00f4!\3\2\2\2\u00f5"+
		"\u00f9\5&\24\2\u00f6\u00f9\5(\25\2\u00f7\u00f9\5> \2\u00f8\u00f5\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9#\3\2\2\2\u00fa\u00fb"+
		"\7\23\2\2\u00fb\u00fc\7N\2\2\u00fc\u00fd\t\4\2\2\u00fd\u00fe\5> \2\u00fe"+
		"%\3\2\2\2\u00ff\u0100\7\21\2\2\u0100\u0101\5> \2\u0101\'\3\2\2\2\u0102"+
		"\u0107\5$\23\2\u0103\u0107\58\35\2\u0104\u0107\5:\36\2\u0105\u0107\5<"+
		"\37\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107)\3\2\2\2\u0108\u0110\5\4\3\2\u0109\u0110\5,\27\2"+
		"\u010a\u0110\5.\30\2\u010b\u0110\5\60\31\2\u010c\u0110\5\64\33\2\u010d"+
		"\u0110\5\66\34\2\u010e\u0110\5\62\32\2\u010f\u0108\3\2\2\2\u010f\u0109"+
		"\3\2\2\2\u010f\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110+\3\2\2\2\u0111\u0112\7\7\2\2"+
		"\u0112\u0113\7#\2\2\u0113\u0114\5> \2\u0114\u0115\7$\2\2\u0115\u011f\5"+
		"\34\17\2\u0116\u0117\7\b\2\2\u0117\u0118\7\7\2\2\u0118\u0119\7#\2\2\u0119"+
		"\u011a\5> \2\u011a\u011b\7$\2\2\u011b\u011c\5\34\17\2\u011c\u011e\3\2"+
		"\2\2\u011d\u0116\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\b"+
		"\2\2\u0123\u0125\5\34\17\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"-\3\2\2\2\u0126\u0127\7\13\2\2\u0127\u0128\5\34\17\2\u0128\u0129\7\n\2"+
		"\2\u0129\u012a\7#\2\2\u012a\u012b\5> \2\u012b\u012c\7$\2\2\u012c/\3\2"+
		"\2\2\u012d\u012e\7\n\2\2\u012e\u012f\7#\2\2\u012f\u0130\5> \2\u0130\u0131"+
		"\7$\2\2\u0131\u0132\5\34\17\2\u0132\61\3\2\2\2\u0133\u0134\7\30\2\2\u0134"+
		"\u0136\7#\2\2\u0135\u0137\5> \2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u0139\7$\2\2\u0139\u013a\5\34\17\2\u013a"+
		"\63\3\2\2\2\u013b\u013c\7\t\2\2\u013c\u0149\7#\2\2\u013d\u0140\5> \2\u013e"+
		"\u0140\5\n\6\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0143\t\5\2\2\u0142\u0144\5> \2\u0143\u0142"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\t\5\2\2\u0146"+
		"\u0148\5> \2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2"+
		"\2\u0149\u013f\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\7$\2\2\u014c\u014d\5\34\17\2\u014d\65\3\2\2\2\u014e\u014f\7\t\2\2\u014f"+
		"\u0152\7#\2\2\u0150\u0153\5\n\6\2\u0151\u0153\7N\2\2\u0152\u0150\3\2\2"+
		"\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0155\7\25\2\2\u0155"+
		"\u0157\7N\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015a\3\2"+
		"\2\2\u0158\u0159\7\16\2\2\u0159\u015b\5> \2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7$\2\2\u015d\u015e\5\34"+
		"\17\2\u015e\67\3\2\2\2\u015f\u0160\7\f\2\2\u01609\3\2\2\2\u0161\u0162"+
		"\7\r\2\2\u0162;\3\2\2\2\u0163\u0165\7\22\2\2\u0164\u0166\5> \2\u0165\u0164"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166=\3\2\2\2\u0167\u0168\b \1\2\u0168\u0169"+
		"\7#\2\2\u0169\u016a\5> \2\u016a\u016b\7$\2\2\u016b\u0176\3\2\2\2\u016c"+
		"\u016d\t\6\2\2\u016d\u0176\5> \22\u016e\u016f\7\63\2\2\u016f\u0176\5>"+
		" \21\u0170\u0172\5F$\2\u0171\u0173\5> \2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0176\5D#\2\u0175\u0167\3\2\2\2\u0175"+
		"\u016c\3\2\2\2\u0175\u016e\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0174\3\2"+
		"\2\2\u0176\u01a2\3\2\2\2\u0177\u0178\f\20\2\2\u0178\u0179\t\7\2\2\u0179"+
		"\u01a1\5> \21\u017a\u017b\f\17\2\2\u017b\u017c\t\b\2\2\u017c\u01a1\5>"+
		" \20\u017d\u017e\f\16\2\2\u017e\u017f\t\t\2\2\u017f\u01a1\5> \17\u0180"+
		"\u0181\f\r\2\2\u0181\u0182\t\n\2\2\u0182\u01a1\5> \16\u0183\u0184\f\f"+
		"\2\2\u0184\u0185\t\13\2\2\u0185\u01a1\5> \r\u0186\u0187\f\13\2\2\u0187"+
		"\u0188\t\f\2\2\u0188\u01a1\5> \f\u0189\u018a\f\n\2\2\u018a\u018b\7@\2"+
		"\2\u018b\u01a1\5> \13\u018c\u018d\f\t\2\2\u018d\u018e\7A\2\2\u018e\u01a1"+
		"\5> \n\u018f\u0190\f\b\2\2\u0190\u0191\7,\2\2\u0191\u0192\5> \2\u0192"+
		"\u0193\7+\2\2\u0193\u0194\5> \t\u0194\u01a1\3\2\2\2\u0195\u0196\f\6\2"+
		"\2\u0196\u0197\7\16\2\2\u0197\u01a1\5> \7\u0198\u0199\f\5\2\2\u0199\u019a"+
		"\t\r\2\2\u019a\u01a1\5> \6\u019b\u019c\f\23\2\2\u019c\u01a1\5@!\2\u019d"+
		"\u019e\f\7\2\2\u019e\u019f\7\25\2\2\u019f\u01a1\7N\2\2\u01a0\u0177\3\2"+
		"\2\2\u01a0\u017a\3\2\2\2\u01a0\u017d\3\2\2\2\u01a0\u0180\3\2\2\2\u01a0"+
		"\u0183\3\2\2\2\u01a0\u0186\3\2\2\2\u01a0\u0189\3\2\2\2\u01a0\u018c\3\2"+
		"\2\2\u01a0\u018f\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0\u0198\3\2\2\2\u01a0"+
		"\u019b\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a2\u01a3\3\2\2\2\u01a3?\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7"+
		"\7#\2\2\u01a6\u01a8\5B\"\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01b1\7$\2\2\u01aa\u01ab\7!\2\2\u01ab\u01ac\5> \2"+
		"\u01ac\u01ad\7\"\2\2\u01ad\u01b1\3\2\2\2\u01ae\u01af\t\16\2\2\u01af\u01b1"+
		"\7N\2\2\u01b0\u01a5\3\2\2\2\u01b0\u01aa\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"A\3\2\2\2\u01b2\u01b7\5> \2\u01b3\u01b4\7\'\2\2\u01b4\u01b6\5> \2\u01b5"+
		"\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\7\'\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcC\3\2\2\2\u01bd\u01c5\7O\2\2\u01be"+
		"\u01c5\7P\2\2\u01bf\u01c5\7Q\2\2\u01c0\u01c5\7N\2\2\u01c1\u01c5\5H%\2"+
		"\u01c2\u01c5\7%\2\2\u01c3\u01c5\7&\2\2\u01c4\u01bd\3\2\2\2\u01c4\u01be"+
		"\3\2\2\2\u01c4\u01bf\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5E\3\2\2\2\u01c6\u01c8\7\27\2\2"+
		"\u01c7\u01c9\5H%\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9G\3\2"+
		"\2\2\u01ca\u01cb\7*\2\2\u01cb\u01cd\5J&\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01d2\7*\2\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2I\3\2\2\2\u01d3"+
		"\u01d4\t\17\2\2\u01d4K\3\2\2\28PR[bjty\u0083\u008b\u0092\u009a\u009d\u00a4"+
		"\u00ab\u00ae\u00b5\u00ba\u00c1\u00c5\u00ca\u00cd\u00d1\u00d9\u00dc\u00e0"+
		"\u00e8\u00ec\u00f0\u00f8\u0106\u010f\u011f\u0124\u0136\u013f\u0143\u0147"+
		"\u0149\u0152\u0156\u015a\u0165\u0172\u0175\u01a0\u01a2\u01a7\u01b0\u01b7"+
		"\u01bb\u01c4\u01c8\u01ce\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}