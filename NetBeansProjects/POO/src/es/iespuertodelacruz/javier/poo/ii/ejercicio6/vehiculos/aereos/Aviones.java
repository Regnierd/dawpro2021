
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.aereos;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Aereos;

/**
 *
 * @author Javi
 */
public class Aviones extends Aereos{
    private String tiempoMax;

    public Aviones(String tiempoMax, int asientos, String matricula, String modelo) {
        super(asientos, matricula, modelo);
        this.tiempoMax = tiempoMax;
    }

    public String getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(String tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    @Override
    public String toString() {
        return "Aviones{" + "tiempoMax=" + tiempoMax + "Asientos: " + getASIENTOS()
                + " Matricula: "+getMatricula() + " Modelo: "+getModelo() + '}';
    }
    
    
}
