package TodoSobreJava.Tema07_Herencia;

/**
 * ---------------------------------------------------------
 * TEMA: HERENCIA - CLASE HIJA (SUBCLASE)
 * ---------------------------------------------------------
 * Usamos la palabra clave 'extends' para indicar que 'Estudiante'
 * HEREDA de la clase 'Persona'.
 * 
 * Un Estudiante ES UNA Persona, por lo tanto, hereda automáticamente
 * nombre, apellido y edad, pero además tiene sus propios atributos
 * específicos (IDEstudiante y notaFinal).
 */
public class Estudiante extends Persona {
    
    // Atributos específicos del Estudiante
    private int IDEstudiante;
    private float notaFinal;

    // --- CONSTRUCTOR ---
    // El constructor de la clase hija DEBE recibir los parámetros
    // necesarios para construir la clase padre, además de los suyos propios.
    public Estudiante(String nombre, String apellido, int edad, int IDEstudiante, float notaFinal) {
        // 'super' llama al constructor de la clase Padre (Persona)
        // Debe ser SIEMPRE la primera línea del constructor.
        super(nombre, edad, apellido);
        
        // Inicializamos los atributos propios de la clase Hija
        this.IDEstudiante = IDEstudiante;
        this.notaFinal = notaFinal;
    }

    // --- MÉTODOS ---
    public void mostrarDatos(){
        // Usamos los métodos getNombre(), getApellido() y getEdad() 
        // que HEREDAMOS de la clase Persona (ya que los atributos eran private).
        System.out.println("Nombre: " + getNombre() + 
                           "\nApellido: " + getApellido() + 
                           "\nEdad: " + getEdad() +
                           "\nID: " + IDEstudiante + 
                           "\nNota: " + notaFinal);
    }
}

