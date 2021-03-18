/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertolacruz.jpexposito.elementos;

import java.util.ArrayList;

/**
 *
 * @author jpexposito
 */
public class Gestion {
    
    
    private ArrayList<Persona> Personas = new ArrayList<>();

   
    public ArrayList<Persona> getListaPersonas() {
        return Personas;
    }
    
    public void insertar (Persona persona) {
        Personas.add(persona);
    }

    public void eliminar(Persona persona) {
        Personas.remove(persona);
    }
    
    public int contar() {
        return Personas.size();
    }
    
    public Persona buscar(int dni) {
        boolean encontrado = false;
        int i = 0;
        Persona personaEncontrada = null;
        
        
        for(Persona persona:Personas) {
            if (persona.getDni() == dni) {
                personaEncontrada = persona;
                break;
            } 
        }
        
        return personaEncontrada;
    }
    
    
    
    
}
