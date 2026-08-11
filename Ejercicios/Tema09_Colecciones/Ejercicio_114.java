package Ejercicios.Tema09_Colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * ---------------------------------------------------------
 * EJERCICIO 114: MAP Y HASHMAP (DICCIONARIOS)
 * ---------------------------------------------------------
 * Conceptos: Estructura Clave-Valor (Key-Value).
 * 
 * Enunciado:
 * Un Map no hereda de Collection. Funciona almacenando datos en
 * pares: una CLAVE (única) que apunta a un VALOR. Es perfecto
 * para agendas, catálogos, configuraciones, etc.
 */
public class Ejercicio_114 {
    public static void main(String[] args) {
        System.out.println("=== DICCIONARIOS CON HASHMAP ===");
        
        // Map<TipoClave, TipoValor>
        // Clave: DNI (String), Valor: Nombre (String)
        Map<String, String> agenda = new HashMap<>();
        
        // Para agregar usamos .put() en lugar de .add()
        agenda.put("111111A", "Eric Pérez");
        agenda.put("222222B", "Ana López");
        agenda.put("333333C", "Carlos Ruiz");
        
        // Para recuperar un dato usamos su CLAVE
        String persona = agenda.get("222222B");
        System.out.println("La persona con DNI 222222B es: " + persona);
        
        // Si usamos una clave que ya existe, SOBRESCRIBE el valor
        agenda.put("111111A", "Eric Pérez (Actualizado)");
        System.out.println("Valor actualizado de 111111A: " + agenda.get("111111A"));
        
        // Recorrer un HashMap (es un poco distinto)
        System.out.println("\n--- Toda la Agenda ---");
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.println("DNI: " + entrada.getKey() + " -> Nombre: " + entrada.getValue());
        }
    }
}
