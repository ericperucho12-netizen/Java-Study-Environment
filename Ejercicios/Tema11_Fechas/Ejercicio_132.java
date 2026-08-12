package Ejercicios.Tema11_Fechas;
import java.time.LocalTime;
/**
 * ---------------------------------------------------------
 * EJERCICIO 132: HORA ACTUAL
 * ---------------------------------------------------------
 * Conceptos: LocalTime.
 * 
 * Enunciado:
 * Utiliza la clase LocalTime para obtener e imprimir la hora, 
 * minuto, segundo y nanosegundo exacto en el que corre el programa.
 */
public class Ejercicio_132 {
    public static void main(String[] args) {
        LocalTime hora = LocalTime.now();
        System.out.println("La hora actual es: " + hora);
    }
}

