package Ejercicios.Tema12_Archivos;
import java.io.File;
/**
 * ---------------------------------------------------------
 * EJERCICIO 147: LISTAR ARCHIVOS DE UN DIRECTORIO
 * ---------------------------------------------------------
 * Conceptos: list().
 * 
 * Enunciado:
 * Apunta la clase File a una carpeta (por ejemplo "." para la 
 * carpeta actual) y obtén un arreglo con los nombres de todos 
 * los archivos que viven ahí adentro.
 */
public class Ejercicio_147 {
    public static void main(String[] args) {
        File carpeta = new File("."); // Directorio actual
        String[] archivos = carpeta.list();
        System.out.println("Archivos en la carpeta actual:");
        for (String ar : archivos) {
            System.out.println("- " + ar);
        }
    }
}

