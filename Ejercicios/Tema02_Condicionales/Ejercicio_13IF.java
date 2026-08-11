/*
"Un obrero necesita calcular su salario semanal, el cual se obtiene de
la siguiente manera: si trabaja 40 horas o menos, se le paga $16 por hora.
Si trabaja más de 40 horas, se le pagan las primeras 40 horas a $16 cada
una y las horas excedentes a $20 por hora."
*/
package Ejercicios.Tema02_Condicionales;


import java.util.Scanner;

public class Ejercicio_13IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Constantes para un código profesional
        final int LIMITE_HORAS = 40;
        final int PAGO_NORMAL = 16;
        final int PAGO_EXTRA = 20;

        int horasTrabajadas, salarioTotal;

        System.out.println("--- Calculadora de Salario Semanal Perucho Dev ---");
        System.out.print("Digite el total de horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        // Sabiendo que LIMITE_HORAS es 40...
        if (horasTrabajadas <= LIMITE_HORAS) {
            salarioTotal = horasTrabajadas * PAGO_NORMAL;
        } else {
            // Calculamos 40 horas fijas + el excedente por el pago extra
            salarioTotal = (LIMITE_HORAS * PAGO_NORMAL) + ((horasTrabajadas - LIMITE_HORAS) * PAGO_EXTRA);
        }

        System.out.println("El salario semanal es: $" + salarioTotal);

        entrada.close();
    }
}
