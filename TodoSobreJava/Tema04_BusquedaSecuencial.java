package TodoSobreJava;

import javax.swing.JOptionPane;

/**
 * ---------------------------------------------------------
 * TEMA: BÚSQUEDA SECUENCIAL (LINEAL)
 * ---------------------------------------------------------
 * La búsqueda secuencial es el método más sencillo para buscar
 * un elemento en un arreglo. Consiste en revisar cada elemento
 * del arreglo, uno por uno (de principio a fin), hasta encontrar
 * el valor buscado o llegar al final del arreglo.
 * 
 * Ventaja: Funciona en arreglos desordenados.
 * Desventaja: Es lenta si el arreglo es muy grande.
 */
public class Tema04_BusquedaSecuencial {
    public static void main(String[] args) {
        System.out.println("=== BÚSQUEDA SECUENCIAL ===");
        
        // Declaramos y llenamos nuestro arreglo
        int[] arreglo = {4, 1, 5, 2, 3};
        int dato;
        boolean band = false; // "Bandera" para saber si lo encontramos

        // Pedimos al usuario qué número quiere buscar
        String input = JOptionPane.showInputDialog("Digite el número a buscar en el arreglo:");
        dato = Integer.parseInt(input);

        // ---------------------------------------------------------
        // LÓGICA DE BÚSQUEDA SECUENCIAL
        // ---------------------------------------------------------
        int i = 0; // Empezamos desde el índice 0
        
        // Iteramos mientras i sea menor al tamaño del arreglo
        // Y la bandera siga siendo falsa (aún no lo encontramos)
        while(i < arreglo.length && !band) {
            
            // Si el elemento en la posición 'i' es igual al dato que buscamos
            if(arreglo[i] == dato) {
                band = true; // ¡Lo encontramos! Cambiamos la bandera a true
            }
            
            // Si no fue así, pasamos a la siguiente posición
            if (!band) {
                i++;
            }
        }

        // --- RESULTADOS ---
        if(band == false) {
            // Si terminó el ciclo y la bandera sigue falsa, el número no existe
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo");
        } else {
            // Si la bandera es verdadera, 'i' nos indica en qué posición se encontró
            JOptionPane.showMessageDialog(null, "El número ha sido encontrado en la posición: " + i);
        }
    }
}

