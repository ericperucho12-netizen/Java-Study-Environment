package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 164: DORMIR UN HILO (THREAD.SLEEP)
 * ---------------------------------------------------------
 * Conceptos: Thread.sleep(), InterruptedException.
 * 
 * Enunciado:
 * Haz que el programa detenga temporalmente su ejecución
 * simulando la cuenta regresiva de una bomba (1 segundo por 
 * cada número).
 */
public class Ejercicio_164 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bomba en 3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("BOOM!");
    }
}

