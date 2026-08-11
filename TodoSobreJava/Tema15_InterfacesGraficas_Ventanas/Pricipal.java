package TodoSobreJava.Tema15_InterfacesGraficas_Ventanas;

/**
 * ---------------------------------------------------------
 * TEMA: EJECUCIÓN DE INTERFACES GRÁFICAS
 * ---------------------------------------------------------
 * Esta es la clase principal que inicializa y muestra nuestra ventana.
 */
public class Pricipal {
    public static void main(String[] args) {
        
        // 1. Instanciamos nuestra ventana.
        // Como 'Ventana1' es una clase estática dentro de 'Ventana', la llamamos así:
        Ventana.Ventana1 v1 = new Ventana.Ventana1();

        // 2. Hacer visible la ventana.
        // Por defecto, los JFrames son invisibles al crearse.
        // Este método DEBE llamarse para que la ventana aparezca en pantalla.
        v1.setVisible(true);
    }
}

