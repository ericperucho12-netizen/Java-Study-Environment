package Ejercicios.Tema07_POO.Ejercicio_94;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre);
    }
    
    // @Override indica al compilador que estamos SOBRESCRIBIENDO 
    // el método de la clase padre
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }
}
