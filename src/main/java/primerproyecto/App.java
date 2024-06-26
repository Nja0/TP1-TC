package primerproyecto;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        // Leer el archivo de entrada
        CharStream input = CharStreams.fromFileName("input/entrada.txt");

        // Crear el lexer y el parser
        compiladoresLexer lexer = new compiladoresLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        compiladoresParser parser = new compiladoresParser(tokens);

        // Añadir un listener para errores sintácticos
        parser.removeErrorListeners();
        parser.addErrorListener(new SyntaxErrorListener());

        // Parsear el archivo
        ParseTree tree = parser.programa();

        // Realizar el análisis semántico
        ParseTreeWalker walker = new ParseTreeWalker();
        SemanticAnalyzer analyzer = new SemanticAnalyzer();
        walker.walk(analyzer, tree);

        // Escribir el reporte de errores
        try (FileWriter writer = new FileWriter("errores_reporte.txt")) {
            for (String error : SyntaxErrorListener.syntaxErrors) {
                writer.write("Sintáctico: " + error + "\n");
            }
            for (String error : analyzer.semanticErrors) {
                writer.write("Semántico: " + error + "\n");
            }
        }
    }
}
