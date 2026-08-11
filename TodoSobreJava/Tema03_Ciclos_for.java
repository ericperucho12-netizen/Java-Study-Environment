package TodoSobreJava;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: CICLO FOR (PARA)
 * ---------------------------------------------------------
 * El ciclo 'for' se usa cuando sabemos EXACTAMENTE cuántas
 * veces queremos repetir un bloque de código. 
 * 
 * Es muy compacto porque incluye en una sola línea:
 * 1. Inicialización (de dónde empezamos)
 * 2. Condición (hasta dónde llegamos)
 * 3. Incremento/Decremento (cómo avanzamos)
 */
public class Tema03_Ciclos_for {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== CICLO FOR ===");

        System.out.print("¿Cuántos términos quieres ver? ");
        int count = entrada.nextInt();

        System.out.println("\n-- Bucle For Ascendente (Avanzando de a 2) --");
        // Sintaxis: for(Inicialización ; Condición ; Iteración)
        // Aquí i empieza en 1, sigue mientras i<=count, y avanza de 2 en 2
        for (int i = 1; i <= count; i += 2) {
            System.out.println(i);
        }

        System.out.println("\n-- Bucle For Descendente --");
        // Empezamos en 10, y bajamos de 1 en 1 hasta que sea menor que 1
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }
        
        entrada.close();
    }
}

