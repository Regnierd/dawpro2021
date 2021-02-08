    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.formas;

/**
 *
 * @author Javi
 */
public class Cuadrado extends Rectangulo {

    
    public Cuadrado(double ladoMenor, double ladoMayor, String color, double punto, String nombre) {
        super(ladoMenor, ladoMayor, color, punto, nombre);
    }
    
   
    @Override
    /**
     * Funcion para imprimir los datos del rectangulo.
     */
    public String imprimir() {
        return "Cuadrado{" + "nombre: " + this.nombre + " centro: " + this.punto + " color: "+ this.color 
                + " lado = " + ladoMenor + '}';
    }
    
    
}
