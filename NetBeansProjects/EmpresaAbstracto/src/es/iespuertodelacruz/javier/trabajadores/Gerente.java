
package es.iespuertodelacruz.javier.trabajadores;

/**
 *
 * @author Javi
 */
public class Gerente extends Tecnico {

    @Override
    public String mostrarEspecialidad() {
        return this.getEspecialidad();
    }

    @Override
    public String mostrarNombre() {
       return this.getNombre();
    }
    
}
