package es.iespuertodelacruz.javier.elementos;

import java.util.HashMap;
import java.util.Objects;

public class Aula {
    private int piso;
    private int numero;
    private HashMap<String, Alumno> alumnos;


    /**
     * Constructor con todos los atributos de la clase
     * @param piso del aula
     * @param numero del aula
     * @param alumnos que estan en el aula
     */
    public Aula(int piso, int numero, HashMap<String, Alumno> alumnos) {
        this.piso = piso;
        this.numero = numero;
        this.alumnos = alumnos;
    }


    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public HashMap<String,Alumno> getAlumnos() {
        return this.alumnos;
    }



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Aula)) {
            return false;
        }
        Aula aula = (Aula) o;
        return piso == aula.piso && numero == aula.numero && Objects.equals(alumnos, aula.alumnos);
    }


    @Override
    public String toString() {
        return "{" +
            " piso='" + getPiso() + "'" +
            ", numero='" + getNumero() + "'" +
            ", alumnos='" + getAlumnos() + "'" +
            "}";
    }



}
