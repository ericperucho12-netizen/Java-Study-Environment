package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 159: ANYMATCH / ALLMATCH
 * ---------------------------------------------------------
 * Conceptos: .anyMatch(), .allMatch().
 * 
 * Enunciado:
 * Métodos ultra rápidos que devuelven true o false. Úsalos 
 * para verificar si AL MENOS UN alumno está suspenso (nota < 5) 
 * en toda la lista de calificaciones.
 */
public class Ejercicio_159 {
    public static void main(String[] args) {
        List<Integer> notas = Arrays.asList(5, 8, 4, 9);
        boolean haySuspenso = notas.stream().anyMatch(n -> n < 5);
        System.out.println("¿Alguien reprobó? " + haySuspenso);
    }
}

