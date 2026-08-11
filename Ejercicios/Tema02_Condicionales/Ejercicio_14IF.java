/*
"Desarrollar un programa que solicite al usuario dos números enteros.
El sistema debe determinar y mostrar si ambos números son pares,
si ambos son impares, o si uno es par y el otro impar
(especificando cuál es cuál)."
 */
package Ejercicios.Tema02_Condicionales;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_14IF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;

        System.out.print("Digite el primer numero: ");
        n1=sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        n2=sc.nextInt();

        if(n1%2==0 && n2%2==0){
            System.out.println("Los numeros son pares");
        } else if (n1%2==0) {
            System.out.println("El numero "+n1+" es par "+ " y el numero "
                    +n2+" es impar");
        }else if(n2%2==0){
            System.out.println("El numero "+n2+" es par "+ " y el numero "+
                    n1+" es impar");
        }else{
            System.out.println("los numeros son impares");
        }
        sc.close();
    }

}
