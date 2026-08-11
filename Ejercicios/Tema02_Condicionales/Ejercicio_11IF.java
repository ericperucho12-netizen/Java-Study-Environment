/* 
"Desarrollar un programa que solicite al usuario un carácter
y determine si este es una letra mayúscula o una letra minúscula."
*/
package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;


public class Ejercicio_11IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;

        System.out.print("Digite una letra: ");
        //Scanner no tiene nextChar(), asi que tomamos el primer carácter del Str
        letra = sc.next().charAt(0);

        if(Character.isUpperCase(letra)){
            System.out.println("La letra '"+ letra+"' es MAYUSCULA.");
        } else if (Character.isLowerCase(letra)) {
            System.out.println("La letra '"+ letra+"' es MINUSCULA.");
        }else {
            System.out.println("El caracter ingresado no es una letra.");
        }
        sc.close();
    }

}
