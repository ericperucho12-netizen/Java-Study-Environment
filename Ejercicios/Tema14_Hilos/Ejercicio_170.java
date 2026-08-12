package Ejercicios.Tema14_Hilos;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
/**
 * ---------------------------------------------------------
 * EJERCICIO 170: CALLABLE Y FUTURE (HILOS CON RETORNO)
 * ---------------------------------------------------------
 * Conceptos: Callable, FutureTask.
 * 
 * Enunciado:
 * Runnable no puede devolver resultados ni lanzar excepciones.
 * Si quieres que un hilo procese algo y luego te entregue el 
 * cálculo final, debes usar Callable y Future.
 */
public class Ejercicio_170 {
    public static void main(String[] args) throws Exception {
        Callable<Integer> tarea = () -> {
            Thread.sleep(1000);
            return 42;
        };
        FutureTask<Integer> futuro = new FutureTask<>(tarea);
        new Thread(futuro).start();
        System.out.println("El resultado del hilo es: " + futuro.get());
    }
}

