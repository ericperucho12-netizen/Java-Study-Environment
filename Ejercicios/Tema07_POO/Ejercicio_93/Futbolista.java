package Ejercicios.Tema07_POO.Ejercicio_93;

public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;


    public Futbolista(String nombre, int edad, String apellido, int dorsal, String posicion) {
        super(nombre, edad, apellido);
        this.dorsal =dorsal;
        this.posicion = posicion;
    }
    @Override
    public void jugarPartido(){
        System.out.println(nombre+ " esta jugando el partido en la posicion de " + posicion);
    }
    @Override
    public void entrenar(){
        System.out.println(nombre+ " " + apellido + " está realizando ejercicios con balón y carrera.");

    }
    public void darEntrevista() {
        System.out.println(nombre + " " + apellido + " está respondiendo preguntas sobre el partido.");
    }

}
