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
public class Elipse extends Forma{
   double radioMayor;
   double radioMenor;

   //Constructores
   public Elipse(double radioMenor, String color, double punto, String nombre){
       super(color, punto, nombre);
       this.radioMenor = radioMenor;
   }
   
    public Elipse(double radioMayor, double radioMenor, String color, double punto, String nombre) {
        super(color, punto, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    
    //Getter/Setter
    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }
   
    /**
     * Funcion para calcular el area de una elipse.
     * @return float
     */
   public double area(){
       return Math.PI*(radioMayor*radioMenor);
   }
   
   @Override
   /**
    * Funcion para imprimir los datos de una elipse.
    */
   public String imprimir(){
       return "Elipse{" + "nombre: " + this.nombre + " centro: " + this.punto + " color: "+ this.color 
                + " radioMenor = " + radioMenor + ", radioMayor = " + radioMayor + '}';
   }
}
