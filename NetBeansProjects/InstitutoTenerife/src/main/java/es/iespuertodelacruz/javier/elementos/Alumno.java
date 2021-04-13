package es.iespuertodelacruz.javier.elementos;

import java.util.ArrayList;

import es.iespuertodelacruz.javier.exceptions.ExceptionValidar;

public class Alumno extends Persona {
    private ArrayList<Nota> notas;


    /**
     * Constructor del alumno con todos los atributos 
     * @param nombre del alumno
     * @param apellidos del alumno
     * @param dni del alumno
     * @param nota del alumno
     * @throws ExceptionValidar
     * @throws Exception
     */
    public Alumno(String nombre, String apellidos, String dni, ArrayList<Nota> notas) throws  ExceptionValidar {
        super(nombre, apellidos, dni);
        this.notas = notas;
    }


    public ArrayList<Nota> getNotas() {
        return this.notas;
    }


}