/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.empleados;

/**
 *
 * @author Javi
 */
public class Auxiliar extends Personal{

    public Auxiliar(String nombre, String apellidos, String FechaContratacion) {
        super(nombre, apellidos, FechaContratacion);
    }
    
    @Override
    public String toString() {
        return "Veterinario{" + "Nombre: " + getNombre() + " Apellidos: " + 
                getApellidos() + " Fecha de contratacion: " + getFechaContratacion()+'}';
    }
}
