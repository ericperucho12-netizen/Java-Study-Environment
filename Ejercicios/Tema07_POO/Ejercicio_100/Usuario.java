package Ejercicios.Tema07_POO.Ejercicio_100;

/**
 * ---------------------------------------------------------
 * EJERCICIO 100: MIEMBROS STATIC VS INSTANCIA
 * ---------------------------------------------------------
 * Conceptos: La palabra reservada static.
 * 
 * Enunciado:
 * Crea una clase Usuario que lleve la cuenta de CUÁNTOS usuarios
 * totales se han registrado en el sistema.
 */
public class Usuario {
    // Variable de instancia (cada usuario tiene SU PROPIO nombre)
    private String nombre;
    
    // Variable de CLASE (static). Todos los usuarios COMPARTEN esta misma variable
    public static int contadorUsuarios = 0;
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        // Cada vez que construimos un usuario, subimos el contador global
        contadorUsuarios++;
    }
    
    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        System.out.println("=== MIEMBROS ESTÁTICOS (STATIC) ===");
        
        System.out.println("Usuarios al inicio: " + Usuario.contadorUsuarios);
        
        Usuario u1 = new Usuario("Eric");
        Usuario u2 = new Usuario("Maria");
        Usuario u3 = new Usuario("Juan");
        
        System.out.println("Usuarios creados: " + u1.getNombre() + ", " + u2.getNombre() + ", " + u3.getNombre());
        
        // Accedemos a la variable estática a través de la Clase, no del objeto
        System.out.println("Total de usuarios registrados en el sistema: " + Usuario.contadorUsuarios);
    }
}
