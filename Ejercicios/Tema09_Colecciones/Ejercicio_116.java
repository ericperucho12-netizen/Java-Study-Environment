package Ejercicios.Tema09_Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ---------------------------------------------------------
 * EJERCICIO 116: ORDENAMIENTO DE LISTAS (COLLECTIONS.SORT)
 * ---------------------------------------------------------
 * Conceptos: Clase utilitaria Collections, ordenamiento.
 * 
 * Enunciado:
 * Crea una lista de números desordenados y otra de nombres,
 * y utiliza la herramienta de Java para ordenarlos 
 * automáticamente (tanto de menor a mayor como alfabéticamente).
 */
public class Ejercicio_116 {
    public static void main(String[] args) {
        System.out.println("=== ORDENANDO COLECCIONES ===");
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(4);
        
        System.out.println("Números desordenados: " + numeros);
        
        // Collections.sort() ordena de forma natural (menor a mayor)
        Collections.sort(numeros);
        System.out.println("Números ordenados: " + numeros);
        
        // --- Ordenando Strings ---
        List<String> nombres = new ArrayList<>();
        nombres.add("Zack");
        nombres.add("Alicia");
        nombres.add("Maria");
        
        System.out.println("\nNombres desordenados: " + nombres);
        Collections.sort(nombres);
        System.out.println("Nombres alfabéticamente: " + nombres);
        
        // Orden Inverso
        Collections.sort(nombres, Collections.reverseOrder());
        System.out.println("Nombres en orden inverso (Z-A): " + nombres);
    }
}
