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
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(compiladoresParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(compiladoresParser.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladoresParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(compiladoresParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condicional_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_if(compiladoresParser.Condicional_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bucle_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_for(compiladoresParser.Bucle_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bucle_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_while(compiladoresParser.Bucle_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamada_datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_datos(compiladoresParser.Llamada_datosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#econdicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcondicion(compiladoresParser.EcondicionContext ctx);
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