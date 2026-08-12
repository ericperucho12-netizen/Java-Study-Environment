package Ejercicios.Tema11_Fechas;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * ---------------------------------------------------------
 * EJERCICIO 134: FORMATEO PERSONALIZADO
 * ---------------------------------------------------------
 * Conceptos: DateTimeFormatter.
 * 
 * Enunciado:
 * Por defecto, Java usa el formato Año-Mes-Día (YYYY-MM-DD).
 * Utiliza DateTimeFormatter para mostrar la fecha al estilo 
 * latino/español (Día/Mes/Año).
 */
public class Ejercicio_134 {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha formateada (España/Latam): " + hoy.format(formato));
    }
}

