package Ejercicios.Tema14_Hilos;
/**
 * ---------------------------------------------------------
 * EJERCICIO 165: SINCRONIZACIÓN BÁSICA (SYNCHRONIZED)
 * ---------------------------------------------------------
 * Conceptos: Palabra clave synchronized.
 * 
 * Enunciado:
 * Cuando dos hilos intentan modificar una misma cuenta bancaria 
 * al mismo tiempo, el saldo puede corromperse. Explica cómo la 
 * palabra 'synchronized' crea una cola de espera segura.
 */
class Cuenta {
    int saldo = 100;
    // synchronized evita que 2 hilos entren al mismo tiempo
    public synchronized void retirar(int monto) {
        if (saldo >= monto) saldo -= monto;
    }
}
public class Ejercicio_165 {
    public static void main(String[] args) {
        System.out.println("El uso de synchronized protege datos compartidos.");
    }
}

