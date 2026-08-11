/* 
"Desarrollar un programa que solicite al usuario dos números
reales y determine cuál de ellos es el mayor o si ambos son
iguales entre sí."
*/
package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;


public class Ejercicio_10IF {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        float n1,n2;

        System.out.println("--- Comparador de numeros ---");
        System.out.println("Digite el primer numero: ");
        n1 = sc.nextFloat();
        System.out.println("Digite el segundo numero: ");
        n2 = sc.nextFloat();

        if(n1>n2){
            System.out.println("El numero "+ n1+ " es mayor.");
        }
        else if(n2>n1){
            System.out.println("El numero "+ n2+ " es mayor.");
        }
        else{
            System.out.println("Ambos numeros son iguales");
        }
        sc.close();
    }
}
