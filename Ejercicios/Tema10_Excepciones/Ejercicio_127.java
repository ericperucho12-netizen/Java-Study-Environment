package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 127: LEER EL STACK TRACE
 * ---------------------------------------------------------
 * Conceptos: e.printStackTrace().
 * 
 * Enunciado:
 * Genera un error y en lugar de imprimir un mensaje amigable,
 * utiliza printStackTrace() para ver la ruta exacta y la línea
 * de código donde ocurrió la falla (muy útil para debug).
 */
public class Ejercicio_127 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("Hola");
        } catch (NumberFormatException e) {
            System.out.println("Imprimiendo la ruta del error:");
            e.printStackTrace();
        }
    }
}

