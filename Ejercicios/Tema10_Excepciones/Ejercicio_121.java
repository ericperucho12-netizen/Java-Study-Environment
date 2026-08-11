package Ejercicios.Tema10_Excepciones;
import java.util.Scanner;
/**
 * ---------------------------------------------------------
 * EJERCICIO 121: TRY-CATCH BÁSICO
 * ---------------------------------------------------------
 * Conceptos: try, catch, Exception.
 * 
 * Enunciado:
 * Crea un programa que pida un número entero al usuario. 
 * Enciérralo en un bloque try-catch para evitar que el programa
 * se detenga bruscamente si el usuario escribe letras en lugar de números.
 */
public class Ejercicio_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MANEJO DE ERRORES ===");
        try {
            System.out.print("Introduce un número entero: ");
            int num = sc.nextInt();
            System.out.println("Tu número es: " + num);
        } catch (Exception e) {
            System.out.println("¡Error! No introdujiste un número válido.");
        }
    }
}

