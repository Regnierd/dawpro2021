
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Cuadrado extends Figura {  

    public Cuadrado() {
    }

    public Cuadrado(double base) {
        super(base);
        
    }
    
    /**
     * Funcion para calcular el area de un cuadrado
     * @return
     */
    @Override
    public double area() {
        return base*base;
    }

    @Override
    public String toString() {
        return "Cuadrado: " + "Base{ " + base + " }";
    }
  
}
