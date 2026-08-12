/*
*
**
***
****
*****
*/

package Ejercicios.Tema05_Matrices;

import java.util.Scanner;

public class Ejercicio_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i <=5;i++){
            for(int j = 0;j <=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
