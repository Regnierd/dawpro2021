
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Triangulo extends Figura{

    public Triangulo() {
        super();
    }

    public Triangulo(double altura, double base) {
        super(altura, base);
    }


    /**
     * Funcion para calcular el area de un triangulo
     * @return
     */
    @Override
    public double area() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo: " + "Base{ " + base + " }" + "Altura{ " + altura + " }";
    }
    
    
}
