/*
*Leer por teclado una tabla de 10 elementos numéricos enteros y una
*posición (entre 0 y 9). Elimar el elemento situado en la posición
*dada al hueco.
*/


package Ejercicios.Tema04_Arreglos;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros =new int[10];
        int posicion;

        //Llenar el arreglo
        System.out.println("--- Ingreso de los 10 datos ---");
        for(int i=0;i<10;i++){
            System.out.print("Posición "+i+": ");
            numeros[i]=sc.nextInt();
        }

        //SOLICITUD DE LA POSICION A ELIMINAR

        System.out.print("\nIngrese la posición del elemento a eliminar (0-9): ");
        posicion=sc.nextInt();

        //ALGORITMO DE ELIMINACION

        for(int i=posicion;i<9;i++){
            numeros[i]=numeros[i+1];
        }
        //RESULTADO FINAL

        System.out.println("\n--- Arreglo actualizado ---");
        for(int i=0;i<9;i++){
            System.out.println("Posicion "+i+": "+numeros[i]);
        }

    }
}
