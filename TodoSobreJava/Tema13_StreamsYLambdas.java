package TodoSobreJava;

import java.util.Arrays;
import java.util.List;

/**
 * ============================================================================
 * GUÍA MAESTRA: STREAMS Y LAMBDAS (PROGRAMACIÓN FUNCIONAL)
 * ============================================================================
 * 
 * 1. EL CAMBIO DE PARADIGMA
 * ----------------------------------------------------------------------------
 * Históricamente, Java era 100% Orientado a Objetos (Programación Imperativa).
 * Tú le decías a Java "CÓMO" hacer las cosas (crea un for, un if, guarda...).
 * 
 * Con Java 8 llegó la Programación Funcional (Lambdas y Streams). Ahora le 
 * dices a Java "QUÉ" quieres (Programación Declarativa). 
 * Ej: "Fíltrame los pares y súmalos". 
 * 
 * 2. FUNCIONES LAMBDA (->)
 * ----------------------------------------------------------------------------
 * Es una forma ultra compacta de escribir un bloque de código "al vuelo".
 * Sintaxis: (parámetros) -> { cuerpo del código }
 * Ejemplo: (numero) -> System.out.println(numero)
 * 
 * 3. EL PIPELINE DE STREAMS (Línea de ensamblaje)
 * ----------------------------------------------------------------------------
 * Imagina una fábrica:
 * - ORIGEN: La lista de datos originales. .stream()
 * - OPERACIONES INTERMEDIAS (Transforman el flujo y devuelven otro stream):
 *    * .filter() -> Deja pasar solo lo que cumple una condición.
 *    * .map() -> Transforma un dato en otro (Ej. minúscula a MAYÚSCULA).
 *    * .sorted() -> Ordena el flujo.
 * - OPERACIÓN TERMINAL (Apaga el flujo y devuelve un resultado real):
 *    * .forEach() -> Imprime o procesa cada elemento.
 *    * .collect() -> Guarda todo en una nueva Lista.
 *    * .reduce() -> Colapsa todos los elementos en un solo número (Ej. Suma).
 */

public class Tema13_StreamsYLambdas {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE STREAMS Y LAMBDAS ===\n");
        
        List<String> guerreros = Arrays.asList("Goku", "Vegeta", "Piccolo", "Gohan", "Krillin");
        
        System.out.println("Lista Original: " + guerreros);
        System.out.println("\n--- Procesando en la Fábrica de Streams ---");
        
        guerreros.stream()
                 // 1. FILTRO: Deja pasar solo a los que empiezan con "G"
                 .filter(nombre -> nombre.startsWith("G"))
                 // 2. MAPEO: Transforma sus nombres a MAYÚSCULAS
                 .map(nombre -> nombre.toUpperCase())
                 // 3. TERMINAL: Imprime lo que quedó
                 .forEach(resultado -> System.out.println(resultado));
                 
        // Todo eso pasó en memoria, la lista original sigue intacta.
    }
}

