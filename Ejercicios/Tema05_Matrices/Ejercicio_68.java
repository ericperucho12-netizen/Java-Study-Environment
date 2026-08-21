/*
*****
****
***
**
*
*/
package Ejercicios.Tema05_Matrices;

public class Ejercicio_68 {
    public static void main(String[] args) {
        System.out.println("--- CREADOR DE TRIÁNGULO INVERTIDO ---");
        System.out.println(); // Espacio estético

        /* EL BUCLE EXTERNO (i): Controla los "pisos" o FILAS de nuestra figura.
         * TRUCO DE LÓGICA: En lugar de contar del 1 al 5, contamos EN REVERSA.
         * Empezamos en el piso 5 y vamos bajando hasta el piso 1 (i--).
         */
        for (int i = 5; i >= 1; i--) {

            /* EL BUCLE INTERNO (j): Dibuja las COLUMNAS (los asteriscos).
             * La condición sigue siendo 'j <= i'.
             * - 1ra vuelta (i=5): Este bucle da 5 vueltas (imprime 5 asteriscos).
             * - 2da vuelta (i=4): Da 4 vueltas (imprime 4 asteriscos).
             * - Última vuelta (i=1): Da 1 vuelta (imprime 1 asterisco).
             */
            for (int j = 1; j <= i; j++) {
                // Usamos print() normal para que salgan uno al lado del otro
                System.out.print("*");
            }

            // Al terminar de imprimir la fila actual, damos el salto de línea
            System.out.println();
        }

        System.out.println("\n--- FIN DEL DIBUJO ---");

    }
}
