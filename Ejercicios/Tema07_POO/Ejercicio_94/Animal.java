package Ejercicios.Tema07_POO.Ejercicio_94;

/**
 * ---------------------------------------------------------
 * CLASE PADRE (SUPERCLASE)
 * ---------------------------------------------------------
 */
public class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    // Método que será sobrescrito (Override) por los hijos
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico de animal.");
    }
}
