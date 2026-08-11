//Pedir un número entre 0 y 99 999 y decir cuantas cifras tiene


package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_16IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int numero;

        System.out.println("digite un numero entre 0 y 99,999: ");
        numero = entrada.nextInt();

        if(numero< 0|| numero>99999){
            System.out.println("Error: El número está fuera del rango permitido.");
        }else if(numero<10){
            System.out.println("El número tiene 1 cifra.");
        }else if(numero<100){
            System.out.println("El número tiene 2 cifra.");
        }else if(numero<1000){
            System.out.println("El número tiene 3 cifra.");
        }else if(numero<10000){
            System.out.println("El número tiene 4 cifra.");
        }else {
            System.out.println("El número tiene 5 cifra.");
        }


    entrada.close();
    }
}
