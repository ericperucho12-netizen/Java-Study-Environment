package Ejercicios.Tema09_Colecciones;

import java.util.HashSet;
import java.util.Set;

/**
 * ---------------------------------------------------------
 * EJERCICIO 113: SET Y HASHSET (CONJUNTOS)
 * ---------------------------------------------------------
 * Conceptos: Elementos únicos, sin orden específico.
 * 
 * Enunciado:
 * A diferencia de las Listas, los "Sets" (Conjuntos) NO PERMITEN 
 * elementos duplicados. Además, el HashSet no garantiza que los 
 * elementos se mantengan en el orden en que los insertaste.
 */
public class Ejercicio_113 {
    public static void main(String[] args) {
        System.out.println("=== COLECCIONES SIN DUPLICADOS (HASHSET) ===");
        
        Set<String> correos = new HashSet<>();
        
        // Añadimos algunos correos
        correos.add("juan@gmail.com");
        correos.add("maria@yahoo.com");
        correos.add("pedro@outlook.com");
        
        System.out.println("Correos registrados: " + correos.size());
        
        // ¡Intentamos añadir un duplicado!
        System.out.println("\nIntentando registrar a 'juan@gmail.com' otra vez...");
        boolean sePudo = correos.add("juan@gmail.com");
        
        if (!sePudo) {
            System.out.println("-> Error: Ese correo ya existía. El Set lo rechazó.");
        }
        
        System.out.println("\nLista final de correos:");
        for (String correo : correos) {
            // Nota: ¡El orden al imprimirlos puede ser distinto al orden de inserción!
            System.out.println(correo); 
        }
    }
}
