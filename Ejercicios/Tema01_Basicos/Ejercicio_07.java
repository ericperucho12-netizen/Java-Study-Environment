/*
"Construir un programa que calcule el equivalente en semanas,
días y horas a partir de un número total de horas ingresado
por el usuario."
 */
package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int HORAS_SEMANA =168, HORAS_DIA = 24;
        int totalHoras, semanas, dias, horas;

        //Solicitamos las horas
        System.out.print("Digite el número total de horas; ");
        totalHoras = entrada.nextInt();

        //Conversión
        semanas = totalHoras / HORAS_SEMANA;
        dias = (totalHoras % HORAS_SEMANA) / HORAS_DIA;
        horas = totalHoras % HORAS_SEMANA;

        //Imprimimos el resultado
        System.out.println("\n--- Resultado de la Conversión ---");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);

        entrada.close();

    }

}
