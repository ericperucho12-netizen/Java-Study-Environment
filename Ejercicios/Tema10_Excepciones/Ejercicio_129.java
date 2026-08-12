package Ejercicios.Tema10_Excepciones;
/**
 * ---------------------------------------------------------
 * EJERCICIO 129: PROPAGACIÓN (THROWS)
 * ---------------------------------------------------------
 * Conceptos: throws en la firma del método.
 * 
 * Enunciado:
 * Si un método sabe que puede fallar pero no quiere manejar el 
 * error, puede pasarle la responsabilidad a quien lo llamó
 * escribiendo 'throws Exception' al lado de su nombre.
 */
public class Ejercicio_129 {
    // throws avisa a quien llame que este método puede fallar
    public static void metodoPeligroso() throws Exception {
        throw new Exception("Bomba");
    }
    public static void main(String[] args) {
        try {
            metodoPeligroso();
        } catch (Exception e) {
            System.out.println("Desactivando bomba: " + e.getMessage());
        }
    }
}

