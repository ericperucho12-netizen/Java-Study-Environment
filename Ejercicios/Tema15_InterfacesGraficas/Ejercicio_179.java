package Ejercicios.Tema15_InterfacesGraficas;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 * ---------------------------------------------------------
 * EJERCICIO 179: DISTRIBUCIÓN DE COMPONENTES (LAYOUTS)
 * ---------------------------------------------------------
 * Conceptos: Layout Managers, BorderLayout.
 * 
 * Enunciado:
 * Por defecto, los elementos se amontonan. Aplica un 
 * BorderLayout para decirle a Java exactamente dónde quieres 
 * ubicar los elementos (Norte, Sur, Este, Oeste o Centro).
 */
public class Ejercicio_179 {
    public static void main(String[] args) {
        JFrame v = new JFrame();
        v.setLayout(new BorderLayout()); // Layout tipo Cruz
        v.add(new JButton("Norte"), BorderLayout.NORTH);
        v.add(new JButton("Sur"), BorderLayout.SOUTH);
        v.add(new JButton("Centro"), BorderLayout.CENTER);
        v.setSize(300, 300);
        v.setVisible(true);
    }
}

