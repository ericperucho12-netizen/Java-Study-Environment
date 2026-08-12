package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 * ---------------------------------------------------------
 * EJERCICIO 176: PANELES PARA AGRUPAR (JPANEL)
 * ---------------------------------------------------------
 * Conceptos: JPanel.
 * 
 * Enunciado:
 * Los JFrame no son buenos organizando muchos elementos a 
 * la vez. Agrupa múltiples botones dentro de un contenedor 
 * invisible (JPanel) y agrega el panel a la ventana.
 */
public class Ejercicio_176 {
    public static void main(String[] args) {
        JFrame v = new JFrame();
        JPanel panel = new JPanel(); // Contenedor invisible
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        v.add(panel);
        v.setSize(300, 100);
        v.setVisible(true);
    }
}

