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
	 * Enter a parse tree produced by {@link compiladoresParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracion(compiladoresParser.ListaDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracion(compiladoresParser.ListaDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(compiladoresParser.TipoContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(compiladoresParser.ParametroContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(compiladoresParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(compiladoresParser.SentenciaContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#estructuraControl}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraControl(compiladoresParser.EstructuraControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#estructuraControl}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraControl(compiladoresParser.EstructuraControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#estructuraIf}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraIf(compiladoresParser.EstructuraIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#estructuraIf}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraIf(compiladoresParser.EstructuraIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#estructuraWhile}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraWhile(compiladoresParser.EstructuraWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#estructuraWhile}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraWhile(compiladoresParser.EstructuraWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#estructuraFor}.
	 * @param ctx the parse tree
	 */
	void enterEstructuraFor(compiladoresParser.EstructuraForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#estructuraFor}.
	 * @param ctx the parse tree
	 */
	void exitEstructuraFor(compiladoresParser.EstructuraForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
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