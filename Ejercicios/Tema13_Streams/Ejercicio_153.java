package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 153: FILTER (FILTRADO)
 * ---------------------------------------------------------
 * Conceptos: .filter().
 * 
 * Enunciado:
 * A partir de una lista de números del 1 al 8, usa un Stream 
 * y su método filter() para descartar los impares y quedarte 
 * únicamente con los pares.
 */
public class Ejercicio_153 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("Pares:");
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}

