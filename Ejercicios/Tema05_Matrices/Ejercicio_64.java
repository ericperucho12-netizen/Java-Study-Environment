//Crear una matriz de tamaño n x m, mostrar la suma de cada
// fila y de cada columna
package Ejercicios.Tema05_Matrices;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_64 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN ---
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CALCULADORA DE FILAS Y COLUMNAS ---");
        System.out.print("Digite el número de filas (N): ");
        int nFilas = sc.nextInt();
        System.out.print("Digite el número de columnas (M): ");
        int nCol = sc.nextInt();

    //Matriz principal
        int [][] matriz = new int[nFilas][nCol];

        //Arreglos para guardar las sumas de forma independiente
        int [] sumaFilas = new int [nFilas];
        int [] sumaColumnas = new int [nCol];

        // --- 2. LLENADO Y SUMA AL VUELO (Optimización Senior) ---
        System.out.println("\n--- Digite los valores de la Matriz ---");
        for( int i = 0; i < nFilas; i++){
            for( int j = 0; j < nCol; j++){
                System.out.print("Posición ["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();


                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
            }
        }

        // --- 3. IMPRESIÓN VISUAL (Estilo Excel) ---
        System.out.println("\n--- TABLA DE RESULTADOS ---");
        //Imprimimos la matriz y al lado la suma de su fila
        for( int i = 0; i < nFilas; i++){
            for( int j = 0; j < nCol; j++){
                System.out.print(matriz[i][j]+" \t");
            }
            System.out.println(" | Suma Fila "+i+ ": "+sumaFilas[i]);
        }
        System.out.println("----------------------------------------");
        //imprimimos la suma de las columnas en la parte inferior
        for( int j = 0; j < nCol; j++){
            System.out.print(sumaColumnas[j]+" \t");
        }
        System.out.println(" <- Suma Columnas");


    }
}
