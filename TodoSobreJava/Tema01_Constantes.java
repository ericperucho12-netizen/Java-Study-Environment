package TodoSobreJava;

/**
 * ---------------------------------------------------------
 * TEMA: CONSTANTES EN JAVA
 * ---------------------------------------------------------
 * Una constante es un espacio en memoria cuyo valor no puede
 * cambiar a lo largo de la ejecución del programa (es inmutable).
 * 
 * En Java, las constantes se declaran usando la palabra reservada 'final'.
 * Por convención (buenas prácticas), los nombres de las constantes
 * siempre se escriben en MAYÚSCULAS y las palabras se separan por '_'.
 */
public class Tema01_Constantes {
    public static void main(String[] args) {
        System.out.println("=== VARIABLES VS CONSTANTES ===");

        // --- ESTO ES UNA VARIABLE ---
        int numero = 10;
        System.out.println("Valor original de la variable: " + numero);
        
        // Podemos cambiar su valor cuando queramos
        numero = 15;
        System.out.println("Valor cambiado de la variable: " + numero);

        // --- ESTO ES UNA CONSTANTE ---
        // Usamos 'final' antes del tipo de dato
        final int NUMERO = 10;
        System.out.println("\nValor de la constante: " + NUMERO);
        
        // Descomentar la siguiente línea provocará un ERROR en Java
        // NUMERO = 15; // ¡Error! No se puede asignar un valor a una variable 'final'
        
        // Las constantes son muy útiles para valores que nunca cambian, como Pi
        final double VALOR_PI = 3.14159265;
        final String NOMBRE_EMPRESA = "TechCorp Solutions";
        
        System.out.println("Valor de Pi: " + VALOR_PI);
        System.out.println("Empresa: " + NOMBRE_EMPRESA);
    }
}

