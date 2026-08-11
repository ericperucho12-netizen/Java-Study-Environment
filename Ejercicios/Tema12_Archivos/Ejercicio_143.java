package Ejercicios.Tema12_Archivos;
import java.io.File;
import java.util.Scanner;
/**
 * ---------------------------------------------------------
 * EJERCICIO 143: LEER ARCHIVO CON SCANNER
 * ---------------------------------------------------------
 * Conceptos: Scanner, File.
 * 
 * Enunciado:
 * En lugar de usar Scanner para leer el teclado (System.in),
 * pásale un objeto File para que lea el contenido completo 
 * de tu archivo de texto.
 */
public class Ejercicio_143 {
    public static void main(String[] args) {
        try {
            File archivo = new File("mi_primer_archivo.txt");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println("Leído: " + linea);
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al leer.");
        }
    }
}

