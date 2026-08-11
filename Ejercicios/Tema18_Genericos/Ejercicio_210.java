package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 210: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #210).
 */
 
class Contenedor<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_210 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #210 ===");
        
        Contenedor<Double> miContenedor = new Contenedor<>();
        miContenedor.setValor(3.1415 + (210 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}