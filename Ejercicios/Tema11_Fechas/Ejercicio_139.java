package Ejercicios.Tema11_Fechas;
import java.time.ZoneId;
import java.time.ZonedDateTime;
/**
 * ---------------------------------------------------------
 * EJERCICIO 139: ZONAS HORARIAS
 * ---------------------------------------------------------
 * Conceptos: ZonedDateTime, ZoneId.
 * 
 * Enunciado:
 * Crea un reloj mundial básico obteniendo la hora exacta en 
 * una zona horaria diferente (ej. Asia/Tokyo).
 */
public class Ejercicio_139 {
    public static void main(String[] args) {
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Hora en Tokyo: " + tokyo);
    }
}

