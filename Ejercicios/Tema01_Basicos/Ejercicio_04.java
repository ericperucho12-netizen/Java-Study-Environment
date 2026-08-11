/*
"Un vendedor recibe un salario base de $1,000 más una comisión
de $150 por cada carro vendido. Además, recibe el 5% del valor
total de las ventas. Si vendió 'N' carros y el valor total de las
ventas fue de 'X' dólares, ¿cuánto recibirá en total al final del mes?"
 */
package Ejercicios.Tema01_Basicos;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Usamos 'final' para valores que son constantes
        final float salario = 1000f, comision= 150f;
        float valorVentasTotal, comisionVentas, pagoTotal;
        int carrosVendidos;

        System.out.print("Cantidad de carros vendidos: ");
        carrosVendidos = entrada.nextInt();

        System.out.print("Valor total de la ventas: $ ");
        valorVentasTotal = entrada.nextFloat();

        comisionVentas = valorVentasTotal * 0.05f;
        pagoTotal = salario + (carrosVendidos * comision)+comisionVentas;

        System.out.println();



    }

}
