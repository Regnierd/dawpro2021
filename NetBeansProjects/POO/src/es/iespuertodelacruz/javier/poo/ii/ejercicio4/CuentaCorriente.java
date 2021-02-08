
package es.iespuertodelacruz.javier.poo.ii.ejercicio4;

/**
 *
 * @author Javi
 */
public class CuentaCorriente extends CuentaBancaria{

    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public double calcularIntereses() {
        return getSaldo()*1.03;
    }

    
    
}
