package antlr;
import GramaticaDeltagramaParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AnalisadorSemantico {
    public static void main(String[] args){
        //parsing the input
        GramaticaDeltagramaParser parser = getParser("C:\\UFLA\\compiladores\\delta\\algoritmos_exemplos\\Soma.txt");
        //obter arvore
        ParseTree ast = parser.inicio();

        System.out.println(ast.toStringTree());

        //Inicia o MyListener, nossa implementação do baseListener
        MyListener listener = new MyListener();

        ParseTreeWalker walker = new ParseTreeWalker();

        //percorre a ast com a nossa implementação do listener
        walker.walk(listener,ast);

        //imprime a tabela de símbolos
        System.out.println(listener.getTabelaSimbolos().toString());
    }


    //método para executar o lexer e o parser sobre o arquivo de entrada
    private static GramaticaDeltagramaParser getParser(String fileName){
        GramaticaDeltagramaParser parser = null;
        try{
            CharStream input = CharStreams.fromFileName(fileName);
            GramaticaDeltagramaLexer lexer = new GramaticaDeltagramaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new GramaticaParser(tokens);

        } catch(IOException e){
            e.printStackTrace();
        }
        return parser;
    }

}
