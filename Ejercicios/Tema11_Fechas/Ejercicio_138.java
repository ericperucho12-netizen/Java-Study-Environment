package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
/**
 * ---------------------------------------------------------
 * EJERCICIO 138: COMPARAR FECHAS
 * ---------------------------------------------------------
 * Conceptos: isBefore, isAfter.
 * 
 * Enunciado:
 * Crea dos fechas distintas y utiliza los métodos booleanos
 * isBefore e isAfter para saber cronológicamente cuál ocurrió primero.
 */
public class Ejercicio_138 {
    public static void main(String[] args) {
        LocalDate f1 = LocalDate.of(2025, 1, 1);
        LocalDate f2 = LocalDate.of(2026, 1, 1);
        System.out.println("¿f1 es antes de f2? " + f1.isBefore(f2));
        System.out.println("¿f1 es después de f2? " + f1.isAfter(f2));
    }
}

