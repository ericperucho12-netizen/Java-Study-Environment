package TodoSobreJava;

/**
 * ---------------------------------------------------------
 * TEMA: PROGRAMACIÓN ORIENTADA A OBJETOS (POO)
 * ---------------------------------------------------------
 * La POO es un paradigma de programación basado en el concepto
 * de "objetos". Un objeto es una representación de algo de la vida real.
 * 
 * Todo objeto tiene:
 * 1. Atributos (Características o Estado): ej. color, marca, modelo
 * 2. Métodos (Comportamiento o Acciones): ej. arrancar, frenar, pitar
 * 
 * Una CLASE es como el "plano" o el "molde" para crear esos objetos.
 */

// Esta es nuestra Clase (el molde)
public class Tema07_POO {
    
    // --- ATRIBUTOS (Características) ---
    // Generalmente son privados para proteger los datos (Encapsulamiento)
    private String marca;
    private String color;
    private int kilometraje;

    // --- CONSTRUCTOR ---
    // Es un método especial que se llama IGUAL que la clase.
    // Sirve para inicializar el objeto cuando lo creamos (cuando usamos 'new').
    public Tema07_POO(String marca, String color) {
        this.marca = marca;
        this.color = color;
        this.kilometraje = 0; // Todos inician con 0km
    }

    // --- MÉTODOS (Comportamientos) ---
    
    public void acelerar() {
        System.out.println("El coche " + this.marca + " está acelerando... Vroom!");
        this.kilometraje += 10;
    }

    public void mostrarInfo() {
        System.out.println("Coche [Marca: " + marca + ", Color: " + color + ", Km: " + kilometraje + "]");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        System.out.println("=== CONCEPTOS BÁSICOS DE POO ===");

        // Instanciación: Creando un objeto a partir del molde (Clase POO)
        System.out.println("\n1. Creando el coche 1 (cocheRojo)...");
        Tema07_POO cocheRojo = new Tema07_POO("Toyota", "Rojo");
        
        // Creando otro objeto distinto usando el mismo molde
        System.out.println("2. Creando el coche 2 (cocheAzul)...");
        Tema07_POO cocheAzul = new Tema07_POO("Ford", "Azul");

        // Usando los métodos de los objetos
        System.out.println("\n3. Usando los objetos:");
        cocheRojo.mostrarInfo();
        cocheRojo.acelerar();
        cocheRojo.acelerar();
        cocheRojo.mostrarInfo();

        System.out.println("---");
        cocheAzul.mostrarInfo();
    }
}


