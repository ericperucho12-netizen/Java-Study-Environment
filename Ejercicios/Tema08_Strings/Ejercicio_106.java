package Ejercicios.Tema08_Strings;

/**
 * ---------------------------------------------------------
 * EJERCICIO 106: DIVISIÓN DE CADENAS (SPLIT)
 * ---------------------------------------------------------
 * Conceptos: Separar Strings en arreglos (split).
 * 
 * Enunciado:
 * Toma una frase y separa cada una de sus palabras usando el
 * espacio en blanco como delimitador. Muestra cuántas palabras hay.
 */
public class Ejercicio_106 {
    public static void main(String[] args) {
        System.out.println("=== DIVIDIENDO STRINGS CON SPLIT ===");
        
        String frase = "Aprender a programar en Java es muy divertido";
        System.out.println("Frase original: " + frase);
        
        // .split(" ") corta la cadena cada vez que encuentra un espacio
        // y guarda cada pedazo en un arreglo de Strings.
        String[] palabras = frase.split(" ");
        
        System.out.println("\nLa frase tiene " + palabras.length + " palabras.");
        
        System.out.println("Las palabras son:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i+1) + ": " + palabras[i]);
        }
    }
}
