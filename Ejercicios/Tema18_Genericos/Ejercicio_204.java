package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 204: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #204).
 */
 
class Contenedor_204<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_204 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #204 ===");
        
        Contenedor_204<Double> miContenedor = new Contenedor_204<>();
        miContenedor.setValor(3.1415 + (204 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}