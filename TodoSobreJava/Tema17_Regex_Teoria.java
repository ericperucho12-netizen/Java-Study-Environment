package TodoSobreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ============================================================================
 * GUÍA MAESTRA: EXPRESIONES REGULARES (REGEX)
 * ============================================================================
 * 
 * 1. ¿QUÉ ES UNA EXPRESIÓN REGULAR?
 * ----------------------------------------------------------------------------
 * Es una secuencia de caracteres que forma un "Patrón de Búsqueda". 
 * Si le pides a un usuario su correo, ¿cómo sabes que de verdad escribió un 
 * correo y no solo "hola123"? ¡Con Regex!
 * 
 * 2. SINTAXIS BÁSICA (Símbolos Mágicos)
 * ----------------------------------------------------------------------------
 * ^        : Empieza con...
 * $        : Termina con...
 * [a-z]    : Cualquier letra minúscula.
 * [0-9]    : Cualquier número (también escrito como \d).
 * +        : El elemento anterior debe aparecer 1 o más veces.
 * *        : El elemento anterior debe aparecer 0 o más veces.
 * .        : Cualquier carácter (comodín).
 * 
 * Ej: "^[a-z]+$" -> "El texto DEBE empezar y terminar SÓLO con letras minúsculas, 
 * por lo menos 1 vez".
 * 
 * 3. CLASES PATTERN Y MATCHER
 * ----------------------------------------------------------------------------
 * En Java, usamos Pattern para "Compilar" (guardar) nuestro patrón Regex.
 * Luego usamos Matcher para comparar ese patrón con el texto del usuario.
 */
public class Tema17_Regex_Teoria {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA: EXPRESIONES REGULARES ===\n");
        
        String correoUsuario = "mi.correo@gmail.com";
        String correoFalso = "esto-no-es-un-correo";
        
        // Patrón básico para un email: LetrasNumeros @ LetrasNumeros . Letras
        String regexEmail = "^[A-Za-z0-9._]+@[A-Za-z0-9]+\\.[A-Za-z]{2,}$";
        
        Pattern patron = Pattern.compile(regexEmail);
        
        Matcher evaluador1 = patron.matcher(correoUsuario);
        System.out.println("¿" + correoUsuario + " es válido? " + evaluador1.matches());
        
        Matcher evaluador2 = patron.matcher(correoFalso);
        System.out.println("¿" + correoFalso + " es válido? " + evaluador2.matches());
    }
}