// Generated from C:\Users\kisio\IdeaProjects\byond-intellij\src\org\byondplugin\grammar\DMHighlightingLexer.g4 by ANTLR 4.7.1
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
public class DMHighlightingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_BRACK=1, CLOSE_BRACK=2, OPEN_PAREN=3, CLOSE_PAREN=4, NEWLINE=5, SWITCH=6, 
		IF=7, ELSE=8, FOR=9, WHILE=10, DO=11, BREAK=12, CONTINUE=13, IN=14, VAR=15, 
		CONST=16, DEL=17, RETURN=18, SET=19, TO=20, AS=21, GOTO=22, NEW=23, SPAWN=24, 
		TRY=25, CATCH=26, VERB=27, PROC=28, GLOBAL=29, STATIC=30, ARG=31, TMP=32, 
		DOUBLE_DOT=33, DOT=34, COMMA=35, STAR=36, PERCENT=37, SLASH=38, COLON=39, 
		QUESTION_MARK=40, NOT_OP=41, NEG_OP=42, MINUS=43, PLUS=44, INCREMENT=45, 
		DECREMENT=46, POWER=47, LESS_THAN=48, GREATER_THAN=49, LESS_THAN_OR_EQUAL=50, 
		GREATER_THAN_OR_EQUAL=51, SHIFT_LEFT=52, SHIFT_RIGHT=53, EQUAL=54, NOT_EQUAL=55, 
		NOT_EQUAL_2=56, BIT_AND=57, BIT_OR=58, BIT_XOR=59, LOG_AND=60, LOG_OR=61, 
		ASSIGN=62, ADD_ASSIGN=63, SUB_ASSIGN=64, MULT_ASSIGN=65, DIV_ASSIGN=66, 
		MOD_ASSIGN=67, BIT_AND_ASSIGN=68, BIT_OR_ASSIGN=69, XOR_ASSIGN=70, LEFT_SHIFT_ASSIGN=71, 
		RIGHT_SHIFT_ASSIGN=72, SEMICOLON=73, NAME=74, STRING_LITERAL=75, ICON_PATH=76, 
		NUMBER=77, SPACES=78, COMMENT=79, UNKNOWN_CHAR=80;
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
		"OCT_DIGIT", "FLOAT", "INT_PART", "EXPONENT", "SPACES", "COMMENT", "INLINE_COMMENT", 
		"MULTILINE_COMMENT", "UNKNOWN_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'('", "')'", null, "'switch'", "'if'", "'else'", 
		"'for'", "'while'", "'do'", "'break'", "'continue'", "'in'", "'var'", 
		"'const'", "'del'", "'return'", "'set'", "'to'", "'as'", "'goto'", "'new'", 
		"'spawn'", "'try'", "'catch'", "'verb'", "'proc'", "'global'", "'static'", 
		"'arg'", "'tmp'", "'..'", "'.'", "','", "'*'", "'%'", "'/'", "':'", "'?'", 
		"'~'", "'!'", "'-'", "'+'", "'++'", "'--'", "'**'", "'<'", "'>'", "'<='", 
		"'>='", "'<<'", "'>>'", "'=='", "'!='", "'<>'", "'&'", "'|'", "'^'", "'&&'", 
		"'||'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", 
		"'^='", "'<<='", "'>>='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_BRACK", "CLOSE_BRACK", "OPEN_PAREN", "CLOSE_PAREN", "NEWLINE", 
		"SWITCH", "IF", "ELSE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", "IN", 
		"VAR", "CONST", "DEL", "RETURN", "SET", "TO", "AS", "GOTO", "NEW", "SPAWN", 
		"TRY", "CATCH", "VERB", "PROC", "GLOBAL", "STATIC", "ARG", "TMP", "DOUBLE_DOT", 
		"DOT", "COMMA", "STAR", "PERCENT", "SLASH", "COLON", "QUESTION_MARK", 
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


	public DMHighlightingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DMHighlightingLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u0273\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\5\6\u00d3"+
		"\n\6\3\6\3\6\5\6\u00d7\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3"+
		"E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3L\3L\7L\u01d0"+
		"\nL\fL\16L\u01d3\13L\3M\3M\5M\u01d7\nM\3N\3N\7N\u01db\nN\fN\16N\u01de"+
		"\13N\3N\3N\3O\3O\3O\7O\u01e5\nO\fO\16O\u01e8\13O\3O\3O\3P\3P\3P\3P\7P"+
		"\u01f0\nP\fP\16P\u01f3\13P\3P\3P\3P\3Q\3Q\5Q\u01fa\nQ\3R\3R\3S\3S\3S\3"+
		"S\5S\u0202\nS\3T\3T\5T\u0206\nT\3U\3U\3U\5U\u020b\nU\3V\3V\7V\u020f\n"+
		"V\fV\16V\u0212\13V\3V\5V\u0215\nV\3W\3W\3W\3W\6W\u021b\nW\rW\16W\u021c"+
		"\3X\3X\6X\u0221\nX\rX\16X\u0222\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\7]"+
		"\u0230\n]\f]\16]\u0233\13]\3]\5]\u0236\n]\3]\6]\u0239\n]\r]\16]\u023a"+
		"\3]\3]\5]\u023f\n]\3^\6^\u0242\n^\r^\16^\u0243\3_\3_\5_\u0248\n_\3_\6"+
		"_\u024b\n_\r_\16_\u024c\3`\6`\u0250\n`\r`\16`\u0251\3`\3`\3a\3a\5a\u0258"+
		"\na\3a\3a\3b\3b\3b\3b\3b\7b\u0261\nb\fb\16b\u0264\13b\3c\3c\3c\3c\7c\u026a"+
		"\nc\fc\16c\u026d\13c\3c\3c\3c\3d\3d\4\u01f1\u026b\2e\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O\2Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177"+
		"@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093"+
		"J\u0095K\u0097L\u0099M\u009bN\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2"+
		"\u00a7O\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd\2\u00bfP\u00c1Q\u00c3\2\u00c5\2\u00c7R\3\2\16"+
		"\5\2C\\aac|\6\2\62;C\\aac|\6\2\f\f\16\17$$^^\3\2^^\3\2\62;\3\2\63;\5\2"+
		"\62;CHch\3\2\629\4\2GGgg\4\2--//\4\2\13\13\"\"\5\2\f\f\16\17^^\2\u027c"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u00a7\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1"+
		"\3\2\2\2\2\u00c7\3\2\2\2\3\u00c9\3\2\2\2\5\u00cb\3\2\2\2\7\u00cd\3\2\2"+
		"\2\t\u00cf\3\2\2\2\13\u00d6\3\2\2\2\r\u00da\3\2\2\2\17\u00e1\3\2\2\2\21"+
		"\u00e4\3\2\2\2\23\u00e9\3\2\2\2\25\u00ed\3\2\2\2\27\u00f3\3\2\2\2\31\u00f6"+
		"\3\2\2\2\33\u00fc\3\2\2\2\35\u0105\3\2\2\2\37\u0108\3\2\2\2!\u010c\3\2"+
		"\2\2#\u0112\3\2\2\2%\u0116\3\2\2\2\'\u011d\3\2\2\2)\u0121\3\2\2\2+\u0124"+
		"\3\2\2\2-\u0127\3\2\2\2/\u012c\3\2\2\2\61\u0130\3\2\2\2\63\u0136\3\2\2"+
		"\2\65\u013a\3\2\2\2\67\u0140\3\2\2\29\u0145\3\2\2\2;\u014a\3\2\2\2=\u0151"+
		"\3\2\2\2?\u0158\3\2\2\2A\u015c\3\2\2\2C\u0160\3\2\2\2E\u0163\3\2\2\2G"+
		"\u0165\3\2\2\2I\u0167\3\2\2\2K\u0169\3\2\2\2M\u016b\3\2\2\2O\u016d\3\2"+
		"\2\2Q\u016f\3\2\2\2S\u0171\3\2\2\2U\u0173\3\2\2\2W\u0175\3\2\2\2Y\u0177"+
		"\3\2\2\2[\u0179\3\2\2\2]\u017b\3\2\2\2_\u017e\3\2\2\2a\u0181\3\2\2\2c"+
		"\u0184\3\2\2\2e\u0186\3\2\2\2g\u0188\3\2\2\2i\u018b\3\2\2\2k\u018e\3\2"+
		"\2\2m\u0191\3\2\2\2o\u0194\3\2\2\2q\u0197\3\2\2\2s\u019a\3\2\2\2u\u019d"+
		"\3\2\2\2w\u019f\3\2\2\2y\u01a1\3\2\2\2{\u01a3\3\2\2\2}\u01a6\3\2\2\2\177"+
		"\u01a9\3\2\2\2\u0081\u01ab\3\2\2\2\u0083\u01ae\3\2\2\2\u0085\u01b1\3\2"+
		"\2\2\u0087\u01b4\3\2\2\2\u0089\u01b7\3\2\2\2\u008b\u01ba\3\2\2\2\u008d"+
		"\u01bd\3\2\2\2\u008f\u01c0\3\2\2\2\u0091\u01c3\3\2\2\2\u0093\u01c7\3\2"+
		"\2\2\u0095\u01cb\3\2\2\2\u0097\u01cd\3\2\2\2\u0099\u01d6\3\2\2\2\u009b"+
		"\u01d8\3\2\2\2\u009d\u01e1\3\2\2\2\u009f\u01eb\3\2\2\2\u00a1\u01f9\3\2"+
		"\2\2\u00a3\u01fb\3\2\2\2\u00a5\u0201\3\2\2\2\u00a7\u0205\3\2\2\2\u00a9"+
		"\u020a\3\2\2\2\u00ab\u0214\3\2\2\2\u00ad\u0216\3\2\2\2\u00af\u021e\3\2"+
		"\2\2\u00b1\u0224\3\2\2\2\u00b3\u0226\3\2\2\2\u00b5\u0228\3\2\2\2\u00b7"+
		"\u022a\3\2\2\2\u00b9\u023e\3\2\2\2\u00bb\u0241\3\2\2\2\u00bd\u0245\3\2"+
		"\2\2\u00bf\u024f\3\2\2\2\u00c1\u0257\3\2\2\2\u00c3\u025b\3\2\2\2\u00c5"+
		"\u0265\3\2\2\2\u00c7\u0271\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca\4\3\2\2\2"+
		"\u00cb\u00cc\7_\2\2\u00cc\6\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce\b\3\2\2\2"+
		"\u00cf\u00d0\7+\2\2\u00d0\n\3\2\2\2\u00d1\u00d3\7\17\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\7\f\2\2\u00d5"+
		"\u00d7\4\16\17\2\u00d6\u00d2\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00d9\b\6\2\2\u00d9\f\3\2\2\2\u00da\u00db\7u\2\2\u00db\u00dc"+
		"\7y\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7e\2\2\u00df"+
		"\u00e0\7j\2\2\u00e0\16\3\2\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7h\2\2\u00e3"+
		"\20\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7u\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\22\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7q\2\2\u00eb"+
		"\u00ec\7t\2\2\u00ec\24\3\2\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef\7j\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7g\2\2\u00f2\26\3\2\2\2\u00f3"+
		"\u00f4\7f\2\2\u00f4\u00f5\7q\2\2\u00f5\30\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7"+
		"\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7m\2\2"+
		"\u00fb\32\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7"+
		"p\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103"+
		"\7w\2\2\u0103\u0104\7g\2\2\u0104\34\3\2\2\2\u0105\u0106\7k\2\2\u0106\u0107"+
		"\7p\2\2\u0107\36\3\2\2\2\u0108\u0109\7x\2\2\u0109\u010a\7c\2\2\u010a\u010b"+
		"\7t\2\2\u010b \3\2\2\2\u010c\u010d\7e\2\2\u010d\u010e\7q\2\2\u010e\u010f"+
		"\7p\2\2\u010f\u0110\7u\2\2\u0110\u0111\7v\2\2\u0111\"\3\2\2\2\u0112\u0113"+
		"\7f\2\2\u0113\u0114\7g\2\2\u0114\u0115\7n\2\2\u0115$\3\2\2\2\u0116\u0117"+
		"\7t\2\2\u0117\u0118\7g\2\2\u0118\u0119\7v\2\2\u0119\u011a\7w\2\2\u011a"+
		"\u011b\7t\2\2\u011b\u011c\7p\2\2\u011c&\3\2\2\2\u011d\u011e\7u\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7v\2\2\u0120(\3\2\2\2\u0121\u0122\7v\2\2\u0122"+
		"\u0123\7q\2\2\u0123*\3\2\2\2\u0124\u0125\7c\2\2\u0125\u0126\7u\2\2\u0126"+
		",\3\2\2\2\u0127\u0128\7i\2\2\u0128\u0129\7q\2\2\u0129\u012a\7v\2\2\u012a"+
		"\u012b\7q\2\2\u012b.\3\2\2\2\u012c\u012d\7p\2\2\u012d\u012e\7g\2\2\u012e"+
		"\u012f\7y\2\2\u012f\60\3\2\2\2\u0130\u0131\7u\2\2\u0131\u0132\7r\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7y\2\2\u0134\u0135\7p\2\2\u0135\62\3\2\2\2\u0136"+
		"\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139\7{\2\2\u0139\64\3\2\2\2\u013a"+
		"\u013b\7e\2\2\u013b\u013c\7c\2\2\u013c\u013d\7v\2\2\u013d\u013e\7e\2\2"+
		"\u013e\u013f\7j\2\2\u013f\66\3\2\2\2\u0140\u0141\7x\2\2\u0141\u0142\7"+
		"g\2\2\u0142\u0143\7t\2\2\u0143\u0144\7d\2\2\u01448\3\2\2\2\u0145\u0146"+
		"\7r\2\2\u0146\u0147\7t\2\2\u0147\u0148\7q\2\2\u0148\u0149\7e\2\2\u0149"+
		":\3\2\2\2\u014a\u014b\7i\2\2\u014b\u014c\7n\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7d\2\2\u014e\u014f\7c\2\2\u014f\u0150\7n\2\2\u0150<\3\2\2\2\u0151"+
		"\u0152\7u\2\2\u0152\u0153\7v\2\2\u0153\u0154\7c\2\2\u0154\u0155\7v\2\2"+
		"\u0155\u0156\7k\2\2\u0156\u0157\7e\2\2\u0157>\3\2\2\2\u0158\u0159\7c\2"+
		"\2\u0159\u015a\7t\2\2\u015a\u015b\7i\2\2\u015b@\3\2\2\2\u015c\u015d\7"+
		"v\2\2\u015d\u015e\7o\2\2\u015e\u015f\7r\2\2\u015fB\3\2\2\2\u0160\u0161"+
		"\7\60\2\2\u0161\u0162\7\60\2\2\u0162D\3\2\2\2\u0163\u0164\7\60\2\2\u0164"+
		"F\3\2\2\2\u0165\u0166\7.\2\2\u0166H\3\2\2\2\u0167\u0168\7,\2\2\u0168J"+
		"\3\2\2\2\u0169\u016a\7\'\2\2\u016aL\3\2\2\2\u016b\u016c\7\61\2\2\u016c"+
		"N\3\2\2\2\u016d\u016e\7^\2\2\u016eP\3\2\2\2\u016f\u0170\7<\2\2\u0170R"+
		"\3\2\2\2\u0171\u0172\7A\2\2\u0172T\3\2\2\2\u0173\u0174\7\u0080\2\2\u0174"+
		"V\3\2\2\2\u0175\u0176\7#\2\2\u0176X\3\2\2\2\u0177\u0178\7/\2\2\u0178Z"+
		"\3\2\2\2\u0179\u017a\7-\2\2\u017a\\\3\2\2\2\u017b\u017c\7-\2\2\u017c\u017d"+
		"\7-\2\2\u017d^\3\2\2\2\u017e\u017f\7/\2\2\u017f\u0180\7/\2\2\u0180`\3"+
		"\2\2\2\u0181\u0182\7,\2\2\u0182\u0183\7,\2\2\u0183b\3\2\2\2\u0184\u0185"+
		"\7>\2\2\u0185d\3\2\2\2\u0186\u0187\7@\2\2\u0187f\3\2\2\2\u0188\u0189\7"+
		">\2\2\u0189\u018a\7?\2\2\u018ah\3\2\2\2\u018b\u018c\7@\2\2\u018c\u018d"+
		"\7?\2\2\u018dj\3\2\2\2\u018e\u018f\7>\2\2\u018f\u0190\7>\2\2\u0190l\3"+
		"\2\2\2\u0191\u0192\7@\2\2\u0192\u0193\7@\2\2\u0193n\3\2\2\2\u0194\u0195"+
		"\7?\2\2\u0195\u0196\7?\2\2\u0196p\3\2\2\2\u0197\u0198\7#\2\2\u0198\u0199"+
		"\7?\2\2\u0199r\3\2\2\2\u019a\u019b\7>\2\2\u019b\u019c\7@\2\2\u019ct\3"+
		"\2\2\2\u019d\u019e\7(\2\2\u019ev\3\2\2\2\u019f\u01a0\7~\2\2\u01a0x\3\2"+
		"\2\2\u01a1\u01a2\7`\2\2\u01a2z\3\2\2\2\u01a3\u01a4\7(\2\2\u01a4\u01a5"+
		"\7(\2\2\u01a5|\3\2\2\2\u01a6\u01a7\7~\2\2\u01a7\u01a8\7~\2\2\u01a8~\3"+
		"\2\2\2\u01a9\u01aa\7?\2\2\u01aa\u0080\3\2\2\2\u01ab\u01ac\7-\2\2\u01ac"+
		"\u01ad\7?\2\2\u01ad\u0082\3\2\2\2\u01ae\u01af\7/\2\2\u01af\u01b0\7?\2"+
		"\2\u01b0\u0084\3\2\2\2\u01b1\u01b2\7,\2\2\u01b2\u01b3\7?\2\2\u01b3\u0086"+
		"\3\2\2\2\u01b4\u01b5\7\61\2\2\u01b5\u01b6\7?\2\2\u01b6\u0088\3\2\2\2\u01b7"+
		"\u01b8\7\'\2\2\u01b8\u01b9\7?\2\2\u01b9\u008a\3\2\2\2\u01ba\u01bb\7(\2"+
		"\2\u01bb\u01bc\7?\2\2\u01bc\u008c\3\2\2\2\u01bd\u01be\7~\2\2\u01be\u01bf"+
		"\7?\2\2\u01bf\u008e\3\2\2\2\u01c0\u01c1\7`\2\2\u01c1\u01c2\7?\2\2\u01c2"+
		"\u0090\3\2\2\2\u01c3\u01c4\7>\2\2\u01c4\u01c5\7>\2\2\u01c5\u01c6\7?\2"+
		"\2\u01c6\u0092\3\2\2\2\u01c7\u01c8\7@\2\2\u01c8\u01c9\7@\2\2\u01c9\u01ca"+
		"\7?\2\2\u01ca\u0094\3\2\2\2\u01cb\u01cc\7=\2\2\u01cc\u0096\3\2\2\2\u01cd"+
		"\u01d1\t\2\2\2\u01ce\u01d0\t\3\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u0098\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d7\5\u009dO\2\u01d5\u01d7\5\u009fP\2\u01d6\u01d4"+
		"\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u009a\3\2\2\2\u01d8\u01dc\7)\2\2\u01d9"+
		"\u01db\n\4\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\7)\2\2\u01e0\u009c\3\2\2\2\u01e1\u01e6\7$\2\2\u01e2\u01e5\5\u00a5"+
		"S\2\u01e3\u01e5\n\4\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e3\3\2\2\2\u01e5"+
		"\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2"+
		"\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7$\2\2\u01ea\u009e\3\2\2\2\u01eb"+
		"\u01ec\7}\2\2\u01ec\u01ed\7$\2\2\u01ed\u01f1\3\2\2\2\u01ee\u01f0\5\u00a1"+
		"Q\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7$"+
		"\2\2\u01f5\u01f6\7\177\2\2\u01f6\u00a0\3\2\2\2\u01f7\u01fa\5\u00a3R\2"+
		"\u01f8\u01fa\5\u00a5S\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u00a2\3\2\2\2\u01fb\u01fc\n\5\2\2\u01fc\u00a4\3\2\2\2\u01fd\u01fe\7^"+
		"\2\2\u01fe\u0202\13\2\2\2\u01ff\u0200\7^\2\2\u0200\u0202\5\13\6\2\u0201"+
		"\u01fd\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u00a6\3\2\2\2\u0203\u0206\5\u00a9"+
		"U\2\u0204\u0206\5\u00b9]\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u00a8\3\2\2\2\u0207\u020b\5\u00abV\2\u0208\u020b\5\u00adW\2\u0209\u020b"+
		"\5\u00afX\2\u020a\u0207\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2"+
		"\2\u020b\u00aa\3\2\2\2\u020c\u0210\5\u00b3Z\2\u020d\u020f\5\u00b1Y\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0215\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0215\7\62\2\2\u0214"+
		"\u020c\3\2\2\2\u0214\u0213\3\2\2\2\u0215\u00ac\3\2\2\2\u0216\u0217\7\62"+
		"\2\2\u0217\u0218\7z\2\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u00b5[\2\u021a"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2"+
		"\2\2\u021d\u00ae\3\2\2\2\u021e\u0220\7\62\2\2\u021f\u0221\5\u00b7\\\2"+
		"\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223"+
		"\3\2\2\2\u0223\u00b0\3\2\2\2\u0224\u0225\t\6\2\2\u0225\u00b2\3\2\2\2\u0226"+
		"\u0227\t\7\2\2\u0227\u00b4\3\2\2\2\u0228\u0229\t\b\2\2\u0229\u00b6\3\2"+
		"\2\2\u022a\u022b\t\t\2\2\u022b\u00b8\3\2\2\2\u022c\u022d\5\u00abV\2\u022d"+
		"\u0231\7\60\2\2\u022e\u0230\5\u00b1Y\2\u022f\u022e\3\2\2\2\u0230\u0233"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0234\u0236\5\u00bd_\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u023f\3\2\2\2\u0237\u0239\5\u00b1Y\2\u0238\u0237\3\2\2"+
		"\2\u0239\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c"+
		"\3\2\2\2\u023c\u023d\5\u00bd_\2\u023d\u023f\3\2\2\2\u023e\u022c\3\2\2"+
		"\2\u023e\u0238\3\2\2\2\u023f\u00ba\3\2\2\2\u0240\u0242\5\u00b1Y\2\u0241"+
		"\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u00bc\3\2\2\2\u0245\u0247\t\n\2\2\u0246\u0248\t\13\2\2\u0247"+
		"\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u024b\5\u00b1"+
		"Y\2\u024a\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024a\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u00be\3\2\2\2\u024e\u0250\t\f\2\2\u024f\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\b`\2\2\u0254\u00c0\3\2\2\2\u0255\u0258\5\u00c3"+
		"b\2\u0256\u0258\5\u00c5c\2\u0257\u0255\3\2\2\2\u0257\u0256\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u025a\ba\2\2\u025a\u00c2\3\2\2\2\u025b\u025c\7\61"+
		"\2\2\u025c\u025d\7\61\2\2\u025d\u0262\3\2\2\2\u025e\u0261\5\u00a5S\2\u025f"+
		"\u0261\n\r\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u00c4\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0265\u0266\7\61\2\2\u0266\u0267\7,\2\2\u0267\u026b\3\2"+
		"\2\2\u0268\u026a\13\2\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026e\u026f\7,\2\2\u026f\u0270\7\61\2\2\u0270\u00c6\3\2\2\2\u0271"+
		"\u0272\13\2\2\2\u0272\u00c8\3\2\2\2\37\2\u00d2\u00d6\u01d1\u01d6\u01dc"+
		"\u01e4\u01e6\u01f1\u01f9\u0201\u0205\u020a\u0210\u0214\u021c\u0222\u0231"+
		"\u0235\u023a\u023e\u0243\u0247\u024c\u0251\u0257\u0260\u0262\u026b\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}