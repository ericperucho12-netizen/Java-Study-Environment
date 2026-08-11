package TodoSobreJava;

/**
 * ============================================================================
 * GUÍA MAESTRA: MÉTODOS Y FUNCIONES
 * ============================================================================
 * 
 * 1. ¿QUÉ ES UN MÉTODO?
 * ----------------------------------------------------------------------------
 * Es un bloque de código empaquetado que hace una tarea específica. 
 * En lugar de escribir 1000 líneas en el 'main', dividimos el problema en 
 * métodos pequeños (sumar, restar, imprimir). 
 * *Nota: En Java se les llama Métodos (porque pertenecen a Clases), pero es 
 * lo mismo que una "Función" en otros lenguajes.
 * 
 * 2. ESTRUCTURA (LA FIRMA DEL MÉTODO)
 * ----------------------------------------------------------------------------
 * [modificador] [tipo_retorno] [nombre] ( [parámetros] ) { ... }
 * Ejemplo: public static int sumar(int a, int b) { return a + b; }
 * 
 * 3. TIPOS DE RETORNO (RETURN vs VOID)
 * ----------------------------------------------------------------------------
 * - VOID: El método hace su trabajo (ej. imprimir algo) y NO devuelve nada.
 * - RETURN: El método hace un cálculo y te DEVUELVE un valor (int, String, etc)
 *   que puedes guardar en una variable para usarlo más adelante.
 */

public class Tema06_MetodosYFunciones {
    
    // --- EJEMPLO 1: Método VOID (No devuelve nada) ---
    // 'static' permite llamarlo directamente desde el main sin instanciar la clase
    public static void saludar(String nombre) {
        System.out.println("¡Hola " + nombre + ", bienvenido a Java!");
    }
    
    // --- EJEMPLO 2: Método con RETURN (Devuelve un dato) ---
    public static int calcularCuadrado(int numero) {
        int resultado = numero * numero;
        return resultado; // Le "escupe" el resultado a quien lo haya llamado
    }
    
    // --- EJEMPLO 3: Sobrecarga de Métodos (Overloading) ---
    // Java permite tener dos métodos con el MISMO NOMBRE siempre y cuando
    // reciban parámetros diferentes (ej. uno recibe int, otro recibe double)
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static double sumar(double a, double b) {
        return a + b;
    }

    // ==================================================================
    // MÉTODO PRINCIPAL (Donde arranca el programa)
    // ==================================================================
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE MÉTODOS ===");
        
        // 1. Llamar a un método void
        saludar("Eric"); 
        
        // 2. Llamar a un método con return y GUARDAR el resultado
        int miCuadrado = calcularCuadrado(5);
        System.out.println("El cuadrado de 5 es: " + miCuadrado);
        
        // 3. Demostrar la Sobrecarga
        System.out.println("Suma de enteros (int): " + sumar(10, 5));
        System.out.println("Suma de decimales (double): " + sumar(10.5, 5.2));
    }
}

