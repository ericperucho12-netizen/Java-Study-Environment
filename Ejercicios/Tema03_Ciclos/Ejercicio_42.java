/*
* Pedir un numero N, introducir N sueldos
* y mostrar el suelo maximo
* */

package Ejercicios.Tema03_Ciclos;


import java.util.Scanner;

public class Ejercicio_42 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN ---

        // Preparamos el teclado para recibir la información
        Scanner entrada = new Scanner(System.in);

        // Variables para el control de los datos
        int cantidadSueldos;
        float sueldo,sueldoMaximo =0;
        /* Nota: Inicializamos sueldoMaximo en 0 para que cualquier
           sueldo real que ingresemos sea mayor que este valor inicial.
        */

        // --- 2. ENTRADA DE DATOS ---

        // Primero preguntamos cuántos sueldos se van a registrar

        System.out.print("Cuántos sueldos desea ingresar?: ");
        cantidadSueldos = entrada.nextInt();

        //---3. El ciclo de busqueda ---
        //El bucle se repetirá "N" veces, segun lo que el usuario decidió arriba
        for(int i=1;i<=cantidadSueldos;i++){
            System.out.print("Ingrese sueldo # " +i+": ");
            sueldo = entrada.nextFloat();

            // --- 4. LA LÓGICA DEL MÁXIMO ---

            /* Aquí ocurre la magia: Si el sueldo que acabamos de leer
               es más grande que el que teníamos guardado como "máximo",
               entonces lo reemplazamos.
            */

            if(sueldo>sueldoMaximo){
                sueldoMaximo = sueldo;//El nuevo sueldo ahora es el líder
            }

        }// <--- El bucle sigue comparando todos los sueldos uno por uno

        // --- 5. RESULTADO FINAL ---

        // Una vez que revisamos todos, mostramos cuál fue el más alto de la lista
        System.out.println("\n==========================");
        System.out.printf("El sueldo máximo registrado es: $%.2f\n",sueldoMaximo);
        System.out.println("=============================");
        entrada.close();//Cerramos el flujo de datos
    }
}
