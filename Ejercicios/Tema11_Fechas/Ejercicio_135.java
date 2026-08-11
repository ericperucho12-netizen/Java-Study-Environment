package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
/**
 * ---------------------------------------------------------
 * EJERCICIO 135: CREAR FECHA ESPECÍFICA
 * ---------------------------------------------------------
 * Conceptos: LocalDate.of()
 * 
 * Enunciado:
 * Crea una variable de fecha que no sea la de "hoy", sino una 
 * fecha inventada por ti (por ejemplo, tu fecha de nacimiento) 
 * utilizando LocalDate.of().
 */
public class Ejercicio_135 {
    public static void main(String[] args) {
        LocalDate nacimiento = LocalDate.of(1995, 5, 23);
        System.out.println("Nací el: " + nacimiento);
    }
}

