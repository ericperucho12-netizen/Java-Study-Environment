/*
Guillermo tienen N dolares. Luis tiene la midad de lo que posee Guillermo
Juan tienen la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que
tiene entre los tres
*/

package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       float guillermo, luis, juan, total;
        System.out.println("Cuantos dólares tiene Guillermo?: ");
        guillermo = entrada.nextFloat();

        //Aplicamos la lógica
        luis = guillermo / 2;
        juan = (guillermo + luis) /2;
        total = guillermo + luis + juan;

        //Mostramos cuánto tienen cada uno antes del total
        System.out.println("\n---Desglose de cuentas ---");
        System.out.println("Guillermo: " + guillermo);
        System.out.println("Luis: " + luis);
        System.out.println("Juan: " + juan);
        System.out.println("------------------------");
        System.out.println("Total entre los tres: $" + total);

        entrada.close();//Tip: Siempre cerrar el Scanner

    }
}
