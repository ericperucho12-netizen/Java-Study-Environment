package Ejercicios.Tema07_POO.Ejercicio_94;

public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau miau!");
    }
}
