# Generated from tl.g4 by ANTLR 4.13.1
from antlr4 import *
from tlParser import tlParser

temporary = 0
variables = {}
# This class defines a complete listener for a parse tree produced by tlParser.
class tlListener(ParseTreeListener):
    # Enter a parse tree produced by tlParser#program.
    def enterProgram(self, ctx:tlParser.ProgramContext):
        pass

    # Exit a parse tree produced by tlParser#program.
    def exitProgram(self, ctx:tlParser.ProgramContext):
        ctx.code = ''
        for child in ctx.getChildren():
            ctx.code += child.code
        print(ctx.code)


    # Enter a parse tree produced by tlParser#funclist.
    def enterFunclist(self, ctx:tlParser.FunclistContext):
        pass

    # Exit a parse tree produced by tlParser#funclist.
    def exitFunclist(self, ctx:tlParser.FunclistContext):
        ctx.code=''
        for child in ctx.getChildren():
            ctx.code += child.code
        pass


    # Enter a parse tree produced by tlParser#funcdef.
    def enterFuncdef(self, ctx:tlParser.FuncdefContext):
        pass

    # Exit a parse tree produced by tlParser#funcdef.
    def exitFuncdef(self, ctx:tlParser.FuncdefContext):
        ctx.code = ''
        ctx.code += f"_{ctx.getChild(1).getText()}:\n"
        ctx.code += f"BeginFunc;\n"
        ctx.code += ctx.getChild(5).code
        ctx.code += f"EndFunc;\n"




    # Enter a parse tree produced by tlParser#paramlist.
    def enterParamlist(self, ctx:tlParser.ParamlistContext):
        pass

    # Exit a parse tree produced by tlParser#paramlist.
    def exitParamlist(self, ctx:tlParser.ParamlistContext):
        pass


    # Enter a parse tree produced by tlParser#param.
    def enterParam(self, ctx:tlParser.ParamContext):
        pass

    # Exit a parse tree produced by tlParser#param.
    def exitParam(self, ctx:tlParser.ParamContext):
        pass


    # Enter a parse tree produced by tlParser#datatype.
    def enterDatatype(self, ctx:tlParser.DatatypeContext):
        pass

    # Exit a parse tree produced by tlParser#datatype.
    def exitDatatype(self, ctx:tlParser.DatatypeContext):
        ctx.code = "";
        pass


    # Enter a parse tree produced by tlParser#codeblock.
    def enterCodeblock(self, ctx:tlParser.CodeblockContext):
        pass

    # Exit a parse tree produced by tlParser#codeblock.
    def exitCodeblock(self, ctx:tlParser.CodeblockContext):
        ctx.code = ''
        for child in ctx.getChildren():
            if hasattr(child,"code"):
                ctx.code += child.code 


    # Enter a parse tree produced by tlParser#stmtlist.
    def enterStmtlist(self, ctx:tlParser.StmtlistContext):
        pass

    # Exit a parse tree produced by tlParser#stmtlist.
    def exitStmtlist(self, ctx:tlParser.StmtlistContext):
        ctx.code = ''
        for child in ctx.getChildren():
            if hasattr(child,"code"):
                ctx.code += child.code +'\n'


    # Enter a parse tree produced by tlParser#stmt.
    def enterStmt(self, ctx:tlParser.StmtContext):
        pass

    # Exit a parse tree produced by tlParser#stmt.
    def exitStmt(self, ctx:tlParser.StmtContext):
        ctx.code = ""
        if len(ctx.var()) > 0:
            for var in ctx.var():
                if var.getChildCount() == 3:
                    ctx.code+= var.code +';\n'
            return
        for child in ctx.getChildren():
            if hasattr(child,"code"):
                ctx.code += str(child.code)
            else:
                ctx.code += child.getText()
        




    # Enter a parse tree produced by tlParser#loopstmt.
    def enterLoopstmt(self, ctx:tlParser.LoopstmtContext):
        pass

    # Exit a parse tree produced by tlParser#loopstmt.
    def exitLoopstmt(self, ctx:tlParser.LoopstmtContext):
        pass


    # Enter a parse tree produced by tlParser#initstmt.
    def enterInitstmt(self, ctx:tlParser.InitstmtContext):
        pass

    # Exit a parse tree produced by tlParser#initstmt.
    def exitInitstmt(self, ctx:tlParser.InitstmtContext):
        pass


    # Enter a parse tree produced by tlParser#poststmt.
    def enterPoststmt(self, ctx:tlParser.PoststmtContext):
        pass

    # Exit a parse tree produced by tlParser#poststmt.
    def exitPoststmt(self, ctx:tlParser.PoststmtContext):
        pass


    # Enter a parse tree produced by tlParser#var.
    def enterVar(self, ctx:tlParser.VarContext):
        pass

    # Exit a parse tree produced by tlParser#var.
    def exitVar(self, ctx:tlParser.VarContext):
        if ctx.getChildCount() == 3:
            ctx.code = ctx.getChild(2).code;
            ctx.code += ctx.getChild(0).getText() + ctx.getChild(1).getText() + ctx.getChild(2).rep
        elif ctx.getChildCount() == 1 :
            ctx.code = ctx.getChild(0).getText()


    # Enter a parse tree produced by tlParser#expr.
    def enterExpr(self, ctx:tlParser.ExprContext):
        pass

    # Exit a parse tree produced by tlParser#expr.
    def exitExpr(self, ctx:tlParser.ExprContext):
        code = []
        mycode =""
        for child in ctx.getChildren():
            if hasattr(child,"rep"):
                code.append(child.code)
                mycode+=child.rep
            elif hasattr(child,"code"):
                mycode += child.code
            else:
                mycode+=child.getText()
        ctx.rep = mycode
        ctx.code = "".join(code)


    # Enter a parse tree produced by tlParser#logical_or.
    def enterLogical_or(self, ctx:tlParser.Logical_orContext):
        pass

    # Exit a parse tree produced by tlParser#logical_or.
    def exitLogical_or(self, ctx:tlParser.Logical_orContext):
        pass


    # Enter a parse tree produced by tlParser#logical_and.
    def enterLogical_and(self, ctx:tlParser.Logical_andContext):
        pass

    # Exit a parse tree produced by tlParser#logical_and.
    def exitLogical_and(self, ctx:tlParser.Logical_andContext):
        pass


    # Enter a parse tree produced by tlParser#comparison.
    def enterComparison(self, ctx:tlParser.ComparisonContext):
        pass

    # Exit a parse tree produced by tlParser#comparison.
    def exitComparison(self, ctx:tlParser.ComparisonContext):
        pass


    # Enter a parse tree produced by tlParser#sum.
    def enterSum(self, ctx:tlParser.SumContext):
        pass

    # Exit a parse tree produced by tlParser#sum.
    def exitSum(self, ctx:tlParser.SumContext):
        global temporary;
        ctx.code=''
        if ctx.getChildCount() == 3:
            if hasattr(ctx.getChild(0),"rep"):
                ctx.code += ctx.getChild(0).code
            if hasattr(ctx.getChild(2),"rep"):
                ctx.code += ctx.getChild(2).code
            ctx.code += f"t{temporary}={ctx.getChild(0).rep if hasattr(ctx.getChild(0),"rep") else ctx.getChild(0).code }{ctx.getChild(1).getText()}{ctx.getChild(2).rep if hasattr(ctx.getChild(2),"rep") else ctx.getChild(2).code };\n"
            ctx.rep =  f"t{temporary}"
            temporary += 1
        if ctx.getChildCount() == 1:
            if hasattr(ctx.getChild(0),"rep"):
                ctx.code += ctx.getChild(0).code
            ctx.code = f"{ ctx.getChild(0).rep if hasattr(ctx.getChild(0),"rep") else ctx.getChild(0).code}"



    # Enter a parse tree produced by tlParser#product.
    def enterProduct(self, ctx:tlParser.ProductContext):
        pass

    # Exit a parse tree produced by tlParser#product.
    def exitProduct(self, ctx:tlParser.ProductContext):
        global temporary;
        ctx.code=''
        if ctx.getChildCount() == 3:
            if hasattr(ctx.getChild(0),"rep"):
                ctx.code += ctx.getChild(0).code
            if hasattr(ctx.getChild(2),"rep"):
                ctx.code += ctx.getChild(2).code
            ctx.code += f"t{temporary}={ctx.getChild(0).rep if hasattr(ctx.getChild(0),"rep") else ctx.getChild(0).code }{ctx.getChild(1).getText()}{ctx.getChild(2).rep if hasattr(ctx.getChild(2),"rep") else ctx.getChild(2).code };\n"
            ctx.rep =  f"t{temporary}"
            temporary += 1
        if ctx.getChildCount() == 1:
            if hasattr(ctx.getChild(0),"rep"):
                ctx.code += ctx.getChild(0).code
            ctx.code = f"{ ctx.getChild(0).rep if hasattr(ctx.getChild(0),"rep") else ctx.getChild(0).code }"

    # Enter a parse tree produced by tlParser#unit.
    def enterUnit(self, ctx:tlParser.UnitContext):
        pass

    # Exit a parse tree produced by tlParser#unit.
    def exitUnit(self, ctx:tlParser.UnitContext):
        ctx.code = ctx.getChild(0).code


    # Enter a parse tree produced by tlParser#atom.
    def enterAtom(self, ctx:tlParser.AtomContext):
        pass

    # Exit a parse tree produced by tlParser#atom.
    def exitAtom(self, ctx:tlParser.AtomContext):
        count = ctx.getChildCount()
        if count == 1 : #id or number or false or true
           ctx.code = ctx.getChild(0).getText()
           ctx.rep = ctx.code

        elif ctx.getChild(1).getText() == '(' : #function call
            code = f"BeginFunc;\n"
            code += f"LCall _{ctx.getChild(0).getText()};\n"
            code += "EndFunc";
            ctx.code = code
            ctx.rep = ctx.code


    # Enter a parse tree produced by tlParser#args.
    def enterArgs(self, ctx:tlParser.ArgsContext):
        pass

    # Exit a parse tree produced by tlParser#args.
    def exitArgs(self, ctx:tlParser.ArgsContext):
        if ctx.getChild(0).getText() == "" :
            ctx.args = []
        pass


    # Enter a parse tree produced by tlParser#number.
    def enterNumber(self, ctx:tlParser.NumberContext):
        pass

    # Exit a parse tree produced by tlParser#number.
    def exitNumber(self, ctx:tlParser.NumberContext):
        pass


    # Enter a parse tree produced by tlParser#e.
    def enterE(self, ctx:tlParser.EContext):
        pass

    # Exit a parse tree produced by tlParser#e.
    def exitE(self, ctx:tlParser.EContext):
        pass



del tlParser