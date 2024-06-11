// Generated from c:/Users/torus/OneDrive/Documentos/GitHub/TP1-TC/src/main/java/primerproyecto/compiladores.g4 by ANTLR 4.13.1

package primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listaDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracion(compiladoresParser.ListaDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(compiladoresParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(compiladoresParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(compiladoresParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#estructuraControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraControl(compiladoresParser.EstructuraControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#estructuraIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraIf(compiladoresParser.EstructuraIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#estructuraWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraWhile(compiladoresParser.EstructuraWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#estructuraFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuraFor(compiladoresParser.EstructuraForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparadores(compiladoresParser.ComparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadores_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores_log(compiladoresParser.Operadores_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operadores_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores_bool(compiladoresParser.Operadores_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#incrementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementos(compiladoresParser.IncrementosContext ctx);
}