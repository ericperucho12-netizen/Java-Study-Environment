package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 125: LANZAR EXCEPCIONES (THROW)
 * ---------------------------------------------------------
 * Conceptos: throw new, IllegalArgumentException.
 * 
 * Enunciado:
 * Crea un método para verificar la edad de un usuario. Si es
 * menor de 18, utiliza 'throw' para lanzar un error deliberadamente
 * y rechazar el acceso.
 */
public class Ejercicio_125 {
    public static void verificarEdad(int edad) {
        if (edad < 18) throw new IllegalArgumentException("Acceso denegado: Menor de edad");
        System.out.println("Acceso concedido");
    }
    public static void main(String[] args) {
        try {
            verificarEdad(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }
    }
}

