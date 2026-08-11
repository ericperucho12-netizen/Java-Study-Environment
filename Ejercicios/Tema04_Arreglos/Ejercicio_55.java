/*
*Leer 5 elementos numericos que se introduciran ordenados de forma creciente. Estos los
*guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo en el lugar
*adecuado para que la tabla continue ordenada
*/
package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []numeros =new int[10];
        int numeroInsertar;
        int posicion=0;// Esta variable busca el lugar correcto

        System.out.println("--- Ingreso de datos (Ordenados Crecientes) ---");
        for(int i=0;i<5;i++){
            System.out.print("Posición "+i+": ");
            numeros[i]=sc.nextInt();
        }

        //El nuevo dato
        System.out.println("\nDigite el número que desea insertar: ");
        numeroInsertar=sc.nextInt();

        while(posicion<5 && numeros[posicion]<numeroInsertar){
            posicion++;
        }

        //Desplazamiento hacia la derecha

        for(int i=4;i>=posicion;i--){
            numeros[i+1]=numeros[i];
        }

        //Colocamos el numero en el hueco perfecto
        numeros[posicion]=numeroInsertar;
        System.out.println("\n--- Arreglo Actualizado y Ordenado ---");
        for(int i=0;i<6;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
}
