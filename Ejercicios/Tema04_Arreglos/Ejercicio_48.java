/*
*Leer 10 numeros enteros, guardarlos en un arreglo.
* Debemos mostrarlos en el
*siguiente orden:
* El primero,
* El ultimo,
* El segundo,
* El penultimo,
* El tercero. etc
*/
package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creamos nuestro arreglo de 10 espacios (índices del 0 al 9)
        int[] numeros = new int[10];

        // --- 2. LLENADO DEL ARREGLO ---
        System.out.println("--- Ingresando los datos ---");

        for(int i=0;i<10;i++){
            System.out.print("Introduce el número para la posición "+i+": ");
            numeros[i] = sc.nextInt();
        }
        // --- 3. LECTURA EN ORDEN ALTERNADO ---
        System.out.println("\n--- Los números en orden especial son ---");

        /* * ¡AQUÍ ESTÁ LA LÓGICA NIVEL DIOS!
         * El bucle solo da 5 vueltas (la mitad del tamaño del arreglo).
         * ¿Por qué? Porque en CADA vuelta vamos a imprimir DOS números.
         * (5 vueltas x 2 números = los 10 números completos).
         */

        for(int i=0;i<5;i++){
            System.out.println("Posición "+i+": "+numeros[i]);
            // Imprime el de "atrás" (9, 8, 7, 6, 5)
            // Usamos matemáticas: 9 menos 'i' nos da el inverso exacto.
            System.out.println("Posición "+(9-1)+ ": "+numeros[9-1]);
        }
        sc.close();
    }
}
