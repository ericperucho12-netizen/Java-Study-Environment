package Ejercicios.Tema07_POO.Ejercicio_96;

public class Motor {
    private String tipo;
    private int caballosFuerza;
    
    public Motor(String tipo, int caballosFuerza) {
        this.tipo = tipo;
        this.caballosFuerza = caballosFuerza;
    }
    
    public void encender() {
        System.out.println("El motor " + tipo + " de " + caballosFuerza + " HP está encendido.");
    }
}
