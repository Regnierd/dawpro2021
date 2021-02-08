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
public class Gato extends Mascota {
    private String color;
    private Boolean peloLargo;

    public Gato(String color, Boolean peloLargo, String nombre, int edad, Estado estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(Boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
    
    @Override
    public String mostrar() {
        return "Color: " + this.color + " Pulgas: " + this.peloLargo + " Nombre: " + getNombre()
               + " Edad: " + getEdad() + " Estado: " + getEstado()+ " Fecha de nacimiento: " + getFechaNacimiento();
    }

    @Override
    public String hablar() {
       if(getEstado() == Estado.Muerto){
            return "El gato no puede maullar porque esta muerto el pobre...";
        }
        return "El gato esta maullar";
    }
    
    
}
