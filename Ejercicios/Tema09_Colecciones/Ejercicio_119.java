package Ejercicios.Tema09_Colecciones;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ---------------------------------------------------------
 * EJERCICIO 119: PILAS (STACKS) LIFO
 * ---------------------------------------------------------
 * Conceptos: LIFO (Last In, First Out), push, pop.
 * 
 * Enunciado:
 * Una Pila funciona como una pila de platos: el último en entrar
 * es el primero en salir. Usaremos la interfaz Deque con una LinkedList
 * para simular el historial del botón "Atrás" de un navegador web.
 */
public class Ejercicio_119 {
    public static void main(String[] args) {
        System.out.println("=== PILAS (STACKS - LIFO) ===");
        
        // Deque (Double Ended Queue) es la forma moderna de hacer Pilas en Java
        Deque<String> historialNavegador = new LinkedList<>();
        
        // .push() mete un elemento en el TOPE de la pila
        historialNavegador.push("google.com");
        System.out.println("Visitaste: google.com");
        
        historialNavegador.push("youtube.com");
        System.out.println("Visitaste: youtube.com");
        
        historialNavegador.push("github.com");
        System.out.println("Visitaste: github.com");
        
        System.out.println("\nHistorial completo (el tope es el último visitado): " + historialNavegador);
        
        // .pop() saca el elemento que está en el TOPE
        System.out.println("\nClick en el botón 'Atrás'...");
        String paginaEliminada = historialNavegador.pop();
        System.out.println("Saliste de: " + paginaEliminada);
        
        // .peek() solo MIRA quién está en el tope, sin sacarlo
        System.out.println("Ahora estás en: " + historialNavegador.peek());
    }
}
