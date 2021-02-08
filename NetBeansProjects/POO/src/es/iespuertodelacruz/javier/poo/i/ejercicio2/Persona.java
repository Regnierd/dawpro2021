/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.poo.i.ejercicio2;

/**
 *
 * @author Javi
 */
public class Persona {
    private final String DNI;
    private String nombre;
    private String apellidos;
    private int edad;
    private static final int mayoriaEdad = 18;
    
    public Persona(String dni, String nombre, String apellidos, int edad) {
        if(!validarDNI(dni)){
            System.out.println("DNI incorrecto");
            dni = "";
        }
        this.DNI = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return DNI;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Funcion para saber si es mayor de edad
     * @param edad
     * @return 
     */
    public boolean esMayorEdad(int edad){      
        if(edad>= this.mayoriaEdad){
            return true;
        }
        return false;
    }
    
    /**
     * Funcion para saber si es jubilado.
     * @param edad
     * @return 
     */
    public boolean esJubilado(int edad){
        if(edad>=65){
            return true;
        }
        return false;
    }
    
    /**
     * Funcion para calcular la diferencia de edad.
     * @param p
     * @return 
     */
    public int diferenciaEdad(Persona p){
        int diferencia = 0;
        if(this.edad>p.getEdad()){
            diferencia = this.edad - p.getEdad();
        }else{
            diferencia = p.getEdad() - this.edad;
        }
       
        return diferencia;
    }
    
    public static boolean validarDNI(String dni){
        boolean valido = true;
        if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false){
            valido = false;            
        }
        return valido;
    }
    
    public String imprime() {
        return nombre + " " + apellidos + " con DNI: " + DNI + " mayor de edad: ";
    }
    
    
}
