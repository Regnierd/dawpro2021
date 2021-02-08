
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.aereos;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Aereos;

/**
 *
 * @author Javi
 */
public class Helicopteros extends Aereos{
    private int numeroHelices;

    public Helicopteros(int numeroHelices, int asientos, String matricula, String modelo) {
        super(asientos, matricula, modelo);
        this.numeroHelices = numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public String toString() {
        return "Helicopteros{" + "numeroHelices=" + numeroHelices + "Asientos: " + getASIENTOS()
                + " Matricula: "+getMatricula() + " Modelo: "+getModelo() +  '}';
    }
    
    
}
