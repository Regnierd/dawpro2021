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
public class Rectangulo extends Forma {
    double ladoMenor;
    double ladoMayor;
    
    
    public Rectangulo(double ladoMenor, double ladoMayor, String color, double punto, String nombre) {
        super(color, punto, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }
    
    //Getter/Setter
    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
    
    /**
     * Funcion para calcular el area del rectangulo.
     * @return double
     */
    public double area(){
        return ladoMenor*ladoMayor;
    }
    
    /**
     * Funcion para calcular el perimetro del rectangulo.
     * @return float
     */
    public double perimetro(){
        return (2*ladoMenor)+(2*ladoMayor);
    }
    
    /**
     * Funcion para cambiar el tamanio de la forma.
     * @param escala
     * @return float.
     */
    public double cambiarTamanio(float escala){
        ladoMenor *= escala;
        ladoMayor *= escala;

        return ladoMenor*ladoMayor;
    }
    
    @Override
    /**
     * Funcion para imprimir los datos del rectangulo.
     */
    public String imprimir() {
        return "Rectangulo{" + "nombre: " + this.nombre + " centro: " + this.punto + " color: "+ this.color 
                + " ladoMenor = " + ladoMenor + ", ladoMayor = " + ladoMayor + '}';
    }

    
    
    

    
    
}
