package Ejercicios.Tema07_POO.Ejercicio_88;

    public class Vehiculo_88 {
    private String marca;
    private String modelo;
    private float precio;


    //Contructor
        public Vehiculo_88(float precio, String modelo, String marca) {
            this.precio = precio;
            this.modelo = modelo;
            this.marca = marca;
        }

        public float getPrecio() {
            return precio;
        }
        public String mostrarDatos(){
            return "\nMarca: "+marca+ "\nModelo: "+modelo+"\nPrecio:"+precio+"\n";

        }

        public static int indiceCocheMBarato(Vehiculo_88 coches[]){
            float precio;
            int indice=0;

            precio=coches[0].getPrecio();
            for(int i=1;i<coches.length;i++){
                if(coches[i].getPrecio()<precio){
                    precio=coches[i].getPrecio();
                    indice=i;
                }
            }
            return indice;
        }



    }
