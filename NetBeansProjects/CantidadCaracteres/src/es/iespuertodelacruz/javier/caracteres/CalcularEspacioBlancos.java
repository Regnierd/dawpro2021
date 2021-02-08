/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.caracteres;

/**
 *
 * @author javier
 */
public class CalcularEspacioBlancos {
    String cadena;
    
    //Constructores
    public CalcularEspacioBlancos() {
        cadena = "";
    }

    public CalcularEspacioBlancos(String cadena) {
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
     * Funcion para calcular los espacios en blanco de una cadena.
     * @param cadena
     * @return int
     */
    public int calcular(){
        int cantidadEspacioBlanco = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);//obtenemos el caracter en la posicion i
            //Se comprueba si es un espacio en blanco, si es un espacio en blanco es true.
            if(Character.isWhitespace(caracter)){
                cantidadEspacioBlanco++;
            }   
        }
        //mostramos por pantalla la cantidad de espacios en blanco que haya.
        return cantidadEspacioBlanco;
    }
}
