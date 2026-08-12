package TodoSobreJava;

/**
 * ============================================================================
 * GUÍA MAESTRA: GENÉRICOS (GENERICS <T>)
 * ============================================================================
 * 
 * 1. ¿QUÉ SON LOS GENÉRICOS?
 * ----------------------------------------------------------------------------
 * Si creas una clase 'Caja' para guardar un String, luego necesitarás otra 
 * 'CajaInt' para guardar un entero, y otra 'CajaPerro' para guardar un Perro.
 * 
 * ¡Eso es duplicar código! Los genéricos te permiten poner un "comodín" <T>
 * (que significa Type) en la clase, para que quien la use decida qué tipo 
 * de dato va a guardar dentro.
 * 
 * 2. REGLA PRINCIPAL
 * ----------------------------------------------------------------------------
 * Los genéricos SOLO funcionan con OBJETOS, no con primitivos.
 * No puedes usar <int> ni <double>. Debes usar sus clases envolventes 
 * <Integer> y <Double>.
 * 
 * 3. NOMENCLATURA COMÚN
 * ----------------------------------------------------------------------------
 * <T> = Type (Un tipo de dato cualquiera)
 * <E> = Element (Un elemento de una colección, usado en ArrayList<E>)
 * <K, V> = Key, Value (Usado en HashMap<K, V>)
 */

// Esta es una Clase Genérica. La <T> se reemplazará por el tipo que tú elijas.
class CajaMagica<T> {
    private T contenido;
    
    public void meter(T algo) {
        this.contenido = algo;
    }
    
    public T sacar() {
        return this.contenido;
    }
}

public class Tema18_Genericos_Teoria {
    public static void main(String[] args) {
        System.out.println("=== TEORÍA: GENÉRICOS <T> ===\n");
        
        // Creamos una caja que SOLO acepta Strings
        CajaMagica<String> cajaDeTexto = new CajaMagica<>();
        cajaDeTexto.meter("Un secreto guardado.");
        System.out.println("Caja 1 tiene: " + cajaDeTexto.sacar());
        
        // Usamos la MISMA CLASE, pero ahora para números
        CajaMagica<Integer> cajaFuerte = new CajaMagica<>();
        cajaFuerte.meter(12345);
        System.out.println("Caja 2 tiene: " + cajaFuerte.sacar());
        
        // cajaDeTexto.meter(100); -> ¡ERROR DE COMPILACIÓN! (Protección activa)
    }
}