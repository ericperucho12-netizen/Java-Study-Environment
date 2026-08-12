package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 167: HILOS DEMONIO (DAEMON)
 * ---------------------------------------------------------
 * Conceptos: setDaemon(true).
 * 
 * Enunciado:
 * Un hilo Demonio (Daemon) corre en el fondo haciendo tareas 
 * de mantenimiento (como el recolector de basura). A diferencia
 * de un hilo normal, un Demonio se muere en cuanto el Main termina.
 */
public class Ejercicio_167 {
    public static void main(String[] args) {
        Thread demonio = new Thread(() -> {
            while(true) System.out.println("Limpiando memoria...");
        });
        demonio.setDaemon(true); // Se detendrá cuando main termine
        demonio.start();
        System.out.println("Main terminando, demonio morirá.");
    }
}

