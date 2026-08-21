/*
*
**
***
****
*****
*/

package Ejercicios.Tema05_Matrices;

import java.util.Scanner;

public class Ejercicio_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* EL BUCLE EXTERNO (i): Controla los "pisos" o FILAS de nuestra figura.
         * Como queremos un triángulo de 5 niveles, el bucle va del 1 al 5.
         */
        for (int i = 1; i <= 5; i++) {

            /* EL BUCLE INTERNO (j): Controla los "cuartos" o COLUMNAS (los asteriscos).
             * ¡AQUÍ ESTÁ EL TRUCO!: La condición no es un número fijo, es 'j <= i'.
             * Si estamos en la fila 1 (i=1), este bucle solo da 1 vuelta.
             * Si estamos en la fila 4 (i=4), este bucle da 4 vueltas.
             */
            for (int j = 1; j <= i; j++) {
                // Usamos print() normal (SIN 'ln') para que los asteriscos
                // se impriman uno al lado del otro en la misma línea.
                System.out.print("*");
            }

            // Una vez que el bucle interno termina de imprimir los asteriscos de esa fila,
            // usamos un println() vacío para dar un salto de línea (bajar al siguiente piso).
            System.out.println();
        }



    }
}
