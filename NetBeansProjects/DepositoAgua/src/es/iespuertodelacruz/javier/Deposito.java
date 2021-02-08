/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Deposito {
    final float MAXIMO_CAPACIDAD = 50L;
    final float MAXIMO_VOLUMEN = 50L;
    float capacidad;
    float volumenActual;

    public Deposito() {
        this.capacidad = 0;
        this.volumenActual = 0;
    }

    
    public Deposito(float capacidad) { 
        setCapacidad(capacidad);
        setVolumenActual(0);
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {      
        if (capacidad < 0 ) {
            this.capacidad = 0;
        } else if (capacidad > MAXIMO_CAPACIDAD) {
            this.capacidad = MAXIMO_CAPACIDAD;
        }
    }

    public float getVolumenActual() {
        return volumenActual;
    }

    public void setVolumenActual(float volumenActual) {
       if (volumenActual < 0 ) {
            this.volumenActual = 0;
        } else if (volumenActual > MAXIMO_VOLUMEN) {
            this.volumenActual = MAXIMO_VOLUMEN;
        }
    }
    
    /**
     * Funcion para agregar agua al deposito
     * @param cantidad
     * @return 
     */
    public float agregarAgua(float cantidad) {
        float desborda = 0;
     
        if (cantidad < 0 ) {    
            this.capacidad = 0;
        } else if ((capacidad + cantidad) > MAXIMO_CAPACIDAD) {
            this.capacidad = MAXIMO_CAPACIDAD;
            desborda = capacidad + cantidad - MAXIMO_CAPACIDAD;   
        } else if((capacidad + cantidad) < MAXIMO_CAPACIDAD){
            desborda = capacidad + cantidad;
        } 
        
        return desborda;
    }
    
    /**
     * Funcion para quitar agua al deposito
     * @param cantidad 
     */
    public void quitarAgua(float cantidad) {
        if(this.capacidad == 0){
            System.out.println("No hay agua que quitar.");
        }else if(cantidad > this.capacidad){
            System.out.println("No se puede quitar mas agua del volumen actual.");
        }else {
            this.capacidad -= cantidad;
            System.out.println("Agua quitada");
        } 
    }

    @Override
    public String toString() {
        return "Deposito{" + "MAXIMO_CAPACIDAD=" + MAXIMO_CAPACIDAD + ", MAXIMO_VOLUMEN=" + MAXIMO_VOLUMEN + ", capacidad=" + capacidad + ", volumenActual=" + volumenActual + '}';
    }
    
    

}
