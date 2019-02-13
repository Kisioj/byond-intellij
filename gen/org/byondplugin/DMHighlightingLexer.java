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
		NUMBER=77, SPACES=78, INLINE_COMMENT=79, UNKNOWN_CHAR=80, MULTILINE_COMMENT=81, 
		MULTILINE_COMMENT_START=82;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u0282\b\1\b\1\4"+
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
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\5\6\u00d8\n\6\3\6\3\6\5\6\u00dc\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:"+
		"\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C"+
		"\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J"+
		"\3J\3K\3K\3L\3L\7L\u01d5\nL\fL\16L\u01d8\13L\3M\3M\5M\u01dc\nM\3N\3N\7"+
		"N\u01e0\nN\fN\16N\u01e3\13N\3N\3N\3O\3O\3O\7O\u01ea\nO\fO\16O\u01ed\13"+
		"O\3O\3O\3P\3P\3P\3P\7P\u01f5\nP\fP\16P\u01f8\13P\3P\3P\3P\3Q\3Q\5Q\u01ff"+
		"\nQ\3R\3R\3S\3S\3S\3S\5S\u0207\nS\3T\3T\5T\u020b\nT\3U\3U\3U\5U\u0210"+
		"\nU\3V\3V\7V\u0214\nV\fV\16V\u0217\13V\3V\5V\u021a\nV\3W\3W\3W\3W\6W\u0220"+
		"\nW\rW\16W\u0221\3X\3X\6X\u0226\nX\rX\16X\u0227\3Y\3Y\3Z\3Z\3[\3[\3\\"+
		"\3\\\3]\3]\3]\7]\u0235\n]\f]\16]\u0238\13]\3]\5]\u023b\n]\3]\6]\u023e"+
		"\n]\r]\16]\u023f\3]\3]\5]\u0244\n]\3^\6^\u0247\n^\r^\16^\u0248\3_\3_\5"+
		"_\u024d\n_\3_\6_\u0250\n_\r_\16_\u0251\3`\6`\u0255\n`\r`\16`\u0256\3`"+
		"\3`\3a\3a\3a\3a\3a\7a\u0260\na\fa\16a\u0263\13a\3a\3a\3b\3b\3b\3b\3b\3"+
		"b\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\5e\u027a\ne\3e\3e\3e\3f\3f\3"+
		"f\3f\3\u01f6\2g\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32"+
		"\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66"+
		"\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P\2R)T*V+X,Z-\\.^/`\60b\61d\62f\63"+
		"h\64j\65l\66n\67p8r9t:v;x<z=|>~?\u0080@\u0082A\u0084B\u0086C\u0088D\u008a"+
		"E\u008cF\u008eG\u0090H\u0092I\u0094J\u0096K\u0098L\u009aM\u009cN\u009e"+
		"\2\u00a0\2\u00a2\2\u00a4\2\u00a6\2\u00a8O\u00aa\2\u00ac\2\u00ae\2\u00b0"+
		"\2\u00b2\2\u00b4\2\u00b6\2\u00b8\2\u00ba\2\u00bc\2\u00be\2\u00c0P\u00c2"+
		"Q\u00c4T\u00c6R\u00c8\2\u00caS\u00cc\2\4\2\3\16\5\2C\\aac|\6\2\62;C\\"+
		"aac|\6\2\f\f\16\17$$^^\3\2^^\3\2\62;\3\2\63;\5\2\62;CHch\3\2\629\4\2G"+
		"Ggg\4\2--//\4\2\13\13\"\"\5\2\f\f\16\17^^\2\u028b\2\4\3\2\2\2\2\6\3\2"+
		"\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22"+
		"\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2"+
		"\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2"+
		"\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3"+
		"\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2"+
		"\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2"+
		"\2N\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\"+
		"\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2"+
		"\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2"+
		"\2v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2"+
		"\2\2\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a"+
		"\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2"+
		"\2\2\u0094\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2\2\2\u009a\3\2\2\2\2\u009c"+
		"\3\2\2\2\2\u00a8\3\2\2\2\2\u00c0\3\2\2\2\2\u00c2\3\2\2\2\2\u00c4\3\2\2"+
		"\2\2\u00c6\3\2\2\2\3\u00c8\3\2\2\2\3\u00ca\3\2\2\2\3\u00cc\3\2\2\2\4\u00ce"+
		"\3\2\2\2\6\u00d0\3\2\2\2\b\u00d2\3\2\2\2\n\u00d4\3\2\2\2\f\u00db\3\2\2"+
		"\2\16\u00df\3\2\2\2\20\u00e6\3\2\2\2\22\u00e9\3\2\2\2\24\u00ee\3\2\2\2"+
		"\26\u00f2\3\2\2\2\30\u00f8\3\2\2\2\32\u00fb\3\2\2\2\34\u0101\3\2\2\2\36"+
		"\u010a\3\2\2\2 \u010d\3\2\2\2\"\u0111\3\2\2\2$\u0117\3\2\2\2&\u011b\3"+
		"\2\2\2(\u0122\3\2\2\2*\u0126\3\2\2\2,\u0129\3\2\2\2.\u012c\3\2\2\2\60"+
		"\u0131\3\2\2\2\62\u0135\3\2\2\2\64\u013b\3\2\2\2\66\u013f\3\2\2\28\u0145"+
		"\3\2\2\2:\u014a\3\2\2\2<\u014f\3\2\2\2>\u0156\3\2\2\2@\u015d\3\2\2\2B"+
		"\u0161\3\2\2\2D\u0165\3\2\2\2F\u0168\3\2\2\2H\u016a\3\2\2\2J\u016c\3\2"+
		"\2\2L\u016e\3\2\2\2N\u0170\3\2\2\2P\u0172\3\2\2\2R\u0174\3\2\2\2T\u0176"+
		"\3\2\2\2V\u0178\3\2\2\2X\u017a\3\2\2\2Z\u017c\3\2\2\2\\\u017e\3\2\2\2"+
		"^\u0180\3\2\2\2`\u0183\3\2\2\2b\u0186\3\2\2\2d\u0189\3\2\2\2f\u018b\3"+
		"\2\2\2h\u018d\3\2\2\2j\u0190\3\2\2\2l\u0193\3\2\2\2n\u0196\3\2\2\2p\u0199"+
		"\3\2\2\2r\u019c\3\2\2\2t\u019f\3\2\2\2v\u01a2\3\2\2\2x\u01a4\3\2\2\2z"+
		"\u01a6\3\2\2\2|\u01a8\3\2\2\2~\u01ab\3\2\2\2\u0080\u01ae\3\2\2\2\u0082"+
		"\u01b0\3\2\2\2\u0084\u01b3\3\2\2\2\u0086\u01b6\3\2\2\2\u0088\u01b9\3\2"+
		"\2\2\u008a\u01bc\3\2\2\2\u008c\u01bf\3\2\2\2\u008e\u01c2\3\2\2\2\u0090"+
		"\u01c5\3\2\2\2\u0092\u01c8\3\2\2\2\u0094\u01cc\3\2\2\2\u0096\u01d0\3\2"+
		"\2\2\u0098\u01d2\3\2\2\2\u009a\u01db\3\2\2\2\u009c\u01dd\3\2\2\2\u009e"+
		"\u01e6\3\2\2\2\u00a0\u01f0\3\2\2\2\u00a2\u01fe\3\2\2\2\u00a4\u0200\3\2"+
		"\2\2\u00a6\u0206\3\2\2\2\u00a8\u020a\3\2\2\2\u00aa\u020f\3\2\2\2\u00ac"+
		"\u0219\3\2\2\2\u00ae\u021b\3\2\2\2\u00b0\u0223\3\2\2\2\u00b2\u0229\3\2"+
		"\2\2\u00b4\u022b\3\2\2\2\u00b6\u022d\3\2\2\2\u00b8\u022f\3\2\2\2\u00ba"+
		"\u0243\3\2\2\2\u00bc\u0246\3\2\2\2\u00be\u024a\3\2\2\2\u00c0\u0254\3\2"+
		"\2\2\u00c2\u025a\3\2\2\2\u00c4\u0266\3\2\2\2\u00c6\u026c\3\2\2\2\u00c8"+
		"\u0270\3\2\2\2\u00ca\u0279\3\2\2\2\u00cc\u027e\3\2\2\2\u00ce\u00cf\7]"+
		"\2\2\u00cf\5\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1\7\3\2\2\2\u00d2\u00d3\7"+
		"*\2\2\u00d3\t\3\2\2\2\u00d4\u00d5\7+\2\2\u00d5\13\3\2\2\2\u00d6\u00d8"+
		"\7\17\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2"+
		"\u00d9\u00dc\7\f\2\2\u00da\u00dc\4\16\17\2\u00db\u00d7\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\6\2\2\u00de\r\3\2\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7e\2\2\u00e4\u00e5\7j\2\2\u00e5\17\3\2\2\2\u00e6\u00e7\7"+
		"k\2\2\u00e7\u00e8\7h\2\2\u00e8\21\3\2\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed\23\3\2\2\2\u00ee\u00ef"+
		"\7h\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7t\2\2\u00f1\25\3\2\2\2\u00f2\u00f3"+
		"\7y\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\27\3\2\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\31\3\2\2\2\u00fb\u00fc\7d\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7g\2\2\u00fe"+
		"\u00ff\7c\2\2\u00ff\u0100\7m\2\2\u0100\33\3\2\2\2\u0101\u0102\7e\2\2\u0102"+
		"\u0103\7q\2\2\u0103\u0104\7p\2\2\u0104\u0105\7v\2\2\u0105\u0106\7k\2\2"+
		"\u0106\u0107\7p\2\2\u0107\u0108\7w\2\2\u0108\u0109\7g\2\2\u0109\35\3\2"+
		"\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\37\3\2\2\2\u010d\u010e"+
		"\7x\2\2\u010e\u010f\7c\2\2\u010f\u0110\7t\2\2\u0110!\3\2\2\2\u0111\u0112"+
		"\7e\2\2\u0112\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115\7u\2\2\u0115"+
		"\u0116\7v\2\2\u0116#\3\2\2\2\u0117\u0118\7f\2\2\u0118\u0119\7g\2\2\u0119"+
		"\u011a\7n\2\2\u011a%\3\2\2\2\u011b\u011c\7t\2\2\u011c\u011d\7g\2\2\u011d"+
		"\u011e\7v\2\2\u011e\u011f\7w\2\2\u011f\u0120\7t\2\2\u0120\u0121\7p\2\2"+
		"\u0121\'\3\2\2\2\u0122\u0123\7u\2\2\u0123\u0124\7g\2\2\u0124\u0125\7v"+
		"\2\2\u0125)\3\2\2\2\u0126\u0127\7v\2\2\u0127\u0128\7q\2\2\u0128+\3\2\2"+
		"\2\u0129\u012a\7c\2\2\u012a\u012b\7u\2\2\u012b-\3\2\2\2\u012c\u012d\7"+
		"i\2\2\u012d\u012e\7q\2\2\u012e\u012f\7v\2\2\u012f\u0130\7q\2\2\u0130/"+
		"\3\2\2\2\u0131\u0132\7p\2\2\u0132\u0133\7g\2\2\u0133\u0134\7y\2\2\u0134"+
		"\61\3\2\2\2\u0135\u0136\7u\2\2\u0136\u0137\7r\2\2\u0137\u0138\7c\2\2\u0138"+
		"\u0139\7y\2\2\u0139\u013a\7p\2\2\u013a\63\3\2\2\2\u013b\u013c\7v\2\2\u013c"+
		"\u013d\7t\2\2\u013d\u013e\7{\2\2\u013e\65\3\2\2\2\u013f\u0140\7e\2\2\u0140"+
		"\u0141\7c\2\2\u0141\u0142\7v\2\2\u0142\u0143\7e\2\2\u0143\u0144\7j\2\2"+
		"\u0144\67\3\2\2\2\u0145\u0146\7x\2\2\u0146\u0147\7g\2\2\u0147\u0148\7"+
		"t\2\2\u0148\u0149\7d\2\2\u01499\3\2\2\2\u014a\u014b\7r\2\2\u014b\u014c"+
		"\7t\2\2\u014c\u014d\7q\2\2\u014d\u014e\7e\2\2\u014e;\3\2\2\2\u014f\u0150"+
		"\7i\2\2\u0150\u0151\7n\2\2\u0151\u0152\7q\2\2\u0152\u0153\7d\2\2\u0153"+
		"\u0154\7c\2\2\u0154\u0155\7n\2\2\u0155=\3\2\2\2\u0156\u0157\7u\2\2\u0157"+
		"\u0158\7v\2\2\u0158\u0159\7c\2\2\u0159\u015a\7v\2\2\u015a\u015b\7k\2\2"+
		"\u015b\u015c\7e\2\2\u015c?\3\2\2\2\u015d\u015e\7c\2\2\u015e\u015f\7t\2"+
		"\2\u015f\u0160\7i\2\2\u0160A\3\2\2\2\u0161\u0162\7v\2\2\u0162\u0163\7"+
		"o\2\2\u0163\u0164\7r\2\2\u0164C\3\2\2\2\u0165\u0166\7\60\2\2\u0166\u0167"+
		"\7\60\2\2\u0167E\3\2\2\2\u0168\u0169\7\60\2\2\u0169G\3\2\2\2\u016a\u016b"+
		"\7.\2\2\u016bI\3\2\2\2\u016c\u016d\7,\2\2\u016dK\3\2\2\2\u016e\u016f\7"+
		"\'\2\2\u016fM\3\2\2\2\u0170\u0171\7\61\2\2\u0171O\3\2\2\2\u0172\u0173"+
		"\7^\2\2\u0173Q\3\2\2\2\u0174\u0175\7<\2\2\u0175S\3\2\2\2\u0176\u0177\7"+
		"A\2\2\u0177U\3\2\2\2\u0178\u0179\7\u0080\2\2\u0179W\3\2\2\2\u017a\u017b"+
		"\7#\2\2\u017bY\3\2\2\2\u017c\u017d\7/\2\2\u017d[\3\2\2\2\u017e\u017f\7"+
		"-\2\2\u017f]\3\2\2\2\u0180\u0181\7-\2\2\u0181\u0182\7-\2\2\u0182_\3\2"+
		"\2\2\u0183\u0184\7/\2\2\u0184\u0185\7/\2\2\u0185a\3\2\2\2\u0186\u0187"+
		"\7,\2\2\u0187\u0188\7,\2\2\u0188c\3\2\2\2\u0189\u018a\7>\2\2\u018ae\3"+
		"\2\2\2\u018b\u018c\7@\2\2\u018cg\3\2\2\2\u018d\u018e\7>\2\2\u018e\u018f"+
		"\7?\2\2\u018fi\3\2\2\2\u0190\u0191\7@\2\2\u0191\u0192\7?\2\2\u0192k\3"+
		"\2\2\2\u0193\u0194\7>\2\2\u0194\u0195\7>\2\2\u0195m\3\2\2\2\u0196\u0197"+
		"\7@\2\2\u0197\u0198\7@\2\2\u0198o\3\2\2\2\u0199\u019a\7?\2\2\u019a\u019b"+
		"\7?\2\2\u019bq\3\2\2\2\u019c\u019d\7#\2\2\u019d\u019e\7?\2\2\u019es\3"+
		"\2\2\2\u019f\u01a0\7>\2\2\u01a0\u01a1\7@\2\2\u01a1u\3\2\2\2\u01a2\u01a3"+
		"\7(\2\2\u01a3w\3\2\2\2\u01a4\u01a5\7~\2\2\u01a5y\3\2\2\2\u01a6\u01a7\7"+
		"`\2\2\u01a7{\3\2\2\2\u01a8\u01a9\7(\2\2\u01a9\u01aa\7(\2\2\u01aa}\3\2"+
		"\2\2\u01ab\u01ac\7~\2\2\u01ac\u01ad\7~\2\2\u01ad\177\3\2\2\2\u01ae\u01af"+
		"\7?\2\2\u01af\u0081\3\2\2\2\u01b0\u01b1\7-\2\2\u01b1\u01b2\7?\2\2\u01b2"+
		"\u0083\3\2\2\2\u01b3\u01b4\7/\2\2\u01b4\u01b5\7?\2\2\u01b5\u0085\3\2\2"+
		"\2\u01b6\u01b7\7,\2\2\u01b7\u01b8\7?\2\2\u01b8\u0087\3\2\2\2\u01b9\u01ba"+
		"\7\61\2\2\u01ba\u01bb\7?\2\2\u01bb\u0089\3\2\2\2\u01bc\u01bd\7\'\2\2\u01bd"+
		"\u01be\7?\2\2\u01be\u008b\3\2\2\2\u01bf\u01c0\7(\2\2\u01c0\u01c1\7?\2"+
		"\2\u01c1\u008d\3\2\2\2\u01c2\u01c3\7~\2\2\u01c3\u01c4\7?\2\2\u01c4\u008f"+
		"\3\2\2\2\u01c5\u01c6\7`\2\2\u01c6\u01c7\7?\2\2\u01c7\u0091\3\2\2\2\u01c8"+
		"\u01c9\7>\2\2\u01c9\u01ca\7>\2\2\u01ca\u01cb\7?\2\2\u01cb\u0093\3\2\2"+
		"\2\u01cc\u01cd\7@\2\2\u01cd\u01ce\7@\2\2\u01ce\u01cf\7?\2\2\u01cf\u0095"+
		"\3\2\2\2\u01d0\u01d1\7=\2\2\u01d1\u0097\3\2\2\2\u01d2\u01d6\t\2\2\2\u01d3"+
		"\u01d5\t\3\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7\u0099\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9"+
		"\u01dc\5\u009eO\2\u01da\u01dc\5\u00a0P\2\u01db\u01d9\3\2\2\2\u01db\u01da"+
		"\3\2\2\2\u01dc\u009b\3\2\2\2\u01dd\u01e1\7)\2\2\u01de\u01e0\n\4\2\2\u01df"+
		"\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7)\2\2\u01e5"+
		"\u009d\3\2\2\2\u01e6\u01eb\7$\2\2\u01e7\u01ea\5\u00a6S\2\u01e8\u01ea\n"+
		"\4\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2"+
		"\2\2\u01ee\u01ef\7$\2\2\u01ef\u009f\3\2\2\2\u01f0\u01f1\7}\2\2\u01f1\u01f2"+
		"\7$\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f5\5\u00a2Q\2\u01f4\u01f3\3\2\2\2"+
		"\u01f5\u01f8\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9"+
		"\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7$\2\2\u01fa\u01fb\7\177\2\2"+
		"\u01fb\u00a1\3\2\2\2\u01fc\u01ff\5\u00a4R\2\u01fd\u01ff\5\u00a6S\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff\u00a3\3\2\2\2\u0200\u0201\n\5"+
		"\2\2\u0201\u00a5\3\2\2\2\u0202\u0203\7^\2\2\u0203\u0207\13\2\2\2\u0204"+
		"\u0205\7^\2\2\u0205\u0207\5\f\6\2\u0206\u0202\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u00a7\3\2\2\2\u0208\u020b\5\u00aaU\2\u0209\u020b\5\u00ba]\2"+
		"\u020a\u0208\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u00a9\3\2\2\2\u020c\u0210"+
		"\5\u00acV\2\u020d\u0210\5\u00aeW\2\u020e\u0210\5\u00b0X\2\u020f\u020c"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u00ab\3\2\2\2\u0211"+
		"\u0215\5\u00b4Z\2\u0212\u0214\5\u00b2Y\2\u0213\u0212\3\2\2\2\u0214\u0217"+
		"\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021a\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0218\u021a\7\62\2\2\u0219\u0211\3\2\2\2\u0219\u0218\3"+
		"\2\2\2\u021a\u00ad\3\2\2\2\u021b\u021c\7\62\2\2\u021c\u021d\7z\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0220\5\u00b6[\2\u021f\u021e\3\2\2\2\u0220\u0221"+
		"\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u00af\3\2\2\2\u0223"+
		"\u0225\7\62\2\2\u0224\u0226\5\u00b8\\\2\u0225\u0224\3\2\2\2\u0226\u0227"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u00b1\3\2\2\2\u0229"+
		"\u022a\t\6\2\2\u022a\u00b3\3\2\2\2\u022b\u022c\t\7\2\2\u022c\u00b5\3\2"+
		"\2\2\u022d\u022e\t\b\2\2\u022e\u00b7\3\2\2\2\u022f\u0230\t\t\2\2\u0230"+
		"\u00b9\3\2\2\2\u0231\u0232\5\u00acV\2\u0232\u0236\7\60\2\2\u0233\u0235"+
		"\5\u00b2Y\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023b"+
		"\5\u00be_\2\u023a\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0244\3\2\2"+
		"\2\u023c\u023e\5\u00b2Y\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\5\u00be"+
		"_\2\u0242\u0244\3\2\2\2\u0243\u0231\3\2\2\2\u0243\u023d\3\2\2\2\u0244"+
		"\u00bb\3\2\2\2\u0245\u0247\5\u00b2Y\2\u0246\u0245\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u00bd\3\2\2\2\u024a"+
		"\u024c\t\n\2\2\u024b\u024d\t\13\2\2\u024c\u024b\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\5\u00b2Y\2\u024f\u024e\3\2\2\2"+
		"\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u00bf"+
		"\3\2\2\2\u0253\u0255\t\f\2\2\u0254\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\b`"+
		"\2\2\u0259\u00c1\3\2\2\2\u025a\u025b\7\61\2\2\u025b\u025c\7\61\2\2\u025c"+
		"\u0261\3\2\2\2\u025d\u0260\5\u00a6S\2\u025e\u0260\n\r\2\2\u025f\u025d"+
		"\3\2\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0265\ba"+
		"\2\2\u0265\u00c3\3\2\2\2\u0266\u0267\7\61\2\2\u0267\u0268\7,\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\bb\3\2\u026a\u026b\bb\4\2\u026b\u00c5\3\2\2"+
		"\2\u026c\u026d\13\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\bc\2\2\u026f\u00c7"+
		"\3\2\2\2\u0270\u0271\7\61\2\2\u0271\u0272\7,\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\bd\3\2\u0274\u0275\bd\4\2\u0275\u00c9\3\2\2\2\u0276\u0277\7,\2"+
		"\2\u0277\u027a\7\61\2\2\u0278\u027a\7\2\2\3\u0279\u0276\3\2\2\2\u0279"+
		"\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\be\5\2\u027c\u027d\be\2"+
		"\2\u027d\u00cb\3\2\2\2\u027e\u027f\13\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0281\bf\3\2\u0281\u00cd\3\2\2\2\37\2\3\u00d7\u00db\u01d6\u01db\u01e1"+
		"\u01e9\u01eb\u01f6\u01fe\u0206\u020a\u020f\u0215\u0219\u0221\u0227\u0236"+
		"\u023a\u023f\u0243\u0248\u024c\u0251\u0256\u025f\u0261\u0279\6\2\3\2\5"+
		"\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}