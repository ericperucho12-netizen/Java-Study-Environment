package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 82: MÉTODOS CON MATRICES
 * ---------------------------------------------------------
 * Conceptos: Paso por referencia y retorno de matrices.
 * 
 * Enunciado:
 * Crea un método que reciba una matriz y devuelva OTRA matriz
 * que sea la transpuesta de la original (filas por columnas).
 */
public class Ejercicio_82 {

    public static int[][] transponerMatriz(int[][] matrizOriginal) {
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;
        
        // Creamos la nueva matriz invertida (columnas x filas)
        int[][] matrizTranspuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Intercambiamos índices
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }
        
        return matrizTranspuesta;
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("=== MATRIZ TRANSPUESTA CON MÉTODOS ===");
        
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("\nMatriz Original (2x3):");
        imprimirMatriz(original);
        
        // Llamamos al método
        int[][] transpuesta = transponerMatriz(original);
        
        System.out.println("\nMatriz Transpuesta (3x2):");
        imprimirMatriz(transpuesta);
    }
}
