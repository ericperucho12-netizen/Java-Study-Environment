/*
*Crear y cargar una matriz de tamaño n x m y decir
si es simétrica o no
*
*/

package Ejercicios.Tema05_Matrices;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_60Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int nFilas, nCol;
         boolean esSimetrica = true;

        System.out.println("--- DETECTOR DE MATRICES SIMÉTRICAS ---");

        System.out.print("Digite el numero de filas: ");
        nFilas = sc.nextInt();
        System.out.print("Digite el numero de colunas: ");
        nCol = sc.nextInt();

        int[][] matriz = new int[nFilas][nCol];


        System.out.println("LLenando la matriz ");
        // Bucle anidado para cargar los valores en cada posición de la matriz
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // Verificamos primero si la matriz es cuadrada (nFilas == nCol)
        // ya que una matriz que no es cuadrada nunca puede ser simétrica.
        if(nFilas == nCol){
            // Recorremos la matriz para comprobar si es simétrica
            for(int i=0; i<nFilas; i++){
                for(int j=0; j<nCol; j++){
                    // La condición de simetría es que el elemento en (i, j) sea igual a (j, i)
                    if(matriz[i][j]!= matriz[j][i]){
                        esSimetrica = false; // Si encontramos una discrepancia, marcamos como falsa
                        break; // Salimos del bucle interior para evitar comprobaciones innecesarias
                    }
                }
                if(!esSimetrica){
                    break; // Salimos del bucle exterior si ya sabemos que no es simétrica
                }
            }
        }else{
            // Si no es cuadrada (filas != columnas), no puede ser simétrica
            esSimetrica = false;
        }


        //Mostramos el resultado de la matriz
        System.out.println("Matriz cargada");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Diagnostico");
        if(esSimetrica){
            System.out.println("Simetrica cargada");

        }else {
            System.out.println("No simetrica cargada");
        }
    sc.close();
    }
}
