package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 155: REDUCE (ACUMULACIÓN)
 * ---------------------------------------------------------
 * Conceptos: .reduce().
 * 
 * Enunciado:
 * Reduce() toma todos los elementos de un Stream y los colapsa
 * en un solo valor final. Úsalo para calcular la suma total 
 * de una lista de precios.
 */
public class Ejercicio_155 {
    public static void main(String[] args) {
        List<Integer> precios = Arrays.asList(10, 20, 30);
        int total = precios.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Suma total: " + total);
    }
}

