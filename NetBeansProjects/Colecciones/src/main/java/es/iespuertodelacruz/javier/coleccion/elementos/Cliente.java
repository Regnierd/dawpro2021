
package es.iespuertodelacruz.javier.coleccion.elementos;

/**
 *
 * @author Javi
 */
public class Cliente {
    
    private String nombre;
    private String numeroCuenta;
    private double saldo;

    public Cliente(String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numeroCuenta=" + 
                numeroCuenta + ", saldo=" + saldo + '}' + "\n";
    }
    
        
}
