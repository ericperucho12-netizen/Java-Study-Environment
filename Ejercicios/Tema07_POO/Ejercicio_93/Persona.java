package Ejercicios.Tema07_POO.Ejercicio_93;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void viajar(){
     System.out.println(nombre+" "+ apellido+ " esta viajando con el equipo.");
 }


    public abstract void entrenar();

    public void jugarPartido(){
        System.out.println(nombre+" esta en el estadio");
    }



}
