/* 
"Desarrollar un programa que solicite el monto total de una compra.
Si el valor es mayor o igual a 300, se debe aplicar un descuento
automático del 20% sobre el total. El sistema debe mostrar el precio
final a pagar."
 */
package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_12IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float UMBRAL_DESCUENT0 = 300f, PORCENTAJE_DESCUENTO =.20f;
        float precioCompra, descuento, precioFinal;

        System.out.println("--- Sistema de descuentos ---");
        System.out.print("Ingrese el monto de la compra: ");
        precioCompra = sc.nextFloat();

        if(precioCompra>= UMBRAL_DESCUENT0){
            descuento= precioCompra*PORCENTAJE_DESCUENTO;
            precioFinal= precioCompra-descuento;
            System.out.println("Se aplico un descuento del 20%!");

        }
        else{
            precioFinal= precioCompra;
            System.out.println("La compra  no alacanza el minimo para descuento.");
        }
        System.out.printf("El total a pagar es: %.2f\n",precioFinal);
        sc.close();
    }
}
