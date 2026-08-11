package Ejercicios.Tema07_POO.Ejercicio_99;

import java.util.Objects;

/**
 * ---------------------------------------------------------
 * EJERCICIO 99: SOBRESCRITURA DE OBJECT (toString y equals)
 * ---------------------------------------------------------
 * Conceptos: Clase Object genérica de Java.
 */
public class Libro {
    private String isbn;
    private String titulo;
    
    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
    }
    
    // Si no sobrescribimos toString(), Java imprime algo ilegible 
    // como "Libro@15db9742"
    @Override
    public String toString() {
        return "Libro [ISBN: " + isbn + ", Título: " + titulo + "]";
    }
    
    // Si no sobrescribimos equals(), Java compara el ESPACIO EN MEMORIA
    // en lugar del contenido real de los objetos.
    @Override
    public boolean equals(Object obj) {
        // ¿Es exactamente el mismo objeto en memoria?
        if (this == obj) return true;
        // ¿El otro objeto es nulo o de otra clase?
        if (obj == null || getClass() != obj.getClass()) return false;
        
        // Comparamos el contenido lógico (el ISBN)
        Libro otroLibro = (Libro) obj;
        return this.isbn.equals(otroLibro.isbn);
    }
    
    public static void main(String[] args) {
        System.out.println("=== TOSTRING Y EQUALS ===");
        
        Libro l1 = new Libro("123-4", "Harry Potter");
        Libro l2 = new Libro("123-4", "Harry Potter");
        
        // Imprimir el objeto llama automáticamente a toString()
        System.out.println("Imprimiendo l1: " + l1);
        
        // Comparamos usando equals()
        if (l1.equals(l2)) {
            System.out.println("l1 y l2 son lógicamente EL MISMO LIBRO.");
        } else {
            System.out.println("l1 y l2 son libros diferentes.");
        }
    }
}
