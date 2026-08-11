package Ejercicios.Tema10_Excepciones;
import java.util.Scanner;
/**
 * ---------------------------------------------------------
 * EJERCICIO 130: BUCLE HASTA DATO VÁLIDO
 * ---------------------------------------------------------
 * Conceptos: while + try-catch.
 * 
 * Enunciado:
 * Crea un bucle que pida un número repetidamente. Si el usuario 
 * introduce texto, atrapa el error y vuelve a pedirlo, hasta que 
 * introduzca un dato válido.
 */
public class Ejercicio_130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Introduce tu año de nacimiento: ");
                int anio = Integer.parseInt(sc.nextLine());
                System.out.println("Naciste en " + anio);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor introduce solo números.");
            }
        }
    }
}

