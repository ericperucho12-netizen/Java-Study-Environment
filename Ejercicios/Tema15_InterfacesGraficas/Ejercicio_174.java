package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * ---------------------------------------------------------
 * EJERCICIO 174: ETIQUETAS DE TEXTO (JLABEL)
 * ---------------------------------------------------------
 * Conceptos: JLabel.
 * 
 * Enunciado:
 * Aprende a colocar texto estático en la ventana 
 * (como instrucciones o títulos) utilizando la clase JLabel.
 */
public class Ejercicio_174 {
    public static void main(String[] args) {
        JFrame v = new JFrame();
        JLabel etiqueta = new JLabel("Texto informativo para el usuario.", JLabel.CENTER);
        v.add(etiqueta);
        v.setSize(300, 100);
        v.setVisible(true);
    }
}

