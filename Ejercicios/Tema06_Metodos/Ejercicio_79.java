package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 79: SOBRECARGA DE MÉTODOS (OVERLOADING)
 * ---------------------------------------------------------
 * Conceptos: Métodos con el mismo nombre pero distintos parámetros.
 * 
 * Enunciado:
 * Crea varios métodos llamados "sumar", pero que funcionen con
 * diferentes tipos de datos o cantidades de parámetros.
 * Java sabrá cuál ejecutar dependiendo de lo que le envíes.
 */
public class Ejercicio_79 {

    // Método 1: Suma dos enteros
    public static int sumar(int a, int b) {
        System.out.println("(Usando sumar con 2 ints)");
        return a + b;
    }

    // Método 2: Suma TRES enteros
    public static int sumar(int a, int b, int c) {
        System.out.println("(Usando sumar con 3 ints)");
        return a + b + c;
    }

    // Método 3: Suma dos decimales (doubles)
    public static double sumar(double a, double b) {
        System.out.println("(Usando sumar con 2 doubles)");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=== SOBRECARGA DE MÉTODOS ===");

        // Java automáticamente elige el Método 1
        int res1 = sumar(10, 5); 
        System.out.println("Resultado 1: " + res1 + "\n");

        // Java automáticamente elige el Método 2
        int res2 = sumar(10, 5, 20);
        System.out.println("Resultado 2: " + res2 + "\n");

        // Java automáticamente elige el Método 3
        double res3 = sumar(10.5, 3.2);
        System.out.println("Resultado 3: " + res3 + "\n");
    }
}
