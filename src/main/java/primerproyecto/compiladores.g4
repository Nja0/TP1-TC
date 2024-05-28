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

// def de variables

INT : 'int' ;
DOUBLE : 'double' ;
BOOL : 'boolean' ;

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

// si : s EOF ;

// s : PA s PC s
//   |
//   ;

// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : LLA instrucciones LLC
            | declaracion
            | asignacion
            ;

declaracion : variable ID PYC ;
            | variable ID IGUAL exp PYC
            ;

variable : INT
         | DOUBLE
         | BOOL
         ;            

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
       | PA exp PC
       ;

f : MULTIPLICACION factor f
  | DIVISION factor f
  | MODULO factor f
  |
  ;