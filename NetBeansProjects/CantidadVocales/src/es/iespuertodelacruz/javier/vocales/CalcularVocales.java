/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.vocales;

/**
 *
 * @author javier
 */
public class CalcularVocales {
    String cadena;
    
    //Constructores
    public CalcularVocales() {
        cadena = "";
    }

    public CalcularVocales(String cadena) {
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
     * Funcion para calcular cuantas vocales tiene una cadena.
     * @param cadena
     * @return String
     */
    public int calcular(String cadena){
        int cantidadVocales = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);//obtenemos el caracter en la posicion i
            if(Character.isLetter(caracter)){//Se comprueba si es una letra, si es una letra es true.
                if (caracter == 'a' || caracter == 'e' || caracter ==  'i' || caracter == 'o' || caracter == 'u') {//comprueba si es una vocal y si lo es suma uno en el contador.
                    cantidadVocales++; //contamos cantidad vocales +1
                  
                }
            }   
        }
        //mostramos por pantalla cantidad de vocales
        return cantidadVocales;
    }
}
