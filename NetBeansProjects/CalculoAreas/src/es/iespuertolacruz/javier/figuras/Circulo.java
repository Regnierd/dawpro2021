
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Circulo extends Figura {
    
    double radio; 
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Funcion para calcular el area de un circulo
     * @return
     */
    @Override
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo: radio{ " + radio + "}"; 
    }
    
    
    
}
