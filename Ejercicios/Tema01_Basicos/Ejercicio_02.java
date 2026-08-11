/*
* Hacer un programa que calcule e imprima el salario semanal de
* un empleado a partir de sus horas semanales trabajadas y
* de su salario por hora.
*
*/

package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas, salario,totalSalario;



        System.out.println("Ingrese el salario del usuario:  ");
        salario = sc.nextInt();
        System.out.println("Ingrese las horas trabajadas: ");
        horas = sc.nextInt();


        totalSalario = horas*salario;
        System.out.println("Salario del usuario: " + totalSalario);



    }
}

