package Ejercicios.Tema13_Streams;
import java.util.Arrays;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 152: CREACIÓN DE STREAMS
 * ---------------------------------------------------------
 * Conceptos: .stream(), .forEach().
 * 
 * Enunciado:
 * Un Stream es un flujo de datos que te permite procesar 
 * colecciones de forma declarativa. Convierte una Lista en 
 * un Stream y recórrela para imprimir sus elementos.
 */
public class Ejercicio_152 {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Manzana", "Pera", "Plátano");
        frutas.stream().forEach(f -> System.out.println(f));
    }
}

