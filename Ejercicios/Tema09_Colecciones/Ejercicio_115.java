package Ejercicios.Tema09_Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ---------------------------------------------------------
 * EJERCICIO 115: ITERADORES Y FOREACH (LAMBDAS)
 * ---------------------------------------------------------
 * Conceptos: Formas avanzadas de recorrer Colecciones.
 * 
 * Enunciado:
 * Muestra las tres formas principales de recorrer una Lista:
 * 1. For-each tradicional.
 * 2. Usando un Iterator (útil para borrar mientras recorres).
 * 3. Usando .forEach() con funciones Lambda (Moderno Java 8+).
 */
public class Ejercicio_115 {
    public static void main(String[] args) {
        System.out.println("=== 3 FORMAS DE RECORRER COLECCIONES ===");
        
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");
        lenguajes.add("C++");
        
        // --- MÉTODO 1: For-Each Tradicional ---
        System.out.println("\n1. Bucle For-Each clásico:");
        for (String lang : lenguajes) {
            System.out.println("- " + lang);
        }
        
        // --- MÉTODO 2: Iterator ---
        // Ideal si necesitas eliminar elementos en medio del recorrido
        System.out.println("\n2. Usando un Iterator (Borraremos C++):");
        Iterator<String> iterador = lenguajes.iterator();
        while (iterador.hasNext()) {
            String lang = iterador.next();
            System.out.println("Inspeccionando: " + lang);
            
            if (lang.equals("C++")) {
                iterador.remove(); // Borrado seguro
                System.out.println("¡C++ eliminado!");
            }
        }
        
        // --- MÉTODO 3: Lambda (forEach moderno de Java 8) ---
        // Sintaxis ultracorta y funcional
        System.out.println("\n3. Usando Lambdas (.forEach):");
        // "Para cada 'lang' haz un println de 'lang'"
        lenguajes.forEach(lang -> System.out.println("-> " + lang));
    }
}
