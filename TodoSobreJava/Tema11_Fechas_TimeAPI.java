package TodoSobreJava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * ============================================================================
 * GUÍA MAESTRA: FECHAS (JAVA 8 TIME API)
 * ============================================================================
 * 
 * 1. EL VIEJO PROBLEMA (java.util.Date)
 * ----------------------------------------------------------------------------
 * Antes de Java 8, manejar fechas era un dolor de cabeza. La clase 'Date' 
 * era "Mutable" (fácil de alterar por accidente), los años empezaban en 1900 
 * y los meses empezaban en 0 (enero = 0). ¡Una locura!
 * 
 * 2. LA SOLUCIÓN: JAVA TIME API
 * ----------------------------------------------------------------------------
 * A partir de Java 8, se creó un paquete completamente nuevo (java.time)
 * basado en tres clases principales que son INMUTABLES y muy fáciles de leer:
 * 
 * - LocalDate: Maneja solo FECHA (Año-Mes-Día). Ej. "2025-05-23"
 * - LocalTime: Maneja solo HORA (Horas:Minutos:Segundos). Ej. "14:30:00"
 * - LocalDateTime: Maneja la combinación de ambas.
 * 
 * 3. ZONAS HORARIAS
 * ----------------------------------------------------------------------------
 * Si estás desarrollando un sistema internacional, no usas LocalDateTime, 
 * sino 'ZonedDateTime' para saber qué hora es exactamente en "Asia/Tokyo"
 * o "America/Mexico_City".
 */

public class Tema11_Fechas_TimeAPI {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE FECHAS (JAVA TIME API) ===\n");
        
        // 1. Obtener los datos del instante actual (.now)
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        
        System.out.println("Formato estándar ISO:");
        System.out.println("-> " + fechaActual);
        System.out.println("-> " + horaActual);
        
        // 2. Manipular fechas
        // ¡Al ser inmutables, plusDays devuelve un NUEVO LocalDate!
        LocalDate enUnaSemana = fechaActual.plusDays(7);
        LocalDate elMesPasado = fechaActual.minusMonths(1);
        
        System.out.println("\nDentro de una semana será: " + enUnaSemana);
        System.out.println("El mes pasado estábamos a: " + elMesPasado);
        
        // 3. Darles un formato amigable para humanos
        DateTimeFormatter español = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy");
        System.out.println("\nFormato hermoso: " + fechaActual.format(español));
    }
}

