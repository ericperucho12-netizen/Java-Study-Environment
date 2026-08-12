package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 203: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #203).
 */
 
class Contenedor_203<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_203 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #203 ===");
        
        Contenedor_203<Double> miContenedor = new Contenedor_203<>();
        miContenedor.setValor(3.1415 + (203 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}