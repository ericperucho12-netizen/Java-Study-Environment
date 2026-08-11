package Ejercicios.Tema12_Archivos;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * ---------------------------------------------------------
 * EJERCICIO 150: LECTURA EFICIENTE (BUFFEREDREADER)
 * ---------------------------------------------------------
 * Conceptos: BufferedReader, try-with-resources.
 * 
 * Enunciado:
 * Si el archivo es gigante (GBs), leerlo de golpe bloqueará la 
 * memoria RAM. Usa un BufferedReader para ir leyendo el archivo
 * línea por línea de forma ultra eficiente.
 */
public class Ejercicio_150 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("nuevo.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("Buffer: " + linea);
            }
        } catch (Exception e) {
            System.out.println("Error de lectura.");
        }
    }
}

