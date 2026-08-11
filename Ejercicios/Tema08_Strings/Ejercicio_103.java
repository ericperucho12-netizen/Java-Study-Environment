package Ejercicios.Tema08_Strings;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 78: INVERTIR UNA CADENA
 * ---------------------------------------------------------
 * Conceptos: Recorrido de Strings con bucle for.
 * 
 * Enunciado:
 * Pide al usuario que ingrese una palabra o frase y el 
 * programa deberá imprimirla completamente al revés.
 */
public class Ejercicio_103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== INVERSOR DE CADENAS ===");
        
        System.out.print("Escribe una frase: ");
        String original = sc.nextLine();
        String invertida = "";

        // Recorremos la cadena de texto desde el ÚLTIMO carácter hasta el primero
        for (int i = original.length() - 1; i >= 0; i--) {
            // Concatenamos cada carácter a nuestra nueva variable String
            invertida += original.charAt(i);
        }

        System.out.println("\nFrase original: " + original);
        System.out.println("Frase invertida: " + invertida);
        
        sc.close();
    }
}
