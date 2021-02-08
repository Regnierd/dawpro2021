/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.animales;

import es.iespuertodelacruz.javier.clientes.Persona;
import es.iespuertodelacruz.javier.vista.MenuPersona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Animal extends MenuPersona {

    Scanner sn = new Scanner(System.in);
    String tipo;
    String nombre;
    int edad;
    Persona persona;
    Historico historico;
    ArrayList<Diagnostico> diagnosticos;

    public Animal(String tipo, String nombre, int edad, Persona persona) {
        if (tipo == "") {
            System.err.println("Error. El tipo no puede ir vacio");
        }else if (nombre == "") {
            System.err.println("Error. El nombre no puede ir vacio");
        }else if (edad == 0) {
            System.err.println("Error. La edad no puede ser 0");
        }else{
            this.tipo = tipo;
            this.nombre = nombre;
            this.edad = edad;
            this.persona = persona;
            this.diagnosticos = new ArrayList();
        }
        

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == "") {
            System.err.println("Error. El tipo no puede ir vacio");
        } else {
            this.tipo = tipo;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == "") {
            System.err.println("Error. El nombre no puede ir vacio");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad == Integer.parseInt("")) {
            System.err.println("Error. La edad no puede ir vacia");
        } else {
            this.edad = edad;
        }
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(ArrayList<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    @Override
    public String toString() {
        return "Animal{" + ", tipo=" + tipo + ", Nombre=" + nombre
                + ", edad=" + edad + ", persona=" + persona + ", historico="
                + historico + ", diagnosticos=" + diagnosticos + '}';
    }

}
