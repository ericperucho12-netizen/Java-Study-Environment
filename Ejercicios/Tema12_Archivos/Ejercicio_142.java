package Ejercicios.Tema12_Archivos;
import java.io.FileWriter;
/**
 * ---------------------------------------------------------
 * EJERCICIO 142: ESCRIBIR EN ARCHIVO
 * ---------------------------------------------------------
 * Conceptos: FileWriter, write, close.
 * 
 * Enunciado:
 * Usa un FileWriter para abrir el archivo .txt creado en el 
 * ejercicio anterior e inyectarle una línea de texto. ¡No 
 * olvides cerrar (close) el archivo al terminar!
 */
public class Ejercicio_142 {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("mi_primer_archivo.txt");
            escritor.write("¡Hola Mundo! Este texto está guardado en el disco duro.");
            escritor.close();
            System.out.println("Se escribió correctamente en el archivo.");
        } catch (Exception e) {
            System.out.println("Error al escribir.");
        }
    }
}

