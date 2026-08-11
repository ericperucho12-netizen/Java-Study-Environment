package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 83: RECURSIVIDAD AVANZADA (FIBONACCI)
 * ---------------------------------------------------------
 * Conceptos: Árbol de llamadas recursivas.
 * 
 * Enunciado:
 * Calcula el n-ésimo número de la sucesión de Fibonacci.
 * Sucesión: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
 * Cada número es la suma de los dos anteriores.
 */
public class Ejercicio_83 {

    public static int fibonacci(int n) {
        // Casos Base
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // Caso Recursivo: f(n) = f(n-1) + f(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("=== SUCESIÓN DE FIBONACCI (RECURSIVA) ===");
        
        int limite = 10;
        System.out.println("Los primeros " + limite + " números son:");
        
        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
