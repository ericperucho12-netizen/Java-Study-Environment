package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 160: ENCADENAMIENTO MÚLTIPLE (PIPELINE)
 * ---------------------------------------------------------
 * Conceptos: Pipeline de Streams.
 * 
 * Enunciado:
 * Conecta múltiples métodos como si fuera una fábrica.
 * 1. Filtra los pares.
 * 2. Multiplícalos por 10 (Map).
 * 3. Súmalos todos (Reduce). ¡Todo en una sola instrucción!
 */
public class Ejercicio_160 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int resultado = numeros.stream()
            .filter(n -> n % 2 == 0) // Tomamos pares: 2, 4, 6
            .map(n -> n * 10)        // Multiplicamos por 10: 20, 40, 60
            .reduce(0, Integer::sum); // Sumamos todos: 120
        System.out.println("Resultado de pipeline: " + resultado);
    }
}

