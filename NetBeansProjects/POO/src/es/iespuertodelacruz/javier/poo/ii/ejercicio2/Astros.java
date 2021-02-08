/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.poo.ii.ejercicio2;

/**
 *
 * @author Javi
 */
public abstract class Astros {
    private String nombre;
    private double radio;
    private double rotacionEje;
    private double masa;
    private double temperaturaMedia;
    private double gravedad;

    public Astros(String nombre, double radio, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacionEje() {
        return rotacionEje;
    }

    public void setRotacionEje(double rotacionEje) {
        this.rotacionEje = rotacionEje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
    
    public abstract void muestra();
    
}
