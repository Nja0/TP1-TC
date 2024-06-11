grammar compiladores;

@header {
package primerproyecto;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

WS : [ \t\n\r] -> skip ;
// OTRO : . ;

PA : '(' ;
PC : ')' ;
LLA : '{' ;
LLC : '}' ;
PYC : ';' ;
COMA: ',' ;
IGUAL : '=' ;
SUMA:  '+' ;
RESTA: '-' ;
MULTIPLICACION: '*' ;
DIVISION : '/' ;
MODULO : '%' ;
PUNT : '.' ;

// Variables
INT : 'int' ;
DOUBLE: 'double' ;
BOOL: 'bool' ;
VOID : 'void' ;

// Palabras reservadas
IWHILE: 'while' ;
IIF: 'if' ;
IELSE: 'else' ;
IFOR: 'for' ;
IRETURN: 'return' ;

// Identificadores y números
ID: LETRA (LETRA | DIGITO)* ;
NUM: DIGITO+ ;

// Reglas
programa: (declaracion | funcion)* ;

declaracion: tipo listaDeclaracion PYC ;
listaDeclaracion: ID (COMA ID)*;

tipo: INT | DOUBLE | BOOL | VOID ;

funcion: tipo ID PA parametros? PC bloque ;

parametros: parametro (COMA parametro)* ;
parametro: tipo ID ;

bloque: LLA (declaracion | sentencia)* LLC ;

sentencia: asignacion PYC
         | llamadaFuncion PYC
         | bloque
         | IRETURN expresion? PYC
         | estructuraControl
         ;

asignacion: ID IGUAL expresion ;

llamadaFuncion: ID PA argumentos? PC ;

argumentos: expresion (COMA expresion)* ;

estructuraControl: estructuraIf
                 | estructuraWhile
                 | estructuraFor
                 ;

estructuraIf: IIF PA expresion PC bloque (IELSE bloque)? ;
estructuraWhile: IWHILE PA expresion PC bloque ;
estructuraFor: IFOR PA (asignacion PYC)? expresion? PYC (asignacion)? PC bloque ;

expresion: expresion (SUMA | RESTA | MULTIPLICACION | DIVISION | MODULO) expresion
         | PA expresion PC
         | ID
         | NUM
         |
         ;
