package Ejercicios.Tema12_Archivos;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/**
 * ---------------------------------------------------------
 * EJERCICIO 149: LEER TODO CON NIO (MODERNO)
 * ---------------------------------------------------------
 * Conceptos: Files.readAllLines.
 * 
 * Enunciado:
 * Usar NIO es mucho más rápido. En una sola línea de código, 
 * lee TODAS las líneas de un archivo y guárdalas en una List<String>.
 */
public class Ejercicio_149 {
    public static void main(String[] args) {
        try {
            List<String> lineas = Files.readAllLines(Paths.get("nuevo.txt"));
            System.out.println("Líneas leídas:");
            lineas.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("No se pudo leer.");
        }
    }
}

