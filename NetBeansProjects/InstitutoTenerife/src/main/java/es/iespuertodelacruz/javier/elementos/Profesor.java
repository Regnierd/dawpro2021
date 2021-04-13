package es.iespuertodelacruz.javier.elementos;
import java.util.ArrayList;
import java.util.Objects;


import es.iespuertodelacruz.javier.exceptions.ExceptionValidar;

public class Profesor extends Persona{
    private ArrayList<Aula> aulas;


    /**
     * Constructor con todos los atributos
     * @param nombre del profesor
     * @param apellidos del profesor
     * @param dni del profesor
     * @param aulas en las que imparte el profesor
     * @throws ExceptionValidar
     * @throws Exception
     */
    public Profesor(String nombre, String apellidos, String dni, ArrayList<Aula> aulas) throws ExceptionValidar {
        super(nombre, apellidos, dni);
        this.aulas = aulas;
    }


    public ArrayList<Aula> getAulas() {
        return this.aulas;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profesor)) {
            return false;
        }
        Profesor profesor = (Profesor) o;
        return Objects.equals(aulas, profesor.aulas);
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", apellidos='" + getApellidos() + "'" +
            ", dni='" + getDni() + "'" +
            getAulas()+
            "}";
    }


}
