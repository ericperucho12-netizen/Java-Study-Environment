package Ejercicios.Tema07_POO.Ejercicio_89;
//Atributos
public class Atletas_89 {
private int numeroAtleta;
private String nombre;
private float tiempo;

//Constructor
    public Atletas_89(int numeroAtleta, String nombre, float tiempo) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getNumeroAtleta() {
        return numeroAtleta;
    }
    public String getNombre() {
        return nombre;
    }
    public float getTiempo() {
        return tiempo;
    }

    public String mostrarDatos(){
        return "\nNombre: "+  nombre+"\nNumero de Atleta:  "+numeroAtleta+"\nTiempo: "+tiempo;
    }


    public static int indiceGanador(Atletas_89 atletas[]){
        int indiceGanador=0;
        float tiempoMasRapido = atletas[0].getTiempo();

        for(int i=1;i<atletas.length;i++){
            if(atletas[i].getTiempo()<tiempoMasRapido){
                indiceGanador=i;
            }
        }
        return indiceGanador;
    }
}
