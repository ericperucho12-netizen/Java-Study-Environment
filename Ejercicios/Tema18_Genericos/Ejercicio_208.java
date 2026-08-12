package Ejercicios.Tema18_Genericos;

/**
 * ---------------------------------------------------------
 * EJERCICIO 208: CLASES GENÉRICAS
 * ---------------------------------------------------------
 * Conceptos: <T>, Clases Genéricas, Type Safety.
 * 
 * Enunciado:
 * Instancia una clase genérica utilizando el tipo Double 
 * para guardar y extraer un número decimal. (Práctica #208).
 */
 
class Contenedor_208<T> {
    private T valor;
    public void setValor(T v) { this.valor = v; }
    public T getValor() { return this.valor; }
}

public class Ejercicio_208 {
    public static void main(String[] args) {
        System.out.println("=== USO DE GENÉRICOS #208 ===");
        
        Contenedor_208<Double> miContenedor = new Contenedor_208<>();
        miContenedor.setValor(3.1415 + (208 - 200));
        
        System.out.println("Valor almacenado: " + miContenedor.getValor());
    }
}