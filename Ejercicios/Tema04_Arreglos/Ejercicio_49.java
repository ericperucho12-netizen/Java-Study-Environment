/*
*Leer por teclado dos tablas de 10 números enteros y mezclarlas
* en una tercera de la forma:
* el 1 de A, el 1 de B , el 2 de A, el 2 de B, etc
*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arregloA=new int[10];
        int[] arregloB=new int[10];
        // Creamos el arreglo "contenedor" (de 20 espacios, para que quepan ambos)
        int[] arregloC=new int[20];
        // --- 2. LLENADO DE DATOS ---
        System.out.println("--- Ingresando datos para el Arreglo A ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            arregloA[i] = sc.nextInt();
        }

        System.out.println("\n--- Ingresando datos para el Arreglo B ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            arregloB[i] = sc.nextInt();
        }

        int j=0;
        for(int i=0;i<10;i++){
            arregloC[j]=arregloA[i];
            j++;

            arregloC[j]=arregloB[i];
            j++;
        }
// --- 4. RESULTADO FINAL ---
        System.out.println("\n--- Arreglo C (Mezclado) ---");
        // Usamos el For-Each para imprimir rápido y limpio
        for (int numero : arregloC) {
            System.out.print(numero + " ");
        }

        sc.close();
    }
}
