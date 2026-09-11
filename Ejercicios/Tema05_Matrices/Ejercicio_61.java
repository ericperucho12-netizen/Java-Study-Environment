/*
Crear y cargar dos matrices de tamaño
3x3, sumarlas y mostrar su resultado.
*/


package Ejercicios.Tema05_Matrices;

import javax.swing.*;

public class Ejercicio_61 {
    public static void main(String[] args) {
    int matriz[][] = {{5,4,3},{2,1,4},{7,9,10}};
    int matriz2 [][]= {{3,1,6},{1,8,6},{3,2,11}};
        int suma[][] = new int[3][3];

        // Recorremos las filas de las matrices
        for(int i=0;i<matriz.length;i++){
            // Recorremos las columnas de las matrices
            for(int j=0;j<matriz2.length;j++){
                // Sumamos los elementos correspondientes de ambas matrices
                suma[i][j]=matriz[i][j]+matriz2[i][j];
            }
        }
        for (int i = 0; i < suma.length; i++) { // Recorre filas
            for (int j = 0; j < suma[i].length; j++) { // Recorre columnas
                System.out.print(suma[i][j] + " "); // Imprime el número y un espacio
            }
            System.out.println(""); // Salto de línea al terminar cada fila
        }




    }
}
