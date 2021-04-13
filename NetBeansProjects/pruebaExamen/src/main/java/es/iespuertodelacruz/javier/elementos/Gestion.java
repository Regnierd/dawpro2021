
package es.iespuertodelacruz.javier.elementos;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Gestion {
    
    ArrayList<Persona> personas;
    
    public Gestion(){
        if(personas == null){
             personas = new ArrayList();
        }
    }
    
    public Gestion(ArrayList<Persona> personas){
        this.personas = personas;
    }
    
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    /**
     * Metodo para insertar una persona a la lista personas
     * @param persona es el valor que se le inserta a la lista
     */
    public void insertar(Persona persona){
        personas.add(persona);
    }
    
    /**
     * Funcion para buscar una persona pasandole dni
     * @param dni valor que se le pasa 
     * @return devuelve una persona o null
     */
    public Persona buscar(String dni){
        Persona personaEncontrada = null;
        
        for (int i = 0; i < personas.size(); i++) { 
            Persona persona = personas.get(i);
            if(persona.getDni().equals(dni)){
                personaEncontrada = persona;
            }
        }
        return personaEncontrada;
    }
    
    /**
     * Funcion para buscar una persona pasandole dni
     * @param dni valor que se le pasa
     * @return devuelve una lista
     */
    public ArrayList<Persona> buscar1(String dni){
        ArrayList<Persona> personasEncontradas = new ArrayList();
        
        for (int i = 0; i < personas.size(); i++) { 
            Persona persona = personas.get(i);
            if(persona.getDni().equals(dni)){
                personasEncontradas.add(persona);
            }
        }
        return personasEncontradas;
    }
    
    /**
     * Metodo para eliminar una persona de la lista personas
     * @param dni valor que se le pasa por parametro
     */
    public void eliminar(String dni){
        Persona persona = buscar(dni);
        if(persona != null){
            personas.remove(persona);
        }
    }
    
//    /**
//     * Funcion para eliminar pasandole el dni
//     * @param dni valor que se le pasa 
//     * @return devuelve una lista de personas
//     */
//    public void eliminar1(String dni){
//        ArrayList<Persona> personasEliminar = buscar1(dni);
//        if(personasEliminar.size() != 0){
//            personas.remove(personasEliminar.get(0));
//        }
//        
//    }
    
    
    
    
}
