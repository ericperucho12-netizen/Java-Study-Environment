package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
/**
 * ---------------------------------------------------------
 * EJERCICIO 137: SUMAR Y RESTAR DÍAS
 * ---------------------------------------------------------
 * Conceptos: plusDays, minusMonths.
 * 
 * Enunciado:
 * Demuestra lo fácil que es hacer matemáticas con fechas en 
 * Java sumando 15 días a la fecha actual y restando 1 mes.
 */
public class Ejercicio_137 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy: " + hoy);
        System.out.println("Dentro de 15 días: " + hoy.plusDays(15));
        System.out.println("Hace 1 mes: " + hoy.minusMonths(1));
    }
}

