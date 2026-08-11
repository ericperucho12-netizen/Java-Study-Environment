package Ejercicios.Tema07_POO.Ejercicio_95;

/**
 * ---------------------------------------------------------
 * INTERFAZ
 * ---------------------------------------------------------
 * Una interfaz es como un contrato. Todos los que "firmen"
 * este contrato (implementen la interfaz) ESTÁN OBLIGADOS
 * a crear los métodos definidos en ella.
 */
public interface Figura {
    // En las interfaces, los métodos solo se declaran, no tienen cuerpo (no tienen { })
    public double calcularArea();
}
