package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
/**
 * ---------------------------------------------------------
 * EJERCICIO 131: FECHA ACTUAL
 * ---------------------------------------------------------
 * Conceptos: LocalDate.
 * 
 * Enunciado:
 * Utiliza la moderna clase LocalDate (introducida en Java 8)
 * para obtener e imprimir la fecha exacta de hoy.
 */
public class Ejercicio_131 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("La fecha de hoy es: " + hoy);
    }
}

