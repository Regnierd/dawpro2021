
package es.iespuertodelacruz.javier.profesores;

import es.iespuertodelacruz.javier.profesores.exceptions.FicheroException;
import es.iespuertodelacruz.javier.profesores.exceptions.ProfesorException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author Javi
 */
public class Gestion {
    ArrayList<Profesor> lista;
    
    public Gestion(){
        lista = new ArrayList();
    }
    
    /**
     * Metodo para insertar en la lista
     * @param profesor a insertar
     * @throws ProfesorException error controlado
     */
    public void insertar(Profesor profesor) throws ProfesorException{
        if(!existe(profesor)){
            lista.add(profesor);
        }else{
            throw new ProfesorException("El profesor, con dni : " + profesor.getDni()
                    + " ya existe en la lista");
        }
        
    }
    
    /**
     * Funcion para verificar si existe el profesor en la lista
     * @param profesor a buscar
     * @return true si existe, false si no existe en la lsita
     */
    public boolean existe(Profesor profesor){
        return lista.contains(profesor);
    }
    
    /**
     * Metodo para eliminar un elemento de la lista
     * @param profesor a eliminar
     */
    public void eliminar(Profesor profesor) throws ProfesorException{
        if(existe(profesor)){
            lista.remove(profesor);
        }else{
            throw new ProfesorException("El profesor, con dni : " + profesor.getDni()
                    + " no existe en la lista para poder eliminarlo.");
        }
    }
    
    /**
     * Funcion para mostrar la lista
     * @return String con todos los elementos
     */
    public String listar(){
        return lista.toString();
    }
    
    /**
     * Metodo para almacenar los datos en un fichero
     * @param nombreFichero del fichero creado
     * @throws ProfesorException error controlado
     * @throws FicheroException error controlado
     */
    public void almacenarDatos(String nombreFichero) throws ProfesorException, FicheroException{
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(nombreFichero);
            fichero.write(listar());
        } catch (Exception e) {
            throw new ProfesorException("", e);
        }finally{
            if(fichero != null){
                try {
                    fichero.close();
                } catch (IOException ex) {
                    throw new FicheroException("", ex);
                }
            }
        }
    }
}
