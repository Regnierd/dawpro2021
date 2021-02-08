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
public class Perro extends Mascota {
    private String raza;
    private boolean pulgas;

    public Perro(String raza, boolean pulgas, String nombre, int edad, Estado estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    

    @Override
    public String mostrar() {
       return "Raza: " + this.raza + " Pulgas: " + this.pulgas + " Nombre: " + getNombre()
               + " Edad: " + getEdad() + " Estado: " + getEstado()+ " Fecha de nacimiento: " + getFechaNacimiento();
    }

    @Override
    public String hablar() {
        if(getEstado() == Estado.Muerto){
            return "El perro no puede ladrar porque esta muerto el pobre...";
        }
        return "El perro esta ladrando";
    }
    
}
