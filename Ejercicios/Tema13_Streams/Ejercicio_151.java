package Ejercicios.Tema13_Streams;
/**
 * ---------------------------------------------------------
 * EJERCICIO 151: INTRODUCCIÓN A LAMBDAS
 * ---------------------------------------------------------
 * Conceptos: Funciones Anónimas, Sintaxis (->).
 * 
 * Enunciado:
 * Las funciones Lambda permiten escribir métodos en una sola línea.
 * Crea una interfaz funcional e impleméntala usando una Lambda
 * para crear un saludo dinámico.
 */
interface Saludo { void saludar(String nombre); }
public class Ejercicio_151 {
    public static void main(String[] args) {
        // Lambda que implementa la interfaz
        Saludo miSaludo = (n) -> System.out.println("Hola " + n);
        miSaludo.saludar("Mundo Lambda");
    }
}

