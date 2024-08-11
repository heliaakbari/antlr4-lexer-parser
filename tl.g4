grammar tl;

program: funclist;

funclist: funcdef+;

funcdef: datatype ID '(' paramlist ')' codeblock;

paramlist: param (',' paramlist)* | e;

param: datatype ID;

datatype: 'int' | 'double' | 'boolean' | 'void';

codeblock: '{' stmtlist '}';

stmtlist: (stmt)*;

stmt:
	';'
	| codeblock
	| datatype var (',' var)* ';'
	| ID '=' expr ';'
	| ID '++' ';'
	| ID '--' ';'
	| 'return' ';'
	| 'return' expr ';'
	| 'if' '(' expr ')' stmt
	| 'if' '(' expr ')' stmt 'else' stmt
	| expr ';'
	| loopstmt
	| initstmt
	| poststmt;

loopstmt: 'while' '(' expr ')' stmt;

initstmt: datatype ID '=' expr | ID '=' expr;

poststmt: ID '=' expr | ID '++' | ID '--';

var: ID |<assoc=left> ID '=' expr;

expr:
	atom
	| unit
	| sum
	| comparison
	| logical_and
	| logical_or
	| STRING;

logical_or:
	atom
	| unit
	| sum
	| comparison
	| logical_and ('||' logical_and)*;

logical_and: atom | unit | sum | comparison ('&&' comparison)*;

comparison:
	atom
	| unit
	| sum (('==' | '!=' | '<' | '<=' | '>' | '>=') sum)*;

sum: atom | unit | product (('+' | '-') product)*;

product: atom | unit (('*' | '/' | '%') unit)*;

unit: ('!' | '-')? atom;

atom:
	ID '(' args ')'
	| number // integer
	| '(' expr ')' // parentheses
	| ID
	| 'false'
	| 'true';

// expr: <assoc = right> unop expr | ID '(' args ')' | ID | 'true' | 'false' | STRING | '(' expr ')'
// | number | expr binop expr;

args: expr (',' expr)* | e;

number: INTEGER | DOUBLE;

e: {};

DOUBLE: INTEGER [.]INTEGER [e]? [-]? INTEGER;

INTEGER: [0-9]+;

ID: [_a-zA-Z][_a-zA-Z0-9]*;

STRING: '"' (~[\n\r"\\])* '"';

MULTINE_COMMENT: ('/*' .*? '*/') -> skip;

INLINE_COMMENT: '//' ~[\r\n]* [\r\n] -> skip;

WS: [ \t\r\n] -> skip;