
package es.iespuertodelacruz.javier.poo.ii.ejercicio7.figuras;

/**
 *
 * @author Javi
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double perimetro() {
        return 2*(Math.PI*radio);
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }
    
    @Override
    public void escalar(double escala) {
        if(escala > 0){
            setRadio(radio*escala);
        }else{
            setRadio(radio/escala);
        }
    }
    
    @Override
    public String toString() {
        return "[Circulo: " + " radio = " + radio + "]";
    }

    
    
    
}
