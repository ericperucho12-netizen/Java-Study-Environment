
//Pedir numeros hasta que se introdusca uno negativo, y calcula la media.
package Ejercicios.Tema03_Ciclos;

import javax.swing.*;
import java.util.Scanner;
/**
 * Exercise 29: Average Calculator
 * Reads numbers until a negative one is entered,
 * then calculates and displays the average of the entered numbers.
 */
public class Ejercicio_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;   // Accumulator
        int count = 0; // Counter
        double average;

        System.out.println("--- Average Calculator System ---");

        // Initial read before the loop
        System.out.print("Enter a number (negative to calculate average): ");
        number = input.nextInt();

        while(number>=0){
            sum += number;
            count++;
            System.out.println("Enter a number (negative to calculate average): ");
            number = input.nextInt();

        }
        if(count == 0){
            System.out.println("Error: Cannoot calculate the average of 0 numbers.");
        }
        else {
            average = (double) sum / count;
            System.out.println("Total numbers entered: " + count);
            System.out.println("Total sum: " + sum);
            System.out.printf("The average is: %.2f\n", average);
        }
        input.close();
    }
}
