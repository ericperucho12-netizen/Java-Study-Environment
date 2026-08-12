package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 126: EXCEPCIONES PERSONALIZADAS
 * ---------------------------------------------------------
 * Conceptos: extends Exception.
 * 
 * Enunciado:
 * Crea tu propia clase de error (Ej. MiExcepcion) haciendo que
 * herede de la clase padre Exception. Luego, lánzala en tu código.
 */
class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) { super(mensaje); }
}
public class Ejercicio_126 {
    public static void main(String[] args) {
        try {
            throw new MiExcepcion("¡Este es mi propio error personalizado!");
        } catch (MiExcepcion e) {
            System.out.println("Atrapado: " + e.getMessage());
        }
    }
}

