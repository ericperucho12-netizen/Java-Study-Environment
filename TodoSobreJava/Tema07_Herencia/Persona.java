package TodoSobreJava.Tema07_Herencia;

/**
 * ---------------------------------------------------------
 * TEMA: HERENCIA - CLASE PADRE (SUPERCLASE)
 * ---------------------------------------------------------
 * En POO, la herencia permite crear nuevas clases basadas en clases
 * existentes. La clase 'Persona' es nuestra Clase Padre.
 * Define los atributos y métodos comunes que cualquier tipo de
 * persona tendrá (nombre, apellido, edad).
 */
public class Persona {
    
    // Atributos marcados como 'private' (Encapsulamiento).
    // Solo pueden ser accedidos directamente desde esta misma clase.
    private String nombre;
    private String apellido;
    private int edad;

    // --- CONSTRUCTOR ---
    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    // --- MÉTODOS GETTER ---
    // Como los atributos son privados, necesitamos métodos 'public' 
    // para que otras clases puedan leer sus valores.
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }
}

