
package es.iespuertolacruz.javier.figuras;

/**
 *
 * @author javier
 */
public class Triangulo extends Figura{

    public Triangulo() {
    }

    
    
    public Triangulo(float base, float altura) {
        super(base, altura);
    }
   
    
    /**
     * Funcion para calcular el area del triangulo.
     * @return 
     */
    @Override
    public float area() {
        return (float)(base*altura)/2;
    }
    
    
}
