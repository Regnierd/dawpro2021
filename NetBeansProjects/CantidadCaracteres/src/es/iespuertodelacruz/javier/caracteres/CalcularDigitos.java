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
public class CalcularDigitos {
    String cadena;

    //Constructores
    public CalcularDigitos() {
        cadena = "";
    }

    public CalcularDigitos(String cadena) {
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
     * Funcion para calcular los digitos de una cadena.
     * @param cadena
     * @return int
     */
    public int calcular(){
        int cantidadDigitos = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);//obtenemos el caracter en la posicion i
            if(Character.isDigit(caracter)){//Se comprueba si es un numero, si es un numero es true.
                cantidadDigitos++;
            }   
        }
        //mostramos por pantalla la cantidad de digitos que haya.
        return cantidadDigitos;
    }
}
