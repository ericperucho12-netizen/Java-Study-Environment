package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 157: ORDENAMIENTO (SORTED)
 * ---------------------------------------------------------
 * Conceptos: .sorted().
 * 
 * Enunciado:
 * En lugar de usar Collections.sort(), puedes ordenar los datos
 * directamente dentro del flujo de un Stream llamando a .sorted()
 * antes de imprimirlos.
 */
public class Ejercicio_157 {
    public static void main(String[] args) {
        List<Integer> desorden = Arrays.asList(5, 1, 9, 3);
        System.out.println("Ordenados:");
        desorden.stream().sorted().forEach(System.out::println);
    }
}

