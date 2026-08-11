package Ejercicios.Tema07_POO.Ejercicio_97;

import java.util.ArrayList;

/**
 * ---------------------------------------------------------
 * EJERCICIO 97: ARRAYLIST CON OBJETOS PERSONALIZADOS
 * ---------------------------------------------------------
 * Conceptos: Colecciones dinámicas, manejo de listas.
 * 
 * Enunciado:
 * Crea una lista de Tareas (To-Do List) usando la clase 
 * ArrayList en lugar de los arreglos estáticos [] tradicionales.
 */
public class ListaTareas {
    public static void main(String[] args) {
        System.out.println("=== USO DE ARRAYLIST CON OBJETOS ===");
        
        // Un ArrayList crece y se encoge dinámicamente
        ArrayList<Tarea> misTareas = new ArrayList<>();
        
        // Agregar elementos
        misTareas.add(new Tarea("Hacer ejercicios de POO"));
        misTareas.add(new Tarea("Practicar recursividad"));
        misTareas.add(new Tarea("Dormir temprano"));
        
        System.out.println("Tenemos " + misTareas.size() + " tareas pendientes.");
        
        // Modificar un objeto dentro de la lista
        misTareas.get(0).marcarCompletada();
        
        System.out.println("\nLista actualizada:");
        // Recorrer la lista con for-each
        for (Tarea t : misTareas) {
            System.out.println(t.getEstado());
        }
    }
}
