grammar ArithGrammer;

// Starting rule
program: expr ;

expr    : expr '+' term
        | expr '-' term
        | term
        ;

term    : type
        | '(' expr ')'
        ;

type    : INT ;

INT     : [0-9]+ ;

WS      : [ \t\r\n]+ -> skip ;