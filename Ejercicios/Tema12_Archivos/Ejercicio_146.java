package Ejercicios.Tema12_Archivos;
import java.io.File;
/**
 * ---------------------------------------------------------
 * EJERCICIO 146: CREAR DIRECTORIO
 * ---------------------------------------------------------
 * Conceptos: mkdir.
 * 
 * Enunciado:
 * Así como puedes crear archivos, puedes crear carpetas.
 * Usa .mkdir() para crear un nuevo directorio vacío en la ruta actual.
 */
public class Ejercicio_146 {
    public static void main(String[] args) {
        File directorio = new File("MiNuevaCarpeta");
        if (directorio.mkdir()) {
            System.out.println("Carpeta creada exitosamente.");
        } else {
            System.out.println("La carpeta ya existe.");
        }
    }
}

