package Ejercicios.Tema05_Matrices;
//Hacer un corazon
public class Ejercicio_75{
    public static void main(String[] args) {
        int n = 6;

        // PARTE SUPERIOR: Las dos "montañas"
        for (int i = n / 2; i <= n; i += 2) {
            // Espacios iniciales
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            // Primer pico del corazón
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Espacio entre los dos picos
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Segundo pico del corazón
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // PARTE INFERIOR: El triángulo invertido centrado
        // i comienza en el ancho total aproximado y va bajando
        for (int i = n; i >= 1; i--) {
            // Espacios para centrar la punta
            // Este bucle crea el margen izquierdo que aumenta en cada fila
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Asteriscos: La fórmula (i*2)-1 genera la forma de triángulo
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
