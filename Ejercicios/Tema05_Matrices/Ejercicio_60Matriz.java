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
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol; j++){
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        if(nFilas == nCol){
            for(int i=0; i<nFilas; i++){
                for(int j=0; j<nCol; j++){

                    if(matriz[i][j]!= matriz[j][i]){
                        esSimetrica = false;
                        break;
                    }
                }
                if(!esSimetrica){
                    break;
                }
            }
        }else{
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
