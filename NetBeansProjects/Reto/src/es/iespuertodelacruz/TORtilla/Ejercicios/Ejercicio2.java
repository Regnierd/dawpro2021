/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.TORtilla.Ejercicios;

/**
 *
 * @author Javi
 */
public class Ejercicio2 {
    String cadena;

    public Ejercicio2() {
    }

    
    public Ejercicio2(String cadena) {
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
    public String invertir(){
        char caracter = ' ';
        System.out.print("La cadena invertida es: ");
        for(int i = cadena.length()-1; i >= 0; i--){
            caracter = cadena.charAt(i);
            System.out.print(caracter);
        }
        return "";
    }

}
