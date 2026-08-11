package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 81: MÉTODOS CON Y SIN RETORNO (VOID)
 * ---------------------------------------------------------
 * Conceptos: Creación de funciones, return vs void.
 * 
 * Enunciado:
 * Crea dos métodos: uno que simplemente imprima un saludo (void)
 * y otro que devuelva el doble de un número (int).
 */
public class Ejercicio_76 {
    
    // Método 1: NO devuelve nada (void). Solo ejecuta una acción.
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + ", bienvenido al curso de métodos!");
    }

    // Método 2: SÍ devuelve un valor (int). Usamos 'return'.
    public static int calcularDoble(int numero) {
        int resultado = numero * 2;
        return resultado; // Este valor vuelve a donde se llamó la función
    }

    public static void main(String[] args) {
        System.out.println("=== INTRODUCCIÓN A MÉTODOS ===");
        
        // Llamando al método void
        saludar("Eric");
        
        // Llamando al método con retorno
        // Como devuelve un int, podemos guardarlo en una variable
        int miNumero = 15;
        int elDoble = calcularDoble(miNumero);
        
        System.out.println("\nEl doble de " + miNumero + " es: " + elDoble);
        
        // También podemos imprimir el resultado directamente
        System.out.println("El doble de 50 es: " + calcularDoble(50));
    }
}
