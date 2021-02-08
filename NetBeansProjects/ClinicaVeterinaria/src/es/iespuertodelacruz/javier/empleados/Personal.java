/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.empleados;

import es.iespuertodelacruz.javier.animales.Diagnostico;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Personal {
    private String nombre;
    private String apellidos;
    private String fechaContratacion;
    private ArrayList<Diagnostico> diagnosticos;
    
    
    public Personal(String nombre, String apellidos, String fechaContratacion) {
        if(nombre == ""){
            System.err.println("Error. El nombre no puede ir vacio");
        }else if(apellidos == ""){
            System.err.println("Error. Los apellidos no pueden ir vacios");
        }else{
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fechaContratacion = fechaContratacion;
            this.diagnosticos = new ArrayList();
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre == ""){
            System.err.println("Error. El nombre no puede ir vacio");
        }else{
            this.nombre = nombre;
        }
       
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if(apellidos == ""){
            System.err.println("Error. Los apellidos no pueden ir vacios");
        }else{
            this.apellidos = apellidos;
        }
        
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }
    
    /**
     * Funcion para comprobar la fecha
     * @param fecha
     * @param expresionFecha
     * @return String
     */
    public static String comprobarFecha(String fechaContratacion, String expresionFecha){
        Pattern pattern = Pattern.compile(expresionFecha);
        Matcher matcher = pattern.matcher(fechaContratacion);

        if (!matcher.matches()) {
            fechaContratacion = "";
            System.err.println("Error en la fecha");
        }

        return fechaContratacion;
    }
    
}
