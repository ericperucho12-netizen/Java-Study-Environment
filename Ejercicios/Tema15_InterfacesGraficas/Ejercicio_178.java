package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * ---------------------------------------------------------
 * EJERCICIO 178: POP-UP DE ENTRADA DE DATOS
 * ---------------------------------------------------------
 * Conceptos: JOptionPane.showInputDialog.
 * 
 * Enunciado:
 * Pídele datos al usuario a través de un diálogo emergente
 * y guarda la respuesta en una variable String para procesarla.
 */
public class Ejercicio_178 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("¿Cuál es tu nombre?");
        if (nombre != null) System.out.println("Bienvenido, " + nombre);
    }
}

