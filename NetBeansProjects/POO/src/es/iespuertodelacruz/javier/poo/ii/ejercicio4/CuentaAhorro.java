
package es.iespuertodelacruz.javier.poo.ii.ejercicio4;

/**
 *
 * @author Javi
 */
public class CuentaAhorro extends CuentaBancaria{
    private final double SALDOMINIMO;

    public CuentaAhorro(double SALDOMINIMO, String iban, double saldo) {
        super(iban, saldo);
        this.SALDOMINIMO = SALDOMINIMO;
    }

    public double getSALDOMINIMO() {
        return SALDOMINIMO;
    }

    @Override
    public double calcularIntereses() {
        if(getSaldo()<SALDOMINIMO){
            return getSaldo()*1.015;
        }else{
            return getSaldo()*1.06;
        }
    }
    
    
}
