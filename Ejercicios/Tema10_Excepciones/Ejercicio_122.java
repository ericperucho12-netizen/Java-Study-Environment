package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 122: DIVISIÓN POR CERO
 * ---------------------------------------------------------
 * Conceptos: ArithmeticException.
 * 
 * Enunciado:
 * Provoca intencionalmente un error matemático dividiendo un 
 * número entre cero. Atrapa específicamente la excepción 
 * ArithmeticException e imprime su mensaje de error.
 */
public class Ejercicio_122 {
    public static void main(String[] args) {
        System.out.println("=== DIVISIÓN POR CERO ===");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        }
    }
}

