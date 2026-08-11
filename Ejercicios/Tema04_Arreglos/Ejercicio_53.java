/*
Crear un programa que lea pro teclado una tabla de 10 números enteros
y la desplace una posición hacia abajo: el primero pasa a
ser el segundo, el segundo pasa a ser el tercero El último pasa a
ser el primero y asi sucesivamentes

*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_53 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int numeros[]=new int[10];
        System.out.println("Ingresa los 10 datos");

        for(int i=0;i<10;i++){
            System.out.print("Ingrese el numero para la posicion "+i+": ");
            numeros[i]=sc.nextInt();

        }
        int ultimoTemporal = numeros[9];

        for(int i=8;i>=0;i--){
            numeros[i+1]=numeros[i];
        }
        numeros[0]=ultimoTemporal;
        System.out.println("\n--- Arreglo Desplazado Circularmente ---");
        for(int numero:numeros){
            System.out.print(numero+" ");
        }
        System.out.println();
    }
}
