package Ejercicios.Tema06_Metodos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 81: PARÁMETROS VARIABLES (VARARGS)
 * ---------------------------------------------------------
 * Conceptos: Uso de los tres puntos (...)
 * 
 * Enunciado:
 * Crea un método que pueda recibir CUALQUIER cantidad de
 * números y devuelva la suma de todos ellos, sin necesidad
 * de usar arreglos explícitamente.
 */
public class Ejercicio_81 {

    // Los tres puntos (...) indican que podemos pasar N cantidad de enteros
    // Internamente, Java lo trata como si fuera un arreglo (int[])
    public static int sumarTodos(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("=== USO DE VARARGS (Parámetros variables) ===");
        
        // Podemos pasar 2 parámetros
        System.out.println("Suma de 2 y 3: " + sumarTodos(2, 3));
        
        // Podemos pasar 4 parámetros
        System.out.println("Suma de 5, 10, 15, 20: " + sumarTodos(5, 10, 15, 20));
        
        // Podemos pasar ningún parámetro
        System.out.println("Suma de NADA: " + sumarTodos());
        
        // También acepta un arreglo directamente
        int[] misNumeros = {1, 2, 3, 4, 5};
        System.out.println("Suma de un arreglo: " + sumarTodos(misNumeros));
    }
}
