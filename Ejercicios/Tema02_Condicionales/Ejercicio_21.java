/*
"Desarrollar un programa que simule el funcionamiento de un
cajero automático con un saldo inicial de 1,000 dólares.
El sistema debe presentar un menú interactivo con las siguientes opciones:

1.-Ingresar dinero: Sumar una cantidad al saldo actual.
2.-Retirar dinero: Restar una cantidad al saldo (validando que
existan fondos suficientes).
3.-Salir: Finalizar la ejecución del programa."
*/


package Ejercicios.Tema02_Condicionales;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float Saldo_Inicial = 1000;
        float ingreso, retiro, saldoActual=Saldo_Inicial;
        int opcion;

        System.out.println("---Cajero automatico---");
        System.out.println("1. Ingresar dinero a la cuenta"+
                "\n2.Retirar dinero de la cuenta"+
                "\n3.Salir");
        System.out.print("Eliga una opcion: ");
        opcion= sc.nextInt();

        switch(opcion){
            case 1:
                System.out.print("Digite la cantidad de dinero a ingresar: ");
                ingreso = sc.nextFloat();
                saldoActual +=ingreso;
                System.out.printf("Saldo actual: R$ %.2f",saldoActual);
                break;
            case 2:
                System.out.print("Digite la cantidad de dinero a retirar: ");
                retiro = sc.nextFloat();
                //Validacion: No puede ratirar mas de lo que tienes
                if(retiro<=saldoActual){
                    saldoActual -=retiro;
                    System.out.printf("Rerito exitoso: Su saldo Restante es: %.2f\n",saldoActual);
                }else{
                    System.out.println("Saldo insuficiente");
                }
                break;
            case 3:
                System.out.println("Gracias por usar el sistema");
                break;
                default:
                    System.out.println("Opcion no válida. Intente de nuevo");
        }
        sc.close();

    }
}
