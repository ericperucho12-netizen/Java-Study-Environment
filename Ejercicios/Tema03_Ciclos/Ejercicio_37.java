/*
    Dadas las edades y alturas de 5 alumnos, mostrar la edad y
    la estatura media, la cantidad de alumnos mayores de 18 años,
    y la cantidad de alumnos que miden más de 1.75
*/
package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_37 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        // Variable declaration
        int age, countAdults = 0, countTallStudents = 0;
        float height, sumAge = 0, sumHeight = 0;
        float averageAge, averageHeight;

        System.out.println("--- Student Data System ---");
        for(int i=1;i<=5;i++) {
            System.out.println("\nData for Student #" + i + ":");
            System.out.println("Enter age: ");
            age = input.nextInt();
            sumAge+=age;
            System.out.println("Enter height (meters): ");
            height = input.nextFloat();
            sumHeight+=height;

            //Logic filters
            if(age > 18) {
                countAdults++;
            }
            if(height>1.75f) {
                countTallStudents++;
            }

        }
        averageAge= sumAge/5;
        averageHeight= sumHeight/5;
        // Output results
        System.out.println("\n--- Statistical Report ---");
        System.out.printf("Average Age: %.2f years\n", averageAge);
        System.out.printf("Average Height: %.2f meters\n", averageHeight);
        System.out.println("Students older than 18: " + countAdults);
        System.out.println("Students taller than 1.75m: " + countTallStudents);

        input.close();

    }
}
