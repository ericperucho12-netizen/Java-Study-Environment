package Ejercicios.Tema09_Colecciones;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ---------------------------------------------------------
 * EJERCICIO 120: COLAS (QUEUES) FIFO
 * ---------------------------------------------------------
 * Conceptos: FIFO (First In, First Out), offer, poll.
 * 
 * Enunciado:
 * Una Cola funciona como la fila del supermercado: el primero 
 * que llega es el primero que es atendido.
 */
public class Ejercicio_120 {
    public static void main(String[] args) {
        System.out.println("=== COLAS (QUEUES - FIFO) ===");
        
        // Queue es la interfaz, LinkedList es la clase que le da vida
        Queue<String> filaSupermercado = new LinkedList<>();
        
        // .offer() encola a un elemento (lo pone al final)
        filaSupermercado.offer("Cliente 1 (Ana)");
        filaSupermercado.offer("Cliente 2 (Pedro)");
        filaSupermercado.offer("Cliente 3 (Luis)");
        
        System.out.println("Fila actual: " + filaSupermercado);
        System.out.println("Total en fila: " + filaSupermercado.size());
        
        System.out.println("\n--- Abriendo Caja ---");
        
        // .poll() atiende (saca) al elemento que está al INICIO de la fila
        while (!filaSupermercado.isEmpty()) {
            String atendido = filaSupermercado.poll();
            System.out.println("Atendiendo a: " + atendido);
        }
        
        System.out.println("\nFila actual: " + filaSupermercado);
        System.out.println("¡Todos los clientes fueron atendidos!");
    }
}
