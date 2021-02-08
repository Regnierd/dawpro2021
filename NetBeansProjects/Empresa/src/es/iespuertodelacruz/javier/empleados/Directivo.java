
package es.iespuertodelacruz.javier.empleados;

/**
 *
 * @author Javi
 */
public class Directivo extends Empleado{

    public Directivo() {
    }

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Directivo{" + this.nombre + '}';
    }
    
    
    
}
