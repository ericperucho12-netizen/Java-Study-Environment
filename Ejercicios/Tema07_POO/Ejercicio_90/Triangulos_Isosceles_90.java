package Ejercicios.Tema07_POO.Ejercicio_90;

public class Triangulos_Isosceles_90 {
        private double base;
        private double lado;

    public Triangulos_Isosceles_90(double base, double lado) {
        this.base = base;
        this.lado = lado;

    }
    public double calcularPerimetro() {
        double perimetro = 2*base+lado;
        return perimetro;
    }
    public double calcularArea() {
        double area = (base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
        return area;
    }

}
