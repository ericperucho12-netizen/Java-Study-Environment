//Pedir un numero N, y mostrar todos los numeros del 1 al N
package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber;

        System.out.println("--- Number Sequence Generator | Perucho Dev ---");
        System.out.print("Enter a positive number (N): ");
        maxNumber = input.nextInt();

        // Validate that the user enters a valid number for the sequence
        if (maxNumber >= 1) {
            System.out.println("\nGenerating sequence from 1 to " + maxNumber + ":");
// *      for(inicializacion; condicion; aumento o decremento){
// *          Instrucciones;
// *      }
            for (int i = 1; i <= maxNumber; i++) {
                System.out.println(i+" ");

            }
            System.out.println("\n\nSequence completed.");
        } else {
            System.out.println("Error: Please enter a number greater than 0.");
        }

        input.close();
    }
}

