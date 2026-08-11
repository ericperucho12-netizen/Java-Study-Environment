package Ejercicios.Tema09_Colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ---------------------------------------------------------
 * EJERCICIO 118: OPERACIONES DE CONJUNTOS (UNIÓN E INTERSECCIÓN)
 * ---------------------------------------------------------
 * Conceptos: addAll, retainAll, Set theory.
 * 
 * Enunciado:
 * Dados dos conjuntos de amigos (los de Juan y los de María),
 * determina quiénes son amigos de AMBOS (Intersección) y la
 * lista total de todos los amigos juntos sin duplicados (Unión).
 */
public class Ejercicio_118 {
    public static void main(String[] args) {
        System.out.println("=== OPERACIONES CON CONJUNTOS (SETS) ===");
        
        // Inicialización rápida usando Arrays.asList()
        Set<String> amigosJuan = new HashSet<>(Arrays.asList("Ana", "Carlos", "Pedro", "Luis"));
        Set<String> amigosMaria = new HashSet<>(Arrays.asList("Laura", "Pedro", "Carlos", "Sofia"));
        
        System.out.println("Amigos de Juan: " + amigosJuan);
        System.out.println("Amigos de María: " + amigosMaria);
        
        // --- 1. INTERSECCIÓN (Los que están en ambos grupos) ---
        // Clonamos el set de Juan para no destruirlo
        Set<String> interseccion = new HashSet<>(amigosJuan);
        // retainAll: "Quédate solo con los que TAMBIÉN están en amigosMaria"
        interseccion.retainAll(amigosMaria);
        
        System.out.println("\nAmigos en COMÚN (Intersección): " + interseccion);
        
        // --- 2. UNIÓN (Todos los amigos juntos, sin repetir) ---
        Set<String> union = new HashSet<>(amigosJuan);
        // addAll: "Agrega todos, ignorando los repetidos (porque es un Set)"
        union.addAll(amigosMaria);
        
        System.out.println("TODOS los amigos juntos (Unión): " + union);
    }
}
