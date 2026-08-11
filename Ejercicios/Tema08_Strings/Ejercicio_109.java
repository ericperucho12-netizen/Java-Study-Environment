package Ejercicios.Tema08_Strings;

import java.util.Scanner;

/**
 * ---------------------------------------------------------
 * EJERCICIO 109: EXPRESIONES REGULARES BÁSICAS (REGEX)
 * ---------------------------------------------------------
 * Conceptos: .matches()
 * 
 * Enunciado:
 * Valida que una cadena sea un correo electrónico válido
 * usando una expresión regular sencilla.
 */
public class Ejercicio_109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VALIDACIÓN CON EXPRESIONES REGULARES ===");
        
        System.out.print("Introduce tu correo electrónico: ");
        String correo = sc.nextLine();
        
        // Explicación de la RegEx básica para correo:
        // ^[A-Za-z0-9+_.-]+   -> Empieza con letras, números o caracteres permitidos
        // @                   -> Debe tener un arroba
        // [A-Za-z0-9.-]+      -> Seguido del dominio
        // $                   -> Fin del string
        String patronCorreo = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        
        if (correo.matches(patronCorreo)) {
            System.out.println("¡El correo parece ser válido!");
        } else {
            System.out.println("Error: El formato del correo es inválido.");
        }
        
        sc.close();
    }
}
