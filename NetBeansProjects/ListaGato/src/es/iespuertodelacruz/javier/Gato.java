
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.excepciones.EdadException;
import es.iespuertodelacruz.javier.excepciones.NombreException;

/**
 *
 * @author Javi
 */
public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws NombreException, EdadException{
        comprobarEdad(edad);
        comprobarNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreException {
        comprobarNombre(nombre);
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadException {
        comprobarEdad(edad);
    }
    
    public void imprimir(){
        System.out.println("El gato se llama: " + nombre + ", y su edad: " + edad);
    }
    
    /**
     * Comprobar la edad
     * @param edad 
     */
    private void comprobarEdad(int edad) throws EdadException{
        if(edad > 0){
            this.edad = edad;
        }else{
            throw new EdadException("La edad " + edad + " no es valida, debe ser mayor"
                    + " que 0");
        }
    }
    
    /**
     * Comprobar el nombre
     * @param nombre 
     */
    private void comprobarNombre(String nombre) throws NombreException{
        if(nombre != null && nombre.length() > 2){
            this.nombre = nombre;
        }else{
            throw new NombreException("El nombre " + nombre + "no es valido, "
                    + "no puede ser nulo o de tamanio menor < 3 ");
        }
    }
}
