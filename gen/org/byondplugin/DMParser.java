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
		NAME=76, STRING_LITERAL=77, ICON_PATH=78, NUMBER=79, SPACES=80, INLINE_COMMENT=81, 
		UNKNOWN_CHAR=82, MULTILINE_COMMENT=83, MULTILINE_COMMENT_START=84;
	public static final int
		RULE_start = 0, RULE_var_stmt = 1, RULE_var_path = 2, RULE_vardef = 3, 
		RULE_attr_assignment = 4, RULE_inline_var_stmt = 5, RULE_inline_var_path = 6, 
		RULE_classdef = 7, RULE_class_body = 8, RULE_funcdefs = 9, RULE_func_type = 10, 
		RULE_funcdef = 11, RULE_parameters = 12, RULE_parameter = 13, RULE_suite = 14, 
		RULE_stmt = 15, RULE_simple_stmt = 16, RULE_small_stmt = 17, RULE_set_stmt = 18, 
		RULE_del_stmt = 19, RULE_flow_stmt = 20, RULE_compound_stmt = 21, RULE_if_stmt = 22, 
		RULE_dowhile_stmt = 23, RULE_while_stmt = 24, RULE_spawn_stmt = 25, RULE_for_stmt = 26, 
		RULE_foreach_stmt = 27, RULE_break_stmt = 28, RULE_continue_stmt = 29, 
		RULE_return_stmt = 30, RULE_expr = 31, RULE_func_trailer = 32, RULE_index_trailer = 33, 
		RULE_attr_trailer = 34, RULE_arglist = 35, RULE_func_call = 36, RULE_method_call = 37, 
		RULE_attribute = 38, RULE_value = 39, RULE_new_stmt = 40, RULE_path = 41;
	public static final String[] ruleNames = {
		"start", "var_stmt", "var_path", "vardef", "attr_assignment", "inline_var_stmt", 
		"inline_var_path", "classdef", "class_body", "funcdefs", "func_type", 
		"funcdef", "parameters", "parameter", "suite", "stmt", "simple_stmt", 
		"small_stmt", "set_stmt", "del_stmt", "flow_stmt", "compound_stmt", "if_stmt", 
		"dowhile_stmt", "while_stmt", "spawn_stmt", "for_stmt", "foreach_stmt", 
		"break_stmt", "continue_stmt", "return_stmt", "expr", "func_trailer", 
		"index_trailer", "attr_trailer", "arglist", "func_call", "method_call", 
		"attribute", "value", "new_stmt", "path"
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
		"NAME", "STRING_LITERAL", "ICON_PATH", "NUMBER", "SPACES", "INLINE_COMMENT", 
		"UNKNOWN_CHAR", "MULTILINE_COMMENT", "MULTILINE_COMMENT_START"
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << VAR) | (1L << VERB) | (1L << PROC))) != 0) || _la==NAME) {
				{
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(84);
					var_stmt();
					}
					break;
				case 2:
					{
					setState(85);
					funcdefs();
					}
					break;
				case 3:
					{
					setState(86);
					classdef();
					}
					break;
				case 4:
					{
					setState(87);
					match(NEWLINE);
					}
					break;
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(VAR);
				setState(96);
				match(NEWLINE);
				setState(97);
				match(INDENT);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98);
					var_path();
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TMP || _la==NAME );
				setState(103);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(VAR);
				setState(106);
				match(SLASH);
				setState(107);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				match(NEWLINE);
				setState(112);
				match(INDENT);
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					var_path();
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TMP || _la==NAME );
				setState(118);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==TMP || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				match(SLASH);
				setState(122);
				var_path();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				vardef();
				setState(124);
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
			setState(128);
			match(NAME);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(129);
				match(ASSIGN);
				setState(130);
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

	public static class Attr_assignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Attr_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_assignment; }
	}

	public final Attr_assignmentContext attr_assignment() throws RecognitionException {
		Attr_assignmentContext _localctx = new Attr_assignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NAME);
			setState(134);
			match(ASSIGN);
			setState(135);
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
		enterRule(_localctx, 10, RULE_inline_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(VAR);
			setState(138);
			match(SLASH);
			setState(139);
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
		enterRule(_localctx, 12, RULE_inline_var_path);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(NAME);
				setState(142);
				match(SLASH);
				setState(143);
				inline_var_path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		enterRule(_localctx, 14, RULE_classdef);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(NAME);
				setState(148);
				match(NEWLINE);
				setState(149);
				match(INDENT);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					class_body();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << VAR) | (1L << VERB) | (1L << PROC))) != 0) || _la==NAME );
				setState(155);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(NAME);
				setState(158);
				match(SLASH);
				setState(159);
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
		public Attr_assignmentContext attr_assignment() {
			return getRuleContext(Attr_assignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(DMParser.NEWLINE, 0); }
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_class_body);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				funcdefs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				classdef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				attr_assignment();
				setState(166);
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
		enterRule(_localctx, 18, RULE_funcdefs);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERB || _la==PROC) {
					{
					setState(170);
					func_type();
					}
				}

				setState(173);
				match(NEWLINE);
				setState(174);
				match(INDENT);
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					funcdef();
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(180);
				match(DEDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERB || _la==PROC) {
					{
					setState(182);
					func_type();
					setState(183);
					match(SLASH);
					}
				}

				setState(187);
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
		enterRule(_localctx, 20, RULE_func_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 22, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(NAME);
			setState(193);
			match(OPEN_PAREN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==NAME) {
				{
				setState(194);
				parameters();
				}
			}

			setState(197);
			match(CLOSE_PAREN);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(198);
				suite();
				}
				break;
			case 2:
				{
				setState(199);
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
		enterRule(_localctx, 24, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			parameter();
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					parameter();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(210);
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
		enterRule(_localctx, 26, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(213);
				match(NAME);
				}
				break;
			case 2:
				{
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(214);
					match(VAR);
					setState(215);
					match(SLASH);
					}
				}

				setState(218);
				inline_var_path();
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(221);
				match(ASSIGN);
				setState(222);
				expr(0);
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(225);
				match(AS);
				setState(226);
				match(NAME);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BIT_OR) {
					{
					{
					setState(227);
					match(BIT_OR);
					setState(228);
					match(NAME);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(236);
				match(IN);
				setState(237);
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
		enterRule(_localctx, 28, RULE_suite);
		int _la;
		try {
			setState(250);
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
				setState(240);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(NEWLINE);
				setState(242);
				match(INDENT);
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243);
					stmt();
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << BREAK) | (1L << CONTINUE) | (1L << VAR) | (1L << DEL) | (1L << RETURN) | (1L << SET) | (1L << NEW) | (1L << SPAWN) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0) );
				setState(248);
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
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(254);
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
				setState(252);
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
				setState(253);
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
		enterRule(_localctx, 32, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			small_stmt();
			setState(257);
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
		enterRule(_localctx, 34, RULE_small_stmt);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				del_stmt();
				}
				break;
			case BREAK:
			case CONTINUE:
			case RETURN:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
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
				setState(261);
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
		enterRule(_localctx, 36, RULE_set_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(SET);
			setState(265);
			match(NAME);
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==ASSIGN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
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
		enterRule(_localctx, 38, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(DEL);
			setState(270);
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
		enterRule(_localctx, 40, RULE_flow_stmt);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				set_stmt();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
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
		enterRule(_localctx, 42, RULE_compound_stmt);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				var_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				dowhile_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				for_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				foreach_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
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
		enterRule(_localctx, 44, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IF);
			setState(288);
			match(OPEN_PAREN);
			setState(289);
			expr(0);
			setState(290);
			match(CLOSE_PAREN);
			setState(291);
			suite();
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(292);
					match(ELSE);
					setState(293);
					match(IF);
					setState(294);
					match(OPEN_PAREN);
					setState(295);
					expr(0);
					setState(296);
					match(CLOSE_PAREN);
					setState(297);
					suite();
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(304);
				match(ELSE);
				setState(305);
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
		enterRule(_localctx, 46, RULE_dowhile_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(DO);
			setState(309);
			suite();
			setState(310);
			match(WHILE);
			setState(311);
			match(OPEN_PAREN);
			setState(312);
			expr(0);
			setState(313);
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
		enterRule(_localctx, 48, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(WHILE);
			setState(316);
			match(OPEN_PAREN);
			setState(317);
			expr(0);
			setState(318);
			match(CLOSE_PAREN);
			setState(319);
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
		enterRule(_localctx, 50, RULE_spawn_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(SPAWN);
			setState(322);
			match(OPEN_PAREN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
				{
				setState(323);
				expr(0);
				}
			}

			setState(326);
			match(CLOSE_PAREN);
			setState(327);
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
		enterRule(_localctx, 52, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(FOR);
			setState(330);
			match(OPEN_PAREN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << VAR) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << COMMA) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (SEMICOLON - 75)) | (1L << (NAME - 75)) | (1L << (STRING_LITERAL - 75)) | (1L << (ICON_PATH - 75)) | (1L << (NUMBER - 75)))) != 0)) {
				{
				setState(333);
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
					setState(331);
					expr(0);
					}
					break;
				case VAR:
					{
					setState(332);
					inline_var_stmt();
					}
					break;
				case COMMA:
				case SEMICOLON:
					break;
				default:
					break;
				}
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
					{
					setState(336);
					expr(0);
					}
				}

				setState(339);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
					{
					setState(340);
					expr(0);
					}
				}

				}
			}

			setState(345);
			match(CLOSE_PAREN);
			setState(346);
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
		enterRule(_localctx, 54, RULE_foreach_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(FOR);
			setState(349);
			match(OPEN_PAREN);
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(350);
				inline_var_stmt();
				}
				break;
			case NAME:
				{
				setState(351);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(354);
				match(AS);
				setState(355);
				match(NAME);
				}
			}

			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(358);
				match(IN);
				setState(359);
				expr(0);
				}
			}

			setState(362);
			match(CLOSE_PAREN);
			setState(363);
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
		enterRule(_localctx, 56, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 58, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 60, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(RETURN);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
				{
				setState(370);
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
	public static class Attr_trailer_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Attr_trailerContext attr_trailer() {
			return getRuleContext(Attr_trailerContext.class,0);
		}
		public Attr_trailer_exprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class Func_trailer_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Func_trailerContext func_trailer() {
			return getRuleContext(Func_trailerContext.class,0);
		}
		public Func_trailer_exprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class Index_trailer_exprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Index_trailerContext index_trailer() {
			return getRuleContext(Index_trailerContext.class,0);
		}
		public Index_trailer_exprContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new Bracket_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(374);
				match(OPEN_PAREN);
				setState(375);
				expr(0);
				setState(376);
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
				setState(378);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(379);
				expr(16);
				}
				break;
			case POWER:
				{
				_localctx = new Power_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(POWER);
				setState(381);
				expr(15);
				}
				break;
			case NEW:
				{
				_localctx = new New_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				new_stmt();
				setState(384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(383);
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
				setState(386);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(434);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new Mult_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(389);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(390);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PERCENT) | (1L << SLASH))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(391);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new Add_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(392);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(393);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(394);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new Comp_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(395);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(396);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << LESS_THAN_OR_EQUAL) | (1L << GREATER_THAN_OR_EQUAL))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(397);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new Bitmove_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(398);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(399);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_LEFT || _la==SHIFT_RIGHT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(400);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new Eq_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(401);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(402);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOT_EQUAL) | (1L << NOT_EQUAL_2))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(403);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new Bit_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(404);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(405);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIT_AND) | (1L << BIT_OR) | (1L << BIT_XOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(406);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new Logand_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(407);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(408);
						match(LOG_AND);
						setState(409);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new Logor_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(410);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(411);
						match(LOG_OR);
						setState(412);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new Tenary_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(413);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(414);
						match(QUESTION_MARK);
						setState(415);
						expr(0);
						setState(416);
						match(COLON);
						setState(417);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new In_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(419);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(420);
						match(IN);
						setState(421);
						expr(5);
						}
						break;
					case 11:
						{
						_localctx = new Assign_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(422);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(423);
						_la = _input.LA(1);
						if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ASSIGN - 64)) | (1L << (ADD_ASSIGN - 64)) | (1L << (SUB_ASSIGN - 64)) | (1L << (MULT_ASSIGN - 64)) | (1L << (DIV_ASSIGN - 64)) | (1L << (BIT_AND_ASSIGN - 64)) | (1L << (BIT_OR_ASSIGN - 64)) | (1L << (XOR_ASSIGN - 64)) | (1L << (LEFT_SHIFT_ASSIGN - 64)) | (1L << (RIGHT_SHIFT_ASSIGN - 64)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(424);
						expr(4);
						}
						break;
					case 12:
						{
						_localctx = new Func_trailer_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(425);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(426);
						func_trailer();
						}
						break;
					case 13:
						{
						_localctx = new Index_trailer_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(427);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(428);
						index_trailer();
						}
						break;
					case 14:
						{
						_localctx = new Attr_trailer_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(429);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(430);
						attr_trailer();
						}
						break;
					case 15:
						{
						_localctx = new As_exprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(431);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(432);
						match(AS);
						setState(433);
						match(NAME);
						}
						break;
					}
					} 
				}
				setState(438);
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

	public static class Func_trailerContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Func_trailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_trailer; }
	}

	public final Func_trailerContext func_trailer() throws RecognitionException {
		Func_trailerContext _localctx = new Func_trailerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_func_trailer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(OPEN_PAREN);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << NEW) | (1L << DOUBLE_DOT) | (1L << DOT) | (1L << SLASH) | (1L << NOT_OP) | (1L << NEG_OP) | (1L << MINUS) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << POWER))) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (NAME - 76)) | (1L << (STRING_LITERAL - 76)) | (1L << (ICON_PATH - 76)) | (1L << (NUMBER - 76)))) != 0)) {
				{
				setState(440);
				arglist();
				}
			}

			setState(443);
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

	public static class Index_trailerContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Index_trailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_trailer; }
	}

	public final Index_trailerContext index_trailer() throws RecognitionException {
		Index_trailerContext _localctx = new Index_trailerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_index_trailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(OPEN_BRACK);
			setState(446);
			expr(0);
			setState(447);
			match(CLOSE_BRACK);
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

	public static class Attr_trailerContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public Attr_trailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_trailer; }
	}

	public final Attr_trailerContext attr_trailer() throws RecognitionException {
		Attr_trailerContext _localctx = new Attr_trailerContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_attr_trailer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==DOT || _la==COLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(450);
			match(NAME);
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
		enterRule(_localctx, 70, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			expr(0);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(453);
					match(COMMA);
					setState(454);
					expr(0);
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(460);
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

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DMParser.NAME, 0); }
		public Func_trailerContext func_trailer() {
			return getRuleContext(Func_trailerContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(NAME);
			setState(464);
			func_trailer();
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

	public static class Method_callContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(DMParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DMParser.NAME, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_method_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(466);
					match(NAME);
					setState(467);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==COLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(470); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(472);
			func_call();
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

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(DMParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DMParser.NAME, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_attribute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					match(NAME);
					setState(475);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==COLON) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(478); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(480);
			match(NAME);
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
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				func_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				method_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				attribute();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				match(ICON_PATH);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(487);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(488);
				match(NAME);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(489);
				path();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(490);
				match(DOUBLE_DOT);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(491);
				match(DOT);
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
		enterRule(_localctx, 80, RULE_new_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(NEW);
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(495);
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
		public List<TerminalNode> NAME() { return getTokens(DMParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DMParser.NAME, i);
		}
		public List<Func_typeContext> func_type() {
			return getRuleContexts(Func_typeContext.class);
		}
		public Func_typeContext func_type(int i) {
			return getRuleContext(Func_typeContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_path);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(498);
					match(SLASH);
					setState(501);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NAME:
						{
						setState(499);
						match(NAME);
						}
						break;
					case VERB:
					case PROC:
						{
						setState(500);
						func_type();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(507);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
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
			return precpred(_ctx, 19);
		case 12:
			return precpred(_ctx, 18);
		case 13:
			return precpred(_ctx, 17);
		case 14:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0201\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3f\n"+
		"\3\r\3\16\3g\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\6\4u\n\4\r\4"+
		"\16\4v\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\5\5\u0086"+
		"\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\t"+
		"\3\t\3\t\3\t\6\t\u009a\n\t\r\t\16\t\u009b\3\t\3\t\3\t\3\t\3\t\5\t\u00a3"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ab\n\n\3\13\5\13\u00ae\n\13\3\13\3"+
		"\13\3\13\6\13\u00b3\n\13\r\13\16\13\u00b4\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00bc\n\13\3\13\5\13\u00bf\n\13\3\f\3\f\3\r\3\r\3\r\5\r\u00c6\n\r\3\r"+
		"\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\7\16\u00d0\n\16\f\16\16\16\u00d3"+
		"\13\16\3\16\5\16\u00d6\n\16\3\17\3\17\3\17\5\17\u00db\n\17\3\17\5\17\u00de"+
		"\n\17\3\17\3\17\5\17\u00e2\n\17\3\17\3\17\3\17\3\17\7\17\u00e8\n\17\f"+
		"\17\16\17\u00eb\13\17\5\17\u00ed\n\17\3\17\3\17\5\17\u00f1\n\17\3\20\3"+
		"\20\3\20\3\20\6\20\u00f7\n\20\r\20\16\20\u00f8\3\20\3\20\5\20\u00fd\n"+
		"\20\3\21\3\21\5\21\u0101\n\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0109"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u0117\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0120\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u012e\n\30"+
		"\f\30\16\30\u0131\13\30\3\30\3\30\5\30\u0135\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u0147"+
		"\n\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0150\n\34\3\34\3\34\5\34"+
		"\u0154\n\34\3\34\3\34\5\34\u0158\n\34\5\34\u015a\n\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\5\35\u0163\n\35\3\35\3\35\5\35\u0167\n\35\3\35\3\35"+
		"\5\35\u016b\n\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \5 \u0176\n "+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0183\n!\3!\5!\u0186\n!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u01b5\n!"+
		"\f!\16!\u01b8\13!\3\"\3\"\5\"\u01bc\n\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"%\3%\3%\7%\u01ca\n%\f%\16%\u01cd\13%\3%\5%\u01d0\n%\3&\3&\3&\3\'\3\'\6"+
		"\'\u01d7\n\'\r\'\16\'\u01d8\3\'\3\'\3(\3(\6(\u01df\n(\r(\16(\u01e0\3("+
		"\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01ef\n)\3*\3*\5*\u01f3\n*\3+\3+"+
		"\3+\5+\u01f8\n+\6+\u01fa\n+\r+\16+\u01fb\3+\5+\u01ff\n+\3+\2\3@,\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"\2\17\4\2$$NN\3\2\37 \4\2\22\22BB\4\2\'\'MM\4\2-/\61\62\3\2(*\3\2/\60"+
		"\3\2\64\67\3\289\3\2:<\3\2=?\4\2BFHL\4\2&&++\2\u0234\2\\\3\2\2\2\4n\3"+
		"\2\2\2\6\u0080\3\2\2\2\b\u0082\3\2\2\2\n\u0087\3\2\2\2\f\u008b\3\2\2\2"+
		"\16\u0093\3\2\2\2\20\u00a2\3\2\2\2\22\u00aa\3\2\2\2\24\u00be\3\2\2\2\26"+
		"\u00c0\3\2\2\2\30\u00c2\3\2\2\2\32\u00cc\3\2\2\2\34\u00dd\3\2\2\2\36\u00fc"+
		"\3\2\2\2 \u0100\3\2\2\2\"\u0102\3\2\2\2$\u0108\3\2\2\2&\u010a\3\2\2\2"+
		"(\u010f\3\2\2\2*\u0116\3\2\2\2,\u011f\3\2\2\2.\u0121\3\2\2\2\60\u0136"+
		"\3\2\2\2\62\u013d\3\2\2\2\64\u0143\3\2\2\2\66\u014b\3\2\2\28\u015e\3\2"+
		"\2\2:\u016f\3\2\2\2<\u0171\3\2\2\2>\u0173\3\2\2\2@\u0185\3\2\2\2B\u01b9"+
		"\3\2\2\2D\u01bf\3\2\2\2F\u01c3\3\2\2\2H\u01c6\3\2\2\2J\u01d1\3\2\2\2L"+
		"\u01d6\3\2\2\2N\u01de\3\2\2\2P\u01ee\3\2\2\2R\u01f0\3\2\2\2T\u01f9\3\2"+
		"\2\2V[\5\4\3\2W[\5\24\13\2X[\5\20\t\2Y[\7\t\2\2ZV\3\2\2\2ZW\3\2\2\2ZX"+
		"\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2"+
		"\2_`\7\2\2\3`\3\3\2\2\2ab\7\23\2\2bc\7\t\2\2ce\7\3\2\2df\5\6\4\2ed\3\2"+
		"\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\4\2\2jo\3\2\2\2kl\7\23"+
		"\2\2lm\7*\2\2mo\5\6\4\2na\3\2\2\2nk\3\2\2\2o\5\3\2\2\2pq\t\2\2\2qr\7\t"+
		"\2\2rt\7\3\2\2su\5\6\4\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2"+
		"\2\2xy\7\4\2\2y\u0081\3\2\2\2z{\t\2\2\2{|\7*\2\2|\u0081\5\6\4\2}~\5\b"+
		"\5\2~\177\7\t\2\2\177\u0081\3\2\2\2\u0080p\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"}\3\2\2\2\u0081\7\3\2\2\2\u0082\u0085\7N\2\2\u0083\u0084\7B\2\2\u0084"+
		"\u0086\5@!\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\t\3\2\2\2\u0087"+
		"\u0088\7N\2\2\u0088\u0089\7B\2\2\u0089\u008a\5@!\2\u008a\13\3\2\2\2\u008b"+
		"\u008c\7\23\2\2\u008c\u008d\7*\2\2\u008d\u008e\5\16\b\2\u008e\r\3\2\2"+
		"\2\u008f\u0090\7N\2\2\u0090\u0091\7*\2\2\u0091\u0094\5\16\b\2\u0092\u0094"+
		"\5\b\5\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\17\3\2\2\2\u0095"+
		"\u0096\7N\2\2\u0096\u0097\7\t\2\2\u0097\u0099\7\3\2\2\u0098\u009a\5\22"+
		"\n\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\4\2\2\u009e\u00a3\3\2"+
		"\2\2\u009f\u00a0\7N\2\2\u00a0\u00a1\7*\2\2\u00a1\u00a3\5\22\n\2\u00a2"+
		"\u0095\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00ab\5\4\3"+
		"\2\u00a5\u00ab\5\24\13\2\u00a6\u00ab\5\20\t\2\u00a7\u00a8\5\n\6\2\u00a8"+
		"\u00a9\7\t\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2"+
		"\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\23\3\2\2\2\u00ac\u00ae"+
		"\5\26\f\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00b0\7\t\2\2\u00b0\u00b2\7\3\2\2\u00b1\u00b3\5\30\r\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5\26"+
		"\f\2\u00b9\u00ba\7*\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\5\30\r\2\u00be\u00ad\3"+
		"\2\2\2\u00be\u00bb\3\2\2\2\u00bf\25\3\2\2\2\u00c0\u00c1\t\3\2\2\u00c1"+
		"\27\3\2\2\2\u00c2\u00c3\7N\2\2\u00c3\u00c5\7\7\2\2\u00c4\u00c6\5\32\16"+
		"\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca"+
		"\7\b\2\2\u00c8\u00cb\5\36\20\2\u00c9\u00cb\7\t\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00d1\5\34\17\2\u00cd\u00ce"+
		"\7\'\2\2\u00ce\u00d0\5\34\17\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d6\7\'\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\33\3\2\2\2\u00d7\u00de\7N\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00db\7*\2\2"+
		"\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de"+
		"\5\16\b\2\u00dd\u00d7\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2"+
		"\u00df\u00e0\7B\2\2\u00e0\u00e2\5@!\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\7\31\2\2\u00e4\u00e9\7N\2\2\u00e5"+
		"\u00e6\7>\2\2\u00e6\u00e8\7N\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ef\7\22\2\2\u00ef\u00f1\5@!\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\35\3\2\2\2\u00f2\u00fd\5\"\22\2\u00f3\u00f4\7\t\2\2\u00f4\u00f6"+
		"\7\3\2\2\u00f5\u00f7\5 \21\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\4"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2\u00fc\u00f3\3\2\2\2\u00fd"+
		"\37\3\2\2\2\u00fe\u0101\5\"\22\2\u00ff\u0101\5,\27\2\u0100\u00fe\3\2\2"+
		"\2\u0100\u00ff\3\2\2\2\u0101!\3\2\2\2\u0102\u0103\5$\23\2\u0103\u0104"+
		"\7\t\2\2\u0104#\3\2\2\2\u0105\u0109\5(\25\2\u0106\u0109\5*\26\2\u0107"+
		"\u0109\5@!\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2"+
		"\2\u0109%\3\2\2\2\u010a\u010b\7\27\2\2\u010b\u010c\7N\2\2\u010c\u010d"+
		"\t\4\2\2\u010d\u010e\5@!\2\u010e\'\3\2\2\2\u010f\u0110\7\25\2\2\u0110"+
		"\u0111\5@!\2\u0111)\3\2\2\2\u0112\u0117\5&\24\2\u0113\u0117\5:\36\2\u0114"+
		"\u0117\5<\37\2\u0115\u0117\5> \2\u0116\u0112\3\2\2\2\u0116\u0113\3\2\2"+
		"\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117+\3\2\2\2\u0118\u0120"+
		"\5\4\3\2\u0119\u0120\5.\30\2\u011a\u0120\5\60\31\2\u011b\u0120\5\62\32"+
		"\2\u011c\u0120\5\66\34\2\u011d\u0120\58\35\2\u011e\u0120\5\64\33\2\u011f"+
		"\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2"+
		"\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"-\3\2\2\2\u0121\u0122\7\13\2\2\u0122\u0123\7\7\2\2\u0123\u0124\5@!\2\u0124"+
		"\u0125\7\b\2\2\u0125\u012f\5\36\20\2\u0126\u0127\7\f\2\2\u0127\u0128\7"+
		"\13\2\2\u0128\u0129\7\7\2\2\u0129\u012a\5@!\2\u012a\u012b\7\b\2\2\u012b"+
		"\u012c\5\36\20\2\u012c\u012e\3\2\2\2\u012d\u0126\3\2\2\2\u012e\u0131\3"+
		"\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7\f\2\2\u0133\u0135\5\36\20\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135/\3\2\2\2\u0136\u0137\7\17\2\2\u0137\u0138"+
		"\5\36\20\2\u0138\u0139\7\16\2\2\u0139\u013a\7\7\2\2\u013a\u013b\5@!\2"+
		"\u013b\u013c\7\b\2\2\u013c\61\3\2\2\2\u013d\u013e\7\16\2\2\u013e\u013f"+
		"\7\7\2\2\u013f\u0140\5@!\2\u0140\u0141\7\b\2\2\u0141\u0142\5\36\20\2\u0142"+
		"\63\3\2\2\2\u0143\u0144\7\34\2\2\u0144\u0146\7\7\2\2\u0145\u0147\5@!\2"+
		"\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149"+
		"\7\b\2\2\u0149\u014a\5\36\20\2\u014a\65\3\2\2\2\u014b\u014c\7\r\2\2\u014c"+
		"\u0159\7\7\2\2\u014d\u0150\5@!\2\u014e\u0150\5\f\7\2\u014f\u014d\3\2\2"+
		"\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153"+
		"\t\5\2\2\u0152\u0154\5@!\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\t\5\2\2\u0156\u0158\5@!\2\u0157\u0156\3\2\2"+
		"\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u014f\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\b\2\2\u015c\u015d\5\36\20\2"+
		"\u015d\67\3\2\2\2\u015e\u015f\7\r\2\2\u015f\u0162\7\7\2\2\u0160\u0163"+
		"\5\f\7\2\u0161\u0163\7N\2\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0165\7\31\2\2\u0165\u0167\7N\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0169\7\22\2\2\u0169"+
		"\u016b\5@!\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2"+
		"\2\u016c\u016d\7\b\2\2\u016d\u016e\5\36\20\2\u016e9\3\2\2\2\u016f\u0170"+
		"\7\20\2\2\u0170;\3\2\2\2\u0171\u0172\7\21\2\2\u0172=\3\2\2\2\u0173\u0175"+
		"\7\26\2\2\u0174\u0176\5@!\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"?\3\2\2\2\u0177\u0178\b!\1\2\u0178\u0179\7\7\2\2\u0179\u017a\5@!\2\u017a"+
		"\u017b\7\b\2\2\u017b\u0186\3\2\2\2\u017c\u017d\t\6\2\2\u017d\u0186\5@"+
		"!\22\u017e\u017f\7\63\2\2\u017f\u0186\5@!\21\u0180\u0182\5R*\2\u0181\u0183"+
		"\5@!\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0186\5P)\2\u0185\u0177\3\2\2\2\u0185\u017c\3\2\2\2\u0185\u017e\3\2\2"+
		"\2\u0185\u0180\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u01b6\3\2\2\2\u0187\u0188"+
		"\f\20\2\2\u0188\u0189\t\7\2\2\u0189\u01b5\5@!\21\u018a\u018b\f\17\2\2"+
		"\u018b\u018c\t\b\2\2\u018c\u01b5\5@!\20\u018d\u018e\f\16\2\2\u018e\u018f"+
		"\t\t\2\2\u018f\u01b5\5@!\17\u0190\u0191\f\r\2\2\u0191\u0192\t\n\2\2\u0192"+
		"\u01b5\5@!\16\u0193\u0194\f\f\2\2\u0194\u0195\t\13\2\2\u0195\u01b5\5@"+
		"!\r\u0196\u0197\f\13\2\2\u0197\u0198\t\f\2\2\u0198\u01b5\5@!\f\u0199\u019a"+
		"\f\n\2\2\u019a\u019b\7@\2\2\u019b\u01b5\5@!\13\u019c\u019d\f\t\2\2\u019d"+
		"\u019e\7A\2\2\u019e\u01b5\5@!\n\u019f\u01a0\f\b\2\2\u01a0\u01a1\7,\2\2"+
		"\u01a1\u01a2\5@!\2\u01a2\u01a3\7+\2\2\u01a3\u01a4\5@!\t\u01a4\u01b5\3"+
		"\2\2\2\u01a5\u01a6\f\6\2\2\u01a6\u01a7\7\22\2\2\u01a7\u01b5\5@!\7\u01a8"+
		"\u01a9\f\5\2\2\u01a9\u01aa\t\r\2\2\u01aa\u01b5\5@!\6\u01ab\u01ac\f\25"+
		"\2\2\u01ac\u01b5\5B\"\2\u01ad\u01ae\f\24\2\2\u01ae\u01b5\5D#\2\u01af\u01b0"+
		"\f\23\2\2\u01b0\u01b5\5F$\2\u01b1\u01b2\f\7\2\2\u01b2\u01b3\7\31\2\2\u01b3"+
		"\u01b5\7N\2\2\u01b4\u0187\3\2\2\2\u01b4\u018a\3\2\2\2\u01b4\u018d\3\2"+
		"\2\2\u01b4\u0190\3\2\2\2\u01b4\u0193\3\2\2\2\u01b4\u0196\3\2\2\2\u01b4"+
		"\u0199\3\2\2\2\u01b4\u019c\3\2\2\2\u01b4\u019f\3\2\2\2\u01b4\u01a5\3\2"+
		"\2\2\u01b4\u01a8\3\2\2\2\u01b4\u01ab\3\2\2\2\u01b4\u01ad\3\2\2\2\u01b4"+
		"\u01af\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7A\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01bb"+
		"\7\7\2\2\u01ba\u01bc\5H%\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\7\b\2\2\u01beC\3\2\2\2\u01bf\u01c0\7\5\2\2"+
		"\u01c0\u01c1\5@!\2\u01c1\u01c2\7\6\2\2\u01c2E\3\2\2\2\u01c3\u01c4\t\16"+
		"\2\2\u01c4\u01c5\7N\2\2\u01c5G\3\2\2\2\u01c6\u01cb\5@!\2\u01c7\u01c8\7"+
		"\'\2\2\u01c8\u01ca\5@!\2\u01c9\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01d0\7\'\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"I\3\2\2\2\u01d1\u01d2\7N\2\2\u01d2\u01d3\5B\"\2\u01d3K\3\2\2\2\u01d4\u01d5"+
		"\7N\2\2\u01d5\u01d7\t\16\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5J"+
		"&\2\u01dbM\3\2\2\2\u01dc\u01dd\7N\2\2\u01dd\u01df\t\16\2\2\u01de\u01dc"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\7N\2\2\u01e3O\3\2\2\2\u01e4\u01ef\5J&\2\u01e5"+
		"\u01ef\5L\'\2\u01e6\u01ef\5N(\2\u01e7\u01ef\7O\2\2\u01e8\u01ef\7P\2\2"+
		"\u01e9\u01ef\7Q\2\2\u01ea\u01ef\7N\2\2\u01eb\u01ef\5T+\2\u01ec\u01ef\7"+
		"%\2\2\u01ed\u01ef\7&\2\2\u01ee\u01e4\3\2\2\2\u01ee\u01e5\3\2\2\2\u01ee"+
		"\u01e6\3\2\2\2\u01ee\u01e7\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2"+
		"\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01efQ\3\2\2\2\u01f0\u01f2\7\33\2\2\u01f1\u01f3\5T+\2\u01f2"+
		"\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3S\3\2\2\2\u01f4\u01f7\7*\2\2\u01f5"+
		"\u01f8\7N\2\2\u01f6\u01f8\5\26\f\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f4\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\7*"+
		"\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ffU\3\2\2\2:Z\\gnv\u0080"+
		"\u0085\u0093\u009b\u00a2\u00aa\u00ad\u00b4\u00bb\u00be\u00c5\u00ca\u00d1"+
		"\u00d5\u00da\u00dd\u00e1\u00e9\u00ec\u00f0\u00f8\u00fc\u0100\u0108\u0116"+
		"\u011f\u012f\u0134\u0146\u014f\u0153\u0157\u0159\u0162\u0166\u016a\u0175"+
		"\u0182\u0185\u01b4\u01b6\u01bb\u01cb\u01cf\u01d8\u01e0\u01ee\u01f2\u01f7"+
		"\u01fb\u01fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}