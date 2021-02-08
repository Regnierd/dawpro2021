/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier;
import es.iespuertodelacruz.javier.vocales.CalcularVocales;
import es.iespuertodelacruz.javier.vocales.InvertirCadena;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class CantidadVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto.");
        String cadena = sn.nextLine(); //leemos la cadena
        
        //Creamos el objeto CalcularVocales pasandole como parametro cadena.
        CalcularVocales calcularVocales = new CalcularVocales(cadena);
        //Imprimos el valor que da la cadena llamando a la funcion calcular().
        System.out.println("La cantidad de vocales es: " + calcularVocales.calcular(cadena));
        
        //Creamos el objeto InvertirCadena pasandole como parametro cadena.
        InvertirCadena invertirCadena = new InvertirCadena(cadena);
        //Imprimos la cadena invertida llamando a la funcion invertir().
        invertirCadena.invertir();
        System.out.println("");
    }
    
    
    
    
    
}
