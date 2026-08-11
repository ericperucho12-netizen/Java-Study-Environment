//Crea una matriz de tamaño 7x7 y rellenarla de
// forma que los elementos de la diagoanl principla sean 1 y el resto 0
package Ejercicios.Tema05_Matrices;

import java.util.Scanner;

public class Ejercicio_63 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[7][7];
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 7; j++) {


            if(i==j){
                matriz[i][j]=1;
            }else{
                matriz[i][j]=0;
            }
        }
    }

    //Truco
//      En Java, los arreglos de tipo 'int' se llenan automáticamente con '0'.
//      * Por lo tanto, podrías hacer esto con un solo bucle y ahorrar memoria:
//      * for(int i = 0; i < 7; i++) { matriz[i][i] = 1; }

        for(int i  = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

    }
}
