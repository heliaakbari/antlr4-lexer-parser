package it.unicam.cs.cmp.labeledexpr;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Calc {
	public static void main(String[] args) throws Exception {
		CharStream input;
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		if (inputFile != null)
			input = CharStreams.fromFileName(inputFile);
		else
			input = CharStreams.fromStream(System.in);
		LabeledExprLexer lexer = new LabeledExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LabeledExprParser parser = new LabeledExprParser(tokens);
		ParseTree tree = parser.prog(); // parse

		EvalVisitor eval = new EvalVisitor();
		eval.visit(tree);
	}
}
