/*
* Hacer unas modificaciones al ejercicio anterior suponiendo que
* no se introduce el precio por litro
* Solo existe tres productos con precio:
* 1. 0.6 $litros
* 2. 3 $litros
* 3. 1,25 $ litros
* */

package Ejercicios.Tema03_Ciclos;

import javax.swing.*;

public class Ejercicio_40 {
    public static void main(String[] args) {
        int codigo, litrosArti1 = 0, conteoMas600 = 0, codigoPrecio, litros;
        float  factTotal = 0, importe = 0, litros1 = 0.6f, litros2 = 3f, litros3 = 1.25f;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N " + i + "\nIngrese el codigo del producto: "));
            codigoPrecio = Integer.parseInt(JOptionPane.showInputDialog("Precio del producto: \nEliga un precio: " +
                    "\n1. $0.6 x litro \n2. $ 3 x litro \n3. $1.25 x litro"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los litros del producto: "));

            //Precios de los articulos +  la facturacion total
            if (codigoPrecio == 1) {
                importe = (float) litros * litros1;
                factTotal += importe;
            } else if (codigoPrecio == 2) {
                importe = (float) litros * litros2;
                factTotal += importe;
            } else if (codigoPrecio == 3) {
                importe = (float) litros * litros3;
                factTotal += importe;
            }

            //Litros del articulo 1
            if (codigo == 1) {
                litrosArti1 += litros;
            }
            if (importe > 600) {
                conteoMas600++;
            }
        }

        System.out.println("Facturacion total: " + factTotal);
        System.out.println("Cantidad de litros vendidos del Articulo 1: " + litrosArti1);
        System.out.println("Cantidad de facturas mayores a $600: " + conteoMas600);

    }
    }

