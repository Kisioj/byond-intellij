parser grammar DMParser;

options { tokenVocab=DMIndentingLexer; }

start: (var_stmt | funcdefs | classdef | NEWLINE)* EOF;


var_stmt
 : 'var' NEWLINE INDENT var_path+ DEDENT
 | 'var' '/' var_path
 ;

var_path
 : (NAME | 'tmp') NEWLINE INDENT var_path+ DEDENT
 | (NAME | 'tmp') '/' var_path
 | vardef NEWLINE
 ;


vardef: NAME ('=' expr)?;
attr_assignment: NAME '=' expr;


inline_var_stmt: 'var' '/' inline_var_path;  // can be used in for loop
inline_var_path
 : NAME '/' inline_var_path
 | vardef
 ;


classdef
 : NAME NEWLINE INDENT class_body+ DEDENT
 | NAME '/' class_body
 ;
class_body: var_stmt | funcdefs | classdef | attr_assignment NEWLINE;


funcdefs
 : func_type? NEWLINE INDENT funcdef+ DEDENT
 | (func_type '/')? funcdef
 ;
func_type: 'proc' | 'verb';
funcdef: NAME '(' parameters? ')' (suite | NEWLINE); //possible empty function body
parameters: parameter (',' parameter)*  (',')?;
parameter: (NAME | ('var' '/')? inline_var_path) ('=' expr)? ('as' NAME ('|' NAME)* )? ('in' expr)?;

suite: simple_stmt | NEWLINE INDENT stmt+ DEDENT;


stmt: simple_stmt | compound_stmt;

simple_stmt: small_stmt NEWLINE;
small_stmt: del_stmt | flow_stmt | expr;

set_stmt: 'set' NAME ('=' | 'in') expr;
del_stmt: 'del' expr;
flow_stmt: set_stmt | break_stmt | continue_stmt | return_stmt;


compound_stmt: var_stmt | if_stmt | dowhile_stmt | while_stmt | for_stmt | foreach_stmt | spawn_stmt;




if_stmt: 'if' '(' expr ')' suite ('else' 'if' '(' expr ')' suite)* ('else' suite)?;
dowhile_stmt: 'do' suite 'while' '(' expr ')';
while_stmt: 'while' '(' expr ')' suite;
spawn_stmt: 'spawn' '(' expr? ')' suite;


for_stmt: 'for' '(' ((expr|inline_var_stmt)? (','|';') expr? (','|';') expr?)? ')' suite;
foreach_stmt: 'for' '(' (inline_var_stmt|NAME) ('as' NAME)? ('in' expr)? ')' suite;

break_stmt: 'break';
continue_stmt: 'continue';
return_stmt: 'return' expr?;

expr
    : '(' expr ')'                                                                          #bracket_expr
    | expr func_trailer                                                                     #func_trailer_expr
    | expr index_trailer                                                                    #index_trailer_expr
    | expr attr_trailer                                                                     #attr_trailer_expr
    | ('~' | '!' | '-' | '++' | '--') expr                                                  #onearg_expr
    | '**' expr                                                                             #power_expr
    | expr ('*' | '/' | '%') expr                                                           #mult_expr
    | expr ('+' | '-') expr                                                                 #add_expr
    | expr ('<' | '<=' | '>' | '>=') expr                                                   #comp_expr
    | expr ('<<' | '>>') expr                                                               #bitmove_expr
    | expr ('==' | '!=' | '<>') expr                                                        #eq_expr
    | expr ('&' | '^' | '|') expr                                                           #bit_expr
    | expr '&&' expr                                                                        #logand_expr
    | expr '||' expr                                                                        #logor_expr
    | expr '?' expr ':' expr                                                                #tenary_expr

    | expr 'as' NAME                                                                        #as_expr
    | expr 'in' expr                                                                        #in_expr

    | expr ('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '<<=' | '>>=') expr      #assign_expr
    | new_stmt expr?                                                                        #new_expr
    | value                                                                                 #val_expr
    ;


func_trailer: '(' arglist? ')';
index_trailer: '[' expr ']';
attr_trailer: ('.' | ':') NAME;
arglist: expr (',' expr)*  (',')?;


func_call: NAME attr_trailer* func_trailer;
value: func_call | STRING_LITERAL | ICON_PATH | NUMBER | NAME | path | '..' | '.';




new_stmt: 'new' path?;  // implicit type (when empty path) may only be used in an assignment
path: ('/' (NAME | func_type) )+ '/'?;