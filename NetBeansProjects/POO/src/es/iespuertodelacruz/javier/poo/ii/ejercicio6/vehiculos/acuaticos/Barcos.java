
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.acuaticos;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Acuaticos;

/**
 *
 * @author Javi
 */
public class Barcos extends Acuaticos{
    private boolean motor;

    public Barcos(boolean motor, double ESLORA, String matricula, String modelo) {
        super(ESLORA, matricula, modelo);
        this.motor = motor;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Barcos{" + "motor=" + motor + "Eslora: " + getESLORA() 
                + " Matricula: " + getMatricula() + " Modelo: " + getModelo()+'}';
    }

    
    
    
}
