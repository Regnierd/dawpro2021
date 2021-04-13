package es.iespuertodelacruz.javier.elementos;

import java.util.HashMap;

import es.iespuertodelacruz.javier.exceptions.AlumnoException;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class GestionHashMap {
    Profesor profesor;
    HashMap<Integer, Alumno> alumnos;
    Fichero fichero;

    /**
     * Constructor por defecto
     */
    public GestionHashMap(){
        alumnos = new HashMap<>();
        fichero = new Fichero();
    }

    /**
     * Metodo para insertar a alumnos en la lista
     * @param alumno que insertar
     * @throws AlumnoException
     */
    public void insertar(Alumno alumno) throws AlumnoException{
        if(existe(alumno)){
            throw new AlumnoException("El alumno ya se encuentra en la lista");
        }else{
            alumnos.put(alumno.getPosicion(), alumno);
        }
        
    }

    /**
     * Funcion que devuelve un alumno pasandole su posicion
     * @param posicion para buscar al alumno
     * @return alumno
     */
    public Alumno buscar(Integer posicion){
        Alumno alumno = null;
        alumno = alumnos.get(posicion);
        return alumno;
    }

    /**
     * Funcion que verifica que existe un alumno
     * @param alumno que buscar
     * @return true si existe, false si no existe
     */
    public boolean existe(Alumno alumno){
        Alumno alumnoEncontrar;
        alumnoEncontrar = alumnos.get(alumno.getPosicion());
        if(alumnoEncontrar != null){
            return true;
        }
        else return false;
    }

    /**
     * Metodo que elimina un elemento de la lista
     * @param posicion que elimniar
     */
    public void eliminar(Integer posicion){
        alumnos.remove(posicion);
    }

    /**
     * Funcion que devuelve la lista de alumnos
     * @return alumnos
     */
    public String mostrarLista(){
        String lista = "";
        for(Alumno alumno : alumnos.values()){
            lista = alumno.toString();
        }
        return lista;

    }

    /**
     * Metodo que permite almacenar en un fichero
     * @param nombreFichero nombre del fichero
     * @throws FicheroException
     */
    public void volcarFichero(String nombreFichero) throws FicheroException{       
        String cadena = mostrarLista();
        fichero.crear(nombreFichero, cadena);
    }

    
    

}
