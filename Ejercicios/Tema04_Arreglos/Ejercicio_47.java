/*
*   Leer 5 numeros por teclado, alamacenados en un arreglo y
    a continuación realizar la media de los numeros positivos,
    la media de los negativos y contar el número de ceros
*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_47 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN DE HERRAMIENTAS Y VARIABLES ---
        Scanner sc=new Scanner(System.in);

        // Reservamos 5 espacios en memoria para nuestros números
        int []numeros=new int[5];

        // "Alcancías" (Acumuladores) y "Clics" (Contadores)
        int sumaPositivos=0,conteoPositivos=0;
        int sumaNegativos=0,conteoNegativos=0;
        int conteoCero=0;

        // --- 2. LLENADO DEL ARREGLO (Bucle FOR Clásico) ---
        System.out.println("--- Ingreso de Datos ---");
        /* Usamos el for clásico porque necesitamos el índice 'i'
           para guardar cada número en su posición correcta (0 al 4). */

        for(int i=0;i<5;i++){
            System.out.print("Ingrese el número para la posición "+ i+": ");
            numeros[i]=sc.nextInt();
        }
        // --- 3. PROCESAMIENTO DE DATOS (Bucle FOR-EACH) ---
        /* Usamos el for-each porque ya no nos importa la posición.
           Solo queremos que Java saque cada número de la "caja"
            y lo evalúe. */

        for(int num:numeros){
            if(num==0){
                conteoCero++;// Si es cero, solo lo contamos
            }
            else if(num>0){
                sumaPositivos+=num;//Si es positivo, lo sumamos...
                conteoPositivos++;// ...y lo contamos
            }
            else {
                sumaNegativos+=num;// Si es negativo, lo sumamos...
                conteoNegativos++;// ...y lo contamos
            }
        }

        // --- 4. CÁLCULOS SEGUROS Y RESULTADOS ---
        System.out.println("\n--- Reporte Estadístico ---");

        // Validación: Prevenir división por cero (ArithmeticException)

        if(conteoPositivos==0){
            System.out.println("Promedio Positivo: No se ingresaron número positivos.");
        }else{
            // Convertimos a (float) para no perder los decimales en la división
            float promedioPositivos=(float)sumaPositivos/conteoPositivos;
            System.out.printf("Promedio Positivo: %.2f\n", promedioPositivos);
        }
        if(conteoNegativos==0){
            System.out.println("Promedio Negativos: No se ingresaron números negativos.");
        }else {
            float promedioNegativos=(float)sumaNegativos/conteoNegativos;
            System.out.printf("Promedio Negativos:%.2f\n", promedioNegativos);
        }
        System.out.println("Cantidad de Ceros: "+ conteoCero);




    }
}
