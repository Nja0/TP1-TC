/*package primerproyecto;

import java.util.regex.*;

public class MyVisitor extends compiladoresBaseVisitor<String> {

    private int lineNumber = 1;

    @Override
    public String visitEntrada(compiladoresParser.EntradaContext ctx) {
        String text = ctx.getText();
        if (esFechaMesesPares(text)) {
            System.out.println("Línea " + lineNumber + ": Fecha Meses Pares - " + text);
        } else if (esHoraManana(text)) {
            System.out.println("Línea " + lineNumber + ": Hora Mañana - " + text);
        } else if (esHoraTarde(text)) {
            System.out.println("Línea " + lineNumber + ": Hora Tarde - " + text);
        }
        lineNumber++;
        return "";
    }

    private boolean esFechaMesesPares(String text) {
        // Expresión regular para fechas correspondientes a meses pares (DD/MM/YYYY)
        Pattern pattern = Pattern.compile("0[2468]/(..)/(....)|10/(0[2468]|1[02])/....|12/(0[2468]|1[02])/....");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    private boolean esHoraManana(String text) {
        // Expresión regular para horas entre las 08:00 y las 12:59 (HH:MM)
        Pattern pattern = Pattern.compile("0[89]:[0-5][0-9]|10:[0-5][0-9]|11:[0-5][0-9]|12:[0-5][0-9]");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    private boolean esHoraTarde(String text) {
        // Expresión regular para horas entre las 18:30 y las 21:30 (HH:MM)
        Pattern pattern = Pattern.compile("18:3[0-9]|19:[0-5][0-9]|20:[0-5][0-9]|21:3[0-9]");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
*/