package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * ---------------------------------------------------------
 * EJERCICIO 156: COLLECT (GUARDAR RESULTADOS)
 * ---------------------------------------------------------
 * Conceptos: .collect(Collectors.toList()).
 * 
 * Enunciado:
 * Un Stream no modifica la lista original. Si quieres guardar
 * los resultados filtrados, debes usar collect() para empaquetarlos
 * en una nueva Lista de resultados.
 */
public class Ejercicio_156 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> impares = nums.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.toList());
        System.out.println("Lista de impares: " + impares);
    }
}

