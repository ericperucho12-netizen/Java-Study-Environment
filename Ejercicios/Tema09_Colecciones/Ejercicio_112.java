package Ejercicios.Tema09_Colecciones;

import java.util.LinkedList;

/**
 * ---------------------------------------------------------
 * EJERCICIO 112: LINKEDLIST (LISTAS ENLAZADAS)
 * ---------------------------------------------------------
 * Conceptos: Nodos, inserción rápida en los extremos.
 * 
 * Enunciado:
 * Una LinkedList (lista doblemente enlazada) es ideal cuando
 * necesitamos insertar o borrar muchísimos elementos al principio
 * o al final de la lista, ya que es más rápida que el ArrayList 
 * para esas tareas en específico.
 */
public class Ejercicio_112 {
    public static void main(String[] args) {
        System.out.println("=== USO DE LINKEDLIST ===");
        
        // A diferencia del ArrayList, aquí usamos LinkedList en ambos lados
        // para tener acceso a sus métodos exclusivos (addFirst, addLast)
        LinkedList<String> tren = new LinkedList<>();
        
        // Añadir elementos normalmente (van al final)
        tren.add("Vagón 1");
        tren.add("Vagón 2");
        System.out.println("Tren inicial: " + tren);
        
        // Operaciones especiales de LinkedList
        tren.addFirst("Locomotora (Inicio)"); // Se inserta mágicamente de primero
        tren.addLast("Furgón de Cola (Final)");
        
        System.out.println("Tren completo: " + tren);
        
        // Obtener el primero y el último sin saber el tamaño
        System.out.println("\nPrimer elemento: " + tren.getFirst());
        System.out.println("Último elemento: " + tren.getLast());
        
        // Eliminar por los extremos
        tren.removeFirst();
        System.out.println("\nTren tras quitar la locomotora: " + tren);
    }
}
