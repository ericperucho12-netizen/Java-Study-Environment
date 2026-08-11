package Ejercicios.Tema09_Colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * ---------------------------------------------------------
 * EJERCICIO 117: CONTAR FRECUENCIAS CON HASHMAP
 * ---------------------------------------------------------
 * Conceptos: Algoritmia clásica con Mapas.
 * 
 * Enunciado:
 * Dada una frase, cuenta cuántas veces se repite cada palabra
 * utilizando un HashMap.
 */
public class Ejercicio_117 {
    public static void main(String[] args) {
        System.out.println("=== CONTADOR DE PALABRAS ===");
        
        String frase = "java es genial y programar en java es muy divertido porque java es poderoso";
        System.out.println("Frase analizada: " + frase + "\n");
        
        // Separamos las palabras
        String[] palabras = frase.split(" ");
        
        // Mapa: Clave (Palabra) -> Valor (Frecuencia)
        Map<String, Integer> contador = new HashMap<>();
        
        for (String palabra : palabras) {
            // Si el mapa ya tiene la palabra, le sumamos 1 a su valor actual
            if (contador.containsKey(palabra)) {
                int veces = contador.get(palabra);
                contador.put(palabra, veces + 1);
            } 
            // Si es la primera vez que la vemos, la agregamos con valor 1
            else {
                contador.put(palabra, 1);
            }
        }
        
        // Imprimimos los resultados
        System.out.println("--- Frecuencias ---");
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            System.out.println("'" + entrada.getKey() + "': " + entrada.getValue() + " vez/veces");
        }
    }
}
