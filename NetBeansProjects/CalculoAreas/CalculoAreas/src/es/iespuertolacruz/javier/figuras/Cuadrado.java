
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Cuadrado extends Figura{

    /**
     * Constructor vacio.
     */
    public Cuadrado() {
        super();
    }
  
    /**
     * Constructor con los parametros del padre.
     * @param base
     * @param altura 
     */
    public Cuadrado(float base, float altura) {
        super(base, altura);
        this.area();
    }

    @Override
    public String toString() {
        return "Lado: " + this.altura;
    }
   
    
}
