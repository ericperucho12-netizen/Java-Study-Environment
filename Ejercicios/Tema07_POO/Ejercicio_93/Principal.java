/*
* Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor), para
* lo cual tendremos lo siguiente:
*
* -Una super clase Persona, que tendrá los siguientes datos: nombre, apellido, edad.
* -La sub clase Futbolista tendrá los siguiente datos: dorsal y posición
* -La sub clase Entrenador tendrá de datos la estrategia que utiliza.
* -La sub clase Doctor, la titulación y los años de experiencia
*
* Hacer un menú donde se tenga las siguientes opciones: Viaje de equipo, entrenamiento, partido
* de futbol, planificar entrenamiento, entrevista, curar lesión.
*/
package Ejercicios.Tema07_POO.Ejercicio_93;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Persona> personas = new ArrayList<Persona>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        llenarEquipo();
        menu();

    }



    public static void llenarEquipo(){
        int tipo, edad,cantidad;
        int dorsal;
        String nombre,apellido,posicion;


        System.out.print("¿Cuántas personas desea ingresar?: ");
        cantidad = input.nextInt(); // Guardamos cuántos vamos a registrar
        input.nextLine(); // Limpieza de buffer

        for(int i=0;i<cantidad;i++) {
            System.out.println("\n¿Qué tipo de integrante desea registrar?");
            System.out.println("1. Futbolista / 2. Entrenador / 3. Doctor");
            tipo = input.nextInt();
            input.nextLine(); // Limpiar el buffer

            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Apellido: ");
            apellido = input.nextLine();
            System.out.print("Edad: ");
            edad = input.nextInt();
            input.nextLine();

            if(tipo==1){
                System.out.print("Dorsal: ");
                dorsal = input.nextInt();
                System.out.print("Posición: ");
                posicion = input.nextLine();
                input.nextLine();
                personas.add(new Futbolista(nombre,edad,apellido,dorsal,posicion));
            }else if(tipo==2){
                System.out.print("Estrategia: ");
                String estrategia = input.nextLine();
                personas.add(new Entrenador(nombre,edad,apellido,estrategia));
            }else if(tipo==3){
                System.out.print("Titulacion: ");
                String titulacion = input.nextLine();
                System.out.print("Años: ");
                int years = input.nextInt();
                input.nextLine();
                personas.add(new Doctor(nombre,edad,apellido,titulacion,years));

            }

        }



    }

    //Menu
    public static void menu(){
        char respuesta;
        int opcion;
        do{
            do{
                System.out.println("Ingrese una opcion: ");
                System.out.println("1. Viaje de equipo");
                System.out.println("2. Entrenamiento");
                System.out.println("3. Partido de futbol");
                System.out.println("4. Planificar entrenamiento");
                System.out.println("5. Entrevista");
                System.out.println("6. Curar lesiones");
                System.out.println("Opción:");
                opcion = input.nextInt();
                switch(opcion){
                    case 1:
                        viajeEquipo();
                        break;
                    case 2:
                        entrenarEquipo();
                        break;
                    case 3:
                        partidoFutbol();
                        break;
                    case 4:
                        planificarEntrenamiento();
                        break;
                    case 5:
                        darEntrevista();
                        break;
                    case 6:
                        curarLesiones();
                        break;
                }
            }while (opcion <1 || opcion > 6);

            System.out.println("Desea introducir otra cosa?(s/n):  ");
            respuesta = input.next().charAt(0);
            System.out.println("");
        }while(respuesta =='s'|| respuesta =='S');
        System.out.println("Hasta luego ");
    }

    //Opcion 1
    public static void viajeEquipo() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas");
        } else {
            System.out.println("\n--- Iniciando Viaje ---");
            for (Persona p : personas) {
                System.out.println(p.getNombre() + " " + p.getApellido() + " -> ");
                p.viajar();
            }
        }
    }

    //Opcion 2
    public static void entrenarEquipo(){
        if (personas.isEmpty()) {
            System.out.println("No hay nadie en el equipo para entrenar");
        }else{
            for (Persona p : personas) {
                p.entrenar();
            }
        }
    }
    //Opcion 3
    public static void partidoFutbol(){
        System.out.println("\n--- ¡Inicia el encuentro! ---");
        if (personas.isEmpty()) {
            System.out.println("No hay personas");
        }else {
            for (Persona p : personas) {
                p.jugarPartido();
            }
        }
    }
    //opcion 4
    public static void planificarEntrenamiento(){
        System.out.println("--- Planificacion de la semana ---");
        for(Persona p : personas){
            if(p instanceof Entrenador){
                ((Entrenador)p).planificarEntrenamiento();
            }
        }
    }
    //Opcion 5
    public static void darEntrevista(){
        System.out.println("--- Zona mixta (Entrevista) ---");
        for(Persona p : personas){
            if(p instanceof Futbolista){
                ((Futbolista)p).darEntrevista();
            }else if(p instanceof Entrenador){
                ((Entrenador)p).darEntrevista();
            }
        }
    }

    //Opcion 6
    public static void curarLesiones() {
        for (Persona p : personas) {
            if (p instanceof Doctor) {
                ((Doctor) p).curarLesion(); // Solo el Doctor tiene este método
            }
        }
    }



}
