package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 * ---------------------------------------------------------
 * EJERCICIO 172: AGREGAR UN BOTÓN (JBUTTON)
 * ---------------------------------------------------------
 * Conceptos: JButton.
 * 
 * Enunciado:
 * Una ventana vacía no es muy útil. Instancia un objeto 
 * JButton con algún texto y agrégalo a tu JFrame.
 */
public class Ejercicio_172 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        JButton boton = new JButton("¡Haz clic aquí!");
        ventana.add(boton);
        ventana.setSize(300, 200);
        ventana.setVisible(true);
    }
}

