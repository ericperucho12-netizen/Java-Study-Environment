package Ejercicios.Tema17_Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ---------------------------------------------------------
 * EJERCICIO 197: PRÁCTICA DE REGEX
 * ---------------------------------------------------------
 * Conceptos: Pattern, Matcher, Sintaxis Regex.
 * 
 * Enunciado:
 * Evalúa si el texto de prueba contiene solo números usando 
 * la expresión regular "\\d+". (Práctica #197).
 */
public class Ejercicio_197 {
    public static void main(String[] args) {
        System.out.println("=== VALIDACIÓN REGEX #197 ===");
        String texto = "12345" + (197 - 190);
        
        // \d+ significa: Uno o más dígitos
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = p.matcher(texto);
        
        if (m.matches()) {
            System.out.println("El texto '" + texto + "' SÍ es un número válido.");
        } else {
            System.out.println("El texto '" + texto + "' NO es un número válido.");
        }
    }
}