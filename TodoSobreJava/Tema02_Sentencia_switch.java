package TodoSobreJava;

import javax.swing.JOptionPane;

/**
 * ---------------------------------------------------------
 * TEMA: ESTRUCTURA DE CONTROL SWITCH
 * ---------------------------------------------------------
 * La sentencia 'switch' se utiliza como alternativa a múltiples 'if-else'
 * cuando queremos evaluar una MISMA variable contra muchos valores posibles.
 * 
 * Es ideal para menús, calculadoras, o cuando esperamos valores
 * exactos (ej. 1, 2, 3 o "A", "B", "C").
 * 
 * ¡MUY IMPORTANTE! Siempre debes usar 'break' al final de cada caso,
 * de lo contrario, el programa ejecutará todos los casos que sigan hacia abajo.
 */
public class Tema02_Sentencia_switch {
    public static void main(String[] args) {
        System.out.println("=== SENTENCIA SWITCH ===");

        // Menú de opciones
        String menu = "Elija una opción:\n"
                    + "1. Saludar\n"
                    + "2. Despedirse\n"
                    + "3. Insultar (No recomendado)\n"
                    + "4. Cantar\n"
                    + "5. Saber tu edad\n";
                    
        int dato = Integer.parseInt(JOptionPane.showInputDialog(menu));

        // Evaluamos la variable 'dato'
        switch (dato) {
            case 1: 
                // Si dato == 1
                JOptionPane.showMessageDialog(null, "Hola guapo, te ves muy bien hoy");
                break; // IMPORTANTE: Sale del switch
            
            case 2:
                // Si dato == 2
                JOptionPane.showMessageDialog(null, "Adiós guapo, que te vaya bien");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "La tuya por si acaso");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null, "And I will always love youuuuu");
                break;
                
            case 5:
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Oye, ¿cuántos años tienes?"));
                
                if (edad > 18) {
                    JOptionPane.showMessageDialog(null, "Ahhh ya estás legal");
                } else if (edad == 18) {
                    JOptionPane.showMessageDialog(null, "Cuidado, apenas entraste a lo legal");
                } else {
                    JOptionPane.showMessageDialog(null, "Llamando a la policía...");
                }
                break;
                
            default:
                // Se ejecuta si no se cumple NINGUNO de los casos anteriores
                JOptionPane.showMessageDialog(null, "Esa opción no existe en el menú. Digite un número entre 1 y 5.");
                break;
        }
    }
}

