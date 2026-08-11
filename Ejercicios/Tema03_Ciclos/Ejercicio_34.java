//Pide al usuario un número (ejemplo: 5). El programa
// debe * todos los números desde el 1 hasta ese número.
// Si el usuario pone 5, el programa
// calcula: 1 * 2 * 3 * 4 * 5 = 120.
package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long factorial=1;
        int num;

        System.out.print("Enter number: ");
        num = sc.nextInt();

        if(num >= 0){
            for(int i=1;i<=num;i++){
                factorial*=i;
            }
            System.out.print("Factorial of "+num+" is "+factorial);
        }
        else{
            System.out.println("Error: Factorial is not defined for negative number.");
        }

    }
}
