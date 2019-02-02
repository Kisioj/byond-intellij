// Generated from DM.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DMLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INDENT", "DEDENT", "NEWLINE", "SWITCH", "IF", "ELSE", "FOR", "WHILE", 
		"DO", "BREAK", "CONTINUE", "IN", "VAR", "CONST", "DEL", "RETURN", "SET", 
		"TO", "AS", "GOTO", "NEW", "SPAWN", "TRY", "CATCH", "VERB", "PROC", "GLOBAL", 
		"STATIC", "ARG", "TMP", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", "CLOSE_PAREN", 
		"DOUBLE_DOT", "DOT", "COMMA", "STAR", "PERCENT", "SLASH", "BACKSLASH", 
		"COLON", "QUESTION_MARK", "NOT_OP", "NEG_OP", "MINUS", "PLUS", "INCREMENT", 
		"DECREMENT", "POWER", "LESS_THAN", "GREATER_THAN", "LESS_THAN_OR_EQUAL", 
		"GREATER_THAN_OR_EQUAL", "SHIFT_LEFT", "SHIFT_RIGHT", "EQUAL", "NOT_EQUAL", 
		"NOT_EQUAL_2", "BIT_AND", "BIT_OR", "BIT_XOR", "LOG_AND", "LOG_OR", "ASSIGN", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"BIT_AND_ASSIGN", "BIT_OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", 
		"RIGHT_SHIFT_ASSIGN", "SEMICOLON", "NAME", "STRING_LITERAL", "ICON_PATH", 
		"SHORT_STRING", "LONG_STRING", "LONG_STRING_ITEM", "LONG_STRING_CHAR", 
		"STRING_ESCAPE_SEQ", "NUMBER", "INTEGER", "DEC", "HEX", "OCT", "DIGIT", 
		"NON_ZERO_DIGIT", "HEX_DIGIT", "OCT_DIGIT", "FLOAT", "INT_PART", "EXPONENT", 
		"SKIP_", "SPACES", "COMMENT", "INLINE_COMMENT", "MULTILINE_COMMENT", "UNKNOWN_CHAR"
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


	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;

	  @Override
	  public void emit(Token token) {
	    //System.out.println("emit: " + token);
	    super.setToken(token);
	    tokens.offer(token);
	  }

	 @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      CommonToken ct = commonToken(DMParser.NEWLINE);
	      ct.setText("<NEWLINE>");
	      this.emit(ct);
	      while (!indents.isEmpty()) {
	        ct = commonToken(DMParser.DEDENT);
	        ct.setText("<DEDENT>");
	        this.emit(ct);

	        indents.pop();
	      }
	      this.emit(commonToken(DMParser.EOF));
	    }

	    Token next = super.nextToken();
	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private void emitHiddenToken(String text) {
	    int start =  this.getCharIndex();
	    int stop = start + text.length() - 1;
	    CommonToken token =  new CommonToken(this._tokenFactorySourcePair, DMParser.NEWLINE, HIDDEN, start, stop);
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


	public DMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DM.g4"; }

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
		case 2:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			OPEN_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			CLOSE_BRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			OPEN_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			CLOSE_PAREN_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n\f]+", "");
			     String spaces = getText().replaceAll("[\r\n\f]+", "");
			     CommonToken ct;

			     int next = _input.LA(1);
			     if (opened > 0 || next == '\r' || next == '\n' || next == '\f') {
			       //skip();
			       emitHiddenToken(getText());

			     } else if (next == '/' ) {
			        next = _input.LA(2);
			        if (next == '/' || next == '*') {
			            //skip();
			            emitHiddenToken(getText());
			        }
			     }
			     else {
			       int startIndex = this._tokenStartCharIndex;
			       int startIndexSpaces = startIndex + newLine.length();

			       ct = commonToken(DMParser.NEWLINE, newLine, startIndex);
			       ct.setLine(this._tokenStartLine);
			       ct.setCharPositionInLine(this._tokenStartCharPositionInLine);
			       ct.setText("<NEWLINE>");
			       emit(ct);

			       int indent = spaces.length();
			       int previous = indents.isEmpty() ? 0 : indents.peek();
			       if (indent == previous) {
			         //skip();
			         emitHiddenToken(getText());
			       }
			       else if (indent > previous) {
			         for(int i=0; i < (indent-previous); ++i) {
			           indents.push(indent);
			           ct = commonToken(DMParser.INDENT, spaces, startIndexSpaces);
			           ct.setText("<INDENT>");
			           ct.setCharPositionInLine(0);
			           emit(ct);
			         }
			       }
			       else {
			         for(int i=0; i < (previous-indent); ++i) {
			           ct = commonToken(DMParser.DEDENT, spaces, startIndexSpaces);
			           ct.setText("<DEDENT>");
			           ct.setCharPositionInLine(0);
			           emit(ct);
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	private void OPEN_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			opened++;
			break;
		}
	}
	private void CLOSE_BRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			opened--;
			break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			opened++;
			break;
		}
	}
	private void CLOSE_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			opened--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u02b2\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00e4\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u00fa\n\3\3\4\3\4\3\4\5\4\u00ff\n\4\3\4\3\4\5\4\u0103\n"+
		"\4\3\4\5\4\u0106\n\4\5\4\u0108\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\3"+
		"9\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3"+
		"B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3"+
		"J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3N\3N\7N\u020d\nN\fN\16N\u0210\13"+
		"N\3O\3O\5O\u0214\nO\3P\3P\7P\u0218\nP\fP\16P\u021b\13P\3P\3P\3Q\3Q\3Q"+
		"\7Q\u0222\nQ\fQ\16Q\u0225\13Q\3Q\3Q\3R\3R\3R\3R\7R\u022d\nR\fR\16R\u0230"+
		"\13R\3R\3R\3R\3S\3S\5S\u0237\nS\3T\3T\3U\3U\3U\3U\5U\u023f\nU\3V\3V\5"+
		"V\u0243\nV\3W\3W\3W\5W\u0248\nW\3X\3X\7X\u024c\nX\fX\16X\u024f\13X\3X"+
		"\5X\u0252\nX\3Y\3Y\3Y\3Y\6Y\u0258\nY\rY\16Y\u0259\3Z\3Z\6Z\u025e\nZ\r"+
		"Z\16Z\u025f\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\7_\u026d\n_\f_\16_\u0270"+
		"\13_\3_\5_\u0273\n_\3_\6_\u0276\n_\r_\16_\u0277\3_\3_\5_\u027c\n_\3`\6"+
		"`\u027f\n`\r`\16`\u0280\3a\3a\5a\u0285\na\3a\6a\u0288\na\ra\16a\u0289"+
		"\3b\3b\5b\u028e\nb\3b\3b\3c\6c\u0293\nc\rc\16c\u0294\3d\3d\5d\u0299\n"+
		"d\3e\3e\3e\3e\3e\7e\u02a0\ne\fe\16e\u02a3\13e\3f\3f\3f\3f\7f\u02a9\nf"+
		"\ff\16f\u02ac\13f\3f\3f\3f\3g\3g\4\u022e\u02aa\2h\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S\2U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@"+
		"\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093"+
		"J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1\2\u00a3\2\u00a5\2\u00a7"+
		"\2\u00a9\2\u00abQ\u00adR\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9"+
		"\2\u00bb\2\u00bdS\u00bf\2\u00c1\2\u00c3T\u00c5\2\u00c7U\u00c9\2\u00cb"+
		"\2\u00cdV\3\2\16\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\16\17$$^^\3\2^^\3\2"+
		"\62;\3\2\63;\5\2\62;CHch\3\2\629\4\2GGgg\4\2--//\4\2\13\13\"\"\5\2\f\f"+
		"\16\17^^\2\u02c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2"+
		"\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2"+
		"\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00bd\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00cd\3\2\2\2\3\u00e3\3\2\2\2\5\u00f9\3\2\2\2\7\u0107"+
		"\3\2\2\2\t\u010b\3\2\2\2\13\u0112\3\2\2\2\r\u0115\3\2\2\2\17\u011a\3\2"+
		"\2\2\21\u011e\3\2\2\2\23\u0124\3\2\2\2\25\u0127\3\2\2\2\27\u012d\3\2\2"+
		"\2\31\u0136\3\2\2\2\33\u0139\3\2\2\2\35\u013d\3\2\2\2\37\u0143\3\2\2\2"+
		"!\u0147\3\2\2\2#\u014e\3\2\2\2%\u0152\3\2\2\2\'\u0155\3\2\2\2)\u0158\3"+
		"\2\2\2+\u015d\3\2\2\2-\u0161\3\2\2\2/\u0167\3\2\2\2\61\u016b\3\2\2\2\63"+
		"\u0171\3\2\2\2\65\u0176\3\2\2\2\67\u017b\3\2\2\29\u0182\3\2\2\2;\u0189"+
		"\3\2\2\2=\u018d\3\2\2\2?\u0191\3\2\2\2A\u0194\3\2\2\2C\u0197\3\2\2\2E"+
		"\u019a\3\2\2\2G\u019d\3\2\2\2I\u01a0\3\2\2\2K\u01a2\3\2\2\2M\u01a4\3\2"+
		"\2\2O\u01a6\3\2\2\2Q\u01a8\3\2\2\2S\u01aa\3\2\2\2U\u01ac\3\2\2\2W\u01ae"+
		"\3\2\2\2Y\u01b0\3\2\2\2[\u01b2\3\2\2\2]\u01b4\3\2\2\2_\u01b6\3\2\2\2a"+
		"\u01b8\3\2\2\2c\u01bb\3\2\2\2e\u01be\3\2\2\2g\u01c1\3\2\2\2i\u01c3\3\2"+
		"\2\2k\u01c5\3\2\2\2m\u01c8\3\2\2\2o\u01cb\3\2\2\2q\u01ce\3\2\2\2s\u01d1"+
		"\3\2\2\2u\u01d4\3\2\2\2w\u01d7\3\2\2\2y\u01da\3\2\2\2{\u01dc\3\2\2\2}"+
		"\u01de\3\2\2\2\177\u01e0\3\2\2\2\u0081\u01e3\3\2\2\2\u0083\u01e6\3\2\2"+
		"\2\u0085\u01e8\3\2\2\2\u0087\u01eb\3\2\2\2\u0089\u01ee\3\2\2\2\u008b\u01f1"+
		"\3\2\2\2\u008d\u01f4\3\2\2\2\u008f\u01f7\3\2\2\2\u0091\u01fa\3\2\2\2\u0093"+
		"\u01fd\3\2\2\2\u0095\u0200\3\2\2\2\u0097\u0204\3\2\2\2\u0099\u0208\3\2"+
		"\2\2\u009b\u020a\3\2\2\2\u009d\u0213\3\2\2\2\u009f\u0215\3\2\2\2\u00a1"+
		"\u021e\3\2\2\2\u00a3\u0228\3\2\2\2\u00a5\u0236\3\2\2\2\u00a7\u0238\3\2"+
		"\2\2\u00a9\u023e\3\2\2\2\u00ab\u0242\3\2\2\2\u00ad\u0247\3\2\2\2\u00af"+
		"\u0251\3\2\2\2\u00b1\u0253\3\2\2\2\u00b3\u025b\3\2\2\2\u00b5\u0261\3\2"+
		"\2\2\u00b7\u0263\3\2\2\2\u00b9\u0265\3\2\2\2\u00bb\u0267\3\2\2\2\u00bd"+
		"\u027b\3\2\2\2\u00bf\u027e\3\2\2\2\u00c1\u0282\3\2\2\2\u00c3\u028d\3\2"+
		"\2\2\u00c5\u0292\3\2\2\2\u00c7\u0298\3\2\2\2\u00c9\u029a\3\2\2\2\u00cb"+
		"\u02a4\3\2\2\2\u00cd\u02b0\3\2\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7W\2"+
		"\2\u00d1\u00d2\7R\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7L\2\2\u00d4\u00d5"+
		"\7C\2\2\u00d5\u00d6\7U\2\2\u00d6\u00d7\7K\2\2\u00d7\u00d8\7C\2\2\u00d8"+
		"\u00e4\7\63\2\2\u00d9\u00da\7L\2\2\u00da\u00db\7C\2\2\u00db\u00dc\7U\2"+
		"\2\u00dc\u00dd\7K\2\2\u00dd\u00de\7C\2\2\u00de\u00df\7F\2\2\u00df\u00e0"+
		"\7W\2\2\u00e0\u00e1\7R\2\2\u00e1\u00e2\7C\2\2\u00e2\u00e4\7\63\2\2\u00e3"+
		"\u00cf\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e4\4\3\2\2\2\u00e5\u00e6\7F\2\2"+
		"\u00e6\u00e7\7W\2\2\u00e7\u00e8\7R\2\2\u00e8\u00e9\7C\2\2\u00e9\u00ea"+
		"\7L\2\2\u00ea\u00eb\7C\2\2\u00eb\u00ec\7U\2\2\u00ec\u00ed\7K\2\2\u00ed"+
		"\u00ee\7C\2\2\u00ee\u00fa\7\64\2\2\u00ef\u00f0\7L\2\2\u00f0\u00f1\7C\2"+
		"\2\u00f1\u00f2\7U\2\2\u00f2\u00f3\7K\2\2\u00f3\u00f4\7C\2\2\u00f4\u00f5"+
		"\7F\2\2\u00f5\u00f6\7W\2\2\u00f6\u00f7\7R\2\2\u00f7\u00f8\7C\2\2\u00f8"+
		"\u00fa\7\64\2\2\u00f9\u00e5\3\2\2\2\u00f9\u00ef\3\2\2\2\u00fa\6\3\2\2"+
		"\2\u00fb\u00fc\6\4\2\2\u00fc\u0108\5\u00c5c\2\u00fd\u00ff\7\17\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0103\7\f"+
		"\2\2\u0101\u0103\4\16\17\2\u0102\u00fe\3\2\2\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0106\5\u00c5c\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u0102\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b\4\2\2\u010a\b\3\2\2\2\u010b\u010c\7u\2\2"+
		"\u010c\u010d\7y\2\2\u010d\u010e\7k\2\2\u010e\u010f\7v\2\2\u010f\u0110"+
		"\7e\2\2\u0110\u0111\7j\2\2\u0111\n\3\2\2\2\u0112\u0113\7k\2\2\u0113\u0114"+
		"\7h\2\2\u0114\f\3\2\2\2\u0115\u0116\7g\2\2\u0116\u0117\7n\2\2\u0117\u0118"+
		"\7u\2\2\u0118\u0119\7g\2\2\u0119\16\3\2\2\2\u011a\u011b\7h\2\2\u011b\u011c"+
		"\7q\2\2\u011c\u011d\7t\2\2\u011d\20\3\2\2\2\u011e\u011f\7y\2\2\u011f\u0120"+
		"\7j\2\2\u0120\u0121\7k\2\2\u0121\u0122\7n\2\2\u0122\u0123\7g\2\2\u0123"+
		"\22\3\2\2\2\u0124\u0125\7f\2\2\u0125\u0126\7q\2\2\u0126\24\3\2\2\2\u0127"+
		"\u0128\7d\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7c\2\2"+
		"\u012b\u012c\7m\2\2\u012c\26\3\2\2\2\u012d\u012e\7e\2\2\u012e\u012f\7"+
		"q\2\2\u012f\u0130\7p\2\2\u0130\u0131\7v\2\2\u0131\u0132\7k\2\2\u0132\u0133"+
		"\7p\2\2\u0133\u0134\7w\2\2\u0134\u0135\7g\2\2\u0135\30\3\2\2\2\u0136\u0137"+
		"\7k\2\2\u0137\u0138\7p\2\2\u0138\32\3\2\2\2\u0139\u013a\7x\2\2\u013a\u013b"+
		"\7c\2\2\u013b\u013c\7t\2\2\u013c\34\3\2\2\2\u013d\u013e\7e\2\2\u013e\u013f"+
		"\7q\2\2\u013f\u0140\7p\2\2\u0140\u0141\7u\2\2\u0141\u0142\7v\2\2\u0142"+
		"\36\3\2\2\2\u0143\u0144\7f\2\2\u0144\u0145\7g\2\2\u0145\u0146\7n\2\2\u0146"+
		" \3\2\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7v\2\2\u014a"+
		"\u014b\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7p\2\2\u014d\"\3\2\2\2\u014e"+
		"\u014f\7u\2\2\u014f\u0150\7g\2\2\u0150\u0151\7v\2\2\u0151$\3\2\2\2\u0152"+
		"\u0153\7v\2\2\u0153\u0154\7q\2\2\u0154&\3\2\2\2\u0155\u0156\7c\2\2\u0156"+
		"\u0157\7u\2\2\u0157(\3\2\2\2\u0158\u0159\7i\2\2\u0159\u015a\7q\2\2\u015a"+
		"\u015b\7v\2\2\u015b\u015c\7q\2\2\u015c*\3\2\2\2\u015d\u015e\7p\2\2\u015e"+
		"\u015f\7g\2\2\u015f\u0160\7y\2\2\u0160,\3\2\2\2\u0161\u0162\7u\2\2\u0162"+
		"\u0163\7r\2\2\u0163\u0164\7c\2\2\u0164\u0165\7y\2\2\u0165\u0166\7p\2\2"+
		"\u0166.\3\2\2\2\u0167\u0168\7v\2\2\u0168\u0169\7t\2\2\u0169\u016a\7{\2"+
		"\2\u016a\60\3\2\2\2\u016b\u016c\7e\2\2\u016c\u016d\7c\2\2\u016d\u016e"+
		"\7v\2\2\u016e\u016f\7e\2\2\u016f\u0170\7j\2\2\u0170\62\3\2\2\2\u0171\u0172"+
		"\7x\2\2\u0172\u0173\7g\2\2\u0173\u0174\7t\2\2\u0174\u0175\7d\2\2\u0175"+
		"\64\3\2\2\2\u0176\u0177\7r\2\2\u0177\u0178\7t\2\2\u0178\u0179\7q\2\2\u0179"+
		"\u017a\7e\2\2\u017a\66\3\2\2\2\u017b\u017c\7i\2\2\u017c\u017d\7n\2\2\u017d"+
		"\u017e\7q\2\2\u017e\u017f\7d\2\2\u017f\u0180\7c\2\2\u0180\u0181\7n\2\2"+
		"\u01818\3\2\2\2\u0182\u0183\7u\2\2\u0183\u0184\7v\2\2\u0184\u0185\7c\2"+
		"\2\u0185\u0186\7v\2\2\u0186\u0187\7k\2\2\u0187\u0188\7e\2\2\u0188:\3\2"+
		"\2\2\u0189\u018a\7c\2\2\u018a\u018b\7t\2\2\u018b\u018c\7i\2\2\u018c<\3"+
		"\2\2\2\u018d\u018e\7v\2\2\u018e\u018f\7o\2\2\u018f\u0190\7r\2\2\u0190"+
		">\3\2\2\2\u0191\u0192\7]\2\2\u0192\u0193\b \3\2\u0193@\3\2\2\2\u0194\u0195"+
		"\7_\2\2\u0195\u0196\b!\4\2\u0196B\3\2\2\2\u0197\u0198\7*\2\2\u0198\u0199"+
		"\b\"\5\2\u0199D\3\2\2\2\u019a\u019b\7+\2\2\u019b\u019c\b#\6\2\u019cF\3"+
		"\2\2\2\u019d\u019e\7\60\2\2\u019e\u019f\7\60\2\2\u019fH\3\2\2\2\u01a0"+
		"\u01a1\7\60\2\2\u01a1J\3\2\2\2\u01a2\u01a3\7.\2\2\u01a3L\3\2\2\2\u01a4"+
		"\u01a5\7,\2\2\u01a5N\3\2\2\2\u01a6\u01a7\7\'\2\2\u01a7P\3\2\2\2\u01a8"+
		"\u01a9\7\61\2\2\u01a9R\3\2\2\2\u01aa\u01ab\7^\2\2\u01abT\3\2\2\2\u01ac"+
		"\u01ad\7<\2\2\u01adV\3\2\2\2\u01ae\u01af\7A\2\2\u01afX\3\2\2\2\u01b0\u01b1"+
		"\7\u0080\2\2\u01b1Z\3\2\2\2\u01b2\u01b3\7#\2\2\u01b3\\\3\2\2\2\u01b4\u01b5"+
		"\7/\2\2\u01b5^\3\2\2\2\u01b6\u01b7\7-\2\2\u01b7`\3\2\2\2\u01b8\u01b9\7"+
		"-\2\2\u01b9\u01ba\7-\2\2\u01bab\3\2\2\2\u01bb\u01bc\7/\2\2\u01bc\u01bd"+
		"\7/\2\2\u01bdd\3\2\2\2\u01be\u01bf\7,\2\2\u01bf\u01c0\7,\2\2\u01c0f\3"+
		"\2\2\2\u01c1\u01c2\7>\2\2\u01c2h\3\2\2\2\u01c3\u01c4\7@\2\2\u01c4j\3\2"+
		"\2\2\u01c5\u01c6\7>\2\2\u01c6\u01c7\7?\2\2\u01c7l\3\2\2\2\u01c8\u01c9"+
		"\7@\2\2\u01c9\u01ca\7?\2\2\u01can\3\2\2\2\u01cb\u01cc\7>\2\2\u01cc\u01cd"+
		"\7>\2\2\u01cdp\3\2\2\2\u01ce\u01cf\7@\2\2\u01cf\u01d0\7@\2\2\u01d0r\3"+
		"\2\2\2\u01d1\u01d2\7?\2\2\u01d2\u01d3\7?\2\2\u01d3t\3\2\2\2\u01d4\u01d5"+
		"\7#\2\2\u01d5\u01d6\7?\2\2\u01d6v\3\2\2\2\u01d7\u01d8\7>\2\2\u01d8\u01d9"+
		"\7@\2\2\u01d9x\3\2\2\2\u01da\u01db\7(\2\2\u01dbz\3\2\2\2\u01dc\u01dd\7"+
		"~\2\2\u01dd|\3\2\2\2\u01de\u01df\7`\2\2\u01df~\3\2\2\2\u01e0\u01e1\7("+
		"\2\2\u01e1\u01e2\7(\2\2\u01e2\u0080\3\2\2\2\u01e3\u01e4\7~\2\2\u01e4\u01e5"+
		"\7~\2\2\u01e5\u0082\3\2\2\2\u01e6\u01e7\7?\2\2\u01e7\u0084\3\2\2\2\u01e8"+
		"\u01e9\7-\2\2\u01e9\u01ea\7?\2\2\u01ea\u0086\3\2\2\2\u01eb\u01ec\7/\2"+
		"\2\u01ec\u01ed\7?\2\2\u01ed\u0088\3\2\2\2\u01ee\u01ef\7,\2\2\u01ef\u01f0"+
		"\7?\2\2\u01f0\u008a\3\2\2\2\u01f1\u01f2\7\61\2\2\u01f2\u01f3\7?\2\2\u01f3"+
		"\u008c\3\2\2\2\u01f4\u01f5\7\'\2\2\u01f5\u01f6\7?\2\2\u01f6\u008e\3\2"+
		"\2\2\u01f7\u01f8\7(\2\2\u01f8\u01f9\7?\2\2\u01f9\u0090\3\2\2\2\u01fa\u01fb"+
		"\7~\2\2\u01fb\u01fc\7?\2\2\u01fc\u0092\3\2\2\2\u01fd\u01fe\7`\2\2\u01fe"+
		"\u01ff\7?\2\2\u01ff\u0094\3\2\2\2\u0200\u0201\7>\2\2\u0201\u0202\7>\2"+
		"\2\u0202\u0203\7?\2\2\u0203\u0096\3\2\2\2\u0204\u0205\7@\2\2\u0205\u0206"+
		"\7@\2\2\u0206\u0207\7?\2\2\u0207\u0098\3\2\2\2\u0208\u0209\7=\2\2\u0209"+
		"\u009a\3\2\2\2\u020a\u020e\t\2\2\2\u020b\u020d\t\3\2\2\u020c\u020b\3\2"+
		"\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u009c\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0214\5\u00a1Q\2\u0212\u0214"+
		"\5\u00a3R\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u009e\3\2\2"+
		"\2\u0215\u0219\7)\2\2\u0216\u0218\n\4\2\2\u0217\u0216\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021d\7)\2\2\u021d\u00a0\3\2\2\2\u021e\u0223\7$\2"+
		"\2\u021f\u0222\5\u00a9U\2\u0220\u0222\n\4\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0226\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\7$\2\2\u0227"+
		"\u00a2\3\2\2\2\u0228\u0229\7}\2\2\u0229\u022a\7$\2\2\u022a\u022e\3\2\2"+
		"\2\u022b\u022d\5\u00a5S\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0232\7$\2\2\u0232\u0233\7\177\2\2\u0233\u00a4\3\2\2\2\u0234"+
		"\u0237\5\u00a7T\2\u0235\u0237\5\u00a9U\2\u0236\u0234\3\2\2\2\u0236\u0235"+
		"\3\2\2\2\u0237\u00a6\3\2\2\2\u0238\u0239\n\5\2\2\u0239\u00a8\3\2\2\2\u023a"+
		"\u023b\7^\2\2\u023b\u023f\13\2\2\2\u023c\u023d\7^\2\2\u023d\u023f\5\7"+
		"\4\2\u023e\u023a\3\2\2\2\u023e\u023c\3\2\2\2\u023f\u00aa\3\2\2\2\u0240"+
		"\u0243\5\u00adW\2\u0241\u0243\5\u00bd_\2\u0242\u0240\3\2\2\2\u0242\u0241"+
		"\3\2\2\2\u0243\u00ac\3\2\2\2\u0244\u0248\5\u00afX\2\u0245\u0248\5\u00b1"+
		"Y\2\u0246\u0248\5\u00b3Z\2\u0247\u0244\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0246\3\2\2\2\u0248\u00ae\3\2\2\2\u0249\u024d\5\u00b7\\\2\u024a\u024c"+
		"\5\u00b5[\2\u024b\u024a\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2"+
		"\2\u024d\u024e\3\2\2\2\u024e\u0252\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252"+
		"\7\62\2\2\u0251\u0249\3\2\2\2\u0251\u0250\3\2\2\2\u0252\u00b0\3\2\2\2"+
		"\u0253\u0254\7\62\2\2\u0254\u0255\7z\2\2\u0255\u0257\3\2\2\2\u0256\u0258"+
		"\5\u00b9]\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257\3\2\2"+
		"\2\u0259\u025a\3\2\2\2\u025a\u00b2\3\2\2\2\u025b\u025d\7\62\2\2\u025c"+
		"\u025e\5\u00bb^\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u00b4\3\2\2\2\u0261\u0262\t\6\2\2\u0262"+
		"\u00b6\3\2\2\2\u0263\u0264\t\7\2\2\u0264\u00b8\3\2\2\2\u0265\u0266\t\b"+
		"\2\2\u0266\u00ba\3\2\2\2\u0267\u0268\t\t\2\2\u0268\u00bc\3\2\2\2\u0269"+
		"\u026a\5\u00afX\2\u026a\u026e\7\60\2\2\u026b\u026d\5\u00b5[\2\u026c\u026b"+
		"\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0272\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0273\5\u00c1a\2\u0272\u0271"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u027c\3\2\2\2\u0274\u0276\5\u00b5["+
		"\2\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\5\u00c1a\2\u027a\u027c\3\2\2"+
		"\2\u027b\u0269\3\2\2\2\u027b\u0275\3\2\2\2\u027c\u00be\3\2\2\2\u027d\u027f"+
		"\5\u00b5[\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u027e\3\2\2"+
		"\2\u0280\u0281\3\2\2\2\u0281\u00c0\3\2\2\2\u0282\u0284\t\n\2\2\u0283\u0285"+
		"\t\13\2\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2"+
		"\u0286\u0288\5\u00b5[\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u00c2\3\2\2\2\u028b\u028e\5\u00c5"+
		"c\2\u028c\u028e\5\u00c7d\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u0290\bb\7\2\u0290\u00c4\3\2\2\2\u0291\u0293\t\f"+
		"\2\2\u0292\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0292\3\2\2\2\u0294"+
		"\u0295\3\2\2\2\u0295\u00c6\3\2\2\2\u0296\u0299\5\u00c9e\2\u0297\u0299"+
		"\5\u00cbf\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u00c8\3\2\2"+
		"\2\u029a\u029b\7\61\2\2\u029b\u029c\7\61\2\2\u029c\u02a1\3\2\2\2\u029d"+
		"\u02a0\5\u00a9U\2\u029e\u02a0\n\r\2\2\u029f\u029d\3\2\2\2\u029f\u029e"+
		"\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u00ca\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5\7\61\2\2\u02a5\u02a6\7"+
		",\2\2\u02a6\u02aa\3\2\2\2\u02a7\u02a9\13\2\2\2\u02a8\u02a7\3\2\2\2\u02a9"+
		"\u02ac\3\2\2\2\u02aa\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\3\2"+
		"\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\7,\2\2\u02ae\u02af\7\61\2\2\u02af"+
		"\u00cc\3\2\2\2\u02b0\u02b1\13\2\2\2\u02b1\u00ce\3\2\2\2$\2\u00e3\u00f9"+
		"\u00fe\u0102\u0105\u0107\u020e\u0213\u0219\u0221\u0223\u022e\u0236\u023e"+
		"\u0242\u0247\u024d\u0251\u0259\u025f\u026e\u0272\u0277\u027b\u0280\u0284"+
		"\u0289\u028d\u0294\u0298\u029f\u02a1\u02aa\b\3\4\2\3 \3\3!\4\3\"\5\3#"+
		"\6\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}