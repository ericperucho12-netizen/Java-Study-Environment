package Ejercicios.Tema07_POO.Ejercicio_93;

public class  Entrenador extends Persona {
    private String estrategia;


    public Entrenador(String nombre, int edad, String apellido, String estrategia) {
        super(nombre, edad, apellido);
        this.estrategia =estrategia;
    }
    public void planificarEntrenamiento(){
        System.out.println(nombre+ " esta planificando con la estrategia: " + estrategia);
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " " + apellido + " está dirigiendo el entrenamiento táctico.");
    }
    @Override
    public void jugarPartido() {
        System.out.println(nombre + " " + apellido + " está dando instrucciones tácticas desde la banca.");
    }

    public void darEntrevista(){
        System.out.println(nombre + " " + apellido + " está en la rueda de prensa oficial.");
    }

}
