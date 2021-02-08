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
public class CalcularLetras {
    String cadena;
    
    //Constructores
    public CalcularLetras() {
        cadena = "";
    }

    public CalcularLetras(String cadena) {
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
     * Funcion para calcular las letras de una cadena.
     * @param cadena
     * @return int
     */
    public int calcular(){
        int cantidadLetras = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);//obtenemos el caracter en la posicion i
            if(Character.isLetter(caracter)){//Se comprueba si es una letra, si es una letra es true.
                cantidadLetras++;
            }   
        }
        //mostramos por pantalla la cantidad de letras que haya.
        return cantidadLetras;
    }
}
