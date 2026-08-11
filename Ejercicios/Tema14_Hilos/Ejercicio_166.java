package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 166: ESPERAR A QUE TERMINE UN HILO (JOIN)
 * ---------------------------------------------------------
 * Conceptos: método .join().
 * 
 * Enunciado:
 * A veces el Hilo Principal necesita los datos que procesa un
 * hilo secundario. Usa .join() para obligar al programa a 
 * detenerse y esperar a que el hilo secundario termine.
 */
public class Ejercicio_166 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Cargando datos pesados...");
        });
        t.start();
        t.join(); // El hilo principal espera a que 't' termine
        System.out.println("Datos listos. Continuamos.");
    }
}

