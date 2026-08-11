package TodoSobreJava;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: MÉTODO DE ORDENAMIENTO BURBUJA (BUBBLE SORT)
 * ---------------------------------------------------------
 * El ordenamiento de burbuja es un algoritmo de ordenamiento
 * sencillo. Funciona revisando cada elemento de la lista que
 * va a ser ordenada con el siguiente, intercambiándolos de
 * posición si están en el orden equivocado.
 * 
 * Es necesario revisar varias veces toda la lista hasta que
 * no se necesiten más intercambios.
 */
public class Tema04_Burbuja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== ALGORITMO DE ORDENAMIENTO BURBUJA ===");
        
        System.out.print("¿Cuántos números deseas ordenar? ");
        int n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        // Llenar el arreglo pidiendo datos al usuario
        System.out.println("\nIntroduce los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i+1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        
        // Mostrar arreglo original antes de ordenar
        System.out.print("\nArreglo Original: ");
        mostrarArreglo(arreglo);
        
        // ---------------------------------------------------------
        // LÓGICA DEL ORDENAMIENTO BURBUJA
        // ---------------------------------------------------------
        int auxiliar; // Variable temporal para hacer el intercambio
        
        // El bucle exterior controla las "pasadas" por el arreglo
        for(int i = 0; i < (n-1); i++) {
            // El bucle interior compara los elementos adyacentes
            // A medida que i aumenta, los últimos elementos ya están ordenados
            for(int j = 0; j < (n-1-i); j++) {
                
                // Si el número actual es MAYOR que el siguiente (orden ascendente)
                if(arreglo[j] > arreglo[j+1]) { 
                    // INTERCAMBIO (SWAP)
                    auxiliar = arreglo[j];      // Guardamos el valor actual
                    arreglo[j] = arreglo[j+1];  // Movemos el menor a la izquierda
                    arreglo[j+1] = auxiliar;    // Ponemos el mayor a la derecha
                }
            }
        }
        
        // Mostrar arreglo ya ordenado
        System.out.print("Arreglo Ordenado: ");
        mostrarArreglo(arreglo);
        
        sc.close();
    }
    
    // Método auxiliar para imprimir el arreglo y no repetir código
    public static void mostrarArreglo(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}

