package TodoSobreJava.Tema07_ClasesYObjetos;

/**
 * ---------------------------------------------------------
 * TEMA: CONSTRUCTORES Y SOBRECARGA DE MÉTODOS
 * ---------------------------------------------------------
 * La clase Persona demuestra cómo podemos tener múltiples constructores
 * (formas de inicializar el objeto) y múltiples métodos con el mismo nombre
 * pero diferentes parámetros (Sobrecarga de Métodos).
 */
public class Persona {
    
    // --- ATRIBUTOS ---
    String nombre;
    int edad;
    String dni;

    // ---------------------------------------------------------
    // CONSTRUCTORES SOBRECARGADOS
    // ---------------------------------------------------------
    
    // Constructor 1: Requiere nombre y edad
    // Usamos 'this' para diferenciar el atributo de la clase del parámetro
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Constructor 2: Solo requiere DNI (Sobrecarga de constructor)
    public Persona(String dni){
        this.dni = dni;
    }

    // ---------------------------------------------------------
    // MÉTODOS SOBRECARGADOS
    // ---------------------------------------------------------
    
    // Método correr 1: Sin parámetros
    public void correr(){
        System.out.println("Soy " + nombre + ", tengo " + edad + " años y estoy corriendo una maratón.");
    }
    
    // Método correr 2: Recibe un parámetro (Sobrecarga del método correr)
    public void correr(int km){
        System.out.println("He corrido " + km + " kilómetros.");
    }

    // Método general
    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

