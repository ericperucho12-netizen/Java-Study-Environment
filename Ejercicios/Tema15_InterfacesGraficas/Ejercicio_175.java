package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * ---------------------------------------------------------
 * EJERCICIO 175: CAMPO DE ENTRADA (JTEXTFIELD)
 * ---------------------------------------------------------
 * Conceptos: JTextField.
 * 
 * Enunciado:
 * Crea una caja de texto donde el usuario pueda escribir su 
 * nombre u otra información usando JTextField.
 */
public class Ejercicio_175 {
    public static void main(String[] args) {
        JFrame v = new JFrame();
        JTextField campo = new JTextField("Escribe algo aquí...");
        v.add(campo);
        v.setSize(300, 100);
        v.setVisible(true);
    }
}

