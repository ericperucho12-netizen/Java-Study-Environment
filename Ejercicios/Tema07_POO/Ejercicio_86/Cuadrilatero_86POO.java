package Ejercicios.Tema07_POO.Ejercicio_86;

public class Cuadrilatero_86POO {
    //Atributos
    private float lado1;
    private float lado2;

    //Métodos

    //Metodo constructor 1 (Cuadrilatero)
    public Cuadrilatero_86POO(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Metod constructor 2 (cuadrado)
    public Cuadrilatero_86POO(float lado1) {
        this.lado1 = this.lado2= lado1;
    }

    public float getPerimetro() {
        float perimetro = 2*(lado1 + lado2);
        return perimetro;
    }
    public float getArea() {
        float area = (lado1*lado2);
        return area;
    }

}
