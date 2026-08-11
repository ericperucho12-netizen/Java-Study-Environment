package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 154: MAP (TRANSFORMACIÓN)
 * ---------------------------------------------------------
 * Conceptos: .map().
 * 
 * Enunciado:
 * El método map() permite aplicar un cambio a todos los elementos.
 * Toma una lista de nombres en minúsculas y usa map() para 
 * convertirlos todos a MAYÚSCULAS en el vuelo.
 */
public class Ejercicio_154 {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("ana", "juan", "luis");
        nombres.stream()
               .map(n -> n.toUpperCase())
               .forEach(System.out::println);
    }
}

