package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 163: MÚLTIPLES HILOS COMPITIENDO
 * ---------------------------------------------------------
 * Conceptos: Condiciones de carrera.
 * 
 * Enunciado:
 * Crea dos hilos (ej. 'Liebre' y 'Tortuga') y ponlos a ejecutar
 * un bucle al mismo tiempo. Verás cómo compiten por la CPU y
 * el orden en que imprimen es impredecible.
 */
class Corredor extends Thread {
    private String nombre;
    public Corredor(String n) { nombre = n; }
    public void run() {
        for (int i=1; i<=3; i++) {
            System.out.println(nombre + " paso " + i);
        }
    }
}
public class Ejercicio_163 {
    public static void main(String[] args) {
        new Corredor("Liebre").start();
        new Corredor("Tortuga").start();
    }
}

