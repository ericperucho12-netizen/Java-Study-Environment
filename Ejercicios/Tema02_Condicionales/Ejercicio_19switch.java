/*
"Construir un programa que simule el funcionamiento de una calculadora
básica. El sistema debe realizar las cuatro operaciones aritméticas
(Suma, Resta, Producto y División) con dos valores enteros.
El usuario especificará la operación mediante un carácter:
'S' para suma, 'R' para resta, 'P' o 'M' para producto, y
'D' para división (debe funcionar con mayúsculas y minúsculas)."
*/
package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_19switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        char opcion;

        System.out.println("Digite el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        n2 = sc.nextInt();

        System.out.println("Eliga un operacion: ");
        System.out.println("S. sumar | R. restar | P/M. producto | D. division");
        System.out.print("Opcion: ");
        opcion = sc.next().charAt(0);

        switch (opcion){
            case 'S':
            case 's':
                System.out.println("La suma es: " + (n1 + n2));
                break;
            case 'R':
            case 'r':
                System.out.println("La resta es: " + (n1 - n2));
                break;
            case 'P':
            case 'p':
            case 'm':
            case 'M':
                System.out.println("El producto es: " + (n1 * n2));
                break;
            case 'D':
            case 'd':
                if(n2!=0){
                    float division = (float) n1 /n2;
                    System.out.printf("El division es: %.2f\n", division);
                }else {
                    System.out.println("Erro: No se puede dividir entre cero");
                }
                break;
            default:
                System.out.println("Opcion invalido. Intente con S, R, P, M o D");
                break;
        }



    }

}

