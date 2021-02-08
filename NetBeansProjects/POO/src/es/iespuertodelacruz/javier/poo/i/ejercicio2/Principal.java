/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.poo.i.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Inserte el dni de la persona 1");
        String dni = sn.nextLine();
        System.out.println("Inserte el nombre de la persona 1 ");
        String nombre = sn.nextLine();
        System.out.println("Inserte los apellidos de la persona 1 ");
        String apellidos = sn.nextLine();
        System.out.println("Inserte la edad de la persona 1");
        int edad = sn.nextInt();
        Persona persona1 = new Persona(dni, nombre, apellidos, edad);
        System.out.println(persona1.imprime() + persona1.esMayorEdad(edad));
        System.out.println("Es jubilado: "+persona1.esJubilado(edad));
        
        System.out.println("Inserte el dni de la persona 2");
        dni = sn.nextLine();
        System.out.println("Inserte el nombre de la persona 2");
        nombre = sn.nextLine();
        System.out.println("Inserte los apellidos de la persona 2");
        apellidos = sn.nextLine();
        System.out.println("Inserte la edad de la persona 2");
        edad = sn.nextInt();        
        Persona persona2 = new Persona(dni, nombre, apellidos, edad);
        System.out.println(persona2.imprime() + persona2.esMayorEdad(edad));
        System.out.println("Es jubilado: "+persona2.esJubilado(edad));
        
        System.out.println("La diferencia de edad es: " + persona1.diferenciaEdad(persona2));
    }
}
