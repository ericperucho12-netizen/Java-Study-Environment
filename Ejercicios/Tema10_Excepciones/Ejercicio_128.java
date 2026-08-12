package Ejercicios.Tema10_Excepciones;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 * ---------------------------------------------------------
 * EJERCICIO 128: EXCEPCIONES CHECKED
 * ---------------------------------------------------------
 * Conceptos: Excepciones verificadas por el compilador.
 * 
 * Enunciado:
 * Intenta abrir un archivo inexistente usando FileReader. 
 * Observa cómo Java te obliga a usar try-catch (es una excepción 
 * obligatoria/checked).
 */
public class Ejercicio_128 {
    public static void main(String[] args) {
        // IOException es Checked, obliga al compilador a pedir un try-catch
        try {
            FileReader fr = new FileReader(new File("archivo_inexistente.txt"));
        } catch (IOException e) {
            System.out.println("El archivo no existe.");
        }
    }
}

