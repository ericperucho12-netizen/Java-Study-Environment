package Ejercicios.Tema07_POO.Ejercicio_95;

/**
 * Usamos 'implements' para decir que Circulo firma el contrato de Figura
 */
public class Circulo implements Figura {
    
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Como firmamos el contrato de Figura, ESTAMOS OBLIGADOS
    // a programar cómo funciona el método calcularArea().
    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }
}
