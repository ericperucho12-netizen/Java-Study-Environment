package TodoSobreJava.Tema07_ClasesYObjetos;

/**
 * ---------------------------------------------------------
 * TEMA: INSTANCIACIÓN Y USO DE OBJETOS
 * ---------------------------------------------------------
 * Esta clase Main es la encargada de ejecutar nuestro programa.
 * Su único propósito es crear objetos de la clase 'Persona'
 * y poner a prueba sus métodos y constructores.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE LA CLASE PERSONA ===");

        // Creando la primera persona usando el Constructor 1 (Nombre y Edad)
        Persona p1 = new Persona("Eric", 24);
        
        System.out.println("\nAcciones de p1:");
        // Llamando al método 'correr' sin parámetros
        p1.correr();

        // Creando la segunda persona usando el Constructor 2 (Solo DNI)
        Persona p2 = new Persona("12131212");
        
        System.out.println("\nAcciones de p2:");
        // Llamando al método 'correr' CON parámetro (Sobrecarga)
        p2.correr(100);
    }
}

