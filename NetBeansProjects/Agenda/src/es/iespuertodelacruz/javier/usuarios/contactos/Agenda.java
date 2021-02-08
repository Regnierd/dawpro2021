
package es.iespuertodelacruz.javier.usuarios.contactos;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Agenda {
    public static ArrayList<Contacto> contactos = new ArrayList();
    
    /**
     * Funcion para añadir contactos.
     * @param contact
     * @return 
     */
    public boolean addContacto(Contacto contact){
        boolean insertado = false;
        
        if(contactos.contains(contact.getIdentificador())){ //PREGUNTAR
            return insertado;
        }else{
            contactos.add(contact);
            insertado = true;
        }
        
        return insertado;
    }
    
    /**
     * Funcion para eliminar contactos.
     * @param nombre
     * @return 
     */
    public boolean delContacto(String nombre){
        boolean eliminado = false;
        for(int i = 0; i<contactos.size();i++){
            if(contactos.get(i).getNombre() == nombre){
                contactos.remove(i);
                eliminado = true;
            }
        }
        
        return eliminado;
    }
    
    /**
     * Funcion para saber si existe un contacto
     * @param nombre
     * @return 
     */
    public boolean existeContacto(String nombre){
        boolean existe = false;
        for(int i = 0; i<contactos.size();i++){
            if(contactos.get(i).getNombre() == nombre){
                existe = true;
            }
        }
        
        return existe;
    }
    
    /**
     * Metodo para mostrar la lista de contactos.
     */
    public void listarContactos(){
        for(int i = 0; i<contactos.size();i++){
            System.out.println(contactos.get(i));
        }
    }
    
    /**
     * Funcion para buscar contactos y devolver su posicion
     * @param nombre
     * @return 
     */
    public int buscaContacto(String nombre){
        int posicion = 0;
        for(int i = 0; i<contactos.size();i++){
            if(contactos.get(i).getNombre() == nombre){
                posicion = i;
            }
        }
        return posicion;
    }
    
    
}
