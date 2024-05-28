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

INT : 'int' ;

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;


programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : LLA instrucciones LLC PYC
            | declaracion
            | asignacion
            ;

declaracion : INT ID PYC ;

asignacion : ID IGUAL exp PYC ;

expresiones : exp PYC expresiones 
| EOF
 ;

exp : term ;

term : factor t ;

t : SUMA term
| RESTA term
| 
;

factor : NUMERO
| ID
;