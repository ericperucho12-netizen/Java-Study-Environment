/*
* Dado 6 notas, escribir la cantidad de alumnos aprovados,
* condicionados (=4) y suspensos
*
* */

package Ejercicios.Tema03_Ciclos;

import javax.swing.*;

public class Ejercicio_41 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN DEL ENTORNO ---

        //Variables to store the input and the counters
        int grade;
        int passedCount =0;
        int conditionedCount =0;
        int failedCount =0;

        // --- 2. EL CICLO DE ENTRADA (SWING) ---

        /* Usamos un bucle "for" para pedir exactamente 6 notas.
           Utilizamos JOptionPane para que aparezcan ventanas emergentes.
        */

        for(int i=1;i<=6;i++){
            grade=Integer.parseInt(JOptionPane.showInputDialog("Enter grade for student #"+i+"(0-10): "));

            // --- 3. LÓGICA DE CLASIFICACIÓN ---
            if(grade >4){
                passedCount++;//Alumno aprovado
            }else if(grade==4){
                conditionedCount++;//Alumno condicionado (panzazo)
            }else {
                failedCount++;//Alumno suspendido
            }
        }

        // --- 4. REPORTE FINAL ---
        // Construimos el mensaje final para mostrarlo en una sola ventana
        String report = "--- Final Report ---\n"+
                "Passe students: "+ passedCount +"\n"+
                "Condictioned students (=4): "+conditionedCount+"\n"+
                "Failed students: "+failedCount;
        JOptionPane.showMessageDialog(null, report);

    }
}

