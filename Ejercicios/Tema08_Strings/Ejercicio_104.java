package Ejercicios.Tema08_Strings;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 79: CONTADOR DE VOCALES
 * ---------------------------------------------------------
 * Conceptos: Recorrido, condicionales dentro de strings.
 * 
 * Enunciado:
 * Diseña un programa que lea una frase por teclado y cuente
 * cuántas vocales (a, e, i, o, u) contiene.
 */
public class Ejercicio_104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CONTADOR DE VOCALES ===");
        
        System.out.print("Escribe una frase: ");
        // Convertimos a minúsculas directamente para simplificar la evaluación
        String frase = sc.nextLine().toLowerCase(); 
        
        int contadorVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            
            // Verificamos si la letra es alguna vocal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Tu frase contiene " + contadorVocales + " vocales.");
        
        sc.close();
    }
}
