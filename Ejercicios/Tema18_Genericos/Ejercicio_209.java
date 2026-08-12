package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 209: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #209).
 */
 
class Contenedor_209<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_209 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #209 ===");
        
        Contenedor_209<Double> miContenedor = new Contenedor_209<>();
        miContenedor.setValor(3.1415 + (209 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}