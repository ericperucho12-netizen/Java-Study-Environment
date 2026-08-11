//Pide un número(que debe estar entre 0 y 10) y
// mostrar las tablas de multiplicar de dicho número

package Ejercicios.Tema03_Ciclos;


import java.util.Scanner;

public class Ejercicio_38 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number, result=0;

        System.out.println("--- Multiplication Table Generator | Perucho Dev ---");

        // Use do-while to ensure the number is within the valid range (0-10)
        do{
            System.out.print("Enter a number between 0 and 10 ");
            number = input.nextInt();
            if(number < 0 || number > 10){
                System.out.println("Error: the number must be between 0 and 10");
            }
        }while(number < 0 || number > 10);

        for(int i = 1; i <= 10; i++){
            result= number * i;
            System.out.printf("%d x %2d =  %d\n",number,i,result);
        }
        input.close();
    }
}
