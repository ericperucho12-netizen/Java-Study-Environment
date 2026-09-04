//hacer un programa que calcule e imprima la suma
// de tres calificaciones

package Ejercicios.Tema01_Basicos;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int cal1, cali2, cali3, resultado;

        System.out.println("Ingrese 3 calificaciones");
        cal1 = sc.nextInt();
        cali2 = sc.nextInt();
        cali3 = sc.nextInt();

        resultado = cal1 + cali2 + cali3;

        System.out.println("Resultado: " + resultado);

    }
    }
