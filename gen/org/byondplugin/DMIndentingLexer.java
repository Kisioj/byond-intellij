// Generated from C:\Users\kisio\IdeaProjects\byond-intellij\src\org\byondplugin\grammar\DMIndentingLexer.g4 by ANTLR 4.7.1
package org.byondplugin;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMIndentingLexer extends Lexer {
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
		MULTILINE_COMMENT_MODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "MULTILINE_COMMENT_MODE"
	};

	public static final String[] ruleNames = {
		"OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", "CLOSE_PAREN", "NEWLINE", "SWITCH", 
		"IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", "IN", "VAR", 
		"CONST", "DEL", "RETURN", "SET", "TO", "AS", "GOTO", "NEW", "SPAWN", "TRY", 
		"CATCH", "VERB", "PROC", "GLOBAL", "STATIC", "ARG", "TMP", "DOUBLE_DOT", 
		"DOT", "COMMA", "STAR", "PERCENT", "SLASH", "BACKSLASH", "COLON", "QUESTION_MARK", 
		"NOT_OP", "NEG_OP", "MINUS", "PLUS", "INCREMENT", "DECREMENT", "POWER", 
		"LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", "GREATER_THAN_OR_EQUAL", 
		"SHIFT_LEFT", "SHIFT_RIGHT", "EQUAL", "NOT_EQUAL", "NOT_EQUAL_2", "BIT_AND", 
		"BIT_OR", "BIT_XOR", "LOG_AND", "LOG_OR", "ASSIGN", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "BIT_AND_ASSIGN", "BIT_OR_ASSIGN", 
		"XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "SEMICOLON", 
		"NAME", "STRING_LITERAL", "ICON_PATH", "SHORT_STRING", "LONG_STRING", 
		"LONG_STRING_ITEM", "LONG_STRING_CHAR", "STRING_ESCAPE_SEQ", "NUMBER", 
		"INTEGER", "DEC", "HEX", "OCT", "DIGIT", "NON_ZERO_DIGIT", "HEX_DIGIT", 
		"OCT_DIGIT", "FLOAT", "INT_PART", "EXPONENT", "SPACES", "INLINE_COMMENT", 
		"MULTILINE_COMMENT_START", "UNKNOWN_CHAR", "MULTILINE_COMMENT_START_NESTED", 
		"MULTILINE_COMMENT", "IGNORE"
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


	    private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	    private boolean reachedEOF = false;
	    private int indent = 0;
	    private int opened = 0;

	    @Override
	    public void reset() {
	        super.reset();

	        tokens.clear();
	        reachedEOF = false;
	        indent = 0;
	        opened = 0;
	    }

	    @Override
	    public void emit(Token token) {
	        super.setToken(token);
	        tokens.offer(token);
	    }

	    @Override
	    public Token nextToken() {

	        if (this.reachedEOF) {
	            return tokens.poll();
	        }

	        if (_input.LA(1) == DMParser.EOF && this.indent > 0) {

	            this.reachedEOF = true;

	            CommonToken ct = commonToken(NEWLINE);
	            ct.setText("<NEWLINE - EOF>");
	            this.emit(ct);

	            while (this.indent > 0) {
	                ct = commonToken(DMParser.DEDENT);
	                ct.setText("<DEDENT - EOF>");
	                this.emit(ct);
	                this.indent--;
	            }

	            this.emit(commonToken(DMParser.EOF));
	        }

	        Token next = super.nextToken();
	        return tokens.isEmpty() ? next : tokens.poll();
	    }

	    private void emitHiddenToken(String text) {
	        int start =  this.getCharIndex();
	        int stop = start + text.length() - 1;
	        CommonToken token =  new CommonToken(this._tokenFactorySourcePair, NEWLINE, HIDDEN, start, stop);
	        emit(token);
	    }

	    private CommonToken commonToken(int type, String text, int start) {
	        int stop = start + text.length() - 1;
	        return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	    }

	    private CommonToken commonToken(int type) {
	        int start =  this.getCharIndex();
	        int stop = start - 1;
	        CommonToken token = new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	        return token;
	    }

	    boolean atStartOfInput() {
	        return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	    }


	public DMIndentingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DMIndentingLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			opened++;
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			opened--;
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			opened++;
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			opened--;
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			        String newLine = getText().replaceAll("[^\r\n\f]+", "");
			        String spaces = getText().replaceAll("[\r\n\f]+", "");
			        CommonToken ct;

			        int next = _input.LA(1);
			        if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == DMParser.EOF) {
			            ct = commonToken(SPACES, getText(), this._tokenStartCharIndex);
			            ct.setLine(this._tokenStartLine);
			            ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
			            ct.setChannel(HIDDEN);
			            ct.setText("<SPACESx>");
			            emit(ct);

			        } else if (next == '/' ) {
			            next = _input.LA(2);
			            if (next == '/' || next == '*') {
			                ct = commonToken(SPACES, getText(), this._tokenStartCharIndex);
			                ct.setLine(this._tokenStartLine);
			                ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
			                ct.setChannel(HIDDEN);
			                emit(ct);
			            }
			        }
			        else {
			            int startIndex = this._tokenStartCharIndex;
			            int startIndexSpaces = startIndex + newLine.length();

			            ct = commonToken(NEWLINE, newLine, startIndex);
			            ct.setLine(this._tokenStartLine);
			            ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
			            ct.setText("<NEWLINEz>");
			            emit(ct);


			            int ws_count = spaces.length();

			            if (ws_count == this.indent) {
			                ct = commonToken(SPACES, spaces, startIndexSpaces);
			                ct.setText("<SPACES>");
			                ct.setCharPositionInLine(0);
			                ct.setChannel(HIDDEN);
			                emit(ct);

			            } else if (ws_count > this.indent) {
			                for(int i=0; i < (ws_count-this.indent); ++i) {
			                    ct = commonToken(DMParser.INDENT, spaces, startIndexSpaces + i);
			                    ct.setText("<INDENT>");
			                    ct.setCharPositionInLine(0);
			                    emit(ct);
			                }
			                this.indent = ws_count;

			            } else {
			                for(int i=0; i < (this.indent-ws_count); ++i) {
			                    ct = commonToken(DMParser.DEDENT, spaces, startIndexSpaces);
			                    ct.setText("<DEDENT>");
			                    ct.setCharPositionInLine(0);
			                    emit(ct);
			                }
			                this.indent = ws_count;

			            }

			        }

			    
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u028d\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00de\n\6\3\6\3\6\5\6\u00e2\n\6\3"+
		"\6\5\6\u00e5\n\6\5\6\u00e7\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<"+
		"\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E"+
		"\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L"+
		"\7L\u01e0\nL\fL\16L\u01e3\13L\3M\3M\5M\u01e7\nM\3N\3N\7N\u01eb\nN\fN\16"+
		"N\u01ee\13N\3N\3N\3O\3O\3O\7O\u01f5\nO\fO\16O\u01f8\13O\3O\3O\3P\3P\3"+
		"P\3P\7P\u0200\nP\fP\16P\u0203\13P\3P\3P\3P\3Q\3Q\5Q\u020a\nQ\3R\3R\3S"+
		"\3S\3S\3S\5S\u0212\nS\3T\3T\5T\u0216\nT\3U\3U\3U\5U\u021b\nU\3V\3V\7V"+
		"\u021f\nV\fV\16V\u0222\13V\3V\5V\u0225\nV\3W\3W\3W\3W\6W\u022b\nW\rW\16"+
		"W\u022c\3X\3X\6X\u0231\nX\rX\16X\u0232\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3"+
		"]\3]\7]\u0240\n]\f]\16]\u0243\13]\3]\5]\u0246\n]\3]\6]\u0249\n]\r]\16"+
		"]\u024a\3]\3]\5]\u024f\n]\3^\6^\u0252\n^\r^\16^\u0253\3_\3_\5_\u0258\n"+
		"_\3_\6_\u025b\n_\r_\16_\u025c\3`\6`\u0260\n`\r`\16`\u0261\3`\3`\3a\3a"+
		"\3a\3a\3a\7a\u026b\na\fa\16a\u026e\13a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3"+
		"c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\5e\u0285\ne\3e\3e\3e\3f\3f\3f\3f\3\u0201"+
		"\2g\4\5\6\6\b\7\n\b\f\t\16\n\20\13\22\f\24\r\26\16\30\17\32\20\34\21\36"+
		"\22 \23\"\24$\25&\26(\27*\30,\31.\32\60\33\62\34\64\35\66\368\37: <!>"+
		"\"@#B$D%F&H\'J(L)N*P\2R+T,V-X.Z/\\\60^\61`\62b\63d\64f\65h\66j\67l8n9"+
		"p:r;t<v=x>z?|@~A\u0080B\u0082C\u0084D\u0086E\u0088F\u008aG\u008cH\u008e"+
		"I\u0090J\u0092K\u0094L\u0096M\u0098N\u009aO\u009cP\u009e\2\u00a0\2\u00a2"+
		"\2\u00a4\2\u00a6\2\u00a8Q\u00aa\2\u00ac\2\u00ae\2\u00b0\2\u00b2\2\u00b4"+
		"\2\u00b6\2\u00b8\2\u00ba\2\u00bc\2\u00be\2\u00c0R\u00c2S\u00c4V\u00c6"+
		"T\u00c8\2\u00caU\u00cc\2\4\2\3\16\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\16"+
		"\17$$^^\3\2^^\3\2\62;\3\2\63;\5\2\62;CHch\3\2\629\4\2GGgg\4\2--//\4\2"+
		"\13\13\"\"\5\2\f\f\16\17^^\2\u0298\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2"+
		"\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3"+
		"\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2"+
		"\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2"+
		"\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2"+
		"\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2"+
		"\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2R"+
		"\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3"+
		"\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2"+
		"\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2"+
		"x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2\u0082\3\2"+
		"\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a\3\2\2\2\2"+
		"\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2\2\2\u0094"+
		"\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2\2\2\u009a\3\2\2\2\2\u009c\3\2\2"+
		"\2\2\u00a8\3\2\2\2\2\u00c0\3\2\2\2\2\u00c2\3\2\2\2\2\u00c4\3\2\2\2\2\u00c6"+
		"\3\2\2\2\3\u00c8\3\2\2\2\3\u00ca\3\2\2\2\3\u00cc\3\2\2\2\4\u00ce\3\2\2"+
		"\2\6\u00d1\3\2\2\2\b\u00d4\3\2\2\2\n\u00d7\3\2\2\2\f\u00e6\3\2\2\2\16"+
		"\u00ea\3\2\2\2\20\u00f1\3\2\2\2\22\u00f4\3\2\2\2\24\u00f9\3\2\2\2\26\u00fd"+
		"\3\2\2\2\30\u0103\3\2\2\2\32\u0106\3\2\2\2\34\u010c\3\2\2\2\36\u0115\3"+
		"\2\2\2 \u0118\3\2\2\2\"\u011c\3\2\2\2$\u0122\3\2\2\2&\u0126\3\2\2\2(\u012d"+
		"\3\2\2\2*\u0131\3\2\2\2,\u0134\3\2\2\2.\u0137\3\2\2\2\60\u013c\3\2\2\2"+
		"\62\u0140\3\2\2\2\64\u0146\3\2\2\2\66\u014a\3\2\2\28\u0150\3\2\2\2:\u0155"+
		"\3\2\2\2<\u015a\3\2\2\2>\u0161\3\2\2\2@\u0168\3\2\2\2B\u016c\3\2\2\2D"+
		"\u0170\3\2\2\2F\u0173\3\2\2\2H\u0175\3\2\2\2J\u0177\3\2\2\2L\u0179\3\2"+
		"\2\2N\u017b\3\2\2\2P\u017d\3\2\2\2R\u017f\3\2\2\2T\u0181\3\2\2\2V\u0183"+
		"\3\2\2\2X\u0185\3\2\2\2Z\u0187\3\2\2\2\\\u0189\3\2\2\2^\u018b\3\2\2\2"+
		"`\u018e\3\2\2\2b\u0191\3\2\2\2d\u0194\3\2\2\2f\u0196\3\2\2\2h\u0198\3"+
		"\2\2\2j\u019b\3\2\2\2l\u019e\3\2\2\2n\u01a1\3\2\2\2p\u01a4\3\2\2\2r\u01a7"+
		"\3\2\2\2t\u01aa\3\2\2\2v\u01ad\3\2\2\2x\u01af\3\2\2\2z\u01b1\3\2\2\2|"+
		"\u01b3\3\2\2\2~\u01b6\3\2\2\2\u0080\u01b9\3\2\2\2\u0082\u01bb\3\2\2\2"+
		"\u0084\u01be\3\2\2\2\u0086\u01c1\3\2\2\2\u0088\u01c4\3\2\2\2\u008a\u01c7"+
		"\3\2\2\2\u008c\u01ca\3\2\2\2\u008e\u01cd\3\2\2\2\u0090\u01d0\3\2\2\2\u0092"+
		"\u01d3\3\2\2\2\u0094\u01d7\3\2\2\2\u0096\u01db\3\2\2\2\u0098\u01dd\3\2"+
		"\2\2\u009a\u01e6\3\2\2\2\u009c\u01e8\3\2\2\2\u009e\u01f1\3\2\2\2\u00a0"+
		"\u01fb\3\2\2\2\u00a2\u0209\3\2\2\2\u00a4\u020b\3\2\2\2\u00a6\u0211\3\2"+
		"\2\2\u00a8\u0215\3\2\2\2\u00aa\u021a\3\2\2\2\u00ac\u0224\3\2\2\2\u00ae"+
		"\u0226\3\2\2\2\u00b0\u022e\3\2\2\2\u00b2\u0234\3\2\2\2\u00b4\u0236\3\2"+
		"\2\2\u00b6\u0238\3\2\2\2\u00b8\u023a\3\2\2\2\u00ba\u024e\3\2\2\2\u00bc"+
		"\u0251\3\2\2\2\u00be\u0255\3\2\2\2\u00c0\u025f\3\2\2\2\u00c2\u0265\3\2"+
		"\2\2\u00c4\u0271\3\2\2\2\u00c6\u0277\3\2\2\2\u00c8\u027b\3\2\2\2\u00ca"+
		"\u0284\3\2\2\2\u00cc\u0289\3\2\2\2\u00ce\u00cf\7]\2\2\u00cf\u00d0\b\2"+
		"\2\2\u00d0\5\3\2\2\2\u00d1\u00d2\7_\2\2\u00d2\u00d3\b\3\3\2\u00d3\7\3"+
		"\2\2\2\u00d4\u00d5\7*\2\2\u00d5\u00d6\b\4\4\2\u00d6\t\3\2\2\2\u00d7\u00d8"+
		"\7+\2\2\u00d8\u00d9\b\5\5\2\u00d9\13\3\2\2\2\u00da\u00db\6\6\2\2\u00db"+
		"\u00e7\5\u00c0`\2\u00dc\u00de\7\17\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e2\7\f\2\2\u00e0\u00e2\4\16\17\2"+
		"\u00e1\u00dd\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e5"+
		"\5\u00c0`\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2"+
		"\2\u00e6\u00da\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\b\6\6\2\u00e9\r\3\2\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7j\2\2\u00f0"+
		"\17\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3\21\3\2\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\23\3\2\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7"+
		"t\2\2\u00fc\25\3\2\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100"+
		"\7k\2\2\u0100\u0101\7n\2\2\u0101\u0102\7g\2\2\u0102\27\3\2\2\2\u0103\u0104"+
		"\7f\2\2\u0104\u0105\7q\2\2\u0105\31\3\2\2\2\u0106\u0107\7d\2\2\u0107\u0108"+
		"\7t\2\2\u0108\u0109\7g\2\2\u0109\u010a\7c\2\2\u010a\u010b\7m\2\2\u010b"+
		"\33\3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010f"+
		"\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2\u0112\u0113\7w\2\2"+
		"\u0113\u0114\7g\2\2\u0114\35\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7"+
		"p\2\2\u0117\37\3\2\2\2\u0118\u0119\7x\2\2\u0119\u011a\7c\2\2\u011a\u011b"+
		"\7t\2\2\u011b!\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e\7q\2\2\u011e\u011f"+
		"\7p\2\2\u011f\u0120\7u\2\2\u0120\u0121\7v\2\2\u0121#\3\2\2\2\u0122\u0123"+
		"\7f\2\2\u0123\u0124\7g\2\2\u0124\u0125\7n\2\2\u0125%\3\2\2\2\u0126\u0127"+
		"\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7v\2\2\u0129\u012a\7w\2\2\u012a"+
		"\u012b\7t\2\2\u012b\u012c\7p\2\2\u012c\'\3\2\2\2\u012d\u012e\7u\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130)\3\2\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7q\2\2\u0133+\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136\7u\2\2\u0136"+
		"-\3\2\2\2\u0137\u0138\7i\2\2\u0138\u0139\7q\2\2\u0139\u013a\7v\2\2\u013a"+
		"\u013b\7q\2\2\u013b/\3\2\2\2\u013c\u013d\7p\2\2\u013d\u013e\7g\2\2\u013e"+
		"\u013f\7y\2\2\u013f\61\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142\7r\2\2\u0142"+
		"\u0143\7c\2\2\u0143\u0144\7y\2\2\u0144\u0145\7p\2\2\u0145\63\3\2\2\2\u0146"+
		"\u0147\7v\2\2\u0147\u0148\7t\2\2\u0148\u0149\7{\2\2\u0149\65\3\2\2\2\u014a"+
		"\u014b\7e\2\2\u014b\u014c\7c\2\2\u014c\u014d\7v\2\2\u014d\u014e\7e\2\2"+
		"\u014e\u014f\7j\2\2\u014f\67\3\2\2\2\u0150\u0151\7x\2\2\u0151\u0152\7"+
		"g\2\2\u0152\u0153\7t\2\2\u0153\u0154\7d\2\2\u01549\3\2\2\2\u0155\u0156"+
		"\7r\2\2\u0156\u0157\7t\2\2\u0157\u0158\7q\2\2\u0158\u0159\7e\2\2\u0159"+
		";\3\2\2\2\u015a\u015b\7i\2\2\u015b\u015c\7n\2\2\u015c\u015d\7q\2\2\u015d"+
		"\u015e\7d\2\2\u015e\u015f\7c\2\2\u015f\u0160\7n\2\2\u0160=\3\2\2\2\u0161"+
		"\u0162\7u\2\2\u0162\u0163\7v\2\2\u0163\u0164\7c\2\2\u0164\u0165\7v\2\2"+
		"\u0165\u0166\7k\2\2\u0166\u0167\7e\2\2\u0167?\3\2\2\2\u0168\u0169\7c\2"+
		"\2\u0169\u016a\7t\2\2\u016a\u016b\7i\2\2\u016bA\3\2\2\2\u016c\u016d\7"+
		"v\2\2\u016d\u016e\7o\2\2\u016e\u016f\7r\2\2\u016fC\3\2\2\2\u0170\u0171"+
		"\7\60\2\2\u0171\u0172\7\60\2\2\u0172E\3\2\2\2\u0173\u0174\7\60\2\2\u0174"+
		"G\3\2\2\2\u0175\u0176\7.\2\2\u0176I\3\2\2\2\u0177\u0178\7,\2\2\u0178K"+
		"\3\2\2\2\u0179\u017a\7\'\2\2\u017aM\3\2\2\2\u017b\u017c\7\61\2\2\u017c"+
		"O\3\2\2\2\u017d\u017e\7^\2\2\u017eQ\3\2\2\2\u017f\u0180\7<\2\2\u0180S"+
		"\3\2\2\2\u0181\u0182\7A\2\2\u0182U\3\2\2\2\u0183\u0184\7\u0080\2\2\u0184"+
		"W\3\2\2\2\u0185\u0186\7#\2\2\u0186Y\3\2\2\2\u0187\u0188\7/\2\2\u0188["+
		"\3\2\2\2\u0189\u018a\7-\2\2\u018a]\3\2\2\2\u018b\u018c\7-\2\2\u018c\u018d"+
		"\7-\2\2\u018d_\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190\7/\2\2\u0190a\3"+
		"\2\2\2\u0191\u0192\7,\2\2\u0192\u0193\7,\2\2\u0193c\3\2\2\2\u0194\u0195"+
		"\7>\2\2\u0195e\3\2\2\2\u0196\u0197\7@\2\2\u0197g\3\2\2\2\u0198\u0199\7"+
		">\2\2\u0199\u019a\7?\2\2\u019ai\3\2\2\2\u019b\u019c\7@\2\2\u019c\u019d"+
		"\7?\2\2\u019dk\3\2\2\2\u019e\u019f\7>\2\2\u019f\u01a0\7>\2\2\u01a0m\3"+
		"\2\2\2\u01a1\u01a2\7@\2\2\u01a2\u01a3\7@\2\2\u01a3o\3\2\2\2\u01a4\u01a5"+
		"\7?\2\2\u01a5\u01a6\7?\2\2\u01a6q\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01a9"+
		"\7?\2\2\u01a9s\3\2\2\2\u01aa\u01ab\7>\2\2\u01ab\u01ac\7@\2\2\u01acu\3"+
		"\2\2\2\u01ad\u01ae\7(\2\2\u01aew\3\2\2\2\u01af\u01b0\7~\2\2\u01b0y\3\2"+
		"\2\2\u01b1\u01b2\7`\2\2\u01b2{\3\2\2\2\u01b3\u01b4\7(\2\2\u01b4\u01b5"+
		"\7(\2\2\u01b5}\3\2\2\2\u01b6\u01b7\7~\2\2\u01b7\u01b8\7~\2\2\u01b8\177"+
		"\3\2\2\2\u01b9\u01ba\7?\2\2\u01ba\u0081\3\2\2\2\u01bb\u01bc\7-\2\2\u01bc"+
		"\u01bd\7?\2\2\u01bd\u0083\3\2\2\2\u01be\u01bf\7/\2\2\u01bf\u01c0\7?\2"+
		"\2\u01c0\u0085\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3\7?\2\2\u01c3\u0087"+
		"\3\2\2\2\u01c4\u01c5\7\61\2\2\u01c5\u01c6\7?\2\2\u01c6\u0089\3\2\2\2\u01c7"+
		"\u01c8\7\'\2\2\u01c8\u01c9\7?\2\2\u01c9\u008b\3\2\2\2\u01ca\u01cb\7(\2"+
		"\2\u01cb\u01cc\7?\2\2\u01cc\u008d\3\2\2\2\u01cd\u01ce\7~\2\2\u01ce\u01cf"+
		"\7?\2\2\u01cf\u008f\3\2\2\2\u01d0\u01d1\7`\2\2\u01d1\u01d2\7?\2\2\u01d2"+
		"\u0091\3\2\2\2\u01d3\u01d4\7>\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d6\7?\2"+
		"\2\u01d6\u0093\3\2\2\2\u01d7\u01d8\7@\2\2\u01d8\u01d9\7@\2\2\u01d9\u01da"+
		"\7?\2\2\u01da\u0095\3\2\2\2\u01db\u01dc\7=\2\2\u01dc\u0097\3\2\2\2\u01dd"+
		"\u01e1\t\2\2\2\u01de\u01e0\t\3\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u0099\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e7\5\u009eO\2\u01e5\u01e7\5\u00a0P\2\u01e6\u01e4"+
		"\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7\u009b\3\2\2\2\u01e8\u01ec\7)\2\2\u01e9"+
		"\u01eb\n\4\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f0\7)\2\2\u01f0\u009d\3\2\2\2\u01f1\u01f6\7$\2\2\u01f2\u01f5\5\u00a6"+
		"S\2\u01f3\u01f5\n\4\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7$\2\2\u01fa\u009f\3\2\2\2\u01fb"+
		"\u01fc\7}\2\2\u01fc\u01fd\7$\2\2\u01fd\u0201\3\2\2\2\u01fe\u0200\5\u00a2"+
		"Q\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u0202\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7$"+
		"\2\2\u0205\u0206\7\177\2\2\u0206\u00a1\3\2\2\2\u0207\u020a\5\u00a4R\2"+
		"\u0208\u020a\5\u00a6S\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a"+
		"\u00a3\3\2\2\2\u020b\u020c\n\5\2\2\u020c\u00a5\3\2\2\2\u020d\u020e\7^"+
		"\2\2\u020e\u0212\13\2\2\2\u020f\u0210\7^\2\2\u0210\u0212\5\f\6\2\u0211"+
		"\u020d\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u00a7\3\2\2\2\u0213\u0216\5\u00aa"+
		"U\2\u0214\u0216\5\u00ba]\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\u00a9\3\2\2\2\u0217\u021b\5\u00acV\2\u0218\u021b\5\u00aeW\2\u0219\u021b"+
		"\5\u00b0X\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2"+
		"\2\u021b\u00ab\3\2\2\2\u021c\u0220\5\u00b4Z\2\u021d\u021f\5\u00b2Y\2\u021e"+
		"\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0225\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\7\62\2\2\u0224"+
		"\u021c\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u00ad\3\2\2\2\u0226\u0227\7\62"+
		"\2\2\u0227\u0228\7z\2\2\u0228\u022a\3\2\2\2\u0229\u022b\5\u00b6[\2\u022a"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d\u00af\3\2\2\2\u022e\u0230\7\62\2\2\u022f\u0231\5\u00b8\\\2"+
		"\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u00b1\3\2\2\2\u0234\u0235\t\6\2\2\u0235\u00b3\3\2\2\2\u0236"+
		"\u0237\t\7\2\2\u0237\u00b5\3\2\2\2\u0238\u0239\t\b\2\2\u0239\u00b7\3\2"+
		"\2\2\u023a\u023b\t\t\2\2\u023b\u00b9\3\2\2\2\u023c\u023d\5\u00acV\2\u023d"+
		"\u0241\7\60\2\2\u023e\u0240\5\u00b2Y\2\u023f\u023e\3\2\2\2\u0240\u0243"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0245\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0246\5\u00be_\2\u0245\u0244\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246\u024f\3\2\2\2\u0247\u0249\5\u00b2Y\2\u0248\u0247\3\2\2"+
		"\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024d\5\u00be_\2\u024d\u024f\3\2\2\2\u024e\u023c\3\2\2"+
		"\2\u024e\u0248\3\2\2\2\u024f\u00bb\3\2\2\2\u0250\u0252\5\u00b2Y\2\u0251"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u00bd\3\2\2\2\u0255\u0257\t\n\2\2\u0256\u0258\t\13\2\2\u0257"+
		"\u0256\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u025b\5\u00b2"+
		"Y\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u00bf\3\2\2\2\u025e\u0260\t\f\2\2\u025f\u025e\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\b`\7\2\u0264\u00c1\3\2\2\2\u0265\u0266\7\61"+
		"\2\2\u0266\u0267\7\61\2\2\u0267\u026c\3\2\2\2\u0268\u026b\5\u00a6S\2\u0269"+
		"\u026b\n\r\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0270\ba\7\2\u0270\u00c3\3\2\2\2\u0271\u0272\7\61"+
		"\2\2\u0272\u0273\7,\2\2\u0273\u0274\3\2\2\2\u0274\u0275\bb\b\2\u0275\u0276"+
		"\bb\t\2\u0276\u00c5\3\2\2\2\u0277\u0278\13\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027a\bc\7\2\u027a\u00c7\3\2\2\2\u027b\u027c\7\61\2\2\u027c\u027d\7,"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027f\bd\b\2\u027f\u0280\bd\t\2\u0280\u00c9"+
		"\3\2\2\2\u0281\u0282\7,\2\2\u0282\u0285\7\61\2\2\u0283\u0285\7\2\2\3\u0284"+
		"\u0281\3\2\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\be"+
		"\n\2\u0287\u0288\be\7\2\u0288\u00cb\3\2\2\2\u0289\u028a\13\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028c\bf\b\2\u028c\u00cd\3\2\2\2!\2\3\u00dd\u00e1"+
		"\u00e4\u00e6\u01e1\u01e6\u01ec\u01f4\u01f6\u0201\u0209\u0211\u0215\u021a"+
		"\u0220\u0224\u022c\u0232\u0241\u0245\u024a\u024e\u0253\u0257\u025c\u0261"+
		"\u026a\u026c\u0284\13\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\2\3\2\5\2\2\7\3\2"+
		"\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}