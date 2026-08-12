package Ejercicios.Tema14_Hilos;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * ---------------------------------------------------------
 * EJERCICIO 169: EXECUTOR SERVICE (POOLS DE HILOS)
 * ---------------------------------------------------------
 * Conceptos: Thread Pools, Executors.
 * 
 * Enunciado:
 * Crear demasiados hilos (miles) colapsa la PC. Aprende la 
 * forma profesional de manejarlos usando un 'Pool' fijo de 
 * hilos que recicle recursos eficientemente.
 */
public class Ejercicio_169 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(() -> System.out.println("Tarea 1"));
        pool.submit(() -> System.out.println("Tarea 2"));
        pool.submit(() -> System.out.println("Tarea 3")); // Espera a que se libere un hilo
        pool.shutdown();
    }
}

