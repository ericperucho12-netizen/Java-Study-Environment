package TodoSobreJava;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: MATRICES (ARREGLOS BIDIMENSIONALES)
 * ---------------------------------------------------------
 * Una matriz es como una tabla de Excel o un tablero de ajedrez.
 * Tiene filas y columnas. Para ubicar un dato dentro de una matriz
 * necesitamos dos coordenadas: el índice de la fila y el índice de la columna.
 * 
 * En Java, una matriz es básicamente un "arreglo de arreglos".
 */
public class Tema05_Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== MATRICES (ARREGLOS DE 2 DIMENSIONES) ===");

        // --- 1. MATRICES CON TAMAÑO FIJO CONOCIDO ---
        // Declaramos la matriz especificando las filas adentro de los primeros
        // corchetes, y las columnas adentro de los segundos.
        int[][] matrizManual = {
            {1, 2, 3}, // Fila 0
            {4, 5, 6}, // Fila 1
            {7, 8, 9}  // Fila 2
        };

        System.out.println("\nImprimiendo matriz manual:");
        for(int i = 0; i < 3; i++) { // Bucle para Filas
            for(int j = 0; j < 3; j++) { // Bucle para Columnas
                System.out.print(matrizManual[i][j] + "\t"); // \t es para dar un espacio de tabulación
            }
            System.out.println(); // Salto de línea al terminar una fila
        }


        // --- 2. MATRICES DINÁMICAS (TAMAÑO DEFINIDO POR EL USUARIO) ---
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas de la matriz:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas de la matriz:"));

        // Creamos la matriz con el tamaño dinámico
        int[][] matrizDinamica = new int[filas][columnas];

        System.out.println("\nLlenado de matriz dinámica (" + filas + "x" + columnas + "):");
        
        // Llenando la matriz con datos ingresados
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matrizDinamica[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nImpresión de tu matriz:");
        // Recorriendo e imprimiendo
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                System.out.print(matrizDinamica[i][j] + "\t");
            }
            System.out.println(); // Bajamos de línea cuando terminamos una fila completa
        }
        
        scanner.close();
    }
}

