package TodoSobreJava;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: ORDENAMIENTO POR INSERCIÓN (INSERTION SORT)
 * ---------------------------------------------------------
 * El método de inserción es una forma natural de ordenar cosas.
 * Imagina cómo ordenas las cartas en tu mano al jugar póker:
 * Tomas una carta, buscas su posición correcta entre las cartas
 * que ya tienes ordenadas a la izquierda, y la insertas ahí.
 * 
 * Es más eficiente que la burbuja para arreglos pequeños o 
 * arreglos que ya están casi ordenados.
 */
public class Tema04_OrdenamientoPorInsercion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== ORDENAMIENTO POR INSERCIÓN ===");

        System.out.print("Digite la cantidad de números a ordenar: ");
        int nElementos = sc.nextInt();
        
        int[] arreglo = new int[nElementos];

        System.out.println("\nDigite los elementos del arreglo:");
        for(int i = 0; i < nElementos; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        // ---------------------------------------------------------
        // LÓGICA DEL ORDENAMIENTO POR INSERCIÓN
        // ---------------------------------------------------------
        int pos, aux;
        
        // Empezamos desde el índice 1, ya que el índice 0 se considera "ordenado" consigo mismo
        for (int i = 1; i < nElementos; i++) {
            pos = i; // La posición en la que estamos evaluando
            aux = arreglo[i]; // El valor de la carta que queremos insertar

            // Mientras no estemos en la primera posición, Y
            // el número a la izquierda sea MAYOR que el número actual...
            while ((pos > 0) && (arreglo[pos-1] > aux)) {
                // Movemos el número de la izquierda un espacio hacia la derecha
                // Para "hacerle hueco" al número que estamos evaluando
                arreglo[pos] = arreglo[pos-1];
                pos--; // Nos movemos un paso a la izquierda para seguir comparando
            }
            
            // Insertamos la "carta" en el hueco que hemos creado (su posición correcta)
            arreglo[pos] = aux; 
        }

        // --- IMPRESIÓN DEL RESULTADO ---
        System.out.println("\nArreglo Ordenado (Ascendente):");
        for(int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }

        System.out.println("\n\nArreglo Ordenado (Descendente):");
        // Para imprimir al revés, empezamos desde el final del arreglo
        for(int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
        
        sc.close();
    }
}

