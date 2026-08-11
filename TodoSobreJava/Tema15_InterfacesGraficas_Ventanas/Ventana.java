package TodoSobreJava.Tema15_InterfacesGraficas_Ventanas;

import javax.swing.*;
import java.awt.*;

/**
 * ---------------------------------------------------------
 * TEMA: INTERFACES GRÁFICAS (GUI) EN JAVA CON SWING
 * ---------------------------------------------------------
 * Swing es una biblioteca gráfica para Java. 
 * JFrame es la clase principal que representa una ventana básica 
 * de una aplicación con borde, barra de título y botones de cierre.
 */
public class Ventana {

    // Clase estática interna que HEREDA de JFrame
    public static class Ventana1 extends JFrame {
        
        // --- CONSTRUCTOR DE LA VENTANA ---
        public Ventana1(){
            // 1. Definir el tamaño de la ventana (ancho, alto) en píxeles
            this.setSize(500, 500);
            
            // 2. Título de la ventana
            setTitle("Mi Primera Ventana");

            // 3. Posición inicial de la ventana
            // setLocation(100,200); // Para coordenadas específicas (X, Y)
            // setBounds(100, 200, 500, 500); // Engloba setLocation y setSize
            
            // setLocationRelativeTo(null) centra la ventana en la pantalla
            setLocationRelativeTo(null);

            // 4. Iniciar los componentes internos (Paneles, Botones, etc.)
            iniciar();
            
            // 5. Configurar el comportamiento al cerrar la ventana.
            // EXIT_ON_CLOSE termina el programa al presionar la 'X'.
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
        // Método privado para agrupar la creación de componentes visuales
        private void iniciar(){
            // Un JPanel es un contenedor invisible donde podemos agrupar elementos
            JPanel panel1 = new JPanel();
            
            // Le damos un color de fondo al panel (Usando colores RGB)
            panel1.setBackground(new Color(69, 191, 226));
            
            // Finalmente, añadimos este panel a nuestra ventana principal (JFrame)
            this.getContentPane().add(panel1);
        }
    }
}

