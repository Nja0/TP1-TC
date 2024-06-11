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

class SyntaxErrorListener extends BaseErrorListener {
    public static final Set<String> syntaxErrors = new HashSet<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String error = "Línea " + line + ":" + charPositionInLine + " - " + msg;
        syntaxErrors.add(error);
    }
}

class SemanticAnalyzer extends compiladoresBaseListener {
    public final Set<String> semanticErrors = new HashSet<>();
    private final Set<String> declaredVariables = new HashSet<>();
    private final Set<String> initializedVariables = new HashSet<>();
    private final Set<String> usedVariables = new HashSet<>();

    @Override
    public void enterDeclaracion(compiladoresParser.DeclaracionContext ctx) {
        for (TerminalNode varNode : ctx.listaDeclaracion().ID()) {
            String varName = varNode.getText();
            if (declaredVariables.contains(varName)) {
                semanticErrors.add("Variable ya declarada: " + varName + " en la línea " + ctx.start.getLine());
            } else {
                declaredVariables.add(varName);
            }
        }
    }

    @Override
    public void enterAsignacion(compiladoresParser.AsignacionContext ctx) {
        String varName = ctx.ID().getText();
        if (!declaredVariables.contains(varName)) {
            semanticErrors.add("Variable no declarada: " + varName + " en la línea " + ctx.start.getLine());
        } else {
            initializedVariables.add(varName);
        }
    }

    @Override
    public void enterLlamadaFuncion(compiladoresParser.LlamadaFuncionContext ctx) {
        String varName = ctx.ID().getText();
        if (!declaredVariables.contains(varName)) {
            semanticErrors.add("Variable no declarada: " + varName + " en la línea " + ctx.start.getLine());
        }
    }

    @Override
    public void exitPrograma(compiladoresParser.ProgramaContext ctx) {
        for (String var : declaredVariables) {
            if (!usedVariables.contains(var)) {
                semanticErrors.add("Variable declarada pero no usada: " + var);
            }
            if (!initializedVariables.contains(var)) {
                semanticErrors.add("Variable declarada pero no inicializada: " + var);
            }
        }
    }

    @Override
    public void enterExpresion(compiladoresParser.ExpresionContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();
            if (declaredVariables.contains(varName)) {
                usedVariables.add(varName);
            } else {
                semanticErrors.add("Variable no declarada: " + varName + " en la línea " + ctx.start.getLine());
            }
        }
    }
}
