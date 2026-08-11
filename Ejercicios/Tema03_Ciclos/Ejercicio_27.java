//Adivina el numero aleatorio
package Ejercicios.Tema03_Ciclos;
import java.util.Scanner;
/**
 * Exercise 27: Guess the Random Number
 * The user must guess a randomly generated number.
 * The program gives hints (higher/lower) and counts the attempts.
 */
public class Ejercicio_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userGuess;
        int attempts = 0;

        // Generates a random number between 0 and 99
        int randomNumber = (int) (Math.random() * 100);

        System.out.println("--- Guess the Random Number ---");
        System.out.println("I have generated a number between 0 and 99. Try to guess it!");

        // The do-while loop guarantees the code runs at least once
        do{
            System.out.print("\nEnter your Guess: ");
            userGuess = input.nextInt();
            attempts++;
            if(randomNumber >  userGuess){
                System.out.println("Hint: The number is HIGHER.");
            }
            else if(randomNumber < userGuess){
                System.out.println("Hint: The number is LOWER.");
            }
            else{
                System.out.println("\nAwesome! You guessed the number in " + attempts + " attempts.");
            }

        }while(userGuess != randomNumber);
        input.close();
    }
}
