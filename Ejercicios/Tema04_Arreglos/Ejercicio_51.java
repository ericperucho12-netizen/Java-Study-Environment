/*
Leer por teclado una serie de 10 numeros enteros.
La Aplicacion debe indicar si los numeros estan
ordenados de forma crecicente, decreciente, o si
estan desordenados

*/
package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numeros =new int[10];

        boolean creciente = false;
        boolean decreciente = false;

        System.out.println("\"--- Ingreso de Datos ---\"");
        for(int i=0;i<10;i++){
            System.out.print("Ingrese el número para la posición "+ i+ ": ");
            numeros[i]=sc.nextInt();
        }
        for(int i=0;i<9;i++){
            if(numeros[i]<numeros[i+1]){
                creciente=true;
            }else if(numeros[i]>numeros[i+1]){
                decreciente=true;
            }
        }
        if(creciente==true&& decreciente==false){
            System.out.println("\"Resultado: El arreglo está ordenado de forma CRECIENTE");
        }else  if(creciente==false&& decreciente==true){
            System.out.println("Resultado: El arreglo está ordenado de forma DECRECIENTE");
        }else if(creciente==true&& decreciente==true){
            System.out.println("Resultado: El arreglo está totalmente DESORDENADO");
        }else{
            System.out.println("Resultado: Todos los números son IGUALES");
        }

    }
}
