/*
*Leer 10 enteros en una tabla. guardar en otra tabla los
* elementos pares de la primera,
*y a continuacion los elementos impares
*
*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arregloOriginal = {5, 12, 7, 4 ,9, 2, 11, 6, 3, 8 };
        int[] arregloDestino = new int[10];
        int posicionDestino =0;

        for(int i=0;i<10;i++){
            if(arregloOriginal[i]%2==0){
                arregloDestino[posicionDestino]=arregloOriginal[i];
                posicionDestino++;
            }
        }

        for(int i=0;i<10;i++){
            if(arregloOriginal[i]%2!=0){
                arregloDestino[posicionDestino]=arregloOriginal[i];
                posicionDestino++;
            }
        }


        System.out.println("--- Arreglo Original ---");
        for(int num:arregloOriginal){
            System.out.print(num+" ");
        }
        System.out.println("\n\n--- Arreglo Clasificado (Pares primero, luego Impares) --- ");
        for(int num: arregloDestino){
            System.out.print(num+" ");
        }
        System.out.println();

    }
}
