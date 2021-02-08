/*
 * 1.- Desarrolla un programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado
 */
package Tarea2;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio1 {
    
    /**
     * Metodo principal para llamar al metodo pedirDatos().
     * @param args 
     */
    public static void main(String [] args){
        System.out.println("Vamos a convertir una velocidad en km/h a m/s");
        pedirDatos();
    }
    
    /**
     * Metodo para pedir los datos al usuario.
     * @return 
     */
    public static String pedirDatos(){
        
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte una velocidad en KM");
        int velocidadKm = sn.nextInt();
        
        System.out.println(calcularMetros(velocidadKm));
        return "";
    }
    
    /**
     * Metodo para calcular la velocidad en m/s.
     * @param velocidadKm
     * @return 
     */
    public static String calcularMetros(int velocidadKm){
        
        double velocidadMetros = velocidadKm*1000/3600;
        return velocidadMetros + " m/s";
    }
}
