package TodoSobreJava;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: CICLO WHILE (MIENTRAS)
 * ---------------------------------------------------------
 * Un ciclo 'while' se utiliza cuando queremos repetir un
 * bloque de código MIENTRAS una condición sea verdadera.
 * 
 * La condición se evalúa al principio, lo que significa que
 * si la condición es falsa desde el principio, el código
 * dentro del ciclo ¡nunca se ejecutará!
 */
public class Tema03_Ciclos_While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== CICLO WHILE ===");
        
        System.out.print("¿Cuántos números en pantalla quieres (ascendente)? ");
        int contador = entrada.nextInt();

        System.out.println("\n-- Contando hacia arriba --");
        int i = 1; // Nuestro contador inicial

        // MIENTRAS i sea menor o igual al número que introdujo el usuario
        while (i <= contador) {
            System.out.println(i);
            i++; // Incrementamos el contador (equivale a i = i + 1)
                 // ¡Si olvidamos esto, tendríamos un bucle infinito!
        }

        // --- EJEMPLO 2: Contando hacia abajo ---
        System.out.println("\n-- Contando hacia abajo (desde 10 hasta 1) --");
        int j = 10; // Empezamos en 10
        
        // Mientras j sea mayor o igual a 1...
        while (j >= 1) {
            System.out.println(j);
            j--; // Decrementamos el contador
        }
        
        entrada.close();
    }
}

