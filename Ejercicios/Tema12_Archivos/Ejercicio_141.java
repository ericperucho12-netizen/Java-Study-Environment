package Ejercicios.Tema12_Archivos;
import java.io.File;
/**
 * ---------------------------------------------------------
 * EJERCICIO 141: CREAR ARCHIVO
 * ---------------------------------------------------------
 * Conceptos: Clase File, createNewFile.
 * 
 * Enunciado:
 * Crea un archivo de texto plano (.txt) en tu sistema.
 * Asegúrate de encerrar la instrucción en un try-catch por 
 * si el disco duro da un error.
 */
public class Ejercicio_141 {
    public static void main(String[] args) {
        try {
            File archivo = new File("mi_primer_archivo.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error.");
        }
    }
}

