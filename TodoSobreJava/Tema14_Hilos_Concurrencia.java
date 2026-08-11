package TodoSobreJava;

/**
 * ============================================================================
 * GUÍA MAESTRA: HILOS Y CONCURRENCIA
 * ============================================================================
 * 
 * 1. ¿QUÉ ES UN HILO (THREAD)?
 * ----------------------------------------------------------------------------
 * Imagina a un Hilo como un "trabajador" de tu programa. Por defecto, Java 
 * te da 1 trabajador (El Main Thread). Si le dices que descargue un archivo, 
 * la interfaz gráfica se congelará hasta que termine.
 * Si creas un segundo Hilo, puedes tener un trabajador descargando el archivo
 * y otro manteniendo la interfaz viva al mismo tiempo (Multitarea).
 * 
 * 2. LAS DOS FORMAS DE CREAR UN HILO
 * ----------------------------------------------------------------------------
 * A) Heredando de la clase Thread: 'class MiHilo extends Thread'
 * B) Implementando la interfaz Runnable: 'class MiTarea implements Runnable'
 * La opción B es la profesional, ya que Java no permite herencia múltiple 
 * (así dejas libre el 'extends' para otra cosa).
 * 
 * 3. CONDICIONES DE CARRERA (RACE CONDITIONS)
 * ----------------------------------------------------------------------------
 * Si dos hilos intentan modificar una misma variable al mismo exacto 
 * microsegundo, la memoria colapsa y se guardan datos corruptos.
 * 
 * SOLUCIÓN: La palabra reservada 'synchronized' se le pone a los métodos 
 * para convertirlos en un "baño público". Si un hilo entra, echa llave a la 
 * puerta. Los demás hilos deben hacer fila afuera hasta que el primero salga.
 */

class Trabajador extends Thread {
    private String nombre;
    
    public Trabajador(String nombre) {
        this.nombre = nombre;
    }
    
    // Todo lo que esté dentro de 'run()' sucederá en paralelo.
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(nombre + " martillando por vez " + i);
            try {
                // Hacemos que descanse medio segundo (500 ms) para ver el efecto
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Error de sueño");
            }
        }
    }
}

public class Tema14_Hilos_Concurrencia {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE HILOS ===\n");
        
        System.out.println("El Jefe (Main) contrata a dos trabajadores.");
        
        Trabajador eric = new Trabajador("Eric");
        Trabajador ana = new Trabajador("Ana");
        
        // ¡Se usa .start(), NO .run()!
        // Start crea la infraestructura del nuevo hilo y luego llama a run por debajo.
        eric.start();
        ana.start();
        
        System.out.println("El Jefe (Main) se va a casa. ¡Los hilos siguen trabajando solos!");
    }
}

