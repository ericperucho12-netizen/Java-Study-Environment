/*
*Crear un programa que lea por teclado una tabla de 10 numeros enteros
*y desplace N posiciones en el arreglo (N es digitado por el usuario)
*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]numeros=new int[10];
        int nPosiciones;

        System.out.println("--- Ingresando los 10 datos ---");
        for(int i=0;i<10;i++){
            System.out.print("Posición "+i+": ");
            numeros[i]=sc.nextInt();
        }
        System.out.println("\nCuantas posiciones deseas desplazar el arreglo? : ");
        nPosiciones=sc.nextInt();

        nPosiciones =nPosiciones%10;

        for(int vuelta =0;vuelta<nPosiciones;vuelta++){
            int ultimoTemporal =numeros[9];
            for(int i=8;i>=0;i--){
                numeros[i+1]=numeros[i];
            }
            numeros[0]=ultimoTemporal;
        }
        System.out.println("\n--- Arreglos Desplazado "+ nPosiciones + "posiciones ---");
        for(int numero:numeros){
            System.out.print(numero+" ");
        }
        sc.close();

    }
}
