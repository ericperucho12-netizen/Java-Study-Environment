package TodoSobreJava;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: CICLO DO-WHILE (HACER-MIENTRAS)
 * ---------------------------------------------------------
 * El ciclo 'do-while' es similar al 'while', pero con una
 * gran diferencia: primero EJECUTA el bloque de código y 
 * LUEGO evalúa la condición.
 * 
 * Esto garantiza que el código dentro del 'do' se ejecutará
 * por lo menos UNA VEZ, incluso si la condición es falsa 
 * desde el principio.
 */
public class Tema03_Ciclos_do_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== CICLO DO-WHILE ===");

        System.out.print("¿Cuántos números quieres imprimir (ascendente)? ");
        int contador = entrada.nextInt();
        
        int i = 1; // Empezamos en 1

        System.out.println("\n-- Ejecución garantizada al menos una vez --");
        
        // HACER (do) lo que está entre llaves...
        do {
            System.out.println(i);
            i++; // Incrementamos
            
        // ...MIENTRAS la condición sea verdadera
        } while (i <= contador);
        
        
        System.out.println("\n-- ¿Qué pasa si la condición es falsa? --");
        int j = 10;
        // Aunque 10 no es menor que 5, esto se imprimirá 1 vez
        do {
            System.out.println("Imprimiendo j: " + j);
            j++;
        } while(j < 5);

        entrada.close();
    }
}

