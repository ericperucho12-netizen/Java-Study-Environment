/*
 * Escribe un programa que se encargue de comprobar si un número
 * es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
package EjercicioMoure;

public class Es_un_numero_primo {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if(esPrimo(i)){
                System.out.println(i+" ");
            }
        }
    }


    public static boolean esPrimo(int numero) {

        if(numero<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(numero);i++){
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }

}