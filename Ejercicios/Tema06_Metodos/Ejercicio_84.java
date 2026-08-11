package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 84: LANZAR EXCEPCIONES (THROW)
 * ---------------------------------------------------------
 * Conceptos: Validaciones, throw, IllegalArgumentException.
 * 
 * Enunciado:
 * Crea un método para registrar edades de usuarios. Si la 
 * edad es negativa, el método debe "estallar" lanzando un error.
 */
public class Ejercicio_84 {

    public static void registrarEdad(int edad) {
        // Validación estricta
        if (edad < 0) {
            // throw interrumpe totalmente la ejecución y arroja el error
            throw new IllegalArgumentException("¡La edad no puede ser negativa!");
        }
        
        System.out.println("Edad " + edad + " registrada exitosamente.");
    }

    public static void main(String[] args) {
        System.out.println("=== VALIDACIONES CON EXCEPCIONES ===");
        
        try {
            System.out.println("Intentando registrar 25...");
            registrarEdad(25);
            
            System.out.println("\nIntentando registrar -5...");
            registrarEdad(-5); // ¡Aquí ocurre el error!
            
            // Esta línea NUNCA se ejecutará porque el error saltó al catch
            System.out.println("Esto no se va a imprimir.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("ATRAPAMOS EL ERROR: " + e.getMessage());
        }
    }
}
