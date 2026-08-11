package Ejercicios.Tema07_POO.Ejercicio_96;

/**
 * ---------------------------------------------------------
 * EJERCICIO 96: COMPOSICIÓN (OBJETOS DENTRO DE OBJETOS)
 * ---------------------------------------------------------
 * Conceptos: Relación "Tiene-Un" (Has-a).
 * 
 * Enunciado:
 * Un Coche TIENE UN Motor. La composición significa que un
 * objeto (Coche) contiene a otro objeto (Motor) como uno de
 * sus atributos, en lugar de heredar de él.
 */
public class Coche {
    private String marca;
    // Aquí está la composición: El coche tiene un objeto de tipo Motor
    private Motor suMotor;
    
    public Coche(String marca, Motor suMotor) {
        this.marca = marca;
        this.suMotor = suMotor;
    }
    
    public void iniciarViaje() {
        System.out.println("Iniciando el viaje en el coche " + marca + "...");
        // El coche le delega la responsabilidad al motor
        suMotor.encender(); 
    }
    
    public static void main(String[] args) {
        System.out.println("=== COMPOSICIÓN DE OBJETOS ===");
        
        // 1. Creamos el objeto pequeño primero
        Motor motorV8 = new Motor("V8 Gasolina", 450);
        
        // 2. Creamos el objeto grande, inyectándole el objeto pequeño
        Coche miMustang = new Coche("Ford Mustang", motorV8);
        
        miMustang.iniciarViaje();
    }
}
