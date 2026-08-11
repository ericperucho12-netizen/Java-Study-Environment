/*
*
*   Pedir 10 sueldos
*   Mostrar su suma y cuantos hay mayores de $1000
*
*/
package Ejercicios.Tema03_Ciclos;


import java.util.Scanner;

public class Ejercicio_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int sueldo, totalsum=0,salario=0;

       for(int i=1;i<=10;i++){
           System.out.print("Digite um numero: ");
           sueldo = sc.nextInt();
           totalsum+=sueldo;
           if(sueldo>1000){
               salario++;
           }
       }
        System.out.println("Mayores de 1000: "+ salario);
        System.out.println("La suma de los numeros es: "+ totalsum);


    }
}
