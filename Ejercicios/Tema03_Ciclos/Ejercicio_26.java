/* Pedir numeros hasta que se tecle uno negativo,
y mostrar cuantos numeros se han introducido.*/
package Ejercicios.Tema03_Ciclos;
import java.util.Scanner;

public class Ejercicio_26 {
public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
        int number;
        int count = 0; // This variable will keep track of the inputs

    System.out.print("Enter a number (negative to stop): ");
    number = input.nextInt();

    while (number >=0){
        count++;
        System.out.print("Enter a number (negative to stop): ");
        number = input.nextInt();
    }
    System.out.println("Total numbers entered: " + count);
    input.close();

    }
}
