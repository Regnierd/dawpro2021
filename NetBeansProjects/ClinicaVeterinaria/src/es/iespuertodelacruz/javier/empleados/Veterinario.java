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
public class Veterinario extends Personal {
    private static String expresionFecha = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
    
    public Veterinario(String nombre, String apellidos, String FechaContratacion) {
        super(nombre, apellidos, comprobarFecha(FechaContratacion, expresionFecha));
    }

    @Override
    public String toString() {
        return "Veterinario{" + "Nombre: " + getNombre() + " Apellidos: " + 
                getApellidos() + " Fecha de contratacion: " + getFechaContratacion()+'}';
    }

    
    
    
}
