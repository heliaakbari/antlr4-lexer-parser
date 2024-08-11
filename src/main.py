from antlr4 import *
from tlLexer import tlLexer
from tlParser import tlParser
from tlListener import tlListener
import json
input_ = '''
void func() {
    print();
}

void main() {
    int a, b, c;
    a = 1;
    b = 2;
    c = 3;

    int result = a + b * C;
}
'''

Input_Stream = InputStream(input_)
lexer = tlLexer(Input_Stream)
token_stream = CommonTokenStream(lexer)
parser = tlParser(token_stream)
tree = parser.program()
my_listener = tlListener()
walker = ParseTreeWalker()
walker.walk(my_listener, tree)