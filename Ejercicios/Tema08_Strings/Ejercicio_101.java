package Ejercicios.Tema08_Strings;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 76: INTRODUCCIÓN A STRINGS
 * ---------------------------------------------------------
 * Conceptos: length(), charAt(), toUpperCase(), toLowerCase()
 * 
 * Enunciado:
 * Crea un programa que pida una frase al usuario y muestre:
 * 1. Cuántos caracteres tiene en total.
 * 2. Cuál es el primer y último carácter.
 * 3. La frase completa en mayúsculas y en minúsculas.
 */
public class Ejercicio_101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MANEJO BÁSICO DE STRINGS ===");
        
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();

        // 1. length(): Devuelve la cantidad de caracteres de la cadena
        int longitud = frase.length();
        System.out.println("\nLa frase tiene " + longitud + " caracteres.");

        // 2. charAt(indice): Devuelve el caracter en la posición indicada (empieza en 0)
        if (longitud > 0) {
            char primero = frase.charAt(0);
            char ultimo = frase.charAt(longitud - 1);
            System.out.println("Primer carácter: " + primero);
            System.out.println("Último carácter: " + ultimo);
        }

        // 3. toUpperCase() y toLowerCase(): Convierten todo a mayúsculas o minúsculas
        System.out.println("En mayúsculas: " + frase.toUpperCase());
        System.out.println("En minúsculas: " + frase.toLowerCase());
        
        sc.close();
    }
}
