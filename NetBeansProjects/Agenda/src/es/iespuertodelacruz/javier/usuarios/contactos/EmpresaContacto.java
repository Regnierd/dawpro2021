
package es.iespuertodelacruz.javier.usuarios.contactos;

/**
 *
 * @author Javi
 */
public class EmpresaContacto extends Contacto{
    String web;

    public EmpresaContacto(String web, String identificador, String nombre, int telefono) {
        super(identificador, nombre, telefono);
        this.web = web;
    }
    
    @Override
    public String toString() {
        return "Contacto{" + "Identificador=" + this.getIdentificador() + ", nombre=" 
                + this.getNombre() + ", telefono=" + this.getTelefono() + "web= " + web+'}';
    }
}
