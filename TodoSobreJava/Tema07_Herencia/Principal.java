package TodoSobreJava.Tema07_Herencia;

/**
 * ---------------------------------------------------------
 * TEMA: PRUEBA DE HERENCIA
 * ---------------------------------------------------------
 * Esta clase contiene el método main para instanciar un Estudiante
 * y comprobar que ha heredado correctamente las propiedades de Persona.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE ESTUDIANTES (HERENCIA) ===\n");

        // Creamos un Estudiante pasándole todos los datos requeridos.
        // Fíjate que le pasamos datos de Persona (Eric, Perucho, 21) 
        // y datos de Estudiante (123, 15.3f).
        Estudiante estudiante = new Estudiante("Eric", "Perucho", 21, 123, 15.3f);

        // Llamamos al método propio de Estudiante que imprimirá todos sus datos
        estudiante.mostrarDatos();
    }
}

