package Ejercicios.Tema12_Archivos;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 * ---------------------------------------------------------
 * EJERCICIO 148: RENOMBRAR CON NIO
 * ---------------------------------------------------------
 * Conceptos: java.nio.file.Files, Paths.
 * 
 * Enunciado:
 * La librería moderna de Java para archivos se llama NIO (New I/O).
 * Usa Files.move() para renombrar un archivo de un nombre a otro.
 */
public class Ejercicio_148 {
    public static void main(String[] args) {
        try {
            Path origen = Paths.get("viejo.txt");
            Files.createFile(origen); // Lo creamos para probar
            Path destino = Paths.get("nuevo.txt");
            Files.move(origen, destino);
            System.out.println("Archivo renombrado a nuevo.txt");
        } catch (Exception e) {
            System.out.println("Error (probablemente el archivo origen no existía).");
        }
    }
}

