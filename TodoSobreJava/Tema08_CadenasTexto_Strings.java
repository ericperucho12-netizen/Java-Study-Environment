package TodoSobreJava;

/**
 * ============================================================================
 * GUÍA MAESTRA: STRINGS (CADENAS DE TEXTO)
 * ============================================================================
 * 
 * 1. ¿QUÉ ES UN STRING?
 * ----------------------------------------------------------------------------
 * A diferencia de 'int' o 'boolean' (tipos primitivos), 'String' es una CLASE.
 * Esto significa que un String es un Objeto y, por lo tanto, tiene muchos 
 * métodos útiles incluidos por defecto.
 * 
 * 2. LA REGLA DE ORO: INMUTABILIDAD
 * ----------------------------------------------------------------------------
 * ¡Los Strings NO SE PUEDEN MODIFICAR una vez creados! 
 * Si tienes String x = "Hola" y haces x = x + " Mundo", Java NO modifica
 * el objeto original. Lo que hace es DESTRUIR el objeto original y crear
 * uno completamente nuevo en la memoria.
 * 
 * 3. STRING BUILDER (La solución rápida)
 * ----------------------------------------------------------------------------
 * Si necesitas modificar un texto miles de veces (por ejemplo, en un bucle),
 * usar String normal hará que tu programa sea muy lento porque creará miles
 * de objetos nuevos. Para esos casos, DEBES usar 'StringBuilder', el cual
 * es "Mutable" (sí permite modificarse a sí mismo sin consumir más memoria).
 */

public class Tema08_CadenasTexto_Strings {
    public static void main(String[] args) {
        
        System.out.println("=== TEORÍA DE STRINGS ===");
        
        // 1. Declaración Básica
        String texto = "  Aprender Java es genial  ";
        
        // 2. MÉTODOS MÁS USADOS:
        
        // .length() -> Devuelve el número de caracteres (incluyendo espacios)
        System.out.println("Longitud: " + texto.length());
        
        // .trim() -> Borra los espacios en blanco sobrantes al inicio y al final
        String limpio = texto.trim();
        System.out.println("Sin espacios extra: '" + limpio + "'");
        
        // .toUpperCase() y .toLowerCase() -> Mayúsculas y minúsculas
        System.out.println("Mayúsculas: " + limpio.toUpperCase());
        
        // .charAt(indice) -> Obtiene la letra exacta en la posición indicada (empieza en 0)
        System.out.println("La primera letra es: " + limpio.charAt(0));
        
        // .substring(inicio, fin) -> Recorta un pedazo del texto
        System.out.println("Recorte: " + limpio.substring(9, 13)); // Extrae "Java"
        
        // .equals() -> PARA COMPARAR TEXTOS (¡Nunca uses == con Strings!)
        String clave = "secreto";
        System.out.println("¿Es igual a 'secreto'? " + clave.equals("secreto"));
        
        
        // 3. USO DE STRING BUILDER (Alto Rendimiento)
        System.out.println("\n--- StringBuilder ---");
        StringBuilder constructor = new StringBuilder("Hola");
        
        // .append() -> Pega texto al final sin destruir la memoria original
        constructor.append(" a ").append("todos.");
        System.out.println("Resultado Builder: " + constructor.toString());
    }
}

