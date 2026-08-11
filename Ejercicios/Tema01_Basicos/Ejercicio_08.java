/*
contruir un programa que calcule y muestre por pantalla las
raices de la ecuacion cuadratica ax^2 + bx + c = 0
*/
package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, determinante, x1, x2;

        System.out.println("--- Calculadora de Ecuaion cuadrática ---");
        System.out.println("Ingrese el coeficiente a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el coeficiente b: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese el coeficiente c: ");
        c = entrada.nextDouble();


        //Calculamos el discriminate (b^2 - 4ac)
        determinante = Math.pow(b,2) - (4 * a * c);

        //Aplicamos la Fórmula general
        x1 = (-b + Math.sqrt(determinante)) / (2 * a);
        x2 = (-b - Math.sqrt(determinante)) / (2 * a);

        //Mostramos resultado
        System.out.println("\n--- Resultado ---");
        System.out.printf("La raíz x1 es: %.4f\n", x1);
        System.out.printf("La raíz x2 es: %.4f\n", x2);

        entrada.close();

    }
}
