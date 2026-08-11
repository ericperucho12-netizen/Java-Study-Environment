/*
        leer un numero e indicar si es positivo o negativo.
        el proceso se repetira hasta que se introdusca un 0

*/

package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter a number (o to exit): ");
        number = input.nextInt();

        while(number!=0){
            if(number> 0){
                System.out.println("The number is POSITIVE.");
            }
            else{
                System.out.println("The number is NEGATIVE.");
            }
            System.out.print("Enter a number (o to exit): ");
            number = input.nextInt();
        }

        System.out.println("Program finished.");
        input.close();

    }

}
