package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 124: MÚLTIPLES CATCH
 * ---------------------------------------------------------
 * Conceptos: Manejo de diferentes tipos de errores.
 * 
 * Enunciado:
 * Un mismo bloque try puede lanzar distintos tipos de errores.
 * Agrega varios bloques catch consecutivos para atrapar una
 * división por cero y un NullPointerException por separado.
 */
public class Ejercicio_124 {
    public static void main(String[] args) {
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (ArithmeticException e) {
            System.out.println("Error matemático.");
        } catch (NullPointerException e) {
            System.out.println("Error: Variable nula (NullPointer).");
        } catch (Exception e) {
            System.out.println("Error genérico.");
        }
    }
}

