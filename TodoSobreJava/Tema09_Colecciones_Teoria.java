package TodoSobreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ============================================================================
 * GUÍA MAESTRA: JAVA COLLECTIONS FRAMEWORK
 * ============================================================================
 * 
 * 1. ¿QUÉ SON LAS COLECCIONES?
 * ----------------------------------------------------------------------------
 * Las colecciones son estructuras de datos dinámicas. Reemplazan a los 
 * arreglos nativos [] porque pueden crecer y encogerse de tamaño sin 
 * romper el programa, y vienen con decenas de métodos útiles.
 * 
 * 2. LAS 3 FAMILIAS PRINCIPALES:
 * ----------------------------------------------------------------------------
 * 
 * A) LIST (Listas) - Clases: ArrayList, LinkedList
 *    - Mantienen el orden en que metiste los datos.
 *    - Se accede a ellas por un índice (0, 1, 2...).
 *    - ¡SÍ permiten elementos duplicados!
 *    - Usa ArrayList para casi todo. Usa LinkedList si vas a borrar o 
 *      añadir muchísimos datos al inicio de la lista.
 * 
 * B) SET (Conjuntos) - Clases: HashSet, TreeSet
 *    - ¡NO PERMITEN DUPLICADOS! Si metes "Juan" dos veces, ignora el segundo.
 *    - NO tienen un orden específico (es como una bolsa revuelta de datos).
 *    - No tienen índices.
 *    - Úsalo para buscar datos rapidísimo o filtrar repetidos.
 * 
 * C) MAP (Diccionarios) - Clases: HashMap, TreeMap
 *    - Guardan la información en parejas: CLAVE -> VALOR.
 *    - Ejemplo: ID "123" -> Nombre "Eric".
 *    - Las claves no se pueden repetir, los valores sí.
 *    - (Ojo: Map no hereda técnicamente de Collection, pero es parte del framework).
 */

public class Tema09_Colecciones_Teoria {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA DE COLECCIONES ===\n");
        
        // --- 1. LIST (ArrayList) ---
        // Ideal para listas ordenadas y predecibles.
        List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Pera");
        lista.add("Manzana"); // Permite repetidos
        System.out.println("LIST (Ordenada, con repetidos): " + lista);
        
        
        // --- 2. SET (HashSet) ---
        // Ideal para colecciones únicas sin repetidos.
        Set<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Pera");
        conjunto.add("Manzana"); // ¡LO IGNORA!
        System.out.println("SET (Sin orden, sin repetidos): " + conjunto);
        
        
        // --- 3. MAP (HashMap) ---
        // Ideal para bases de datos pequeñas o agendas.
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1001, "Empleado Eric");
        mapa.put(1002, "Empleado Ana");
        System.out.println("MAP (Clave-Valor):");
        System.out.println("  ID 1001 -> " + mapa.get(1001));
    }
}

