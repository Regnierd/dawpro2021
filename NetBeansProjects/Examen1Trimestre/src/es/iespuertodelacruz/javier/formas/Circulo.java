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
public class Circulo extends Elipse{
    
    double radio; 
    
    //Constructor
    public Circulo( double radioMenor, String color, double punto, String nombre) {
        super(radioMenor, color, punto, nombre);
        this.radio = radioMenor;
    }
    
    //Getter/Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Funcion para calcular el area de un circulo
     * @return
     */
    @Override
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
   
   @Override
   /**
    * Funcion para imprimir los datos de una elipse.
    */
   public String imprimir(){
       return "Circulo{" + "nombre: " + this.nombre + " centro: " + this.punto + " color: "+ this.color 
                + " radio = " + radio + '}';
   }
}
