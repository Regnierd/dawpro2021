/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.poo.ii.ejercicio3;

/**
 *
 * @author Javi
 */
public class Canario extends Aves{
    private String color;
    private boolean canta;
    
    
    public Canario(String color, boolean canta, String pico, boolean vuela, String nombre, int edad, Estado estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.color = color;
        if(getEstado() == Estado.Muerto){
            setCanta(false);
        }else{
            this.canta = canta;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        if(getEstado() == Estado.Muerto){
            setCanta(false);
        }
        this.canta = canta;
    }
    
    
    
    @Override
    public String volar() {
        if(isVuela() == false){
            return "El canario no puede volar porque esta muerto por desgracia el pobre...";
        }
        return "El canario esta volando";
    }

    @Override
    public String mostrar() {
        return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Estado: " + getEstado() + " Fecha de nacimiento: " + getFechaNacimiento()
                + this.color + " Habla: " + this.canta + " Pico: " + getPico() + " Vuela: " + isVuela();
    }

    @Override
    public String hablar() {
        if(isCanta()==false){
            return "El canario no puede hablar porque esta muerto por desgracia el pobre...";
        }
        return "El canario esta hablando";
    }
    
}
