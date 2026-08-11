/*
"Un estudiante obtuvo calificaciones en distintas categorías.
Calcula su nota final sabiendo que: las participaciones valen el 10%,
el primer y segundo examen parcial valen un 25% cada uno,
y el examen final tiene un peso del 40%."
 */
package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float PESO_PARTICIPACION = .10f, PESO_EXAMENES = .25f, PESO_FINAL = .40f;
        float participacion, examen1, examen2, examenFinal, notaFinal;

        //Pedimos datos al usuario
        System.out.println("---Calculadora de Nota Final");
        System.out.print("Nota de participaciones: ");
        participacion = entrada.nextFloat();

        System.out.print("Nota del examen 1: ");
        examen1 = entrada.nextFloat();
        System.out.print("Nota del examen 2: ");
        examen2 = entrada.nextFloat();
        System.out.print("Nota del examen Final: ");
        examenFinal = entrada.nextFloat();

        //Aplicamos la logica
        notaFinal = (participacion * PESO_PARTICIPACION)
                + (examen1 * PESO_EXAMENES)
                + (examen2 * PESO_EXAMENES)
                + (examenFinal * PESO_FINAL);
        System.out.printf("\nLa nota final del estudiante es: %.2f\n", notaFinal);
        entrada.close();

    }

}
