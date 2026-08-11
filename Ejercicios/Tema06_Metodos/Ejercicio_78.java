package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 83: PASO DE ARREGLOS A MÉTODOS
 * ---------------------------------------------------------
 * Conceptos: Parámetros tipo array.
 * 
 * Enunciado:
 * Crea un método que reciba un arreglo de números enteros
 * y retorne cuál es el número mayor de ese arreglo.
 */
public class Ejercicio_78 {

    // Este método recibe un array completo como parámetro
    public static int encontrarMayor(int[] numeros) {
        // Asumimos que el primero es el mayor temporalmente
        int mayor = numeros[0]; 
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i]; // Actualizamos si encontramos uno más grande
            }
        }
        
        return mayor;
    }

    public static void main(String[] args) {
        System.out.println("=== BUSCADOR DEL NÚMERO MAYOR ===");

        int[] edades = {15, 22, 18, 45, 30, 8, 50, 19};
        
        System.out.print("Arreglo analizado: [ ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println("]");

        // Le pasamos el arreglo al método
        int edadMaxima = encontrarMayor(edades);
        
        System.out.println("\nLa edad mayor encontrada es: " + edadMaxima);
    }
}
