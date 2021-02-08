/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier;

import java.util.ArrayList;
import java.util.Scanner;
import es.iespuertodelacruz.javier.exceptions.AsignaturaException;

/**
 *
 * @author Javi
 */
public class Principal {

    static ArrayList<ArrayList> asignaturas = new ArrayList();
    static Scanner sn = new Scanner(System.in);
    public static void main(String[] args) throws AsignaturaException {
        
        asignaturas.add(new ArrayList<String>());
        asignaturas.add(new ArrayList<Double>());
        
        asignaturas.get(0).add("Matematicas");
        asignaturas.get(0).add("Fisica");
        asignaturas.get(0).add("Quimica");
        asignaturas.get(0).add("Historia");
        asignaturas.get(0).add("Lenguaje");
        
        asignarNotas(asignaturas);
        mostrarAsignaturas(asignaturas);
        eliminarAsignatura(asignaturas);
        if(asignaturas.get(0).isEmpty()){
            System.out.println("Tienes todo aprobado! Felicidades!");
        }else{
            System.out.println("Tienes que recuperar las siguientes asignaturas: ");
            mostrarAsignaturas(asignaturas);
        }
        
        System.out.println("Agregamos una nueva asignatura");
        String asignatura = sn.nextLine();
        comprobarAsignatura(asignaturas, asignatura);
        
    }
    
    /**
     * Metodo para asignar las notas a la asignatura correspondiente
     * @param asignaturas 
     */
    private static void asignarNotas(ArrayList<ArrayList> asignaturas){      
        for (int i = 0; i < asignaturas.get(0).size(); i++) {
            System.out.println("¿Cual es la nota de la asignatura "+ asignaturas.get(0).get(i)+" ?");
            double nota = sn.nextDouble();
            asignaturas.get(1).add(nota);
        }            
        sn.skip("\n");
    }
    
    /**
     * Metodo para mostrar la lista de asignaturas con sus notas
     * @param asignaturas 
     */
    private static void mostrarAsignaturas(ArrayList<ArrayList> asignaturas){
        for (int i = 0; i < asignaturas.get(0).size(); i++) {
            System.out.println("Asignatura: " + asignaturas.get(0).get(i)
                    + " Nota: " + asignaturas.get(1).get(i));
        }
    }
    
    /**
     * Metodo para eliminar una asignatura si esta aprobada
     * @param asignaturas 
     */
    private static void eliminarAsignatura(ArrayList<ArrayList> asignaturas ){        
        for (int i = 0; i < asignaturas.get(1).size(); i++) {
            if((Double)asignaturas.get(1).get(i)>=5){
                asignaturas.get(0).remove(i); 
                asignaturas.get(1).remove(i);
                eliminarAsignatura(asignaturas);
                //Hacemos recurisiva para que el tamanio cambie desde
                //que se elimina un elemento. Es la unica forma que se me ocurrio.
            }
        }
        
    }
    
    /**
     * Metodo para comprobar si existe la asignatura
     * @param listaAsignaturas
     * @param asignatura
     * @throws AsignaturaException 
     */
    private static void comprobarAsignatura(ArrayList asignaturas, String asignatura) throws AsignaturaException{  
        if(asignaturas.contains(asignatura)){
            throw new AsignaturaException("La asignatura ya existe");
        }else{
            asignaturas.add(asignatura);
        }
        
    }
    
}
