/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.trabajadores;

/**
 *
 * @author Javi
 */
public abstract class Tecnico extends Empleado{
    
    public String especialidad;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
     
    
    public abstract String mostrarEspecialidad();
}
