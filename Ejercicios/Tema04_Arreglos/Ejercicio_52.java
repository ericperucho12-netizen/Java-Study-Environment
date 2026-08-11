/*
*Diseñar una aplicación que declare una tabla de 10 elementos enteros.
*Leer mediante el teclado 8 números. Después se debe pedir un número y
*una posición, insertarlo en la posición indicada, desplazando
*los que estén detrás
*/
package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]numeros =new int[10];
        int numeroInsertar, posicion;

        System.out.println("--- Llenando los primeros 8 datos ---");
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }


        System.out.println("\nIngrese el NUEVO número que desea insertar:");
        numeroInsertar = sc.nextInt();

        System.out.println("Ingrese la POSICIÓN donde desea insertar: ");
        posicion = sc.nextInt();

    for(int i=7;i>=posicion;i--){
        numeros[i+1]=numeros[i];
    }
    numeros[posicion]=numeroInsertar;

    for(int i=0;i<9;i++){
        System.out.println("Posición "+i+": "+numeros[i]);
    }


    }
}
