
package es.iespuertodelacruz.javier.trabajadores;

/**
 *
 * @author Javi
 */
public class Operario extends Empleado{

    @Override
    public String mostrarNombre() {
        return "Operario" + getNombre();
    }
    
}
