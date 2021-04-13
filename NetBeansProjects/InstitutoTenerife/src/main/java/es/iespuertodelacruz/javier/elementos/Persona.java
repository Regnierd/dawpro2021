package es.iespuertodelacruz.javier.elementos;

import java.util.Objects;

import es.iespuertodelacruz.javier.exceptions.ExceptionValidar;

public class Persona extends Validacion {
    private String nombre;
    private String apellidos;
    private String dni;


    /**
     * Constructor con todos los atributos de la clase
     * @param nombre de la persona
     * @param apellidos de la persona
     * @param dni de la persona
     * @throws ExceptionValidar
     * @throws Exception
     */
    public Persona(String nombre, String apellidos, String dni) throws ExceptionValidar {
        this.nombre = nombre;
        this.apellidos = apellidos;
        validarDni(dni);
        this.dni = dni;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return this.dni;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos) && Objects.equals(dni, persona.dni);
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellidos='" + getApellidos() + "'" +
            ", dni='" + getDni() + "'" +
            "}";
    }


    


}
