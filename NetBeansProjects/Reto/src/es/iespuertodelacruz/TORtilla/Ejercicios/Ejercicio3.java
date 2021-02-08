/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.TORtilla.Ejercicios;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Javi
 */
public class Ejercicio3 {
    String cadena;

    public Ejercicio3() {
    }

    
    public Ejercicio3(String cadena) {
        this.cadena = cadena;
    }

    
    //Getter/setters
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * Funcion que invierte una cadena y la imprime
     */
    public void invertirFrase(){       
        
        System.out.print("La cadena invertida es: ");
        String[] palabras = cadena.split(" ");
        for (int i = palabras.length -1; i >= 0; i--) {
            System.out.print(palabras[i] + " " );
            
        }
        System.out.println("");
    }
       

}
