/*
*   Una empresa que se dedica a la venta de desinfectantes
*   necesita un programa para gestionar las facturas.
*   En cada factura figura: el codigo del articulo, la
*   cantidad vendida en litros y el precio por litro.
*
*   Se pide de 5 facturas introducidad:
*   -Facturacion total
*   -Cantidad en litros vendidos del articulo 1
*   -y cuantas facturas se emitieron de mas de $600
*
*/


package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_39 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int codigo,litros,litrosArti1=0,conteoMas600=0;
        float precioLitros, factTotal=0, importe=0;

        for (int i=1;i<=5;i++){
            System.out.println("Articulo "+i+" :");
            System.out.print("Ingrese el codigo del articulo: ");
            codigo = input.nextInt();
            System.out.print("Ingrese la cantidad de litros del articulo: ");
            litros = input.nextInt();
            System.out.print("Ingrese el precio x litros del articulo: ");
            precioLitros = input.nextFloat();

            importe = (float) litros * precioLitros;
            factTotal += importe;


            if(codigo==1){
                litrosArti1+=litros;
            }
            if(codigo>=600){
                conteoMas600++;
            }

        }
        System.out.println("Facturacion total: "+factTotal);
        System.out.println("Precio litros del articulo 1: "+litrosArti1);
        System.out.println("Facturacion total de mas de 600 "+conteoMas600 );


    }
}
