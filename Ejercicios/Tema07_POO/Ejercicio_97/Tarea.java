package Ejercicios.Tema07_POO.Ejercicio_97;

public class Tarea {
    private String descripcion;
    private boolean completada;
    
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }
    
    public void marcarCompletada() {
        this.completada = true;
    }
    
    public String getEstado() {
        return completada ? "[X] " + descripcion : "[ ] " + descripcion;
    }
}
