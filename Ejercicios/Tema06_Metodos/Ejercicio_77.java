package Ejercicios.Tema06_Metodos;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 82: CALCULADORA MODULAR
 * ---------------------------------------------------------
 * Conceptos: Separación de responsabilidades.
 * 
 * Enunciado:
 * Crea un programa que pida dos números y luego llame a 4
 * métodos distintos (sumar, restar, multiplicar, dividir)
 * devolviendo sus resultados.
 */
public class Ejercicio_77 {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0; // Devolvemos 0 como valor por defecto en caso de error
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== CALCULADORA CON MÉTODOS ===");

        System.out.print("Digite el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + sumar(num1, num2));
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        System.out.println("División: " + dividir(num1, num2));

        sc.close();
    }
}
