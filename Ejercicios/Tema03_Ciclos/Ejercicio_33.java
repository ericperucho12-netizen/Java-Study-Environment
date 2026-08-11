/*
Diseñar un programa que muestre el producto (Multiplicación)
de los 10 primeros numeros impares

*/
package Ejercicios.Tema03_Ciclos;

public class Ejercicio_33 {
    public static void main(String[] args) {
        long producto=1;

        for(int i=1;i<=10;i+=2){
            int oddNumber=(2*i)-1;
            producto*=oddNumber;

        }
        System.out.println("El producto es: "+producto);
    }
}
