lexer grammar CommonLexerRules;

/* BYOND reserved keywords */
SWITCH : 'switch';
IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
DO : 'do';
BREAK : 'break';
CONTINUE : 'continue';
IN : 'in';

VAR : 'var';
CONST : 'const';

DEL : 'del';
RETURN : 'return';
SET : 'set';
TO : 'to';
AS : 'as';
GOTO : 'goto';
NEW : 'new';
SPAWN : 'spawn';

TRY : 'try';
CATCH : 'catch';


/* BYOND not reserved keywords (for this grammar they will be reserved) */
VERB : 'verb';
PROC : 'proc';

GLOBAL : 'global';
STATIC : 'static';
ARG : 'arg';
TMP : 'tmp';

/* built-in functions*/
//INPUT : 'input';


/*  */
DOUBLE_DOT: '..';
DOT : '.';
COMMA : ',';
STAR : '*';
PERCENT : '%';
SLASH : '/';
fragment BACKSLASH : '\\';
COLON : ':';
QUESTION_MARK : '?';

NOT_OP : '~';
NEG_OP : '!';
MINUS : '-';
PLUS : '+';
INCREMENT : '++';
DECREMENT : '--';

POWER : '**';

LESS_THAN : '<';
GREATER_THAN : '>';
LESS_THAN_OR_EQUAL : '<=';
GREATER_THAN_OR_EQUAL : '>=';

SHIFT_LEFT : '<<';
SHIFT_RIGHT : '>>';

EQUAL : '==';
NOT_EQUAL : '!=';
NOT_EQUAL_2 : '<>';

BIT_AND : '&' ;
BIT_OR : '|';
BIT_XOR : '^' ;

LOG_AND : '&&';
LOG_OR : '||';

ASSIGN : '=';
ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MULT_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
BIT_AND_ASSIGN : '&=';
BIT_OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
LEFT_SHIFT_ASSIGN : '<<=';
RIGHT_SHIFT_ASSIGN : '>>=';



SEMICOLON : ';';

NAME: [_a-zA-Z][_a-zA-Z0-9]*;

STRING_LITERAL : SHORT_STRING | LONG_STRING;
ICON_PATH : '\'' (~["\\\r\n\f])* '\'';

fragment SHORT_STRING : '"' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f"] )* '"';
fragment LONG_STRING :  '{"' LONG_STRING_ITEM*? '"}';

fragment LONG_STRING_ITEM
 : LONG_STRING_CHAR
 | STRING_ESCAPE_SEQ
 ;

fragment LONG_STRING_CHAR
 : ~'\\'
 ;

fragment STRING_ESCAPE_SEQ
 : '\\' .
 | '\\' NEWLINE
 ;

NUMBER
 : INTEGER
 | FLOAT
 ;

fragment INTEGER
 : DEC
 | HEX
 | OCT
 ;

fragment DEC
 : NON_ZERO_DIGIT DIGIT*
 | '0'
 ;

fragment HEX : '0x' HEX_DIGIT+ ;
fragment OCT : '0' OCT_DIGIT+;

fragment DIGIT : [0-9];
fragment NON_ZERO_DIGIT : [1-9];
fragment HEX_DIGIT : [0-9a-fA-F];
fragment OCT_DIGIT : [0-7];

fragment FLOAT
 : DEC '.' DIGIT* EXPONENT?
 | DIGIT+ EXPONENT
 ;

fragment INT_PART : DIGIT+;
fragment EXPONENT : [eE] [+-]? DIGIT+;


SPACES
 : [ \t]+ -> channel(HIDDEN)
 ;


INLINE_COMMENT : '//' ( STRING_ESCAPE_SEQ | ~[\\\r\n\f] )* -> channel(HIDDEN);

MULTILINE_COMMENT_START : '/*' -> more, pushMode(MULTILINE_COMMENT_MODE);


UNKNOWN_CHAR: .  -> channel(HIDDEN);


mode MULTILINE_COMMENT_MODE;
MULTILINE_COMMENT_START_NESTED : '/*' -> more, pushMode(MULTILINE_COMMENT_MODE);
MULTILINE_COMMENT: ('*/' | EOF) -> popMode, channel(HIDDEN);
IGNORE : . -> more;
