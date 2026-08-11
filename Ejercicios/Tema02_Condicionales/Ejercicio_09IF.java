/*
"Construir un programa que lea un número entero por teclado
y determine si dicho número es múltiplo de 10. El sistema debe
mostrar un mensaje confirmando el resultado."
*/

package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_09IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese el numero: ");
        numero = entrada.nextInt();

        if(numero%10==0){
            System.out.println("El numero "+numero+" es múltiplo de 10" );
        }
        else{
            System.out.println("El número "+ numero+ " No es múltiplo de 10");
        }
        entrada.close();
    }

}
