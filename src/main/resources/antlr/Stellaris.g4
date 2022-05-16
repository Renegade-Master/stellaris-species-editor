grammar Stellaris;

options { caseInsensitive = true; }

// Parser configuration
empires returns [List<dao.empire.UserEmpire> empireList]
@init{$empireList = new ArrayList<dao.empire.UserEmpire>();}: (empire)* EOF;

empire returns [dao.empire.UserEmpire userEmpire]: string OPERATOR map
{$userEmpire = new dao.empire.UserEmpire($map.text);};

//config: (assignment)*;

assignment: field OPERATOR value;
field: string | symbol;

value: integer | percent | real | date | string | symbol | map | array;

// Stellaris Specific
trait: TRAIT;

// Generic
symbol: STRING | INT | SYMBOL;
string: STRING;
integer: INT;
real: REAL;
date: DATE;
percent: PCT;

map: BLOCK_START (assignment)* BLOCK_END;
array: BLOCK_START value+ BLOCK_END;

// Lexer configuration
OPERATOR: '=' | '<>' | '>' | '<' | '<=' | '>=';
BLOCK_START: '{';
BLOCK_END: '}';

// Stellaris Specific
TRAIT: 'trait_'SYMBOL;

// Generic
INT: NEGATION?[0-9]+;
PCT: NEGATION?[0-9]+'%';
REAL: NEGATION?[0-9]+'.'[0-9]+;
DATE: [0-9]+'.'[0-9]+'.'[0-9]+;
STRING : STRING_DELIM (~('"' | '\\') | '\\' ('"' | '\\'))* STRING_DELIM;
SYMBOL: [A-Za-z0-9][:@A-Za-z_0-9.%-]*;

WHITESPACE: [ \t\n\r] + -> skip;
LINE_COMMENT: '#'~[\r\n]* -> channel(HIDDEN);

fragment STRING_DELIM: '"';
fragment NEGATION: '-';
