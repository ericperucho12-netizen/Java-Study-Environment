/*
"Desarrollar un programa que solicite al usuario una nota entera
del 0 al 10. El sistema debe clasificar y mostrar la calificación
según la siguiente escala:

0 - 4: Insuficiente.
5: Suficiente.
6: Bien.
7 - 8: Notable.
9 - 10: Sobresaliente."

*/
package Ejercicios.Tema02_Condicionales;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_20switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int nota;
        System.out.print("Digite una nota de 0 a 10: ");
        nota = sc.nextInt();

        //usar el switch para clasificar la nota
        switch (nota) {
            case 0: case 1: case 2: case 3: case 4:
                System.out.println("Resultado: Insuficiente");
                break;
            case 5:
                System.out.println("Resultado: Suficiente");
                break;
            case 6:
                System.out.println("Resultado: Bien");
                break;
            case 7: case 8:
                System.out.println("Resultado: Notable");
                break;
            case 9: case 10:
                System.out.println("Resultado: Sobresaliente");
                break;
            default:
                System.out.println("Erro: La nota debe estar entre 0 y 10");
                break;


        }
        sc.close();
    }
}
