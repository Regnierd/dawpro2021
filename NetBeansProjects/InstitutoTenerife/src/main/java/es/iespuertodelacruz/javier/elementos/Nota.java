package es.iespuertodelacruz.javier.elementos;

import java.util.Objects;

public class Nota {
    private String nombre;
    private int calificacion;


    /**
     * Constructor con todos los atributos por defecto
     * @param nombre de la asignatura
     * @param calificacion de la asignatura
     */
    public Nota(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Nota)) {
            return false;
        }
        Nota nota = (Nota) o;
        return Objects.equals(nombre, nota.nombre) && calificacion == nota.calificacion;
    }


    @Override
    public String toString() {
        return getNombre() + ": " + getCalificacion();
    }

    
}
