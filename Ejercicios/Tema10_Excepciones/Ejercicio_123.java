package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 123: BLOQUE FINALLY
 * ---------------------------------------------------------
 * Conceptos: try, catch, finally.
 * 
 * Enunciado:
 * Demuestra el uso de 'finally'. Este bloque de código siempre
 * se ejecuta, independientemente de si ocurrió un error o no.
 * Es muy útil para cerrar conexiones a bases de datos o archivos.
 */
public class Ejercicio_123 {
    public static void main(String[] args) {
        System.out.println("=== USO DE FINALLY ===");
        try {
            System.out.println("Abriendo conexión a la base de datos...");
            int error = 10 / 0; // Simulamos error
        } catch (Exception e) {
            System.out.println("Ocurrió un error.");
        } finally {
            System.out.println("Este bloque SIEMPRE se ejecuta. Cerrando conexión...");
        }
    }
}

