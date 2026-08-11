package Ejercicios.Tema08_Strings;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 80: COMPROBAR PALÍNDROMO
 * ---------------------------------------------------------
 * Conceptos: Reemplazo de caracteres (replace), igualdades.
 * 
 * Enunciado:
 * Un palíndromo es una palabra o frase que se lee igual de 
 * izquierda a derecha que de derecha a izquierda (ej. "reconocer", 
 * "anita lava la tina"). Haz un programa que lo compruebe.
 */
public class Ejercicio_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== DETECTOR DE PALÍNDROMOS ===");
        
        System.out.print("Escribe una palabra o frase corta: ");
        String texto = sc.nextLine();
        
        // 1. Limpiamos el texto: quitamos espacios y pasamos todo a minúsculas
        // replace("a", "b") reemplaza todas las 'a' por 'b'
        String textoLimpio = texto.replace(" ", "").toLowerCase();
        
        // 2. Invertimos el texto limpio
        String textoInvertido = "";
        for (int i = textoLimpio.length() - 1; i >= 0; i--) {
            textoInvertido += textoLimpio.charAt(i);
        }
        
        // 3. Comparamos ambos textos
        if (textoLimpio.equals(textoInvertido)) {
            System.out.println("\n¡ES UN PALÍNDROMO!");
        } else {
            System.out.println("\nNo es un palíndromo.");
        }
        
        sc.close();
    }
}
