/*
*Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los atributos
*necesarios que se requieren, proporcione métodos de consulta, un método constructor e implemente
*métodos para calcular el perímetro y el área de un triangulo, además implementar un método que a partir
*de un arreglo de triángulo devuelva el área del triángulo de mayor superficie.
*/
package Ejercicios.Tema07_POO.Ejercicio_90;



import java.util.Scanner;

public class Principal {
    public static double mayorArea(Triangulos_Isosceles_90 triangulo[]){
        double area;
        area = triangulo[0].calcularArea();
        for (int i = 1; i < triangulo.length; i++){
            if (triangulo[i].calcularArea() > area){
                area = triangulo[i].calcularArea();
            }
        }
            return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado,base;
        int nTriangulos;

        System.out.print("Digite el numero de triangulos:  ");
        nTriangulos = input.nextInt();

        Triangulos_Isosceles_90 triangulos[]=new Triangulos_Isosceles_90[nTriangulos];
        for(int i=0;i<nTriangulos;i++){
            System.out.println("\nDigite el numero de la triangulo "+(i+1)+":");
            System.out.print("Digite el valor de base:  ");
            base = input.nextDouble();
            System.out.print("Digite el valor de lado:  ");
            lado = input.nextDouble();

            triangulos[i]=new Triangulos_Isosceles_90(base,lado);
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].calcularPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].calcularArea());

        }
        System.out.println("\nEl area del triangulo mayor area es: "+mayorArea(triangulos));


    }
}
