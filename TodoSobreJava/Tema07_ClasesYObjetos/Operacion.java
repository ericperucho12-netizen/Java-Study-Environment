package TodoSobreJava.Tema07_ClasesYObjetos;

/**
 * ---------------------------------------------------------
 * TEMA: MÉTODOS CON RETORNO DE VALORES
 * ---------------------------------------------------------
 * Esta clase agrupa operaciones matemáticas.
 * A diferencia de los métodos tipo 'void' que solo ejecutan una acción,
 * estos métodos 'retornan' (devuelven) un resultado al código
 * que los invocó usando la palabra reservada 'return'.
 */
public class Operacion {
    
    // --- MÉTODOS DE OPERACIÓN ---
    
    // Método que recibe 2 enteros, los suma, y RETORNA un entero (int)
    public int sumar(int num1, int num2){
       int suma = num1 + num2;
       return suma; // Devuelve el resultado al invocador
    }
    
    // Método para restar
    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
    }
    
    // Método para multiplicar
    public int multiplicacion(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
    
    // Método para dividir
    public int division(int num1, int num2){
        // Nota: en una división real, deberíamos manejar 
        // el error de división por cero (num2 == 0) o usar double/float
        int division = num1 / num2; 
        return division;
    }

    /* 
     * MÉTODOS COMENTADOS QUE PUEDEN SER ÚTILES (VOID)
     * public void mostrar(int suma, int resta, int multiplicacion, int division){
     *     System.out.println("Suma: " + suma);
     *     System.out.println("Resta: " + resta);
     *     System.out.println("Multiplicación: " + multiplicacion);
     *     System.out.println("División: " + division);
     * }
     */
}

