/*
Desarrollar un programa que solicite al usuario una
cantidad en Kilogramos (Kg). El sistema debe permitir
convertir dicha masa a otras unidades mediante un menú de opciones:
*Gramos (g)
*Libras (lb)
*Onzas (oz)
*Miligramos (mg)"
*/
package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        // Constants for conversion factors
        final double KG_TO_G = 1000.0;
        final double KG_TO_LB = 2.20462;
        final double KG_TO_OZ = 35.274;
        final double KG_TO_TON = 0.001;

    double kgAmount, convertedValue;
    int opcion;

        System.out.print("Enter weigt in lilograms (Kg): ");
        kgAmount = input.nextDouble();

        System.out.println("\nSelect the target unit: "+
                "\n1. Grams (g)" +
                "\n2. Pounds (lb)" +
                "\n3. Ounces (oz)" +
                "\n4. Tonnes (ton)");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
                convertedValue = kgAmount*KG_TO_G;
                System.out.printf("%.2f Kg is equal to %.2f Grams.\n", kgAmount, convertedValue);
                break;
            case 2:
                convertedValue = kgAmount*KG_TO_LB;
                System.out.printf("%.2f Kg is equal to %.4f Pounds.\n",kgAmount, convertedValue );
                break;
            case 3:
                convertedValue = kgAmount*KG_TO_OZ;
                System.out.printf("%.2f Kg is equal to %.4f Ounces.\n",kgAmount, convertedValue );
                break;
            case 4:
                convertedValue = kgAmount*KG_TO_TON;
                System.out.printf("%.2f Kg is equal to %.4f Tons.\n",kgAmount, convertedValue );
                break;
                default:
                    System.out.println("Error: invalid option selected");
                    break;
        }

    }
}
