/*
*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
* educativo. Cada grupo (o clase) está compuesta por 5 alumnos. Se pide leer las notas del
* primer, segundo y tercer trimestre de un grupo. Debemos Mostrar al final:
* la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la
* posición N (N se lee por teclado)
*
*/

package Ejercicios.Tema04_Arreglos;

import java.util.Scanner;

public class Ejercicio_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] primerTrimestre = new float[5];
        float[] segundoTrimestre = new float[5];
        float[] tercerTrimestre = new float[5];

        float sumaPrimer = 0, sumaSegundo = 0, sumaTercer = 0;

        //Ingresar los datos
        System.out.println("Gestor de calificaciones");

        for(int i = 0; i <5;i++){
            System.out.println("\nLlenando notas del Alumno #"+i+": ");

            System.out.print("Nota 1er Trimestre: ");
            primerTrimestre[i] = sc.nextFloat();
            sumaPrimer += primerTrimestre[i];

            System.out.print("Nota 2er Trimestre: ");
            segundoTrimestre[i] = sc.nextFloat();
            sumaSegundo += segundoTrimestre[i];

            System.out.print("Nota 3er Trimestre: ");
            tercerTrimestre[i] = sc.nextFloat();
            sumaTercer += tercerTrimestre[i];

        }

        //Calculo de promedio grupales

        System.out.println("\n--- PROMEDIO DEL GRUPO ---");
        System.out.printf("Promedio 1er Trimestre: %.2f\n", (sumaPrimer / 5));
        System.out.printf("Promedio 2do Trimestre: %.2f\n", (sumaSegundo / 5));
        System.out.printf("Promedio 3er Trimestre: %.2f\n", (sumaTercer / 5));


        //Busqueda de alumno especifico
        System.out.println("\n --- Promedio individual --- ");
        while(true) {
            System.out.printf("\nIngrese la posicion del alumno a consultar (0-4) o un numero negativo para salir: ");
            int posicionAlumno = sc.nextInt();
            
            // Condicion de salida
            if (posicionAlumno < 0) {
                System.out.println("Saliendo de la busqueda...");
                break;
            }

            //Validamos que la posicion exista para evitar errores
            if(posicionAlumno >= 0 && posicionAlumno < 5){

                //Calculamos el promedio del alumno sumando sus 3 notas y dividiendo entre 3
                float sumaAlumno = primerTrimestre[posicionAlumno]+
                                   segundoTrimestre[posicionAlumno]+
                                    tercerTrimestre[posicionAlumno];
                float promedioAlumno = sumaAlumno/3;
                System.out.printf("El promedio final del Alumno #"+posicionAlumno+ " es: %.2f\n",promedioAlumno);
            }else{
                System.out.println("Error: La posicion del alumno no es valida");
            }
        }
        sc.close();



    }
}
