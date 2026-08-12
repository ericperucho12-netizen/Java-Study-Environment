package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
/**
 * ---------------------------------------------------------
 * EJERCICIO 171: CREAR UNA VENTANA (JFRAME)
 * ---------------------------------------------------------
 * Conceptos: Librería Swing, JFrame.
 * 
 * Enunciado:
 * ¡Adiós a la consola! Importa javax.swing.JFrame y crea 
 * tu primera ventana real de sistema operativo. Ajusta su
 * tamaño y hazla visible.
 */
public class Ejercicio_171 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi Primera Ventana");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true); // ¡Puf! Aparece la ventana
    }
}

