package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 201: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #201).
 */
 
class Contenedor_201<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_201 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #201 ===");
        
        Contenedor_201<Double> miContenedor = new Contenedor_201<>();
        miContenedor.setValor(3.1415 + (201 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}