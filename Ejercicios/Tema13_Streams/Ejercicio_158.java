package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 158: LIMIT Y SKIP
 * ---------------------------------------------------------
 * Conceptos: .limit(), .skip().
 * 
 * Enunciado:
 * Juega con el flujo de datos: usa skip() para saltarte los 
 * primeros 2 elementos de la lista y limit() para tomar solo 
 * los 3 siguientes.
 */
public class Ejercicio_158 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Saltar 2 y tomar 3:");
        nums.stream().skip(2).limit(3).forEach(System.out::println);
    }
}

