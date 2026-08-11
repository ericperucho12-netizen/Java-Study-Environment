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

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
