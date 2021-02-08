
package es.iespuertodelacruz.javier.empleados;

/**
 *
 * @author Javi
 */
public class Empleado {
    String nombre;
    
    //Constructores
    public Empleado() {
        nombre = "";
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter/setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + '}';
    }
       
}
