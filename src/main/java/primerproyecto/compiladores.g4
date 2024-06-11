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
SUMA:  '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION : '/';
MODULO : '%';
PUNT : '.';

// Variables
INT : 'int' ;
DOUBLE: 'double';
BOOL: 'bool';
VOID : 'void';

// Palabras reservadas
IWHILE: 'while';
IIF: 'if';
IELSE: 'else';
IFOR: 'for';
IRETURN: 'return';

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


NUMERO : DIGITO+ ;

IDOUBLE: DIGITO COMA DIGITO;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;


instruccion : declaracion PYC
            | asignacion 
            | condicional_if 
            | bucle_for
            | bucle_while 
            | funcion
            | llamada_funcion
            | declaracion_funcion
            | vreturn
            ;

bloque : LLA instrucciones LLC (PYC|);

declaracion : variable ID
            | variable ID IGUAL exp 
            ;

variable : INT
         | DOUBLE
         | BOOL
         | VOID
         ;

asignacion : ID IGUAL exp PYC;

expresiones : exp PYC expresiones 
            | EOF
 ;

exp : term t;

term : factor f;

t : SUMA term t
  | RESTA term t
  | 
  ;

factor : NUMERO
       | ID
       | PA exp PC
       | NUMERO PUNT NUMERO
       | TRUE
       | FALSE
       ;

f : MULTIPLICACION factor f
  | DIVISION factor f
  | MODULO factor f
  |
  ;

condicional_if : IIF PA econdicion PC bloque (condicional_else|);

condicional_else : IELSE bloque
                 | IELSE condicional_if
                 |
                 ;

bucle_for : IFOR PA declaracion econdicion PYC incrementos PC bloque;

bucle_while : IWHILE PA econdicion PC bloque;

declaracion_funcion : declaracion PA declaraciones PC PYC;

declaraciones: variable ID
              | variable ID COMA declaraciones
              |
              ;

funcion : declaracion PA (declaraciones|) PC bloque;

llamada_funcion: ID PA llamada_datos PC PYC;

vreturn : IRETURN	factor PYC;

llamada_datos : ID llamada_datos
              | COMA llamada_datos
              |
              ;

econdicion : exp comparadores exp
           | econdicion operadores_log econdicion
           | operadores_bool 
           | exp comparadores operadores_bool
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
          | ID IGUAL exp
           ;
