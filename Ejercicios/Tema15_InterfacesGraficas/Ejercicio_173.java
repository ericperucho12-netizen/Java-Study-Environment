package Ejercicios.Tema15_InterfacesGraficas;
import javax.swing.JFrame;
import javax.swing.JButton;
/**
 * ---------------------------------------------------------
 * EJERCICIO 173: ESCUCHAR CLICS (ACTIONLISTENER)
 * ---------------------------------------------------------
 * Conceptos: Eventos, ActionListener, Lambdas.
 * 
 * Enunciado:
 * Un botón no sirve de nada si no sabe qué hacer al ser 
 * presionado. Añade un ActionListener al botón para que 
 * imprima un saludo en consola cuando el usuario haga clic.
 */
public class Ejercicio_173 {
    public static void main(String[] args) {
        JFrame v = new JFrame();
        JButton b = new JButton("Saludar");
        b.addActionListener(e -> System.out.println("¡Hola desde la interfaz!"));
        v.add(b);
        v.setSize(200, 200);
        v.setVisible(true);
    }
}

