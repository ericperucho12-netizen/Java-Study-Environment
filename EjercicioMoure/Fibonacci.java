/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
package EjercicioMoure;

public class Fibonacci {
    public static void main(String[] args) {

        long n1=0;//Primer numero
        long n2=1;//Segundo numero

        for(int i=1;i<=50;i++){
            //1.Imprimimos el numero actual
            System.out.println(i+": "+n2);
            //2.Calculamos el siguiente sumando los dos anteriores
            long suma =n1 + n2;

            //3.Desplazamos los valores para la siguiente vuelta
            n1=n2;//El que era 2Do ahora es 1ro
            n2=suma;//El nuevo resultado ahora es el 2do
        }

    }


    }

