
package es.iespuertodelacruz.javier.empleados;


/**
 *
 * @author Javi
 */
public class Oficial extends Operario {

    public Oficial() {
    }
    
    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Oficial{" + this.nombre + '}';
    }
    
    
}
