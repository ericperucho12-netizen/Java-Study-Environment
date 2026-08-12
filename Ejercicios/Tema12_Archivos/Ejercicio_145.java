package Ejercicios.Tema12_Archivos;
import java.io.File;
/**
 * ---------------------------------------------------------
 * EJERCICIO 145: ELIMINAR ARCHIVOS
 * ---------------------------------------------------------
 * Conceptos: delete.
 * 
 * Enunciado:
 * Utiliza el método .delete() sobre tu objeto File para borrar
 * el archivo de texto que habías creado, limpiando el disco duro.
 */
public class Ejercicio_145 {
    public static void main(String[] args) {
        File archivo = new File("mi_primer_archivo.txt");
        if (archivo.delete()) {
            System.out.println("Archivo eliminado: " + archivo.getName());
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
    }
}

