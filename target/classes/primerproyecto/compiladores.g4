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

// Booleanos
TRUE: 'true';
FALSE: 'false';

// Expresiones logicas
AND: '&&';
OR: '||';

// Comparadores
EQUAL: '==';
MAY: '>';
MAYIG: '>=';
MEN : '<';
MENIG: '<=';
DESIG: '!=';

// Identificadores y números
ID: LETRA (LETRA | DIGITO)* ;
NUM: (DIGITO)+ ('.' (DIGITO)+)?;


// Reglas
programa: (instruccion)* ;

instruccion : declaracion PYC
            | asignacion 
            | estructuraIf
            | estructuraFor
            | estructuraWhile 
            | funcion
            | llamadaFuncion
            | declaracion_funcion
            | sentencia
            ;

declaracion : tipo listaDeclaracion (IGUAL expresion)?;
listaDeclaracion: ID (COMA tipo? ID)*;

tipo: INT | DOUBLE | BOOL | VOID ;

funcion: tipo ID PA declaracion? PC bloque PYC;

declaracion_funcion : tipo ID PA declaracion? PC PYC;

parametros: parametro (COMA parametro)* ;
parametro: tipo ID ;

bloque: LLA (instruccion)* LLC ;

sentencia: asignacion PYC
         | llamadaFuncion PYC
         | bloque
         | IRETURN expresion? PYC
         | estructuraControl
         | expresion
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
estructuraFor: IFOR PA (declaracion|asignacion)? PYC expresion? PYC (asignacion|incrementos)? PC bloque ;

expresion: expresion (SUMA | RESTA | MULTIPLICACION | DIVISION | MODULO) expresion
         | PA expresion PC
         | ID
         | NUM
         | expresion (comparadores | operadores_bool | operadores_log) expresion
         | incrementos PYC
         | operadores_bool
         ;


comparadores : EQUAL 
             | MAY 
             | MAYIG 
             | MEN 
             | MENIG  
             | DESIG
             ;

operadores_log: AND
              | OR
              ;

operadores_bool: TRUE
               | FALSE
               ;

incrementos: ID SUMA SUMA
          | ID RESTA RESTA
          | SUMA SUMA ID
          | RESTA RESTA ID
          | ID IGUAL expresion
           ;