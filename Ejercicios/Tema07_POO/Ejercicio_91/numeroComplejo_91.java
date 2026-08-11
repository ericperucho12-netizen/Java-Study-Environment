package Ejercicios.Tema07_POO.Ejercicio_91;

public class numeroComplejo_91 {

    private double real;
    private double imag;

    public  numeroComplejo_91(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public numeroComplejo_91 sumar(numeroComplejo_91 c) {
        double r = this.real + c.real;
        double i = this.imag + c.imag;
        return new numeroComplejo_91(r, i);
    }
     public numeroComplejo_91 multiplicar(numeroComplejo_91 c) {
        double r = (this.real * c.real)-(this.imag * c.imag) ;
        double i = (this.real * c.imag)+(this.imag * c.real);
        return new numeroComplejo_91(r, i);
     }
     public boolean esIgual(numeroComplejo_91 c) {
         if (this.real == c.real && this.imag == c.imag) {
             return true;
         } else{
             return false;
     }

     }
     public numeroComplejo_91 multiplicarEntero(int n) {
        double r = this.real * n;
        double i = this.imag * n;
        return new numeroComplejo_91(r, i);
     }
    public String mostrar() {
        return this.real + " + " + this.imag + "i";
    }
}

