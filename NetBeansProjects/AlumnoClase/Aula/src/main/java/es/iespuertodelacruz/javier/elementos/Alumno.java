package es.iespuertodelacruz.javier.elementos;

public class Alumno extends Persona {
    int posicion;



    public Alumno(String nombre, String apellidos, int posicion) {
        super(nombre, apellidos);
        this.posicion = posicion;
    }
    

    public int getPosicion() {
        return this.posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


    @Override
    public String toString() {
        return this.nombre + ", " + this.apellidos + ", " + posicion + "\n";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alumno)) {
            return false;
        }
        Alumno alumno = (Alumno) o;
        return posicion == alumno.posicion;
    }
    
}
