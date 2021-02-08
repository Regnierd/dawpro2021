
package es.iespuertodelacruz.javier.trabajadores;

/**
 *
 * @author Javi
 */
public abstract class Empleado {
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String mostrarNombre();
          
}
