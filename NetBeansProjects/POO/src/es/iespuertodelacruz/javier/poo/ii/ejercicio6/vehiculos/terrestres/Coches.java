
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.terrestres;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Terrestres;

/**
 *
 * @author Javi
 */
public class Coches extends Terrestres{
    private boolean aireAcondicionado;

    public Coches(boolean aireAcondicionado, int RUEDAS, String matricula, String modelo) {
        super(RUEDAS, matricula, modelo);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    public String toString() {
        return "Coches{" + "aireAcondicionado=" + aireAcondicionado +
                " Ruedas: "+getRUEDAS() +" Matricula: "+ getMatricula() +" Modelo: " + getModelo() + '}';
    }
    
    
}
