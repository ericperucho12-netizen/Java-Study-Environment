/*
*   Pedir 10 numeros
*   Mostrar la media de los numeros positivos,
*   la media de los numero negativos y la cantidad de ceros
* */
package Ejercicios.Tema03_Ciclos;

import java.util.Scanner;

public class Ejercicio_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int num, sumaPos=0, conteoPos=0, //Num positivos
             sumaNeg=0, conteoNeg=0, //Num negativos
             conteoCero=0;

     float  mediaPos=0, mediaNeg=0;

     for(int i=1;i<=10;i++){
         System.out.print("Digite um numero: ");
         num = sc.nextInt();

         if(num==0){
             conteoCero++;
         } else if (num>0) {
             sumaPos+=num;
             conteoPos++;
         }else {
             sumaNeg+=num;
             conteoNeg++;
         }
     }
     //Tratar con los positivos
        if(conteoPos==0){
            System.out.println("No se puede sacar la media de positivos");
        }else {
            mediaPos = (float) sumaPos / conteoPos;
            System.out.println("La media de los numeros positivos es: " + mediaPos);
        }
        if(conteoNeg==0){
            System.out.println("No se puede sacar la media de negativos");
        }
        else{
            mediaNeg = (float) sumaNeg / conteoNeg;
            System.out.println("La media de los numeros negativos es: " + mediaNeg);

        }
        System.out.println("La cantidad de ceros es: " + conteoCero);

    }
}

