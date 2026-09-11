/*

 *********
  *******
   *****
    ***
     *
 */

package Ejercicios.Tema05_Matrices;

public class Ejercicio_70 {
    public static void main(String[] args) {
        int n=5; // Número de filas (altura de la pirámide invertida)
        
        // Bucle exterior para recorrer las filas de mayor a menor
        for(int i=n-1;i>=1;i-- ){
            
            // Bucle interior para imprimir los espacios en blanco
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            
            // Bucle interior para imprimir los asteriscos (*)
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            
            // Salto de línea después de cada fila
            System.out.println();
        }
    }
}
