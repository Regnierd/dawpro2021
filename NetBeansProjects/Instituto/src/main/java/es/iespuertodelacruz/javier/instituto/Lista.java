
package es.iespuertodelacruz.javier.instituto;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Javi
 */
public class Lista {
    
    ArrayList<Persona> personas;
    Persona persona;

    public Lista(){
        this.personas = new ArrayList();
    }
    
    public Lista(ArrayList<Persona> personas){
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    /**
     * Funcion que imprime toda la lista de personas.
     * @return String
     */
    public String imprimir(){
        return personas.toString();
    }
    
    /**
     * Metodo para insertar una persona en la lista.
     * @param persona 
     */
    public void insertar(Persona persona){
        personas.add(persona);
    }
    
    /**
     * Metodo para eliminar una persona en la lista.
     * @param persona 
     */
    public void eliminar(Persona persona){
        personas.remove(persona);
    }
    
    /**
     * Metodo para contar cuantas personas hay en la lista.
     * @return int
     */
    public int contar(){
        return personas.size();
    }
    
    /**
     * Metodo que devuelve una persona en la lista por el dni
     * @param dni
     * @return Persona
     */
    public Persona buscar(int dni) throws Exception{
        Persona personaEncontrada = null;
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).equals(dni)){
               personaEncontrada = personas.get(i);
            }else{
                throw new Exception("No se encuentra a la persona con el dni: " + dni);
            }
        }
        return personaEncontrada;
    }
    
    public ArrayList<Persona> buscarNombre(String nombre){
        ArrayList<Persona> personasRepetidas = new ArrayList();
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).equals(nombre)){
                personasRepetidas.add(personas.get(i));
            }
        }
        return personasRepetidas;
    }
    
    public void ordenar(){       
        
     
    }
    
    
}
