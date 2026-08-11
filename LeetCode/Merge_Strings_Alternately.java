import java.util.Scanner;

public class Merge_Strings_Alternately {

}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word1, word2;

    System.out.print("Ingrese la palabra 1: ");
    word1 = sc.nextLine();
    System.out.print("Ingrese la palabra 2: ");
    word2 = sc.nextLine();

    String resultadoFinal = mergeAlternately(word1, word2);

    System.out.println("Resultado: " + resultadoFinal);

}

public static String mergeAlternately(String word1, String word2) {
    StringBuilder result = new StringBuilder();
    int i = 0;

    if (word1.length() >= 1 && word1.length() <= 100 && word2.length() >= 1 && word2.length() <= 100) {
        while (i < word1.length() && i < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            i++;
        }
    }
    if (i < word1.length()) {
        result.append(word1.substring(i));
    }
    if (i < word2.length()) {
        result.append(word2.substring(i));
    }

    return result.toString();
}
