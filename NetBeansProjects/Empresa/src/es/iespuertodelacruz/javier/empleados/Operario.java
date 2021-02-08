
package es.iespuertodelacruz.javier.empleados;

/**
 *
 * @author Javi
 */
public class Operario extends Empleado{

    public Operario() {
    }

    public Operario(String nombre) {
        super(nombre);
    }
   
    
    @Override
    public String toString() {
        return "Operario{" + this.nombre + '}';
    }
    
}
