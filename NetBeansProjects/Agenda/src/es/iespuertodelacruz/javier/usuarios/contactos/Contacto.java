
package es.iespuertodelacruz.javier.usuarios.contactos;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public abstract class Contacto {   
    private String identificador;
    private String nombre;
    private int telefono;

    public Contacto(String identificador, String nombre, int telefono) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "Identificador=" + identificador + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
