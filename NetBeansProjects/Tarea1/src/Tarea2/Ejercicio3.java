/*
 * 3.- Escribe un programa que determine el total a pagar por una llamada telefónica,
 * teniendo en cuenta lo siguiente: toda llamada que dure hasta 5 minutos tiene un importe 
 * de 2€ y por cada minuto adicional se cobrarán 0,50€. Se debe pedir al usuario el tiempo 
 * de duración de la llamada.
 */
package Tarea2;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio3 {
    
    /**
     * Metodo principal para llamar al metodo pedirDatos().
     * @param args 
     */
    public static void main(String[] args){
        
        pedirDatos();
    }
    
    /**
     * Metodo para pedir los datos al usuario.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte el tiempo de la llamada");
        int tiempo = sn.nextInt();
        
        System.out.println(calcularImporte(tiempo));
        
        return "";
    }
    
    /**
     * Metodo para calcular el total del importe de la llamada.
     * @param tiempo
     * @return 
     */
    public static String calcularImporte(int tiempo){
        double importe = 2;
         
        if (tiempo <= 5){
            return importe + " euros";

        }else{
            importe = importe+((tiempo-5)*0.5);
            return importe + " euros";
        }              
    }
}
