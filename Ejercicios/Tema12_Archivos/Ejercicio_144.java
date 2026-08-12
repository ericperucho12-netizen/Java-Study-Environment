package Ejercicios.Tema12_Archivos;
import java.io.File;
/**
 * ---------------------------------------------------------
 * EJERCICIO 144: OBTENER INFO DEL ARCHIVO
 * ---------------------------------------------------------
 * Conceptos: getName, getAbsolutePath, length.
 * 
 * Enunciado:
 * Consulta los metadatos de tu archivo: verifica si existe,
 * averigua su ruta completa en el disco duro y su peso en bytes.
 */
public class Ejercicio_144 {
    public static void main(String[] args) {
        File archivo = new File("mi_primer_archivo.txt");
        if (archivo.exists()) {
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("Tamaño: " + archivo.length() + " bytes");
        }
    }
}

