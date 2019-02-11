// Generated from C:\Users\kisio\IdeaProjects\byond-intellij\src\org\byondplugin\grammar\DMParser.g4 by ANTLR 4.7.1
package org.byondplugin;
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
		INDENT=1, DEDENT=2, OPEN_BRACK=3, CLOSE_BRACK=4, OPEN_PAREN=5, CLOSE_PAREN=6, 
		NEWLINE=7, SWITCH=8, IF=9, ELSE=10, FOR=11, WHILE=12, DO=13, BREAK=14, 
		CONTINUE=15, IN=16, VAR=17, CONST=18, DEL=19, RETURN=20, SET=21, TO=22, 
		AS=23, GOTO=24, NEW=25, SPAWN=26, TRY=27, CATCH=28, VERB=29, PROC=30, 
		GLOBAL=31, STATIC=32, ARG=33, TMP=34, DOUBLE_DOT=35, DOT=36, COMMA=37, 
		STAR=38, PERCENT=39, SLASH=40, COLON=41, QUESTION_MARK=42, NOT_OP=43, 
		NEG_OP=44, MINUS=45, PLUS=46, INCREMENT=47, DECREMENT=48, POWER=49, LESS_THAN=50, 
		GREATER_THAN=51, LESS_THAN_OR_EQUAL=52, GREATER_THAN_OR_EQUAL=53, SHIFT_LEFT=54, 
		SHIFT_RIGHT=55, EQUAL=56, NOT_EQUAL=57, NOT_EQUAL_2=58, BIT_AND=59, BIT_OR=60, 
		BIT_XOR=61, LOG_AND=62, LOG_OR=63, ASSIGN=64, ADD_ASSIGN=65, SUB_ASSIGN=66, 
		MULT_ASSIGN=67, DIV_ASSIGN=68, MOD_ASSIGN=69, BIT_AND_ASSIGN=70, BIT_OR_ASSIGN=71, 
		XOR_ASSIGN=72, LEFT_SHIFT_ASSIGN=73, RIGHT_SHIFT_ASSIGN=74, SEMICOLON=75, 
		NAME=76, STRING_LITERAL=77, ICON_PATH=78, NUMBER=79, SPACES=80, COMMENT=81, 
		UNKNOWN_CHAR=82;
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
		null, null, null, "'['", "']'", "'('", "')'", null, "'switch'", "'if'", 
		"'else'", "'for'", "'while'", "'do'", "'break'", "'continue'", "'in'", 
		"'var'", "'const'", "'del'", "'return'", "'set'", "'to'", "'as'", "'goto'", 
		"'new'", "'spawn'", "'try'", "'catch'", "'verb'", "'proc'", "'global'", 
		"'static'", "'arg'", "'tmp'", "'..'", "'.'", "','", "'*'", "'%'", "'/'", 
		"':'", "'?'", "'~'", "'!'", "'-'", "'+'", "'++'", "'--'", "'**'", "'<'", 
		"'>'", "'<='", "'>='", "'<<'", "'>>'", "'=='", "'!='", "'<>'", "'&'", 
		"'|'", "'^'", "'&&'", "'||'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'&='", "'|='", "'^='", "'<<='", "'>>='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDENT", "DEDENT", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", "CLOSE_PAREN", 
		"NEWLINE", "SWITCH", "IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", 
		"IN", "VAR", "CONST", "DEL", "RETURN", "SET", "TO", "AS", "GOTO", "NEW", 
		"SPAWN", "TRY", "CATCH", "VERB", "PROC", "GLOBAL", "STATIC", "ARG", "TMP", 
		"DOUBLE_DOT", "DOT", "COMMA", "STAR", "PERCENT", "SLASH", "COLON", "QUESTION_MARK", 
		"NOT_OP", "NEG_OP", "MINUS", "PLUS", "INCREMENT", "DECREMENT", "POWER", 
		"LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", 
		"SHIFT_LEFT", "SHIFT_RIGHT", "EQUAL", "NOT_EQUAL", "NOT_EQUAL_2", "BIT_AND", 
		"BIT_OR", "BIT_XOR", "LOG_AND", "LOG_OR", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "BIT_AND_ASSIGN", "BIT_OR_ASSIGN", 
		"XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "SEMICOLON", 
		"NAME", "STRING_LITERAL", "ICON_PATH", "NUMBER", "SPACES", "COMMENT", 
		"UNKNOWN_CHAR"
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
	public String getGrammarFileName() { return "DMParser.g4"; }

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
		public TerminalNode EOF() { return getToken(DMParser.EOF, 0); }
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
			setState(83);
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
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_stmt);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(VAR);
				setState(86);
				match(NEWLINE);
				setState(87);
				match(INDENT);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					var_path();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TMP || _la==NAME );
				setState(93);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(VAR);
				setState(96);
				match(SLASH);
				setState(97);
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
	}

	public final Var_pathContext var_path() throws RecognitionException {
		Var_pathContext _localctx = new Var_pathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_path);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==TMP || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(101);
				match(NEWLINE);
				setState(102);
				match(INDENT);
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103);
					var_path();
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TMP || _la==NAME );
				setState(108);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				_la = _input.LA(1);
				if ( !(_la==TMP || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				match(SLASH);
				setState(112);
				var_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				vardef();
				setState(114);
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
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NAME);
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(119);
				match(ASSIGN);
				setState(120);
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
	}

	public final Inline_var_stmtContext inline_var_stmt() throws RecognitionException {
		Inline_var_stmtContext _localctx = new Inline_var_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inline_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(VAR);
			setState(124);
			match(SLASH);
			setState(125);
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
	}

	public final Inline_var_pathContext inline_var_path() throws RecognitionException {
		Inline_var_pathContext _localctx = new Inline_var_pathContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inline_var_path);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(NAME);
				setState(128);
				match(SLASH);
				setState(129);
				inline_var_path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classdef);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(NAME);
				setState(134);
				match(NEWLINE);
				setState(135);
				match(INDENT);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					class_body();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << VAR) | (1L << VERB) | (1L << PROC))) != 0) || _la==NAME );
				setState(141);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(NAME);
				setState(144);
				match(SLASH);
				setState(145);
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
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_body);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				funcdefs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				classdef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				vardef();
				setState(152);
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
	}

	public final FuncdefsContext funcdefs() throws RecognitionException {
		FuncdefsContext _localctx = new FuncdefsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcdefs);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERB || _la==PROC) {
					{
					setState(156);
					func_type();
					}
				}

				setState(159);
				match(NEWLINE);
				setState(160);
				match(INDENT);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					funcdef();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(166);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERB || _la==PROC) {
					{
					setState(168);
					func_type();
					setState(169);
					match(SLASH);
					}
				}

				setState(173);
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
	}

	public final Func_typeContext func_type() throws RecognitionException {
		Func_typeContext _localctx = new Func_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(NAME);
			setState(179);
			match(OPEN_PAREN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==NAME) {
				{
				setState(180);
				parameters();
				}
			}

			setState(183);
			match(CLOSE_PAREN);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(184);
				suite();
				}
				break;
			case 2:
				{
				setState(185);
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
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			parameter();
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					match(COMMA);
					setState(190);
					parameter();
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(196);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(199);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(200);
					match(VAR);
					setState(201);
					match(SLASH);
					}
				}

				setState(204);
				inline_var_path();
				}
				break;
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(207);
				match(ASSIGN);
				setState(208);
				expr(0);
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(211);
				match(AS);
				setState(212);
				match(NAME);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BIT_OR) {
					{
					{
					setState(213);
					match(BIT_OR);
					setState(214);
					match(NAME);
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(222);
				match(IN);
				setState(223);
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
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_suite);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
			case BREAK:
			case CONTINUE:
			case DEL:
			case RETURN:
			case SET:
			case NEW:
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
				setState(226);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(NEWLINE);
				setState(228);
				match(INDENT);
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					stmt();
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << BREAK) | (1L << CONTINUE) | (1L << VAR) | (1L << DEL) | (1L << RETURN) | (1L << SET) | (1L << NEW) | (1L << SPAWN) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0) );
				setState(234);
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
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
			case BREAK:
			case CONTINUE:
			case DEL:
			case RETURN:
			case SET:
			case NEW:
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
				setState(238);
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
				setState(239);
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
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			small_stmt();
			setState(243);
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
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_small_stmt);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				del_stmt();
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				flow_stmt();
				}
				break;
			case OPEN_PAREN:
			case NEW:
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
				setState(247);
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
	}

	public final Set_stmtContext set_stmt() throws RecognitionException {
		Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_set_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(SET);
			setState(251);
			match(NAME);
			setState(252);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(253);
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
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DEL);
			setState(256);
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
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_flow_stmt);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				set_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
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
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compound_stmt);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				dowhile_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				foreach_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
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
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IF);
			setState(274);
			match(OPEN_PAREN);
			setState(275);
			expr(0);
			setState(276);
			match(CLOSE_PAREN);
			setState(277);
			suite();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(ELSE);
					setState(279);
					match(IF);
					setState(280);
					match(OPEN_PAREN);
					setState(281);
					expr(0);
					setState(282);
					match(CLOSE_PAREN);
					setState(283);
					suite();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(290);
				match(ELSE);
				setState(291);
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
	}

	public final Dowhile_stmtContext dowhile_stmt() throws RecognitionException {
		Dowhile_stmtContext _localctx = new Dowhile_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dowhile_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(DO);
			setState(295);
			suite();
			setState(296);
			match(WHILE);
			setState(297);
			match(OPEN_PAREN);
			setState(298);
			expr(0);
			setState(299);
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
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(WHILE);
			setState(302);
			match(OPEN_PAREN);
			setState(303);
			expr(0);
			setState(304);
			match(CLOSE_PAREN);
			setState(305);
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
	}

	public final Spawn_stmtContext spawn_stmt() throws RecognitionException {
		Spawn_stmtContext _localctx = new Spawn_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_spawn_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(SPAWN);
			setState(308);
			match(OPEN_PAREN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
				{
				setState(309);
				expr(0);
				}
			}

			setState(312);
			match(CLOSE_PAREN);
			setState(313);
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
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOR);
			setState(316);
			match(OPEN_PAREN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << VAR) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << COMMA) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (SEMICOLON - 75)) | (1L << (NAME - 75)) | (1L << (STRING_LITERAL - 75)) | (1L << (ICON_PATH - 75)) | (1L << (NUMBER - 75)))) != 0)) {
				{
				setState(319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAREN:
				case NEW:
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
					setState(317);
					expr(0);
					}
					break;
				case VAR:
					{
					setState(318);
					inline_var_stmt();
					}
					break;
				case COMMA:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
					{
					setState(322);
					expr(0);
					}
				}

				setState(325);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
					{
					setState(326);
					expr(0);
					}
				}

				}
			}

			setState(331);
			match(CLOSE_PAREN);
			setState(332);
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
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_foreach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(FOR);
			setState(335);
			match(OPEN_PAREN);
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(336);
				inline_var_stmt();
				}
				break;
			case NAME:
				{
				setState(337);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(340);
				match(AS);
				setState(341);
				match(NAME);
				}
			}

			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(344);
				match(IN);
				setState(345);
				expr(0);
				}
			}

			setState(348);
			match(CLOSE_PAREN);
			setState(349);
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
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(RETURN);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
				{
				setState(356);
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
	}
	public static class Trailer_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TrailerContext trailer() {
			return getRuleContext(TrailerContext.class,0);
		}
		public Trailer_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Add_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Add_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class New_exprContext extends ExprContext {
		public New_stmtContext new_stmt() {
			return getRuleContext(New_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public New_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Assign_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Assign_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class As_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public As_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Bitmove_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bitmove_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Logor_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logor_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Logand_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logand_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Comp_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Power_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Power_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Mult_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Mult_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Val_exprContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Val_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Tenary_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Tenary_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Onearg_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Onearg_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Bit_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bit_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Eq_exprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Eq_exprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class Bracket_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bracket_exprContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new Bracket_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(360);
				match(OPEN_PAREN);
				setState(361);
				expr(0);
				setState(362);
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
				setState(364);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(365);
				expr(16);
				}
				break;
			case POWER:
				{
				_localctx = new Power_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(POWER);
				setState(367);
				expr(15);
				}
				break;
			case NEW:
				{
				_localctx = new New_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368);
				new_stmt();
				setState(370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(369);
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
				setState(372);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(416);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new Mult_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(375);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(376);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PERCENT) | (1L << SLASH))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(377);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new Add_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(378);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(379);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(380);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new Comp_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(381);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(382);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(383);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new Bitmove_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(384);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(385);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(386);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new Eq_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(387);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(388);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << NOT_EQUAL_2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(389);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new Bit_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(390);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(391);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(392);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new Logand_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(393);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(394);
						match(LOG_AND);
						setState(395);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new Logor_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(396);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(397);
						match(LOG_OR);
						setState(398);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new Tenary_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(399);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(400);
						match(QUESTION_MARK);
						setState(401);
						expr(0);
						setState(402);
						match(COLON);
						setState(403);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new In_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(405);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(406);
						match(IN);
						setState(407);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new Assign_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(409);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSIGN - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MULT_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (BIT_AND_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (LEFT_SHIFT_ASSIGN - 64)) | (1L << (RIGHT_SHIFT_ASSIGN - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(410);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new Trailer_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(411);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(412);
						trailer();
						}
						break;
					case 13:
						{
						_localctx = new As_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(413);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(414);
						match(AS);
						setState(415);
						match(NAME);
						}
						break;
					}
					} 
				}
				setState(420);
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
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_trailer);
		int _la;
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				match(OPEN_PAREN);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
					{
					setState(422);
					arglist();
					}
				}

				setState(425);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				match(OPEN_BRACK);
				setState(427);
				expr(0);
				setState(428);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(430);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(431);
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
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			expr(0);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(435);
					match(COMMA);
					setState(436);
					expr(0);
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(442);
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
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(STRING_LITERAL);
				}
				break;
			case ICON_PATH:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(ICON_PATH);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(NUMBER);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(NAME);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				path();
				}
				break;
			case DOUBLE_DOT:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(DOUBLE_DOT);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
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
	}

	public final New_stmtContext new_stmt() throws RecognitionException {
		New_stmtContext _localctx = new New_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_new_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(NEW);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(455);
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
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(458);
					match(SLASH);
					setState(459);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(462); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(464);
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
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (VERB - 29)) | (1L << (PROC - 29)) | (1L << (NAME - 29)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u01d8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\\\n\3\r\3\16\3]\3\3\3\3\3\3\3\3\3\3"+
		"\5\3e\n\3\3\4\3\4\3\4\3\4\6\4k\n\4\r\4\16\4l\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4w\n\4\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5"+
		"\7\u0086\n\7\3\b\3\b\3\b\3\b\6\b\u008c\n\b\r\b\16\b\u008d\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u0095\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\n\5\n\u00a0"+
		"\n\n\3\n\3\n\3\n\6\n\u00a5\n\n\r\n\16\n\u00a6\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00ae\n\n\3\n\5\n\u00b1\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3"+
		"\f\3\f\5\f\u00bd\n\f\3\r\3\r\3\r\7\r\u00c2\n\r\f\r\16\r\u00c5\13\r\3\r"+
		"\5\r\u00c8\n\r\3\16\3\16\3\16\5\16\u00cd\n\16\3\16\5\16\u00d0\n\16\3\16"+
		"\3\16\5\16\u00d4\n\16\3\16\3\16\3\16\3\16\7\16\u00da\n\16\f\16\16\16\u00dd"+
		"\13\16\5\16\u00df\n\16\3\16\3\16\5\16\u00e3\n\16\3\17\3\17\3\17\3\17\6"+
		"\17\u00e9\n\17\r\17\16\17\u00ea\3\17\3\17\5\17\u00ef\n\17\3\20\3\20\5"+
		"\20\u00f3\n\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00fb\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0109\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0120\n\27\f\27\16\27\u0123\13"+
		"\27\3\27\3\27\5\27\u0127\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u0139\n\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\5\33\u0142\n\33\3\33\3\33\5\33\u0146\n\33\3\33\3"+
		"\33\5\33\u014a\n\33\5\33\u014c\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\5\34\u0155\n\34\3\34\3\34\5\34\u0159\n\34\3\34\3\34\5\34\u015d\n\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u0168\n\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \5 \u0175\n \3 \5 \u0178\n \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01a3\n \f \16 \u01a6\13 \3!\3!"+
		"\5!\u01aa\n!\3!\3!\3!\3!\3!\3!\3!\5!\u01b3\n!\3\"\3\"\3\"\7\"\u01b8\n"+
		"\"\f\"\16\"\u01bb\13\"\3\"\5\"\u01be\n\"\3#\3#\3#\3#\3#\3#\3#\5#\u01c7"+
		"\n#\3$\3$\5$\u01cb\n$\3%\3%\6%\u01cf\n%\r%\16%\u01d0\3%\5%\u01d4\n%\3"+
		"&\3&\3&\2\3>\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJ\2\20\4\2$$NN\3\2\37 \4\2\22\22BB\4\2\'\'MM\4\2-/\61\62\3"+
		"\2(*\3\2/\60\3\2\64\67\3\289\3\2:<\3\2=?\4\2BFHL\4\2&&++\4\2\37 NN\2\u020a"+
		"\2R\3\2\2\2\4d\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n}\3\2\2\2\f\u0085\3\2\2"+
		"\2\16\u0094\3\2\2\2\20\u009c\3\2\2\2\22\u00b0\3\2\2\2\24\u00b2\3\2\2\2"+
		"\26\u00b4\3\2\2\2\30\u00be\3\2\2\2\32\u00cf\3\2\2\2\34\u00ee\3\2\2\2\36"+
		"\u00f2\3\2\2\2 \u00f4\3\2\2\2\"\u00fa\3\2\2\2$\u00fc\3\2\2\2&\u0101\3"+
		"\2\2\2(\u0108\3\2\2\2*\u0111\3\2\2\2,\u0113\3\2\2\2.\u0128\3\2\2\2\60"+
		"\u012f\3\2\2\2\62\u0135\3\2\2\2\64\u013d\3\2\2\2\66\u0150\3\2\2\28\u0161"+
		"\3\2\2\2:\u0163\3\2\2\2<\u0165\3\2\2\2>\u0177\3\2\2\2@\u01b2\3\2\2\2B"+
		"\u01b4\3\2\2\2D\u01c6\3\2\2\2F\u01c8\3\2\2\2H\u01ce\3\2\2\2J\u01d5\3\2"+
		"\2\2LQ\5\4\3\2MQ\5\22\n\2NQ\5\16\b\2OQ\7\t\2\2PL\3\2\2\2PM\3\2\2\2PN\3"+
		"\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7"+
		"\2\2\3V\3\3\2\2\2WX\7\23\2\2XY\7\t\2\2Y[\7\3\2\2Z\\\5\6\4\2[Z\3\2\2\2"+
		"\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\4\2\2`e\3\2\2\2ab\7\23\2"+
		"\2bc\7*\2\2ce\5\6\4\2dW\3\2\2\2da\3\2\2\2e\5\3\2\2\2fg\t\2\2\2gh\7\t\2"+
		"\2hj\7\3\2\2ik\5\6\4\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2"+
		"\2no\7\4\2\2ow\3\2\2\2pq\t\2\2\2qr\7*\2\2rw\5\6\4\2st\5\b\5\2tu\7\t\2"+
		"\2uw\3\2\2\2vf\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\7\3\2\2\2x{\7N\2\2yz\7B\2"+
		"\2z|\5> \2{y\3\2\2\2{|\3\2\2\2|\t\3\2\2\2}~\7\23\2\2~\177\7*\2\2\177\u0080"+
		"\5\f\7\2\u0080\13\3\2\2\2\u0081\u0082\7N\2\2\u0082\u0083\7*\2\2\u0083"+
		"\u0086\5\f\7\2\u0084\u0086\5\b\5\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\r\3\2\2\2\u0087\u0088\7N\2\2\u0088\u0089\7\t\2\2\u0089\u008b"+
		"\7\3\2\2\u008a\u008c\5\20\t\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\7\4\2\2\u0090\u0095\3\2\2\2\u0091\u0092\7N\2\2\u0092\u0093\7*\2\2\u0093"+
		"\u0095\5\20\t\2\u0094\u0087\3\2\2\2\u0094\u0091\3\2\2\2\u0095\17\3\2\2"+
		"\2\u0096\u009d\5\4\3\2\u0097\u009d\5\22\n\2\u0098\u009d\5\16\b\2\u0099"+
		"\u009a\5\b\5\2\u009a\u009b\7\t\2\2\u009b\u009d\3\2\2\2\u009c\u0096\3\2"+
		"\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\21\3\2\2\2\u009e\u00a0\5\24\13\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2\u00a4\7\3\2\2\u00a3"+
		"\u00a5\5\26\f\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\4\2\2\u00a9"+
		"\u00b1\3\2\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7*\2\2\u00ac\u00ae\3"+
		"\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\5\26\f\2\u00b0\u009f\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\23\3\2\2"+
		"\2\u00b2\u00b3\t\3\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\7N\2\2\u00b5\u00b7"+
		"\7\7\2\2\u00b6\u00b8\5\30\r\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b9\3\2\2\2\u00b9\u00bc\7\b\2\2\u00ba\u00bd\5\34\17\2\u00bb\u00bd"+
		"\7\t\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\27\3\2\2\2\u00be"+
		"\u00c3\5\32\16\2\u00bf\u00c0\7\'\2\2\u00c0\u00c2\5\32\16\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\'\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\31\3\2\2\2\u00c9\u00d0\7N\2\2\u00ca\u00cb"+
		"\7\23\2\2\u00cb\u00cd\7*\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\5\f\7\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d4\5> \2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00de\3\2\2\2\u00d5\u00d6\7\31\2\2"+
		"\u00d6\u00db\7N\2\2\u00d7\u00d8\7>\2\2\u00d8\u00da\7N\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e3\5> \2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\33\3\2\2\2\u00e4\u00ef\5 \21"+
		"\2\u00e5\u00e6\7\t\2\2\u00e6\u00e8\7\3\2\2\u00e7\u00e9\5\36\20\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00e4\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ef\35\3\2\2\2\u00f0\u00f3\5 \21"+
		"\2\u00f1\u00f3\5*\26\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\37"+
		"\3\2\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00f6\7\t\2\2\u00f6!\3\2\2\2\u00f7"+
		"\u00fb\5&\24\2\u00f8\u00fb\5(\25\2\u00f9\u00fb\5> \2\u00fa\u00f7\3\2\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb#\3\2\2\2\u00fc\u00fd"+
		"\7\27\2\2\u00fd\u00fe\7N\2\2\u00fe\u00ff\t\4\2\2\u00ff\u0100\5> \2\u0100"+
		"%\3\2\2\2\u0101\u0102\7\25\2\2\u0102\u0103\5> \2\u0103\'\3\2\2\2\u0104"+
		"\u0109\5$\23\2\u0105\u0109\58\35\2\u0106\u0109\5:\36\2\u0107\u0109\5<"+
		"\37\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109)\3\2\2\2\u010a\u0112\5\4\3\2\u010b\u0112\5,\27\2"+
		"\u010c\u0112\5.\30\2\u010d\u0112\5\60\31\2\u010e\u0112\5\64\33\2\u010f"+
		"\u0112\5\66\34\2\u0110\u0112\5\62\32\2\u0111\u010a\3\2\2\2\u0111\u010b"+
		"\3\2\2\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010e\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112+\3\2\2\2\u0113\u0114\7\13\2\2"+
		"\u0114\u0115\7\7\2\2\u0115\u0116\5> \2\u0116\u0117\7\b\2\2\u0117\u0121"+
		"\5\34\17\2\u0118\u0119\7\f\2\2\u0119\u011a\7\13\2\2\u011a\u011b\7\7\2"+
		"\2\u011b\u011c\5> \2\u011c\u011d\7\b\2\2\u011d\u011e\5\34\17\2\u011e\u0120"+
		"\3\2\2\2\u011f\u0118\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0126\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\f"+
		"\2\2\u0125\u0127\5\34\17\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"-\3\2\2\2\u0128\u0129\7\17\2\2\u0129\u012a\5\34\17\2\u012a\u012b\7\16"+
		"\2\2\u012b\u012c\7\7\2\2\u012c\u012d\5> \2\u012d\u012e\7\b\2\2\u012e/"+
		"\3\2\2\2\u012f\u0130\7\16\2\2\u0130\u0131\7\7\2\2\u0131\u0132\5> \2\u0132"+
		"\u0133\7\b\2\2\u0133\u0134\5\34\17\2\u0134\61\3\2\2\2\u0135\u0136\7\34"+
		"\2\2\u0136\u0138\7\7\2\2\u0137\u0139\5> \2\u0138\u0137\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\b\2\2\u013b\u013c\5\34\17\2"+
		"\u013c\63\3\2\2\2\u013d\u013e\7\r\2\2\u013e\u014b\7\7\2\2\u013f\u0142"+
		"\5> \2\u0140\u0142\5\n\6\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\t\5\2\2\u0144\u0146\5>"+
		" \2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\t\5\2\2\u0148\u014a\5> \2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\u014c\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\7\b\2\2\u014e\u014f\5\34\17\2\u014f\65\3\2\2\2\u0150"+
		"\u0151\7\r\2\2\u0151\u0154\7\7\2\2\u0152\u0155\5\n\6\2\u0153\u0155\7N"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0157\7\31\2\2\u0157\u0159\7N\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u015b\7\22\2\2\u015b\u015d\5> \2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\b"+
		"\2\2\u015f\u0160\5\34\17\2\u0160\67\3\2\2\2\u0161\u0162\7\20\2\2\u0162"+
		"9\3\2\2\2\u0163\u0164\7\21\2\2\u0164;\3\2\2\2\u0165\u0167\7\26\2\2\u0166"+
		"\u0168\5> \2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168=\3\2\2\2\u0169"+
		"\u016a\b \1\2\u016a\u016b\7\7\2\2\u016b\u016c\5> \2\u016c\u016d\7\b\2"+
		"\2\u016d\u0178\3\2\2\2\u016e\u016f\t\6\2\2\u016f\u0178\5> \22\u0170\u0171"+
		"\7\63\2\2\u0171\u0178\5> \21\u0172\u0174\5F$\2\u0173\u0175\5> \2\u0174"+
		"\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0178\5D"+
		"#\2\u0177\u0169\3\2\2\2\u0177\u016e\3\2\2\2\u0177\u0170\3\2\2\2\u0177"+
		"\u0172\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u01a4\3\2\2\2\u0179\u017a\f\20"+
		"\2\2\u017a\u017b\t\7\2\2\u017b\u01a3\5> \21\u017c\u017d\f\17\2\2\u017d"+
		"\u017e\t\b\2\2\u017e\u01a3\5> \20\u017f\u0180\f\16\2\2\u0180\u0181\t\t"+
		"\2\2\u0181\u01a3\5> \17\u0182\u0183\f\r\2\2\u0183\u0184\t\n\2\2\u0184"+
		"\u01a3\5> \16\u0185\u0186\f\f\2\2\u0186\u0187\t\13\2\2\u0187\u01a3\5>"+
		" \r\u0188\u0189\f\13\2\2\u0189\u018a\t\f\2\2\u018a\u01a3\5> \f\u018b\u018c"+
		"\f\n\2\2\u018c\u018d\7@\2\2\u018d\u01a3\5> \13\u018e\u018f\f\t\2\2\u018f"+
		"\u0190\7A\2\2\u0190\u01a3\5> \n\u0191\u0192\f\b\2\2\u0192\u0193\7,\2\2"+
		"\u0193\u0194\5> \2\u0194\u0195\7+\2\2\u0195\u0196\5> \t\u0196\u01a3\3"+
		"\2\2\2\u0197\u0198\f\6\2\2\u0198\u0199\7\22\2\2\u0199\u01a3\5> \7\u019a"+
		"\u019b\f\5\2\2\u019b\u019c\t\r\2\2\u019c\u01a3\5> \6\u019d\u019e\f\23"+
		"\2\2\u019e\u01a3\5@!\2\u019f\u01a0\f\7\2\2\u01a0\u01a1\7\31\2\2\u01a1"+
		"\u01a3\7N\2\2\u01a2\u0179\3\2\2\2\u01a2\u017c\3\2\2\2\u01a2\u017f\3\2"+
		"\2\2\u01a2\u0182\3\2\2\2\u01a2\u0185\3\2\2\2\u01a2\u0188\3\2\2\2\u01a2"+
		"\u018b\3\2\2\2\u01a2\u018e\3\2\2\2\u01a2\u0191\3\2\2\2\u01a2\u0197\3\2"+
		"\2\2\u01a2\u019a\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5?\3\2\2\2"+
		"\u01a6\u01a4\3\2\2\2\u01a7\u01a9\7\7\2\2\u01a8\u01aa\5B\"\2\u01a9\u01a8"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01b3\7\b\2\2\u01ac"+
		"\u01ad\7\5\2\2\u01ad\u01ae\5> \2\u01ae\u01af\7\6\2\2\u01af\u01b3\3\2\2"+
		"\2\u01b0\u01b1\t\16\2\2\u01b1\u01b3\7N\2\2\u01b2\u01a7\3\2\2\2\u01b2\u01ac"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3A\3\2\2\2\u01b4\u01b9\5> \2\u01b5\u01b6"+
		"\7\'\2\2\u01b6\u01b8\5> \2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01be\7\'\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"C\3\2\2\2\u01bf\u01c7\7O\2\2\u01c0\u01c7\7P\2\2\u01c1\u01c7\7Q\2\2\u01c2"+
		"\u01c7\7N\2\2\u01c3\u01c7\5H%\2\u01c4\u01c7\7%\2\2\u01c5\u01c7\7&\2\2"+
		"\u01c6\u01bf\3\2\2\2\u01c6\u01c0\3\2\2\2\u01c6\u01c1\3\2\2\2\u01c6\u01c2"+
		"\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"E\3\2\2\2\u01c8\u01ca\7\33\2\2\u01c9\u01cb\5H%\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cbG\3\2\2\2\u01cc\u01cd\7*\2\2\u01cd\u01cf\5J&\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\7*\2\2\u01d3\u01d2\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4I\3\2\2\2\u01d5\u01d6\t\17\2\2\u01d6K\3\2\2\28PR]"+
		"dlv{\u0085\u008d\u0094\u009c\u009f\u00a6\u00ad\u00b0\u00b7\u00bc\u00c3"+
		"\u00c7\u00cc\u00cf\u00d3\u00db\u00de\u00e2\u00ea\u00ee\u00f2\u00fa\u0108"+
		"\u0111\u0121\u0126\u0138\u0141\u0145\u0149\u014b\u0154\u0158\u015c\u0167"+
		"\u0174\u0177\u01a2\u01a4\u01a9\u01b2\u01b9\u01bd\u01c6\u01ca\u01d0\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}