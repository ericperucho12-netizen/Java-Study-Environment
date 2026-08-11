

package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter a number (0 to exit): ");
        number = input.nextInt();

        while(number != 0){
            if(number % 2 == 0){
                System.out.println("The number is pair");
            }
            else{
                System.out.println("The number is ood");
            }
            System.out.print("Enter a number (0 to exit): ");
            number = input.nextInt();
        }
        System.out.println("Program finished.");
    input.close();
    }
}
