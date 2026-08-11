/*
Construir un programa que calcule el área y el perímetro de un cuadrilátero
dada la longitud de sus dos lados. Los valores de la longitud deberán introducirse
por línea de ordenes. Si es un cuadrado, sólo se proporcionará la longitud de uno de
uno de los lados al constructor.
*/
package Ejercicios.Tema07_POO.Ejercicio_86;




import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Cuadrilatero_86POO c1;
        float lado1,lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado 1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese lado 2: "));

        if(lado1==lado2){// Es un cuadrado
            c1= new Cuadrilatero_86POO(lado1);
        }
        else{
            c1=new Cuadrilatero_86POO(lado1,lado2);
        }
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }

}
