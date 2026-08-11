//pedir 10 numero y escribir la suma total
package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number, totalSum=0;
        for(int i=1;i<=10;i++){
            System.out.print("Enter number: "+i+":");
            number=sc.nextInt();
            totalSum+=number;
        }
        System.out.println("The total sum is: "+totalSum);
    }
}
