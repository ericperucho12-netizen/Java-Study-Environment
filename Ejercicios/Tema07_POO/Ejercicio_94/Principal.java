package Ejercicios.Tema07_POO.Ejercicio_94;

/**
 * ---------------------------------------------------------
 * EJERCICIO 94: POLIMORFISMO Y @OVERRIDE
 * ---------------------------------------------------------
 * Conceptos: 
 * El Polimorfismo ("muchas formas") nos permite tratar objetos 
 * de clases hijas (Perro, Gato) como si fueran objetos de la 
 * clase padre (Animal).
 * 
 * Al ejecutar sus métodos, cada objeto responde de forma 
 * distinta según cómo sobrescribió el método original.
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("=== POLIMORFISMO EN ACCIÓN ===");
        
        // Creamos objetos específicos pero los guardamos
        // en variables de tipo general (Animal)
        Animal miMascota1 = new Perro("Firulais");
        Animal miMascota2 = new Gato("Michi");
        Animal animalGenerico = new Animal("Bicho");
        
        // ¡Magia del polimorfismo!
        // Llamamos al mismo método "hacerSonido()", pero 
        // cada uno suena distinto según el objeto real.
        miMascota1.hacerSonido();
        miMascota2.hacerSonido();
        animalGenerico.hacerSonido();
    }
}
