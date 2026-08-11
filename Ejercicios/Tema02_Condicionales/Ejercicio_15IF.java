//Pedir 3 numeros y mostrarlos ordenados de mayor a menor
package Ejercicios.Tema02_Condicionales;
import java.util.Scanner;
public class Ejercicio_15IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("--- Ordenador de Números ---");
        System.out.print("Digite el primer número: ");
        n1 = sc.nextInt();
        System.out.print("Digite el segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Digite el tercer número: ");
        n3 = sc.nextInt();

        // Lógica de permutaciones para orden descendente
        if ((n1 >= n2) && (n2 >= n3)) {
            System.out.println("Orden: " + n1 + " - " + n2 + " - " + n3);
        } else if ((n1 >= n3) && (n3 >= n2)) {
            System.out.println("Orden: " + n1 + " - " + n3 + " - " + n2);
        } else if ((n2 >= n1) && (n1 >= n3)) {
            System.out.println("Orden: " + n2 + " - " + n1 + " - " + n3);
        } else if ((n2 >= n3) && (n3 >= n1)) {
            System.out.println("Orden: " + n2 + " - " + n3 + " - " + n1);
        } else if ((n3 >= n1) && (n1 >= n2)) {
            System.out.println("Orden: " + n3 + " - " + n1 + " - " + n2);
        } else {
            System.out.println("Orden: " + n3 + " - " + n2 + " - " + n1);
        }

        sc.close(); // Práctica estándar de calidad
    }
}
