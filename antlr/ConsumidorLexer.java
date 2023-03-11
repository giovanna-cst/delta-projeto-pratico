package antlr;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

import java.io.IOException;

public class ConsumidorLexer {

    public static void  main (String[] args){
        String filename = "C:\\UFLA\\compiladores\\delta-projeto-pratico\\casos_teste\\ComErro.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            GramaticaDeltagramaLexer lexer = new GramaticaDeltagramaLexer(input);
            Token token;
            while (!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("    Lexema: "+ token.getText());
                System.out.println("    Classe: "+lexer.getVocabulary().getDisplayName(token.getType()));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
