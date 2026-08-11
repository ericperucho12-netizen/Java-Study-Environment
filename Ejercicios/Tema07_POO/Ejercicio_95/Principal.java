package Ejercicios.Tema07_POO.Ejercicio_95;

/**
 * ---------------------------------------------------------
 * EJERCICIO 95: INTERFACES
 * ---------------------------------------------------------
 * Conceptos: 
 * Las Interfaces permiten establecer un molde estricto de 
 * comportamiento para diferentes clases, sin importar si
 * esas clases se parecen entre sí o no.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("=== INTERFACES EN JAVA ===");
        
        // No podemos hacer: new Figura(); porque una Interfaz no es un objeto
        // Pero sí podemos guardar un Círculo en una variable tipo Figura
        Figura miCirculo = new Circulo(5.0);
        
        // Llamamos al método que el contrato nos aseguró que existe
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
    }
}
