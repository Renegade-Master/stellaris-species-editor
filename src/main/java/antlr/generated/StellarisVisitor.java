// Generated from /home/renegade/workspace/stellaris-species-editor/src/main/resources/antlr/Stellaris.g4 by ANTLR 4.10.1
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StellarisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StellarisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StellarisParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(StellarisParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(StellarisParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(StellarisParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(StellarisParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(StellarisParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StellarisParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(StellarisParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(StellarisParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(StellarisParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent(StellarisParser.PercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(StellarisParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link StellarisParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(StellarisParser.ArrayContext ctx);
}
