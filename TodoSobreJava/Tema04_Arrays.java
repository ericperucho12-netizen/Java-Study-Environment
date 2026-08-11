package TodoSobreJava;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * TEMA: ARREGLOS (ARRAYS) EN JAVA
 * ---------------------------------------------------------
 * Un arreglo es una estructura de datos que nos permite
 * almacenar múltiples valores del MISMO TIPO bajo un 
 * único nombre. Imagínalo como una caja con separadores,
 * donde cada separador (índice) guarda un elemento.
 */
public class Tema04_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 1. DECLARACIÓN Y ASIGNACIÓN ===");
        
        // Forma 1: Asignación Rápida (Directa)
        // Ya sabemos los valores que queremos guardar.
        int[] numerosDirectos = {15, 6, 100, 1000};
        System.out.println("Primer elemento de numerosDirectos: " + numerosDirectos[0]);

        // Forma 2: Asignación Manual (Paso a paso)
        // Declaramos el tamaño y luego llenamos cada posición.
        // OJO: Los índices siempre empiezan en 0.
        int[] numerosManuales = new int[4];
        numerosManuales[0] = 10;
        numerosManuales[1] = 20;
        numerosManuales[2] = 30;
        numerosManuales[3] = 40;

        System.out.println("\n=== 2. ARREGLOS DINÁMICOS (TAMAÑO DEFINIDO POR USUARIO) ===");
        
        int nElem;
        // El usuario decide de qué tamaño será nuestra "caja"
        nElem = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de caracteres que desea guardar: "));

        // Creamos el arreglo con el tamaño exacto que pidió el usuario
        char[] letras = new char[nElem];

        System.out.println("Digite los " + nElem + " elementos del array (solo una letra por vez): ");
        // Llenado del arreglo con un ciclo for
        for (int i = 0; i < nElem; i++) {
            System.out.print((i + 1) + ". Digite un caracter: ");
            // charAt(0) captura solo la primera letra de lo que escriba el usuario
            letras[i] = sc.next().charAt(0);
        }

        System.out.println("\n=== 3. RECORRIDO DE ARREGLOS ===");
        
        // Recorrido Clásico (Usando índices)
        System.out.print("Impresión con For Clásico: ");
        for (int i = 0; i < nElem; i++) {
            System.out.print(letras[i] + " ");
        }
        System.out.println();

        // Recorrido For-Each (Más moderno y seguro)
        // El For-Each significa "Por cada...". No usa contadores (como la 'i').
        // Simplemente recorre todo el arreglo de principio a fin automáticamente.
        System.out.print("Impresión con For-Each (Piloto Automático): ");
        // Se lee: "Por cada caracter 'letra' dentro del arreglo 'letras'..."
        for (char letra : letras) {
            System.out.print(letra + " ");
        }
        System.out.println();

        sc.close();
    }
}

