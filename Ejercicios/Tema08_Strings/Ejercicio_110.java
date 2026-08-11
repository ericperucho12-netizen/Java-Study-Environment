package Ejercicios.Tema08_Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 110: ALGORITMO DETECTOR DE ANAGRAMAS
 * ---------------------------------------------------------
 * Conceptos: Strings a Arrays, Arrays.sort(), equals.
 * 
 * Enunciado:
 * Un anagrama es una palabra que se forma reordenando las 
 * letras de otra (ej. "roma" y "amor", "delira" y "lidera").
 * Construye un comprobador de anagramas.
 */
public class Ejercicio_110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== DETECTOR DE ANAGRAMAS ===");
        
        System.out.print("Palabra 1: ");
        String pal1 = sc.nextLine().toLowerCase().replace(" ", "");
        
        System.out.print("Palabra 2: ");
        String pal2 = sc.nextLine().toLowerCase().replace(" ", "");
        
        // 1. Si no miden lo mismo, es imposible que sean anagramas
        if (pal1.length() != pal2.length()) {
            System.out.println("\nNo son anagramas (miden distinto).");
        } else {
            // 2. Convertimos los Strings a arreglos de caracteres (char[])
            char[] arreglo1 = pal1.toCharArray();
            char[] arreglo2 = pal2.toCharArray();
            
            // 3. Ordenamos alfabéticamente ambos arreglos (A-Z)
            Arrays.sort(arreglo1);
            Arrays.sort(arreglo2);
            
            // 4. Si al ordenarlos son exactamente iguales, ¡es un anagrama!
            if (Arrays.equals(arreglo1, arreglo2)) {
                System.out.println("\n¡SON ANAGRAMAS!");
            } else {
                System.out.println("\nNo son anagramas (tienen diferentes letras).");
            }
        }
        
        sc.close();
    }
}
