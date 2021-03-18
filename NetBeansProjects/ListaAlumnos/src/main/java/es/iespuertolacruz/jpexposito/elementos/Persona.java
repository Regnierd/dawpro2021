
package es.iespuertolacruz.jpexposito.elementos;

/**
 *
 * @author jpexposito
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private int dni;
    private int edad;
    private Direccion direccion;

    /**
     * Constructor de la clase persona
     * @param nombre nombre de la persona
     * @param apellidos apellidos de la persona
     * @param dni dni de la persona
     * @param edad edad de la persona 
     * @param direccion direccion de la persona
     */
    public Persona(String nombre, String apellidos,
            int dni, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
    }

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    
    
}
