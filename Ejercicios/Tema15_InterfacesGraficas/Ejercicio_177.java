package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * ---------------------------------------------------------
 * EJERCICIO 177: ALERTAS (JOPTIONPANE)
 * ---------------------------------------------------------
 * Conceptos: JOptionPane.showMessageDialog.
 * 
 * Enunciado:
 * Lanza una pequeña ventana emergente (Pop-up) clásica 
 * del sistema operativo para mostrarle una alerta de 
 * advertencia o éxito al usuario.
 */
public class Ejercicio_177 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Alerta! Esto es un pop-up.");
    }
}

