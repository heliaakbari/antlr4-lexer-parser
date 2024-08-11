package it.unicam.cs.cmp.actionexpr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class ActionCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		CharStream input = CharStreams.fromStream(System.in);
		ActionExprLexer lexer = new ActionExprLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ActionExprParser parser = new ActionExprParser(tokens);
		// parse
		parser.prog();

	}

}