package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 162: CREAR UN HILO (IMPLEMENTS RUNNABLE)
 * ---------------------------------------------------------
 * Conceptos: Interfaz Runnable.
 * 
 * Enunciado:
 * La forma recomendada de crear hilos en Java es implementando 
 * la interfaz Runnable (porque Java no permite herencia múltiple). 
 * Demuestra esta técnica y pásasela a un nuevo Thread.
 */
class Tarea implements Runnable {
    public void run() {
        System.out.println("Tarea Runnable ejecutándose...");
    }
}
public class Ejercicio_162 {
    public static void main(String[] args) {
        Thread hilo2 = new Thread(new Tarea());
        hilo2.start();
    }
}

