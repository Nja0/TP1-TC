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
IGUAL : '=' ;
SUMA:  '+';
RESTA: '-';
MULTIPLICACION: '*';
DIVISION : '/';
MODULO : '%';

// Variables
INT : 'int' ;
DOUBLE: 'double';
BOOL: 'boolean';

// Palabras reservadas
IWHILE: 'while';
IIF: 'if';
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


ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

bloque : LLA instrucciones LLC (PYC|);

instruccion : declaracion PYC
            | asignacion PYC
            | condicional_if 
            | bucle_for
            | bucle_while 
            ;

declaracion : variable ID  
            | variable ID IGUAL exp 
            ;

variable : INT
         | DOUBLE
         | BOOL
         ;

asignacion : ID IGUAL exp;

expresiones : exp PYC expresiones 
            | EOF
 ;

exp : term t;

term : factor t;

t : SUMA term
  | RESTA term
  | 
  ;

factor : NUMERO
       | ID
       | PA exp PC
       ;

f : MULTIPLICACION factor f
  | DIVISION factor f
  | MODULO factor f
  |
  ;

condicional_if : IIF PA econdicion PC bloque;

bucle_for : IFOR PA (declaracion PYC econdicion PYC incrementos)PC bloque;

bucle_while : IWHILE PA econdicion PC bloque;

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
