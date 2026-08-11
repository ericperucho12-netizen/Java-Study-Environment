package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 168: PRIORIDADES DE HILOS
 * ---------------------------------------------------------
 * Conceptos: MIN_PRIORITY, MAX_PRIORITY.
 * 
 * Enunciado:
 * Puedes sugerirle a la CPU qué hilos son más importantes que 
 * otros. Crea dos hilos y asígnales la prioridad mínima y 
 * máxima respectivamente.
 */
public class Ejercicio_168 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Prioridad Baja"));
        Thread t2 = new Thread(() -> System.out.println("Prioridad Alta"));
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}

