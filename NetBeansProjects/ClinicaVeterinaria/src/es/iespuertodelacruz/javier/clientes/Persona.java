
package es.iespuertodelacruz.javier.clientes;

import es.iespuertodelacruz.javier.animales.Animal;
import es.iespuertodelacruz.javier.vista.MenuPersona;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Persona{
    
    private String email;
    private String direccion;
    private int telefono;
    private ArrayList<Animal> animales;
    private Animal animal;
    
    
    public Persona(String email, String direccion, int telefono) {               
        if(direccion.equals("")){
            System.err.println("Error. La direccion no puede ir vacia");       
        }else{
            this.email = email;
            this.direccion = direccion;
            this.telefono = telefono;
            this.animales = new ArrayList();
        }
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if(direccion == ""){
            System.err.println("Error. La direccion no puede ir vacia");
        }else{
            this.direccion = direccion;
        }
        
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if(telefono == Integer.parseInt("")){
            System.err.println("Error. El telefono no puede ir vacio");
        }else{
           this.telefono = telefono; 
        }
        
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Persona{" + "email=" + email + ", direccion=" + direccion + 
                ", telefono=" + telefono + ", animales=" + animales
                + ", animal=" + animal + '}';
    }
   
     /**
     * Funcion para comprobar el email de las personas.
     * @param email
     * @param expresion
     * @return email
     */
    public static String comprobarEmail(String email, String expresion) {
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches() || email == "") {
            email = "";
            System.err.println("Error en el email");
        }

        return email;
    }
    
    /**
     * Funcion para comprobar el telefono de la persona juridica
     * @param telefono
     * @param expresionTelefono
     * @return int
     */
    public static int comprobarTelefono(int telefono, String expresionTelefono) {
        Pattern pattern = Pattern.compile(expresionTelefono);
        Matcher matcher = pattern.matcher(Integer.toString(telefono));

        if (!matcher.matches()) {
            telefono = 0;
            System.err.println("Error en el telefono");
        }

        return telefono;
    }
    
}
