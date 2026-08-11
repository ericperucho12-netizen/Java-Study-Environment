/*
leer los datos correspondientes a dos tablas de 12 elementos
numericos, y mezclarlos en una tercera de la
forma: 3 de la tabla A, 3 de la B, otros de A, Otros de la B, etc.
*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arregloA[] = {1,2,3,7,8,9,13,14,15,19,20,21};
        int arregloB[] = {4,5,6,10,11,12,16,17,18,22,23,24};
        int arregloC[]= new int[24];
        int  j=0;


        for(int i=0;i<12;i+=3){
            // Bloque 1: Pasamos 3 datos seguidos desde el Arreglo A
            for(int k=0;k<3;k++){
                arregloC[j]=arregloA[k];
            }




        }
    }
}
