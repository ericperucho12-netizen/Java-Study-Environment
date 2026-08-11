/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
package EjercicioMoure;

import java.util.Arrays;
import java.util.Scanner;

public class esUnAnagrama {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("--- Detector de Anagramas | Perucho Dev ---");
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = entrada.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = entrada.nextLine();

        if (esAnagrama(palabra1, palabra2)) {
            System.out.println("¡Es un Anagrama!");
        } else {
            System.out.println("No es un Anagrama.");
        }
    }

    public static boolean esAnagrama(String str1, String str2) {
        // 1. Limpieza: Pasamos a minúsculas y quitamos espacios
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        // 2. Regla de oro: Si son exactamente iguales, NO son anagramas
        if (str1.equals(str2)) return false;

        // 3. Regla de oro 2: Si no tienen la misma longitud, no pueden ser anagramas
        if (str1.length() != str2.length()) return false;

        // 4. Convertimos a arreglos de caracteres y ordenamos
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1); // Ordena alfabéticamente: [a, b, r, o, m] -> [a, b, m, o, r]
        Arrays.sort(array2);

        // 5. Comparamos si los arreglos ordenados son iguales
        return Arrays.equals(array1, array2);
}


}
