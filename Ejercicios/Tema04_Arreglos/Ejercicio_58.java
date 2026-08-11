/*
*Leer dos series de 10 enteros, que estaran ordenados crecientemente
leer N y buscarlos en la tabla. se debe mostrar la posicion en que
se encuentra. si no está, indicarlo con un mensaje
*
*/


package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- 1. ASIGNACIÓN DIRECTA ---
        // Llenamos la tabla con 10 datos ordenados crecientemente para la prueba
        int[] tabla ={2,5,8,12,16,23,38,56,72,91};
        System.out.println("Motor de Busqueda \nDigite el numero N que desea encontrar:  ");
        int numeroBuscando = sc.nextInt();

        boolean encontrado = false;
        int posicion =-1;

        //Busqueda

        for(int i=0;i<10;i++){
            //caso A: Lo encontramos
            if(tabla[i]==numeroBuscando){
                encontrado=true;
                posicion=i;
                break;//Detemos el bucle inmediatamente para ahorrar memoria
            }
            //Case B:
            if(tabla[i]>numeroBuscando){
                break;
            }
        }
        //Resultado final
        System.out.println("\n--- Resultados ---");
        if (encontrado) {
            System.out.println("ÉXITO: El número " + numeroBuscando + " está en la posición " + posicion);
        } else {
            System.out.println("ERROR: El número " + numeroBuscando + " NO se encuentra en la tabla.");
        }

        sc.close();
    }
}
