package TodoSobreJava.Tema07_ClasesYObjetos;

/**
 * ---------------------------------------------------------
 * TEMA: CLASES Y OBJETOS (Básico)
 * ---------------------------------------------------------
 * Esta clase representa el "molde" para crear objetos tipo Coche.
 * Aquí definimos qué características (atributos) tiene un coche.
 */
public class Coche {
    
    // --- ATRIBUTOS (Estado del objeto) ---
    // Son las variables que pertenecen a la clase
    String color;
    String marca;
    int km;

    // --- MÉTODO PRINCIPAL ---
    // Lo incluimos aquí mismo para hacer pruebas rápidas
    public static void main(String[] args) {
        
        System.out.println("=== CREANDO OBJETOS DE LA CLASE COCHE ===");

        // 1. Instanciar (Crear) el primer objeto
        Coche coche1 = new Coche();

        // 2. Asignar valores a los atributos del objeto
        coche1.color = "Red";
        coche1.marca = "Honda";
        coche1.km = 10;

        System.out.println("\n-- Coche 1 --");
        System.out.println("Color: " + coche1.color);
        System.out.println("Marca: " + coche1.marca);
        System.out.println("Kilometraje: " + coche1.km + " km");

        // 3. Crear un segundo objeto COMPLETAMENTE INDEPENDIENTE
        Coche coche2 = new Coche();
        
        coche2.color = "Blue";
        coche2.marca = "Nissan";
        coche2.km = 0;

        System.out.println("\n-- Coche 2 --");
        System.out.println("Color: " + coche2.color);
        System.out.println("Marca: " + coche2.marca);
        System.out.println("Kilometraje: " + coche2.km + " km");
    }
}

