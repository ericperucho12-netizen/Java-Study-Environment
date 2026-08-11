package Ejercicios.Tema07_POO.Ejercicio_98;

/**
 * ---------------------------------------------------------
 * EJERCICIO 98: ENCAPSULAMIENTO ESTRICTO
 * ---------------------------------------------------------
 * Conceptos: private, getters, setters, validaciones.
 * 
 * Enunciado:
 * Crea una clase CuentaBancaria que impida que el saldo sea
 * modificado directamente desde fuera, protegiéndolo de saldos negativos.
 */
public class CuentaBancaria {
    
    // El encapsulamiento requiere que los atributos críticos sean PRIVADOS
    private String titular;
    private double saldo;
    
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        // Incluso en el constructor usamos el setter para validar
        this.setSaldo(saldoInicial);
    }
    
    // --- GETTERS (Lectura) ---
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    // --- SETTERS (Escritura controlada) ---
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Error: El saldo no puede ser negativo.");
        } else {
            this.saldo = saldo;
        }
    }
    
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de $" + monto);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== ENCAPSULAMIENTO BANCARIO ===");
        
        CuentaBancaria miCuenta = new CuentaBancaria("Eric", 1000);
        
        // No podemos hacer miCuenta.saldo = -500; (El compilador daría error)
        // La única forma de interactuar es a través de sus métodos:
        
        System.out.println("Saldo actual: $" + miCuenta.getSaldo());
        
        // Intentamos un hackeo
        miCuenta.setSaldo(-5000);
        System.out.println("Saldo tras intento de hackeo: $" + miCuenta.getSaldo());
    }
}
