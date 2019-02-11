lexer grammar DMHighlightingLexer;
import CommonLexerRules;

OPEN_BRACK : '[' ;
CLOSE_BRACK : ']' ;
OPEN_PAREN : '(' ;
CLOSE_PAREN : ')' ;

NEWLINE : ( '\r'? '\n' | '\r' | '\f' ) -> channel(HIDDEN);

