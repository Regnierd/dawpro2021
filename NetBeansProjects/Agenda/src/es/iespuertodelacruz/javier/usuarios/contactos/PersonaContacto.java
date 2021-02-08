
package es.iespuertodelacruz.javier.usuarios.contactos;

/**
 *
 * @author Javi
 */
public class PersonaContacto extends Contacto {
    String nacimiento;

    public PersonaContacto(String nacimiento, String identificador, String nombre, int telefono) {
        super(identificador, nombre, telefono);
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Contacto{" + "Identificador=" + this.getIdentificador() + ", nombre=" + this.getNombre() + ", telefono=" + this.getTelefono() + "fecha nacimiento= " + nacimiento+'}';
    }
    
    
}
