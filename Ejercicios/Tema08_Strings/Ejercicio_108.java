package Ejercicios.Tema08_Strings;

/**
 * ---------------------------------------------------------
 * EJERCICIO 108: FORMATEO DE TEXTO (STRING.FORMAT)
 * ---------------------------------------------------------
 * Conceptos: Formatear strings como en C (printf).
 * 
 * Enunciado:
 * Imprime un ticket de compra alineando el texto y limitando
 * los decimales de los precios.
 */
public class Ejercicio_108 {
    public static void main(String[] args) {
        System.out.println("=== FORMATEO DE TEXTO CON STRING.FORMAT ===");
        
        String producto1 = "Manzanas";
        double precio1 = 2.4578;
        
        String producto2 = "Leche";
        double precio2 = 1.2;
        
        // %s es para String, %f es para números flotantes (dobles)
        // %.2f significa "redondea a 2 decimales"
        // %-15s significa "reserva 15 espacios y alinea a la izquierda"
        
        System.out.println("-------------------------");
        System.out.println("     TICKET DE COMPRA    ");
        System.out.println("-------------------------");
        
        String linea1 = String.format("%-15s $%5.2f", producto1, precio1);
        String linea2 = String.format("%-15s $%5.2f", producto2, precio2);
        
        System.out.println(linea1);
        System.out.println(linea2);
        System.out.println("-------------------------");
        System.out.println(String.format("%-15s $%5.2f", "TOTAL", (precio1 + precio2)));
    }
}
