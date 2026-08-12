package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 207: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #207).
 */
 
class Contenedor_207<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_207 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #207 ===");
        
        Contenedor_207<Double> miContenedor = new Contenedor_207<>();
        miContenedor.setValor(3.1415 + (207 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}