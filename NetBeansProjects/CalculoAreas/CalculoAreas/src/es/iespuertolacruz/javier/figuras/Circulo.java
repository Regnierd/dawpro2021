
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Circulo extends Figura {
    float radio;
    
    public Circulo(float radio){
        this.radio = radio;
    }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    
   
     
    /**
     * Funcion que calcula el area de un circulo.
     * @return 
     */
    @Override
    public float area() {
        return (float) Math.PI*radio*radio;
    }
    
}
