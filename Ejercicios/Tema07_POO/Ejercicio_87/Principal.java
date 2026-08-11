/*
Construir un programa que permita dirigir el movimiento de un objeto
dentro de un tablero y actualice su posición dentro del mismo. Los
movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras
cada movimiento el programa mostrará la nueva dirección elegida
y las coordenadas de situación del objeto dentro del tablero.
*/

package Ejercicios.Tema07_POO.Ejercicio_87;



import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        char proximoMov = '0';
        Posicion_87 objeto = new Posicion_87(0,0);
        System.out.println("Posicion Inicial: ("+objeto.getX()+","+objeto.getY()+")");
        while(proximoMov != 'E'){
            //Identificamos el proximo movimiento
            do {
                proximoMov = Character.toUpperCase(JOptionPane.showInputDialog("Ingrese el siguiente movimiento"+"\n"+"W-Adelante\n"+"S-Atras\n"+"A-Izquierda\n"+"D-Derecha\n"+"E-Salir\n ").charAt(0));
            }while((proximoMov != 'W')&&(proximoMov != 'A')&&(proximoMov !='S')&&(proximoMov != 'D')&&(proximoMov !='E'));
            //Realizamos el movimiento
            switch (proximoMov) {
                case 'W':
                    objeto.Arriba();
                    break;
                case 'S':
                    objeto.Abajo();
                    break;
                case 'A':
                    objeto.Izquiera();
                    break;
                case 'D':
                    objeto.Derecha();
                    break;
                case 'E':
                    System.out.println("Gracias por jugar");
                    break;
                    default:
                        System.out.println("Movimiento no reconocido");
                        break;
            }
        }
    }
}
