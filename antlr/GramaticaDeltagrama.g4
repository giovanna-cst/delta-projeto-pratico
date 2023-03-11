grammar GramaticaDeltagrama;

@header{
    package antlr;
}

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
WS:[ \r\t\n]* ->skip;
programa: TIPO | SAI':'exp_sa | ENT':'VAR | SE':'(exp_se) | SE':'(exp_se) SENAO':'(exp_senao);
valor: VAR | NUM_INT | NUM_REAL;
exp_sa: valor;
exp_se: (valor OP_COMP valor) OP_LOG (valor OP_COMP valor) inicio;
exp_senao: exp_se | inicio;
inicio: '<'programa'>';
