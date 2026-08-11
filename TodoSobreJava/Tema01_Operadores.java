package TodoSobreJava;

/**
 * ---------------------------------------------------------
 * TEMA: OPERADORES ARITMÉTICOS Y ASIGNACIÓN
 * ---------------------------------------------------------
 * En Java podemos realizar operaciones matemáticas básicas usando
 * los operadores +, -, *, /, % (módulo o resto).
 * Además, podemos usar operadores de asignación combinada para 
 * escribir código más corto y limpio (ej. +=, -=).
 */
public class Tema01_Operadores {
    public static void main(String[] args) {
        System.out.println("=== OPERADORES ARITMÉTICOS ===");

        int numero = 10;
        System.out.println("Valor inicial: " + numero);

        // Operadores de asignación con operación (forma reducida)
        
        // Equivalente a: numero = numero + 5;
        numero += 5; 
        System.out.println("Después de += 5: " + numero); // 15
        
        // Equivalente a: numero = numero - 5;
        numero -= 5;
        System.out.println("Después de -= 5: " + numero); // 10
        
        // Equivalente a: numero = numero * 2;
        numero *= 2;
        System.out.println("Después de *= 2: " + numero); // 20
        
        // Equivalente a: numero = numero / 2;
        numero /= 2;
        System.out.println("Después de /= 2: " + numero); // 10

        // El operador módulo (%) devuelve el RESTO de una división
        // 10 dividido entre 3 es 3, y SOBRA 1. El módulo devuelve 1.
        numero %= 3;
        System.out.println("Después de %= 3 (Resto de la división por 3): " + numero); // 1
    }
}

