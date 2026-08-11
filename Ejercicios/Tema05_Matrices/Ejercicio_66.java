/*
* Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben
* ser 0 salvo los de los bordes que debnen ser 1. Mostrarla
*
*/
package Ejercicios.Tema05_Matrices;

import java.util.Scanner;

public class Ejercicio_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[5][5];
        System.out.println("--- GENERADOR DE MATRIZ MARCO (5x5) ---");

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i == 0 || i==4 || j == 0 || j==4){
                    matriz[i][j] = 1;//Bordes
                }
                else{
                    matriz[i][j] = 0;//Centro vacío
                }
            }
        }

        System.out.println("\n---RESULTADO EN PANTALLA---");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(matriz[i][j] + " ");//Imprime el elemento con espacio
            }
            System.out.println();//Salto de línea para formar la cuadrícula 5x5
        }

    }
}
