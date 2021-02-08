
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.terrestres;

import es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos.Terrestres;

/**
 *
 * @author Javi
 */
public class Motos extends Terrestres {
    private String color;

    public Motos(String color, int RUEDAS, String matricula, String modelo) {
        super(RUEDAS, matricula, modelo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Motos{" + "color=" + color + " Ruedas: "+getRUEDAS()
                +" Matricula: "+ getMatricula() +" Modelo: " + getModelo() +'}';
    }
    
    
}
