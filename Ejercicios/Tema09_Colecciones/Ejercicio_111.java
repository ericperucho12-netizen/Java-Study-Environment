package Ejercicios.Tema09_Colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * ---------------------------------------------------------
 * EJERCICIO 111: LIST Y ARRAYLIST
 * ---------------------------------------------------------
 * Conceptos: Listas dinámicas, interfaz List.
 * 
 * Enunciado:
 * Un ArrayList es un arreglo dinámico que puede crecer y
 * encogerse automáticamente. Crea una lista de nombres y
 * prueba sus operaciones principales (add, get, remove, size).
 */
public class Ejercicio_111 {
    public static void main(String[] args) {
        System.out.println("=== INTRODUCCIÓN A ARRAYLIST ===");
        
        // Es buena práctica usar la Interfaz 'List' a la izquierda
        // y la implementación 'ArrayList' a la derecha.
        List<String> nombres = new ArrayList<>();
        
        // 1. Añadir elementos (.add)
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");
        
        System.out.println("Lista inicial: " + nombres);
        
        // 2. Obtener un elemento por su índice (.get)
        System.out.println("El nombre en la posición 1 es: " + nombres.get(1));
        
        // 3. Modificar un elemento existente (.set)
        nombres.set(1, "Carlos Alberto");
        System.out.println("Lista tras modificar: " + nombres);
        
        // 4. Eliminar un elemento (.remove)
        nombres.remove("Ana"); // Borrado por valor
        // nombres.remove(0);  // También se puede borrar por índice
        System.out.println("Lista tras borrar a Ana: " + nombres);
        
        // 5. Tamaño de la lista (.size)
        System.out.println("La lista tiene " + nombres.size() + " elementos.");
        
        // 6. Recorrer la lista
        System.out.println("\nRecorriendo la lista:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }
    }
}
