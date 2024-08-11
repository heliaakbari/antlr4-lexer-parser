/**
 * 
 */
package it.unicam.cs.cmp.hello;

/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Simple Hello World ANTLR 4 main.
 */
public class HelloRunner {
	public static void main(String[] args) throws Exception {
		// create a CharStream that reads from standard input
		CharStream input = CharStreams.fromStream(System.in);
		// create a lexer that feeds off of input CharStream
		HelloLexer lexer = new HelloLexer(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		HelloParser parser = new HelloParser(tokens);
		// begin parsing at rule 'r'
		ParseTree tree = parser.r();
		// print LISP-style tree
		System.out.println(tree.toStringTree(parser));
	}

}
