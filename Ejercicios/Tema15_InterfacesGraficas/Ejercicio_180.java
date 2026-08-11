package Ejercicios.Tema15_InterfacesGraficas;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * ---------------------------------------------------------
 * EJERCICIO 180: PROYECTO GUI (MINI FORMULARIO)
 * ---------------------------------------------------------
 * Conceptos: Integración final de Swing.
 * 
 * Enunciado:
 * ¡Tu prueba final de Interfaces! Une etiquetas, cajas de 
 * texto y botones para formar un formulario de registro. 
 * Haz que al presionar "Guardar", se imprima el nombre.
 */
public class Ejercicio_180 {
    public static void main(String[] args) {
        JFrame v = new JFrame("Formulario de Registro");
        v.setLayout(new FlowLayout());
        
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(15); // 15 columnas de ancho
        JButton btnGuardar = new JButton("Guardar");
        
        btnGuardar.addActionListener(e -> {
            System.out.println("Guardado exitosamente: " + txtNombre.getText());
        });
        
        v.add(lblNombre);
        v.add(txtNombre);
        v.add(btnGuardar);
        
        v.setSize(250, 150);
        v.setVisible(true);
    }
}

