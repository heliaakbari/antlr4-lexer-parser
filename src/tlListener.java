// Generated from tl.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tlParser}.
 */
public interface tlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#funclist}.
	 * @param ctx the parse tree
	 */
	void enterFunclist(tlParser.FunclistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#funclist}.
	 * @param ctx the parse tree
	 */
	void exitFunclist(tlParser.FunclistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(tlParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(tlParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(tlParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(tlParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(tlParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(tlParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(tlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(tlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void enterCodeblock(tlParser.CodeblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#codeblock}.
	 * @param ctx the parse tree
	 */
	void exitCodeblock(tlParser.CodeblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#stmtlist}.
	 * @param ctx the parse tree
	 */
	void enterStmtlist(tlParser.StmtlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#stmtlist}.
	 * @param ctx the parse tree
	 */
	void exitStmtlist(tlParser.StmtlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(tlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(tlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#loopstmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopstmt(tlParser.LoopstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#loopstmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopstmt(tlParser.LoopstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#initstmt}.
	 * @param ctx the parse tree
	 */
	void enterInitstmt(tlParser.InitstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#initstmt}.
	 * @param ctx the parse tree
	 */
	void exitInitstmt(tlParser.InitstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#poststmt}.
	 * @param ctx the parse tree
	 */
	void enterPoststmt(tlParser.PoststmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#poststmt}.
	 * @param ctx the parse tree
	 */
	void exitPoststmt(tlParser.PoststmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(tlParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(tlParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(tlParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(tlParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or(tlParser.Logical_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#logical_or}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or(tlParser.Logical_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and(tlParser.Logical_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#logical_and}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and(tlParser.Logical_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(tlParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(tlParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(tlParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(tlParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(tlParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(tlParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(tlParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(tlParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(tlParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(tlParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(tlParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(tlParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(tlParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(tlParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link tlParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(tlParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link tlParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(tlParser.EContext ctx);
}