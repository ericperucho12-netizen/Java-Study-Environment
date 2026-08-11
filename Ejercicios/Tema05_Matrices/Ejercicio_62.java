//Crear una matriz de tamaño 3x3, transponerla y mostrarla.
package Ejercicios.Tema05_Matrices;

import java.util.Scanner;

public class Ejercicio_62 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN ---
        Scanner sc = new Scanner(System.in);

        // Creamos la matriz original y la que guardará el resultado transpuesto
        int[][] matrizOriginal = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];

        System.out.println("--- CREADOR DE MATRIZ TRANSPUESTA (3x3) ---");

        // --- 2. LLENADO DE LA MATRIZ ORIGINAL ---
        System.out.println("\nPor favor, digite los valores de la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Coordenada [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

        // --- 3. ALGORITMO DE TRANSPOSICIÓN (La Magia) ---
        /* Para transponer, simplemente invertimos los índices al momento de copiar.
           Lo que en la original era Fila (i) y Columna (j),
           en la nueva será Columna (i) y Fila (j). */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // --- 4. MOSTRAR RESULTADOS ---
        System.out.println("\n--- MATRIZ ORIGINAL ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizOriginal[i][j] + "  ");
            }
            System.out.println(); // Salto de línea por fila
        }

        System.out.println("\n--- MATRIZ TRANSPUESTA ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTranspuesta[i][j] + "  ");
            }
            System.out.println(); // Salto de línea por fila
        }

        sc.close();
    }
}
