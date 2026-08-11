//Leer 5 numeros, guardarlos en un arreglo y
// mostrarlos en el mismo orden introducido

package Ejercicios.Tema04_Arreglos;
import java.util.Scanner;

public class Ejercicio_45Arrays {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);

      int[]numeros=new int[5];

        System.out.println("--- Ingreso de Datos ---");
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el valor para la posición "+i+": ");
            numeros[i]=sc.nextInt();
        }
        System.out.println("\n--- Los números guardados son ---");
        for(int numeroActual:numeros){
            System.out.print(numeroActual+" ");
        }
    }

}

