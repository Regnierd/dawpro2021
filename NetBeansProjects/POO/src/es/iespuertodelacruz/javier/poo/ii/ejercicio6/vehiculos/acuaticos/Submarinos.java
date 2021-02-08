
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.acuaticos;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Acuaticos;

/**
 *
 * @author Javi
 */
public class Submarinos extends Acuaticos{
    private double profundidadMax;

    public Submarinos(double profundidadMax, double ESLORA, String matricula, String modelo) {
        super(ESLORA, matricula, modelo);
        this.profundidadMax = profundidadMax;
    }

    public double getProfundidadMax() {
        return profundidadMax;
    }

    public void setProfundidadMax(double profundidadMax) {
        this.profundidadMax = profundidadMax;
    }

    @Override
    public String toString() {
        return "Submarinos{" + "profundidadMax=" + profundidadMax  + "Eslora: "
                + getESLORA() + " Matricula: " + getMatricula() + " Modelo: " + getModelo()+ '}';
    }
    
    
}
