/*
*Utiliza dos matrices de tamaño 5x9 y 9x5,
* cargar la primera y transponerla en la segunda
*
*/

package Ejercicios.Tema05_Matrices;

import java.util.Scanner;

public class Ejercicio_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --- 1. PREPARACIÓN DE LAS MATRICES ---
        // Matriz original: 5 Filas x 9 Columnas
        int[][] matrizOriginal = new int[5][9];

        // Matriz transpuesta: 9 Filas x 5 Columnas (¡Dimensiones invertidas!)
        int[][] matrizTranspuesta = new int[9][5];

        System.out.println("--- TRANSPOSICIÓN DE MATRIZ RECTANGULAR ---");

        // --- 2. AUTOLlenado (Truco de Optimización para Pruebas) ---
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrizOriginal[i][j] = contador;
                contador++;
            }
        }
        // --- 3. ALGORITMO DE TRANSPOSICIÓN ---
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 9; j++){
                //Invertimos las coordenadas: El destino recibe Columna filas
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // --- 4. IMPRESIÓN VISUAL ---
        System.out.println("\n--- MATRIZ ORIGINAL (5x9) ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizOriginal[i][j] + " \t");
            }
            System.out.println();
        }

        System.out.println("\n--- MATRIZ TRANSPUESTA (9x5)--- ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizTranspuesta[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
