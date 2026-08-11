/*
Pedir numeros hasta que se teclee un 0, mostrar la suma de todos
los numeros introducidos
*/

package Ejercicios.Tema03_Ciclos;
import java.util.Scanner;
/**
 * Exercise 28: Sum of Numbers
 * Reads numbers from the user until a 0 is entered,
 * then displays the total sum of all entered numbers.
 */
public class Ejercicio_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0; // Accumulator variable initialized to 0

        System.out.println("--- Number Summation System ---");
        System.out.println("Enter numbers to add them up. Type 0 to exit.");

        // The do-while loop ensures the user is prompted at least once
        do{
            System.out.print("Enter number: ");
            number = input.nextInt();
            sum += number;

        }while(number != 0);
        System.out.println("\nProcess finished.");
        System.out.println("The total sum is: " + sum);
        input.close();
    }
}
