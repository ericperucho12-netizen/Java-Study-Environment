package Ejercicios.Tema08_Strings;

/**
 * ---------------------------------------------------------
 * EJERCICIO 77: SUBCADENAS Y BÚSQUEDAS
 * ---------------------------------------------------------
 * Conceptos: substring(), indexOf(), equals()
 * 
 * Enunciado:
 * Dada una ruta de un archivo (ej. "C:/documentos/java/archivo.txt"), 
 * extrae solamente el nombre del archivo y su extensión.
 */
public class Ejercicio_102 {
    public static void main(String[] args) {
        System.out.println("=== EXTRACCIÓN DE SUBCADENAS ===");
        
        String ruta = "C:/documentos/java/archivo_secreto.txt";
        System.out.println("Ruta original: " + ruta);

        // indexOf(cadena): Busca la primera aparición de un texto y devuelve su posición.
        // lastIndexOf(cadena): Busca la ÚLTIMA aparición de un texto.
        int posicionUltimaBarra = ruta.lastIndexOf("/");
        
        // substring(inicio): Extrae desde la posición indicada hasta el final
        String nombreArchivo = ruta.substring(posicionUltimaBarra + 1);
        System.out.println("Nombre del archivo: " + nombreArchivo);

        // Podemos usar equals() para comparar el contenido de dos Strings de forma segura
        String extensionEsperada = ".txt";
        
        int posicionPunto = nombreArchivo.lastIndexOf(".");
        String extensionReal = nombreArchivo.substring(posicionPunto);

        if (extensionReal.equals(extensionEsperada)) {
            System.out.println("El archivo es un documento de texto (.txt)");
        } else {
            System.out.println("El archivo es de otro tipo: " + extensionReal);
        }
    }
}
