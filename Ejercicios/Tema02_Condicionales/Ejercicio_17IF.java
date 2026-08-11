/*
*"Desarrollar un programa que solicite al usuario el día,
* mes y año de una fecha. El sistema debe determinar si la
* fecha ingresada es correcta, considerando bajo una regla
* simplificada que todos los meses tienen exactamente 30 días."
*
*/
package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_17IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia,mes,year;

        System.out.print("Digite el dia: ");
        dia = entrada.nextInt();
        System.out.print("Digite el mes: ");
        mes = entrada.nextInt();
        System.out.print("Digite el año: ");
        year = entrada.nextInt();

        //Lógica de validación con operadores lógicos
        if ((dia >= 1 && dia <= 30) && (mes >= 1 && mes <= 12) && (year != 0)) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + year + " es CORRECTA.");
        } else {
            System.out.println("La fecha es INCORRECTA. Verifique los datos ingresados.");
        }
        entrada.close();
    }

}
