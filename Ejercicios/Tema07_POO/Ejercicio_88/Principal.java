/*
Construir un programa que dada una serie de vehículos caracterizados por su marca,
modelo y precio, imprima las propiedades del vehículo más barato. Para ello,
se deberán leer por teclado las caracteríscticas de cada vehículo y crear una clase
que represente a cada uno de ellos.
*/


package Ejercicios.Tema07_POO.Ejercicio_88;



import java.util.Scanner;

import static Ejercicios.Tema07_POO.Ejercicio_88.Vehiculo_88.indiceCocheMBarato;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String marca, modelo;
        float precio;
        int numerVehiculos,indiceBarato;

        System.out.print("Digite la cantidad de vehiculos: ");
        numerVehiculos = sc.nextInt();

        Vehiculo_88 coche[]=new Vehiculo_88[numerVehiculos];
        for (int i=0;i< coche.length;i++){
            sc.nextLine();
            System.out.println("Digite las caracteristicas del coche "+ (i+1)+": ");
            System.out.print("Introduce la marca: ");
            marca = sc.nextLine();
            System.out.print("Introduce la modelo: ");
            modelo = sc.nextLine();
            System.out.print("Introduce la precio: ");
            precio = sc.nextFloat();

            coche[i]=new Vehiculo_88(precio,modelo,marca);
        }
        indiceBarato = indiceCocheMBarato(coche);{
            System.out.println("\nEl coche mas barato es: ");
            System.out.println(coche[indiceBarato].mostrarDatos());
        }

    }
}
