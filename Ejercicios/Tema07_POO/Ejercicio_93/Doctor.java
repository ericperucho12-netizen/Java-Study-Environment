package Ejercicios.Tema07_POO.Ejercicio_93;

public class Doctor extends Persona {
    private String titulacion;
    private int years;

    public Doctor(String nombre, int edad, String apellido, String titulacion, int years) {
        super(nombre, edad, apellido);
        this.titulacion = titulacion;
        this.years = years;
    }
    public void curarLesion(){
        System.out.println("El doctor " + nombre + " está curando a un jugador usando su título en " + titulacion);
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " " + apellido + " está supervisando la hidratación y salud en el entrenamiento.");
    }
    @Override
    public void jugarPartido() {
        System.out.println(nombre + " está en la banca con el botiquín listo.");
    }
}
