/*
* Construir un programa para trabajar con 2 números complejos, implemente el siguiente menu:
*
* Sumar dos números complejos
* Multiplicar 2 Números Complejos
* Comparar 2 Números complejos (iguales o no)
* Multiplicar un número complejo por un entero
*
* */

package Ejercicios.Tema07_POO.Ejercicio_91;



import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double r, i;
    int opcion, entero;

        System.out.println("--- Primer Número complejo ---");
        System.out.print("Parte real: ");
        r = sc.nextDouble();
        System.out.print("Parte imaginaria: ");
        i = sc.nextDouble();
        numeroComplejo_91 n1=new numeroComplejo_91(r,i);

        System.out.println("--- Segundo Número complejo ---");
        System.out.print("Parte real: ");
        r = sc.nextDouble();
        System.out.print("Parte imaginaria: ");
        i = sc.nextDouble();
        numeroComplejo_91 n2=new numeroComplejo_91(r,i);

        do{
            System.out.println("\n---Menu ---");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar complejo");
            System.out.println("3. Comparar");
            System.out.println("4. Multiplicar por entero");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    numeroComplejo_91 suma = n1.sumar(n2);
                    System.out.println("Resultado: " + suma.mostrar());
                    break;
                case 2:
                    numeroComplejo_91 multi = n1.multiplicar(n2);
                    System.out.println("Resultado: " + multi.mostrar());
                    break;
                case 3:
                    if (n1.esIgual(n2))
                        System.out.println("Los números son iguales?: " + n1.esIgual(n2));
                    else{
                        System.out.println("Los números son iguales?: " + n1.esIgual(n2));
                }
                    break;
                case 4:
                    System.out.print("Digite el numero entero a multiplicar: ");
                    entero = sc.nextInt();
                    numeroComplejo_91 multiplicarEntero = n1.multiplicarEntero(entero);
                    System.out.println("Resultado: " + multiplicarEntero.mostrar());
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                    default:
                        System.out.println("Opcion no valida");
            }

        }while (opcion!=5);


    }
}
