// Generated from /home/renegade/workspace/stellaris-species-editor/src/main/resources/antlr/Stellaris.g4 by ANTLR 4.10.1
package antlr.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StellarisParser}.
 */
public interface StellarisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StellarisParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(StellarisParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(StellarisParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StellarisParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StellarisParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(StellarisParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(StellarisParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(StellarisParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(StellarisParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(StellarisParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(StellarisParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(StellarisParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(StellarisParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(StellarisParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(StellarisParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(StellarisParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(StellarisParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(StellarisParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(StellarisParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(StellarisParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(StellarisParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(StellarisParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(StellarisParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link StellarisParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(StellarisParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StellarisParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(StellarisParser.ArrayContext ctx);
}
