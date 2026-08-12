package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 161: CREAR UN HILO (EXTENDS THREAD)
 * ---------------------------------------------------------
 * Conceptos: Programación concurrente, extends Thread.
 * 
 * Enunciado:
 * Crea una clase que herede de 'Thread' e implemente el método run(). 
 * Luego inicia el hilo desde el main para demostrar cómo se ejecutan 
 * procesos en paralelo.
 */
class MiHilo extends Thread {
    public void run() {
        System.out.println("Hilo ejecutándose paralelamente...");
    }
}
public class Ejercicio_161 {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        hilo1.start(); // Inicia el hilo (Llama a run por debajo)
        System.out.println("Hilo principal terminado.");
    }
}

