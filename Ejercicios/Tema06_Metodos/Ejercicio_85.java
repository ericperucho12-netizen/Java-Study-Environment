package Ejercicios.Tema06_Metodos;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 85: PROYECTO INTEGRADOR (MENÚ ITERATIVO)
 * ---------------------------------------------------------
 * Conceptos: Integración de varios métodos, ciclo while, switch.
 * 
 * Enunciado:
 * Un programa completo que muestre un menú, llame a diferentes
 * funciones según la opción y no termine hasta elegir "Salir".
 */
public class Ejercicio_85 {

    // Método para imprimir el menú (void)
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Saludar");
        System.out.println("2. Ver número de la suerte");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
    
    // Método para la opción 1
    public static void opcionSaludar() {
        System.out.println("¡Hola! Qué bueno verte integrando todos tus conocimientos.");
    }
    
    // Método para la opción 2 (retorna int)
    public static int generarNumeroSuerte() {
        // Math.random() genera un decimal entre 0.0 y 0.99
        return (int)(Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SISTEMA CON MÉTODOS INTEGRADOS ===");
        
        boolean continuar = true;
        
        while (continuar) {
            mostrarMenu();
            int opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    opcionSaludar();
                    break;
                case 2:
                    int suerte = generarNumeroSuerte();
                    System.out.println("Tu número de la suerte hoy es: " + suerte);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema... ¡Hasta luego!");
                    continuar = false; // Rompe el bucle while
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        
        sc.close();
    }
}
