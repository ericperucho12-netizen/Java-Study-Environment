/*
* Pedir 5 calificaciones de alumnos y decir al final si hay
* algun reprobado
*
* */
package Ejercicios.Tema03_Ciclos;

import javax.swing.*;

public class Ejercicio_44 {
    public static void main(String[] args) {
        // --- 1. PREPARACIÓN ---
        int nota;
        boolean hayReprobados = false;//El interruptor que nos dice si hubo alguien con menos de 6
        String listaReprobados="";//Aquí "escribimos" la lista de los alumnos reprobados

        // --- 2. EL CICLO DE EVALUACIÓN ---

        //Pedimos 5 calificaciones (del alumno 1 al 5)
    for(int i=1; i<=5;i++) {
        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Nota del alumno #" + i + " (0-10)"));
        // --- 3. LÓGICA DE DETECCIÓN Y REGISTRO ---
        //Suponiendo que se reprueba con una nota menor a 6
        if (nota < 6) {
            hayReprobados = true;
            /*Concatenación: Vamos sumando el texto a nuestra lista
            "\n" sirve para que cada alumno aparezca en un renglón nuevo
            * */
            listaReprobados += "Alumno #" + i + " (Nota: " + nota + ")\n";
        }
    }
        // --- 4. RESULTADO FINAL ---
        // Verificamos si el interruptor se encendió
if(hayReprobados==true){
    JOptionPane.showMessageDialog(null,"Alerta: hay alumnos reprobados:\n\n"+listaReprobados);
}else {
    JOptionPane.showMessageDialog(null,"Excelente Todos los alumnos han aprobado");
}


    }
}
