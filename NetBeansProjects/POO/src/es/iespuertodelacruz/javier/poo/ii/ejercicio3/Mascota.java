
package es.iespuertodelacruz.javier.poo.ii.ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public abstract class Mascota {
    
    private String nombre;
    private int edad;
    public enum Estado{Vivo, Muerto};
    private Estado estado;
    private String fechaNacimiento;

    public Mascota(String nombre, int edad, Estado estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    /**
     * Metodo para saber si es el cumpleanios
     * @param fechaNacimiento
     * @return String
     */
    public String cumplirAnio(String fechaNacimiento){
        String felicitacion = "";
        if(this.getFechaNacimiento() == fechaNacimiento){
            felicitacion = "Es su cumpleaños! Felicidades!";
        }
        return felicitacion;
    }
    
    /**
     * Cambiar el estado del animal a muerto.
     */
    public void morir(){
        this.estado = Estado.Muerto;
    }
    
    public abstract String mostrar();
    public abstract String hablar();
    
    
    
    
    
    
    
  
}
