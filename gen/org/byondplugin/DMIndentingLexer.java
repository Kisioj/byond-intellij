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
		MULTILINE_COMMENT=82, UNKNOWN_CHAR=83;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
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
		"MULTILINE_COMMENT", "UNKNOWN_CHAR"
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
		"MULTILINE_COMMENT", "UNKNOWN_CHAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u027e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6\u00d7\n\6\3\6\3\6\5\6\u00db\n\6\3\6\5\6\u00de\n\6\5\6"+
		"\u00e0\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3"+
		")\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3"+
		"?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3"+
		"G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\7L\u01d9\nL\fL\16L\u01dc"+
		"\13L\3M\3M\5M\u01e0\nM\3N\3N\7N\u01e4\nN\fN\16N\u01e7\13N\3N\3N\3O\3O"+
		"\3O\7O\u01ee\nO\fO\16O\u01f1\13O\3O\3O\3P\3P\3P\3P\7P\u01f9\nP\fP\16P"+
		"\u01fc\13P\3P\3P\3P\3Q\3Q\5Q\u0203\nQ\3R\3R\3S\3S\3S\3S\5S\u020b\nS\3"+
		"T\3T\5T\u020f\nT\3U\3U\3U\5U\u0214\nU\3V\3V\7V\u0218\nV\fV\16V\u021b\13"+
		"V\3V\5V\u021e\nV\3W\3W\3W\3W\6W\u0224\nW\rW\16W\u0225\3X\3X\6X\u022a\n"+
		"X\rX\16X\u022b\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\7]\u0239\n]\f]\16]\u023c"+
		"\13]\3]\5]\u023f\n]\3]\6]\u0242\n]\r]\16]\u0243\3]\3]\5]\u0248\n]\3^\6"+
		"^\u024b\n^\r^\16^\u024c\3_\3_\5_\u0251\n_\3_\6_\u0254\n_\r_\16_\u0255"+
		"\3`\6`\u0259\n`\r`\16`\u025a\3`\3`\3a\3a\3a\3a\3a\7a\u0264\na\fa\16a\u0267"+
		"\13a\3a\3a\3b\3b\3b\3b\7b\u026f\nb\fb\16b\u0272\13b\3b\3b\3b\5b\u0277"+
		"\nb\3b\3b\3c\3c\3c\3c\4\u01fa\u0270\2d\3\5\5\6\7\7\t\b\13\t\r\n\17\13"+
		"\21\f\23\r\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26\'\27)\30+\31"+
		"-\32/\33\61\34\63\35\65\36\67\379 ;!=\"?#A$C%E&G\'I(K)M*O\2Q+S,U-W.Y/"+
		"[\60]\61_\62a\63c\64e\65g\66i\67k8m9o:q;s<u=w>y?{@}A\177B\u0081C\u0083"+
		"D\u0085E\u0087F\u0089G\u008bH\u008dI\u008fJ\u0091K\u0093L\u0095M\u0097"+
		"N\u0099O\u009bP\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7Q\u00a9\2"+
		"\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb"+
		"\2\u00bd\2\u00bfR\u00c1S\u00c3T\u00c5U\3\2\16\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\6\2\f\f\16\17$$^^\3\2^^\3\2\62;\3\2\63;\5\2\62;CHch\3\2\629\4\2GGg"+
		"g\4\2--//\4\2\13\13\"\"\5\2\f\f\16\17^^\2\u028b\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\3\u00c7\3\2\2\2\5\u00ca\3\2\2\2\7\u00cd\3\2\2\2\t\u00d0"+
		"\3\2\2\2\13\u00df\3\2\2\2\r\u00e3\3\2\2\2\17\u00ea\3\2\2\2\21\u00ed\3"+
		"\2\2\2\23\u00f2\3\2\2\2\25\u00f6\3\2\2\2\27\u00fc\3\2\2\2\31\u00ff\3\2"+
		"\2\2\33\u0105\3\2\2\2\35\u010e\3\2\2\2\37\u0111\3\2\2\2!\u0115\3\2\2\2"+
		"#\u011b\3\2\2\2%\u011f\3\2\2\2\'\u0126\3\2\2\2)\u012a\3\2\2\2+\u012d\3"+
		"\2\2\2-\u0130\3\2\2\2/\u0135\3\2\2\2\61\u0139\3\2\2\2\63\u013f\3\2\2\2"+
		"\65\u0143\3\2\2\2\67\u0149\3\2\2\29\u014e\3\2\2\2;\u0153\3\2\2\2=\u015a"+
		"\3\2\2\2?\u0161\3\2\2\2A\u0165\3\2\2\2C\u0169\3\2\2\2E\u016c\3\2\2\2G"+
		"\u016e\3\2\2\2I\u0170\3\2\2\2K\u0172\3\2\2\2M\u0174\3\2\2\2O\u0176\3\2"+
		"\2\2Q\u0178\3\2\2\2S\u017a\3\2\2\2U\u017c\3\2\2\2W\u017e\3\2\2\2Y\u0180"+
		"\3\2\2\2[\u0182\3\2\2\2]\u0184\3\2\2\2_\u0187\3\2\2\2a\u018a\3\2\2\2c"+
		"\u018d\3\2\2\2e\u018f\3\2\2\2g\u0191\3\2\2\2i\u0194\3\2\2\2k\u0197\3\2"+
		"\2\2m\u019a\3\2\2\2o\u019d\3\2\2\2q\u01a0\3\2\2\2s\u01a3\3\2\2\2u\u01a6"+
		"\3\2\2\2w\u01a8\3\2\2\2y\u01aa\3\2\2\2{\u01ac\3\2\2\2}\u01af\3\2\2\2\177"+
		"\u01b2\3\2\2\2\u0081\u01b4\3\2\2\2\u0083\u01b7\3\2\2\2\u0085\u01ba\3\2"+
		"\2\2\u0087\u01bd\3\2\2\2\u0089\u01c0\3\2\2\2\u008b\u01c3\3\2\2\2\u008d"+
		"\u01c6\3\2\2\2\u008f\u01c9\3\2\2\2\u0091\u01cc\3\2\2\2\u0093\u01d0\3\2"+
		"\2\2\u0095\u01d4\3\2\2\2\u0097\u01d6\3\2\2\2\u0099\u01df\3\2\2\2\u009b"+
		"\u01e1\3\2\2\2\u009d\u01ea\3\2\2\2\u009f\u01f4\3\2\2\2\u00a1\u0202\3\2"+
		"\2\2\u00a3\u0204\3\2\2\2\u00a5\u020a\3\2\2\2\u00a7\u020e\3\2\2\2\u00a9"+
		"\u0213\3\2\2\2\u00ab\u021d\3\2\2\2\u00ad\u021f\3\2\2\2\u00af\u0227\3\2"+
		"\2\2\u00b1\u022d\3\2\2\2\u00b3\u022f\3\2\2\2\u00b5\u0231\3\2\2\2\u00b7"+
		"\u0233\3\2\2\2\u00b9\u0247\3\2\2\2\u00bb\u024a\3\2\2\2\u00bd\u024e\3\2"+
		"\2\2\u00bf\u0258\3\2\2\2\u00c1\u025e\3\2\2\2\u00c3\u026a\3\2\2\2\u00c5"+
		"\u027a\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8\u00c9\b\2\2\2\u00c9\4\3\2\2\2"+
		"\u00ca\u00cb\7_\2\2\u00cb\u00cc\b\3\3\2\u00cc\6\3\2\2\2\u00cd\u00ce\7"+
		"*\2\2\u00ce\u00cf\b\4\4\2\u00cf\b\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1\u00d2"+
		"\b\5\5\2\u00d2\n\3\2\2\2\u00d3\u00d4\6\6\2\2\u00d4\u00e0\5\u00bf`\2\u00d5"+
		"\u00d7\7\17\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00db\7\f\2\2\u00d9\u00db\4\16\17\2\u00da\u00d6\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00de\5\u00bf`\2\u00dd\u00dc"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d3\3\2\2\2\u00df"+
		"\u00da\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\6\6\2\u00e2\f\3\2\2\2"+
		"\u00e3\u00e4\7u\2\2\u00e4\u00e5\7y\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7j\2\2\u00e9\16\3\2\2\2\u00ea\u00eb"+
		"\7k\2\2\u00eb\u00ec\7h\2\2\u00ec\20\3\2\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1\22\3\2\2\2\u00f2\u00f3"+
		"\7h\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7t\2\2\u00f5\24\3\2\2\2\u00f6\u00f7"+
		"\7y\2\2\u00f7\u00f8\7j\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7n\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\26\3\2\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe\7q\2\2\u00fe"+
		"\30\3\2\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7t\2\2\u0101\u0102\7g\2\2\u0102"+
		"\u0103\7c\2\2\u0103\u0104\7m\2\2\u0104\32\3\2\2\2\u0105\u0106\7e\2\2\u0106"+
		"\u0107\7q\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\u010a\7k\2\2"+
		"\u010a\u010b\7p\2\2\u010b\u010c\7w\2\2\u010c\u010d\7g\2\2\u010d\34\3\2"+
		"\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110\36\3\2\2\2\u0111\u0112"+
		"\7x\2\2\u0112\u0113\7c\2\2\u0113\u0114\7t\2\2\u0114 \3\2\2\2\u0115\u0116"+
		"\7e\2\2\u0116\u0117\7q\2\2\u0117\u0118\7p\2\2\u0118\u0119\7u\2\2\u0119"+
		"\u011a\7v\2\2\u011a\"\3\2\2\2\u011b\u011c\7f\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7n\2\2\u011e$\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121"+
		"\u0122\7v\2\2\u0122\u0123\7w\2\2\u0123\u0124\7t\2\2\u0124\u0125\7p\2\2"+
		"\u0125&\3\2\2\2\u0126\u0127\7u\2\2\u0127\u0128\7g\2\2\u0128\u0129\7v\2"+
		"\2\u0129(\3\2\2\2\u012a\u012b\7v\2\2\u012b\u012c\7q\2\2\u012c*\3\2\2\2"+
		"\u012d\u012e\7c\2\2\u012e\u012f\7u\2\2\u012f,\3\2\2\2\u0130\u0131\7i\2"+
		"\2\u0131\u0132\7q\2\2\u0132\u0133\7v\2\2\u0133\u0134\7q\2\2\u0134.\3\2"+
		"\2\2\u0135\u0136\7p\2\2\u0136\u0137\7g\2\2\u0137\u0138\7y\2\2\u0138\60"+
		"\3\2\2\2\u0139\u013a\7u\2\2\u013a\u013b\7r\2\2\u013b\u013c\7c\2\2\u013c"+
		"\u013d\7y\2\2\u013d\u013e\7p\2\2\u013e\62\3\2\2\2\u013f\u0140\7v\2\2\u0140"+
		"\u0141\7t\2\2\u0141\u0142\7{\2\2\u0142\64\3\2\2\2\u0143\u0144\7e\2\2\u0144"+
		"\u0145\7c\2\2\u0145\u0146\7v\2\2\u0146\u0147\7e\2\2\u0147\u0148\7j\2\2"+
		"\u0148\66\3\2\2\2\u0149\u014a\7x\2\2\u014a\u014b\7g\2\2\u014b\u014c\7"+
		"t\2\2\u014c\u014d\7d\2\2\u014d8\3\2\2\2\u014e\u014f\7r\2\2\u014f\u0150"+
		"\7t\2\2\u0150\u0151\7q\2\2\u0151\u0152\7e\2\2\u0152:\3\2\2\2\u0153\u0154"+
		"\7i\2\2\u0154\u0155\7n\2\2\u0155\u0156\7q\2\2\u0156\u0157\7d\2\2\u0157"+
		"\u0158\7c\2\2\u0158\u0159\7n\2\2\u0159<\3\2\2\2\u015a\u015b\7u\2\2\u015b"+
		"\u015c\7v\2\2\u015c\u015d\7c\2\2\u015d\u015e\7v\2\2\u015e\u015f\7k\2\2"+
		"\u015f\u0160\7e\2\2\u0160>\3\2\2\2\u0161\u0162\7c\2\2\u0162\u0163\7t\2"+
		"\2\u0163\u0164\7i\2\2\u0164@\3\2\2\2\u0165\u0166\7v\2\2\u0166\u0167\7"+
		"o\2\2\u0167\u0168\7r\2\2\u0168B\3\2\2\2\u0169\u016a\7\60\2\2\u016a\u016b"+
		"\7\60\2\2\u016bD\3\2\2\2\u016c\u016d\7\60\2\2\u016dF\3\2\2\2\u016e\u016f"+
		"\7.\2\2\u016fH\3\2\2\2\u0170\u0171\7,\2\2\u0171J\3\2\2\2\u0172\u0173\7"+
		"\'\2\2\u0173L\3\2\2\2\u0174\u0175\7\61\2\2\u0175N\3\2\2\2\u0176\u0177"+
		"\7^\2\2\u0177P\3\2\2\2\u0178\u0179\7<\2\2\u0179R\3\2\2\2\u017a\u017b\7"+
		"A\2\2\u017bT\3\2\2\2\u017c\u017d\7\u0080\2\2\u017dV\3\2\2\2\u017e\u017f"+
		"\7#\2\2\u017fX\3\2\2\2\u0180\u0181\7/\2\2\u0181Z\3\2\2\2\u0182\u0183\7"+
		"-\2\2\u0183\\\3\2\2\2\u0184\u0185\7-\2\2\u0185\u0186\7-\2\2\u0186^\3\2"+
		"\2\2\u0187\u0188\7/\2\2\u0188\u0189\7/\2\2\u0189`\3\2\2\2\u018a\u018b"+
		"\7,\2\2\u018b\u018c\7,\2\2\u018cb\3\2\2\2\u018d\u018e\7>\2\2\u018ed\3"+
		"\2\2\2\u018f\u0190\7@\2\2\u0190f\3\2\2\2\u0191\u0192\7>\2\2\u0192\u0193"+
		"\7?\2\2\u0193h\3\2\2\2\u0194\u0195\7@\2\2\u0195\u0196\7?\2\2\u0196j\3"+
		"\2\2\2\u0197\u0198\7>\2\2\u0198\u0199\7>\2\2\u0199l\3\2\2\2\u019a\u019b"+
		"\7@\2\2\u019b\u019c\7@\2\2\u019cn\3\2\2\2\u019d\u019e\7?\2\2\u019e\u019f"+
		"\7?\2\2\u019fp\3\2\2\2\u01a0\u01a1\7#\2\2\u01a1\u01a2\7?\2\2\u01a2r\3"+
		"\2\2\2\u01a3\u01a4\7>\2\2\u01a4\u01a5\7@\2\2\u01a5t\3\2\2\2\u01a6\u01a7"+
		"\7(\2\2\u01a7v\3\2\2\2\u01a8\u01a9\7~\2\2\u01a9x\3\2\2\2\u01aa\u01ab\7"+
		"`\2\2\u01abz\3\2\2\2\u01ac\u01ad\7(\2\2\u01ad\u01ae\7(\2\2\u01ae|\3\2"+
		"\2\2\u01af\u01b0\7~\2\2\u01b0\u01b1\7~\2\2\u01b1~\3\2\2\2\u01b2\u01b3"+
		"\7?\2\2\u01b3\u0080\3\2\2\2\u01b4\u01b5\7-\2\2\u01b5\u01b6\7?\2\2\u01b6"+
		"\u0082\3\2\2\2\u01b7\u01b8\7/\2\2\u01b8\u01b9\7?\2\2\u01b9\u0084\3\2\2"+
		"\2\u01ba\u01bb\7,\2\2\u01bb\u01bc\7?\2\2\u01bc\u0086\3\2\2\2\u01bd\u01be"+
		"\7\61\2\2\u01be\u01bf\7?\2\2\u01bf\u0088\3\2\2\2\u01c0\u01c1\7\'\2\2\u01c1"+
		"\u01c2\7?\2\2\u01c2\u008a\3\2\2\2\u01c3\u01c4\7(\2\2\u01c4\u01c5\7?\2"+
		"\2\u01c5\u008c\3\2\2\2\u01c6\u01c7\7~\2\2\u01c7\u01c8\7?\2\2\u01c8\u008e"+
		"\3\2\2\2\u01c9\u01ca\7`\2\2\u01ca\u01cb\7?\2\2\u01cb\u0090\3\2\2\2\u01cc"+
		"\u01cd\7>\2\2\u01cd\u01ce\7>\2\2\u01ce\u01cf\7?\2\2\u01cf\u0092\3\2\2"+
		"\2\u01d0\u01d1\7@\2\2\u01d1\u01d2\7@\2\2\u01d2\u01d3\7?\2\2\u01d3\u0094"+
		"\3\2\2\2\u01d4\u01d5\7=\2\2\u01d5\u0096\3\2\2\2\u01d6\u01da\t\2\2\2\u01d7"+
		"\u01d9\t\3\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01db\u0098\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01e0\5\u009dO\2\u01de\u01e0\5\u009fP\2\u01df\u01dd\3\2\2\2\u01df\u01de"+
		"\3\2\2\2\u01e0\u009a\3\2\2\2\u01e1\u01e5\7)\2\2\u01e2\u01e4\n\4\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7)\2\2\u01e9"+
		"\u009c\3\2\2\2\u01ea\u01ef\7$\2\2\u01eb\u01ee\5\u00a5S\2\u01ec\u01ee\n"+
		"\4\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f2\u01f3\7$\2\2\u01f3\u009e\3\2\2\2\u01f4\u01f5\7}\2\2\u01f5\u01f6"+
		"\7$\2\2\u01f6\u01fa\3\2\2\2\u01f7\u01f9\5\u00a1Q\2\u01f8\u01f7\3\2\2\2"+
		"\u01f9\u01fc\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd"+
		"\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7$\2\2\u01fe\u01ff\7\177\2\2"+
		"\u01ff\u00a0\3\2\2\2\u0200\u0203\5\u00a3R\2\u0201\u0203\5\u00a5S\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u0203\u00a2\3\2\2\2\u0204\u0205\n\5"+
		"\2\2\u0205\u00a4\3\2\2\2\u0206\u0207\7^\2\2\u0207\u020b\13\2\2\2\u0208"+
		"\u0209\7^\2\2\u0209\u020b\5\13\6\2\u020a\u0206\3\2\2\2\u020a\u0208\3\2"+
		"\2\2\u020b\u00a6\3\2\2\2\u020c\u020f\5\u00a9U\2\u020d\u020f\5\u00b9]\2"+
		"\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u00a8\3\2\2\2\u0210\u0214"+
		"\5\u00abV\2\u0211\u0214\5\u00adW\2\u0212\u0214\5\u00afX\2\u0213\u0210"+
		"\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u00aa\3\2\2\2\u0215"+
		"\u0219\5\u00b3Z\2\u0216\u0218\5\u00b1Y\2\u0217\u0216\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021e\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021e\7\62\2\2\u021d\u0215\3\2\2\2\u021d\u021c\3"+
		"\2\2\2\u021e\u00ac\3\2\2\2\u021f\u0220\7\62\2\2\u0220\u0221\7z\2\2\u0221"+
		"\u0223\3\2\2\2\u0222\u0224\5\u00b5[\2\u0223\u0222\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u00ae\3\2\2\2\u0227"+
		"\u0229\7\62\2\2\u0228\u022a\5\u00b7\\\2\u0229\u0228\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u00b0\3\2\2\2\u022d"+
		"\u022e\t\6\2\2\u022e\u00b2\3\2\2\2\u022f\u0230\t\7\2\2\u0230\u00b4\3\2"+
		"\2\2\u0231\u0232\t\b\2\2\u0232\u00b6\3\2\2\2\u0233\u0234\t\t\2\2\u0234"+
		"\u00b8\3\2\2\2\u0235\u0236\5\u00abV\2\u0236\u023a\7\60\2\2\u0237\u0239"+
		"\5\u00b1Y\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023f"+
		"\5\u00bd_\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0248\3\2\2"+
		"\2\u0240\u0242\5\u00b1Y\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5\u00bd"+
		"_\2\u0246\u0248\3\2\2\2\u0247\u0235\3\2\2\2\u0247\u0241\3\2\2\2\u0248"+
		"\u00ba\3\2\2\2\u0249\u024b\5\u00b1Y\2\u024a\u0249\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u00bc\3\2\2\2\u024e"+
		"\u0250\t\n\2\2\u024f\u0251\t\13\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3"+
		"\2\2\2\u0251\u0253\3\2\2\2\u0252\u0254\5\u00b1Y\2\u0253\u0252\3\2\2\2"+
		"\u0254\u0255\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u00be"+
		"\3\2\2\2\u0257\u0259\t\f\2\2\u0258\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\b`"+
		"\7\2\u025d\u00c0\3\2\2\2\u025e\u025f\7\61\2\2\u025f\u0260\7\61\2\2\u0260"+
		"\u0265\3\2\2\2\u0261\u0264\5\u00a5S\2\u0262\u0264\n\r\2\2\u0263\u0261"+
		"\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\ba"+
		"\7\2\u0269\u00c2\3\2\2\2\u026a\u026b\7\61\2\2\u026b\u026c\7,\2\2\u026c"+
		"\u0270\3\2\2\2\u026d\u026f\13\2\2\2\u026e\u026d\3\2\2\2\u026f\u0272\3"+
		"\2\2\2\u0270\u0271\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0276\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0274\7,\2\2\u0274\u0277\7\61\2\2\u0275\u0277\7\2"+
		"\2\3\u0276\u0273\3\2\2\2\u0276\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u0279\bb\7\2\u0279\u00c4\3\2\2\2\u027a\u027b\13\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u027d\bc\7\2\u027d\u00c6\3\2\2\2!\2\u00d6\u00da\u00dd\u00df"+
		"\u01da\u01df\u01e5\u01ed\u01ef\u01fa\u0202\u020a\u020e\u0213\u0219\u021d"+
		"\u0225\u022b\u023a\u023e\u0243\u0247\u024c\u0250\u0255\u025a\u0263\u0265"+
		"\u0270\u0276\b\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}