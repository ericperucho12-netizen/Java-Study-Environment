// (a + b)^2 = a^2 + b^2 + 2ab
package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, resultado;


        //Pedimos valores
        System.out.println("--- Caculadora de Binomio al cuadrado ---");
        System.out.println("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = entrada.nextDouble();

        //Aplicamos la logica usamos Math.pow para elevar a la potencia

        resultado = Math.pow(a, 2) + Math.pow(b, 2)+ (2*a*b);
        System.out.printf("\nEl resultado de (%.2f + %.2f)^2 es: %.2f\n", a, b, resultado);
        entrada.close();
    }
}
