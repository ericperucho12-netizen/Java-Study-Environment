package Ejercicios.Tema06_Metodos;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 80: RECURSIVIDAD (FACTORIAL)
 * ---------------------------------------------------------
 * Conceptos: Un método que se llama a sí mismo.
 * 
 * Enunciado:
 * Calcula el factorial de un número. El factorial de 5 (5!) es:
 * 5 * 4 * 3 * 2 * 1 = 120.
 */
public class Ejercicio_80 {

    public static int factorial(int n) {
        // Caso Base: Es MUY importante para que la recursividad no sea infinita
        if (n == 0 || n == 1) {
            return 1;
        } 
        // Caso Recursivo: Multiplicamos el número por el factorial del anterior
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== RECURSIVIDAD: FACTORIAL ===");

        System.out.print("Introduce un número entero pequeño (ej. 5): ");
        int numero = sc.nextInt();

        int resultado = factorial(numero);
        
        System.out.println("\nEl factorial de " + numero + "! es: " + resultado);
        
        sc.close();
    }
}
