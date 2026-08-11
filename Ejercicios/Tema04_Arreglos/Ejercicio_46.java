
//Leer 5 numeros, guardarlos en un arreglo y mostrarlos
// en el orden inverso al introducirlos
package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        // --- 2. LLENADO DEL ARREGLO (Hacia adelante) ---
        System.out.println("--- Ingresando los datos ---");

        // Vamos del 0 al 4 sumando de uno en uno (i++)
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // --- 3. LECTURA EN REVERSA (Hacia atrás) ---
        System.out.println("\n--- Los números en orden INVERSO son ---");

        /*
         * ¡AQUÍ ESTÁ LA MAGIA!
         * 1. Empezamos en 4 (porque la última posición de un arreglo de 5 es el 4).
         * 2. La condición es i >= 0 (para que llegue hasta el primer cajón).
         * 3. Usamos i-- para ir restando y retroceder (4, 3, 2, 1, 0).
         */
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
