grammar GramaticaDeltagrama;

fragment NUM: [0-9];
fragment LET: [a-zA-Z];

ENT: 'entrada:';
SAI: 'saida:';
OP_COMP: 'MAIOR' | 'MENOR' | 'IGUAL';
OP_LOG: 'E' | 'OU' | 'NAO';
TIPO: 'int' | 'double' | 'bool' | 'string';
SE: 'se';
SENAO: 'senao';
NUM_INT: NUM+;
NUM_REAL: NUM+('.'NUM+);
ENQ: 'enquanto:';
OP_ARIT: ('+'|'-'|'*'|'/');
OP_ATRI: ':' | '=';
PONT: '!' | '?' | '.' | ',' | ';';
ABRE_COMEN: '/"' ;
FECHA_COMEN: '"/';
INI: '<';
FIM: '>';
AP: '(';
FP: ')';
VAR: LET(NUM|LET)*;
WS: [ \r\t\n]* -> skip;
