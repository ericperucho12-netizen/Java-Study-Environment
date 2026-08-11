package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
import java.time.Period;
/**
 * ---------------------------------------------------------
 * EJERCICIO 136: CÁLCULO DE EDAD
 * ---------------------------------------------------------
 * Conceptos: Period.between()
 * 
 * Enunciado:
 * Toma una fecha de nacimiento, comparala con la fecha de hoy
 * usando la clase Period y extrae la cantidad exacta de años
 * de diferencia (es decir, la edad).
 */
public class Ejercicio_136 {
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(2000, 1, 1);
        LocalDate hoy = LocalDate.now();
        Period edad = Period.between(nacimiento, hoy);
        System.out.println("Tienes " + edad.getYears() + " años.");
    }
}

