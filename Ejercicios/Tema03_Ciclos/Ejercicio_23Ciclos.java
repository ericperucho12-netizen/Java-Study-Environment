/*
    Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
    introduzca un numero negativo
*/
package Ejercicios.Tema03_Ciclos;
import java.util.Scanner;

public class Ejercicio_23Ciclos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, square;

        System.out.println("Enter number: ");
        number = sc.nextInt();

        while(number >=0){
            square = (int)Math.pow(number,2);
            System.out.println("The square of "+ number+" is: "+square);

            System.out.println("\nEnter another number (or negative to quit): ");
            number = sc.nextInt();

        }

        System.out.println("\nProgram Terminated. ");
        sc.close();
    }
}
