
package es.iespuertolacruz.javier;

import java.util.ArrayList;

/**
 *
 * @author javier
 *
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

    
    public Deposito(float capacidad, float volumenActual) { 
        setCapacidad(capacidad);
        setVolumenActual(volumenActual);
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
    
    
    public void agregarAgua(float cantidad) {
        
        if (cantidad < 0 ) {    
            this.capacidad = cantidad;
        } else if (capacidad > MAXIMO_CAPACIDAD) {
            this.capacidad = MAXIMO_CAPACIDAD;
            capacidad -= MAXIMO_CAPACIDAD;
            float capacidadRestante = capacidad;
            crearDeposito(capacidadRestante);
        } else {
            this.capacidad = MAXIMO_CAPACIDAD;
        }
        
    }
    
    public void quitarAgua(float cantidad) {
        if(this.volumenActual == 0){
            System.out.println("No hay agua que quitar.");
        }else if(cantidad > this.volumenActual){
            System.out.println("No se puede quitar mas agua del volumen actual.");
        }else {
            this.volumenActual -= cantidad;
            System.out.println("Agua quitada");
        } 
    }
    
    public void crearDeposito(float capacidadRestante){
        ArrayList depositos = new ArrayList();
        Deposito depositoNuevo = new Deposito(capacidadRestante, this.volumenActual);
        depositos.add(depositoNuevo);
    }
}
