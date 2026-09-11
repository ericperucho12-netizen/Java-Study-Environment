/*
    *
   ***
  *****
 *******
*********

*/
package Ejercicios.Tema05_Matrices;

public class Ejercicio_71 {
    public static void main(String[] args) {
        int n = 5; // Número de filas (altura de la pirámide normal)
        
        // Bucle exterior para recorrer las filas
        for(int i=1;i<=n;i++){
            
            // Bucle interior para imprimir los espacios en blanco
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            // Bucle interior para imprimir los asteriscos (*)
            for(int j =1; j<=(2*i-1);j++){
                System.out.print("*");
            }
            
            // Salto de línea después de cada fila
            System.out.println();
        }

    }
}
