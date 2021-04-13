
package es.iespuertodelacruz.javier.profesores;

import java.util.Objects;

/**
 *
 * @author Javi
 */
public class Profesor {
    private String nombre;
    private String apellidos;
    private String dni;
    
    //Constructor vacio
    public Profesor() {
    }
    
    //Constructor con los parametros
    public Profesor(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    
    //Getter/setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /**
     * Funcion encargada de comparar dos elementos
     * @param obj
     * @return true o false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesor other = (Profesor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + ";" + apellidos + ";" + dni + "\n";
    }
    
    
    
    
}
