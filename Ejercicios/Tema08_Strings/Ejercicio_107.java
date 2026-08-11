package Ejercicios.Tema08_Strings;

/**
 * ---------------------------------------------------------
 * EJERCICIO 107: OPTIMIZACIÓN CON STRINGBUILDER
 * ---------------------------------------------------------
 * Conceptos: Rendimiento al concatenar cadenas.
 * 
 * Enunciado:
 * Muestra la diferencia entre concatenar texto de la forma clásica (+)
 * y usar StringBuilder, el cual es muchísimo más rápido para bucles.
 */
public class Ejercicio_107 {
    public static void main(String[] args) {
        System.out.println("=== STRINGBUILDER VS STRING NORMAL ===");
        
        int repeticiones = 50000;
        
        // 1. Usando String normal (+)
        long inicioString = System.currentTimeMillis();
        String textoNormal = "";
        for (int i = 0; i < repeticiones; i++) {
            textoNormal += "A"; // Java crea un String nuevo en memoria CADA VEZ
        }
        long finString = System.currentTimeMillis();
        
        // 2. Usando StringBuilder
        long inicioBuilder = System.currentTimeMillis();
        StringBuilder constructorTexto = new StringBuilder();
        for (int i = 0; i < repeticiones; i++) {
            constructorTexto.append("A"); // Se modifica el mismo objeto en memoria
        }
        String resultado = constructorTexto.toString();
        long finBuilder = System.currentTimeMillis();
        
        System.out.println("Tiempo con String normal (+): " + (finString - inicioString) + " milisegundos.");
        System.out.println("Tiempo con StringBuilder: " + (finBuilder - inicioBuilder) + " milisegundos.");
        System.out.println("\nMoraleja: ¡Si vas a modificar un texto dentro de un bucle largo, usa StringBuilder!");
    }
}
