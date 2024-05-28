// Generated from c:/Users/torus/OneDrive/Documentos/GitHub/TP1-TC/src/main/java/primerproyecto/compiladores.g4 by ANTLR 4.13.1

package primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(compiladoresParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(compiladoresParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones(compiladoresParser.ExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones(compiladoresParser.ExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladoresParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladoresParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicional_if}.
	 * @param ctx the parse tree
	 */
	void enterCondicional_if(compiladoresParser.Condicional_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicional_if}.
	 * @param ctx the parse tree
	 */
	void exitCondicional_if(compiladoresParser.Condicional_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bucle_for}.
	 * @param ctx the parse tree
	 */
	void enterBucle_for(compiladoresParser.Bucle_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bucle_for}.
	 * @param ctx the parse tree
	 */
	void exitBucle_for(compiladoresParser.Bucle_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void enterBucle_while(compiladoresParser.Bucle_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void exitBucle_while(compiladoresParser.Bucle_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamada_datos}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_datos(compiladoresParser.Llamada_datosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamada_datos}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_datos(compiladoresParser.Llamada_datosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#econdicion}.
	 * @param ctx the parse tree
	 */
	void enterEcondicion(compiladoresParser.EcondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#econdicion}.
	 * @param ctx the parse tree
	 */
	void exitEcondicion(compiladoresParser.EcondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(compiladoresParser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(compiladoresParser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operadores_log}.
	 * @param ctx the parse tree
	 */
	void enterOperadores_log(compiladoresParser.Operadores_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadores_log}.
	 * @param ctx the parse tree
	 */
	void exitOperadores_log(compiladoresParser.Operadores_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#operadores_bool}.
	 * @param ctx the parse tree
	 */
	void enterOperadores_bool(compiladoresParser.Operadores_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operadores_bool}.
	 * @param ctx the parse tree
	 */
	void exitOperadores_bool(compiladoresParser.Operadores_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#incrementos}.
	 * @param ctx the parse tree
	 */
	void enterIncrementos(compiladoresParser.IncrementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#incrementos}.
	 * @param ctx the parse tree
	 */
	void exitIncrementos(compiladoresParser.IncrementosContext ctx);
}