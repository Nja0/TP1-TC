package primerproyecto;


import org.antlr.v4.runtime.*;

import java.io.PrintWriter;

class ManejadorErrores extends BaseErrorListener {
    private PrintWriter escritorErrores;

    ManejadorErrores(PrintWriter escritorErrores) {
        this.escritorErrores = escritorErrores;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
            Object simboloOfensivo,
            int linea,
            int posicionEnLinea,
            String mensaje,
            RecognitionException e) {
        String tipoError = "Error sintáctico";
        if (mensaje.contains("missing ';'")) {
            tipoError = "Error sintáctico: Falta punto y coma";
        } else if (mensaje.contains("missing '('")) {
            tipoError = "Error sintáctico: Falta abrir paréntesis";
        }else if (mensaje.contains("missing ')'")) {
            tipoError = "Error sintáctico: Falta cerrar paréntesis";
        } else if (mensaje.contains("mismatched input")) {
            tipoError = "Error sintáctico: Formato incorrecto en lista de declaración de variables";
        }
        escritorErrores.println(tipoError + " en la línea " + linea + ":" + posicionEnLinea + " = " + mensaje);
    }
}