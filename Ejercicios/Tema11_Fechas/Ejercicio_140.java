package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
/**
 * ---------------------------------------------------------
 * EJERCICIO 140: COMPROBAR AÑO BISIESTO
 * ---------------------------------------------------------
 * Conceptos: isLeapYear.
 * 
 * Enunciado:
 * Las nuevas clases de fechas traen herramientas increíbles.
 * Usa el método isLeapYear() para comprobar automáticamente 
 * si el año actual es bisiesto.
 */
public class Ejercicio_140 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        if (hoy.isLeapYear()) {
            System.out.println("Este año ES bisiesto.");
        } else {
            System.out.println("Este año NO es bisiesto.");
        }
    }
}

