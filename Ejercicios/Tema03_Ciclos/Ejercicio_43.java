/*
* Pedir 10 numeros, y mostrar al final si se ha
* introducido algun numero negativo
* */

package Ejercicios.Tema03_Ciclos;

import javax.swing.*;

public class Ejercicio_43 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN ---
        int numero;
        /* Usamos una variable "boolean" que solo puede ser verdadera (true) o falsa (false).
           La llamamos "existeNegativo" y empieza en falso porque aún no leemos nada.
        */
        boolean existeNegativo = false;

        // --- 2. EL CICLO DE ENTRADA ---

        // El bucle se repetirá 10 veces para pedir los números
        for (int i = 1; i <= 10; i++) {
            // Pedimos el número mediante una ventana emergente
            // Nota: Convertimos el texto de la ventana a número con Integer.parseInt
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número #" + i + ":"));

            // --- 3. LA LÓGICA DE LA BANDERA ---

            /* Si el número que el usuario escribió es menor a 0,
               nuestro interruptor se enciende (pasa a true).
            */
            if (numero < 0) {
                existeNegativo = true;
                /* Una vez que encontramos UN negativo, ya sabemos que la respuesta es SÍ.
                   No importa si los demás son positivos o negativos.
                */
            }
        }

        // --- 4. RESULTADO FINAL ---

        // Dependiendo de si la bandera terminó en true o false, damos el mensaje
        if (existeNegativo == true) {
            JOptionPane.showMessageDialog(null, "Atención: Se ha introducido al menos un número negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "Perfecto: Todos los números introducidos son positivos.");
        }

    }
}
