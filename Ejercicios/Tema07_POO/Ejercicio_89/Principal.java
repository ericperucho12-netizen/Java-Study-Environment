/*
*Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caracterizados
*por su numero de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera
*/


package Ejercicios.Tema07_POO.Ejercicio_89;
import static Ejercicios.Tema07_POO.Ejercicio_89.Atletas_89.indiceGanador;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int atletas,numeroAtleta;
        float time;
        String name;


        System.out.print("Ingrese el numero de atletas a insertar: ");
        atletas = sc.nextInt();
        Atletas_89 numAtletas[]=new Atletas_89[atletas];

        for(int i=0;i<atletas;i++){
            System.out.println("Digite al atleta "+ (i+1)+": ");
            System.out.print("Introduce el numero del atleta: ");
            numeroAtleta = sc.nextInt();
            sc.nextLine();

            System.out.print("Introduce el nombre del atleta : ");
            name = sc.nextLine();
            System.out.print("Introduce el tiempo del atleta : ");
            time = sc.nextFloat();

            numAtletas[i] = new Atletas_89(numeroAtleta,name,time);
        }
        int indice = indiceGanador(numAtletas); // Llamamos al método
        System.out.println("\nEl atleta Ganador es: ");
        // Usamos 'numAtletas' que es como llamaste a tu arreglo al principio
        System.out.println(numAtletas[indice].mostrarDatos());




    }
}
