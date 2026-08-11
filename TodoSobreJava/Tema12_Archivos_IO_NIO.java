package TodoSobreJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * ============================================================================
 * GUÍA MAESTRA: ARCHIVOS (ENTRADA Y SALIDA - I/O)
 * ============================================================================
 * 
 * 1. LA CLASE FILE
 * ----------------------------------------------------------------------------
 * Un objeto 'File' no es el contenido del archivo en sí, sino más bien 
 * un "puntero" o "mapa" que apunta a una ruta en tu disco duro (ya sea 
 * una carpeta o un archivo txt/png/mp3).
 * Sirve para preguntar cosas como: ¿Existes?, ¿Cuánto pesas?, ¿Cuál es tu nombre?
 * 
 * 2. STREAMS DE DATOS (El paquete java.io clásico)
 * ----------------------------------------------------------------------------
 * Para leer o escribir contenido, abrimos un "tubo" de datos (Stream).
 * - Escribir: Usamos clases como FileWriter o BufferedWriter.
 * - Leer: Usamos clases como FileReader o simplemente Scanner (pasándole 
 *   el archivo en lugar del teclado).
 * 
 * 3. IMPORTANCIA DE CERRAR EL FLUJO
 * ----------------------------------------------------------------------------
 * Cuando abres un archivo para escribirle, el sistema operativo lo "bloquea"
 * para que nadie más lo modifique. Si olvidas poner .close(), el archivo
 * quedará bloqueado hasta que reinicies la computadora.
 * 
 * 4. EL NUEVO PAQUETE: NIO (New I/O)
 * ----------------------------------------------------------------------------
 * A partir de Java 7, se creó java.nio.file.Files, que contiene herramientas
 * estáticas ultra rápidas para copiar, mover, leer y escribir archivos en 
 * una sola línea de código sin tanta verbosidad.
 */

public class Tema12_Archivos_IO_NIO {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE ARCHIVOS ===\n");
        
        File archivo = new File("teoria_archivos.txt");
        
        // SIEMPRE encerrar I/O en try-catch (Regla de Java)
        try {
            // 1. Crear / Escribir
            System.out.println("Abriendo flujo de escritura...");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("El conocimiento es poder.");
            escritor.close(); // ¡VITAL!
            
            // 2. Leer
            System.out.println("Abriendo flujo de lectura...");
            Scanner lector = new Scanner(archivo);
            while (lector.hasNextLine()) {
                System.out.println("Leímos del disco: " + lector.nextLine());
            }
            lector.close(); // ¡VITAL!
            
            // 3. Destruir evidencia (Limpiar el disco para que no quede basura)
            if (archivo.delete()) {
                System.out.println("\nArchivo eliminado correctamente.");
            }
            
        } catch (IOException e) {
            System.out.println("Hubo un fallo catastrófico en el disco duro.");
            e.printStackTrace();
        }
    }
}

