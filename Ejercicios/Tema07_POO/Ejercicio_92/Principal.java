/*
* Hacer un programa para clacular el área de Polígonos (Triangulos y rectangulos) el
* programa debe ser capaz de almacenar en un arreglo N Triangulos y rectangulos, y al final
* mostrar el área y los datos de cada uno. para ello se tendrá lo siguiente:
*
*  -Una super calse llamada poligono
*  -Una sub clase llamada rectangulo
*  -Una sub clase llamada triangulo
*/
package Ejercicios.Tema07_POO.Ejercicio_92;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        //Llenar un poligono
        llenarPoligono();
        //Mostrar los datos y el area de cada poligono
        mostrarResultados();
    }


    public static void llenarPoligono(){
      int opcion;
      char respuesta;
        do{
            do {
                System.out.println("Digite que poligono desea: ");
                System.out.println("1.Triangulo");
                System.out.println("2.Rectangulo");
                System.out.print("Opcion: ");
                opcion = input.nextInt();
            }while(opcion<1||opcion>2);

            switch(opcion){
                case 1:llenarTriangulo();//llenar un triangulo
                    break;
                case 2:llenarRectangulo();//llenar un rectangulo
                    break;
            }

            System.out.println("Desea introducir otro poligono?(s/n):  ");
            respuesta = input.next().charAt(0);
            System.out.println("");
        }while(respuesta =='s'|| respuesta =='S');
    }

    public static void llenarTriangulo(){
        double lado1, lado2, lado3;

        System.out.print("\nDigite el lado 1 del triangulo: ");
        lado1 = input.nextDouble();
        System.out.print("Digite el lado 2 del triangulo: ");
        lado2 = input.nextDouble();
        System.out.print("Digite el lado 3 del triangulo: ");
        lado3 = input.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        poligonos.add(triangulo);

    }

    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.print("\nDigite el lado 1 del rectangulo: ");
        lado1 = input.nextDouble();
        System.out.print("Digite el lado 2 del rectangulo: ");
        lado2 = input.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligonos.add(rectangulo);
    }

    public static void mostrarResultados(){
        //Mostrar
        for(Poligono poli: poligonos){
            System.out.println(poli.toString());
            System.out.println("Area= "+ poli.area());
            System.out.println("");
        }
    }

}
