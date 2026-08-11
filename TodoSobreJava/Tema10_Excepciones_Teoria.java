package TodoSobreJava;

/**
 * ============================================================================
 * GUÍA MAESTRA: EXCEPCIONES Y MANEJO DE ERRORES
 * ============================================================================
 * 
 * 1. ¿QUÉ ES UNA EXCEPCIÓN?
 * ----------------------------------------------------------------------------
 * Es un evento anormal que ocurre mientras el programa se está ejecutando 
 * (ej. el internet se corta, un archivo no existe, intentas dividir por cero). 
 * Si no lo atrapas, el programa "crachea" (se cierra abruptamente).
 * 
 * 2. LA JERARQUÍA DEL DESASTRE
 * ----------------------------------------------------------------------------
 * Todo nace de la clase 'Throwable'. Se divide en dos:
 * - ERROR: Fallas críticas del sistema operativo o la Máquina Virtual (ej. 
 *   te quedaste sin RAM). ¡No se pueden ni se deben intentar atrapar!
 * - EXCEPTION: Errores de lógica o entorno que SÍ debemos atrapar.
 * 
 * 3. CHECKED vs UNCHECKED EXCEPTIONS
 * ----------------------------------------------------------------------------
 * - Checked (Verificadas): Java te OBLIGA a escribir un try-catch antes
 *   de dejarte compilar el código. (Ej. IOException, leer archivos).
 * 
 * - Unchecked (No Verificadas o RuntimeExceptions): Java asume que sabes 
 *   lo que haces y no te obliga a usar try-catch (Ej. NullPointerException, 
 *   ArithmeticException).
 * 
 * 4. EL BLOQUE TRY-CATCH-FINALLY
 * ----------------------------------------------------------------------------
 * try { ... código peligroso ... }
 * catch (Error e) { ... plan de respaldo si falla ... }
 * finally { ... código que siempre se ejecuta al final, pase lo que pase ... }
 */

public class Tema10_Excepciones_Teoria {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE EXCEPCIONES ===\n");
        
        System.out.println("Iniciando conexión...");
        
        try {
            // CÓDIGO PELIGROSO
            int[] arreglo = new int[3];
            arreglo[5] = 10; // ¡Crashea! El índice 5 no existe (ArrayIndexOutOfBoundsException)
            System.out.println("Esto nunca se va a imprimir");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // PLAN DE RESPALDO ESPECÍFICO
            System.out.println("¡CRASH EVITADO! Intentaste acceder a una posición que no existe.");
            
        } catch (Exception e) {
            // PLAN DE RESPALDO GENERAL (Atrapa cualquier otra cosa)
            System.out.println("Ocurrió un error inesperado.");
            
        } finally {
            // CÓDIGO DE LIMPIEZA
            // Siempre se ejecuta. Ideal para cerrar bases de datos, scanners, etc.
            System.out.println("Cerrando conexión de forma segura...");
        }
        
        System.out.println("\nEl programa sigue vivo y llega hasta el final =)");
    }
}

