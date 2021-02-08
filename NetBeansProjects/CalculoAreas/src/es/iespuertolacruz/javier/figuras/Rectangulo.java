
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Rectangulo extends Figura{

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        super(altura, base);
    }
    
 
    /**
     * Funcion para calcular el area del rectangulo
     * @return
     */
    @Override
    public double area() {
        return altura * base;
    }

    @Override
    public String toString() {
        return "Rectangulo: " + "Base{ " + base + " }" + "Altura{ " + altura + " }";
    }
    
}
