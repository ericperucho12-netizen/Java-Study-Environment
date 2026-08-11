package TodoSobreJava;

import javax.swing.JOptionPane;

/**
 * ---------------------------------------------------------
 * TEMA: ESTRUCTURAS CONDICIONALES (IF - ELSE)
 * ---------------------------------------------------------
 * La sentencia 'if' (SI condicional) nos permite tomar decisiones en el código.
 * Evalúa una condición y, si es verdadera (true), ejecuta un bloque de código.
 * Si es falsa (false), puede ejecutar otro bloque usando 'else' (SINO).
 * 
 * Operadores lógicos y de comparación comunes:
 * == (Igual que)
 * != (Diferente que)
 * >  (Mayor que)
 * <  (Menor que)
 * >= (Mayor o igual que)
 * <= (Menor o igual que)
 */
public class Tema02_SentenciaIF {
    public static void main(String[] args) {
        System.out.println("=== SENTENCIA IF - ELSE ===");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int numeroConstante = 5;

        System.out.println("Has escrito el número: " + numero);
        System.out.println("Vamos a compararlo con el número mágico (5):");

        // --- IF BÁSICO ---
        if (numero == numeroConstante) {
            System.out.println("-> ¡El número es EXACTAMENTE 5!");
        } 
        // --- ELSE IF (Sino si...) ---
        else if (numero > numeroConstante) {
            System.out.println("-> El número es MAYOR que 5");
        } 
        // --- ELSE (En cualquier otro caso) ---
        else {
            System.out.println("-> El número es MENOR que 5");
        }

        // --- OTRO EJEMPLO CON IF MULTIPLE ---
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero diferente: "));
        
        System.out.println("\nComprobando si el segundo número (" + dato + ") es 5...");
        
        if (dato != 5) {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
    }
}

