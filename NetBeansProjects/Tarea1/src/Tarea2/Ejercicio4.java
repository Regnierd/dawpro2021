/*
 * Determinar el área de un círculo y volumen de una esfera cuyo radio es un dato de entrada. 
 */
package Tarea2;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio4 {
    
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
        System.out.println("Inserte un radio para calcular el area de un circulo y"
                + " el volumen de una esfera");
        double radio = sn.nextDouble();
        System.out.println(calcularAreaCirculo(radio));
        System.out.println(calcularVolumenEsfera(radio));
        return "";
    }
    
    /**
     * Metodo para calcular el area de un circulo mediante un radio dado por el usuario.
     * @param radio
     * @return 
     */
    public static String calcularAreaCirculo(double radio){
        
        double area = Math.PI * (Math.pow(radio, 2));
        return area + "cm2";
    }
    
    /**
     * Metodo para calcular el area de un circulo mediante un radio dado por el usuario.
     * @param radio
     * @return 
     */
    public static String calcularVolumenEsfera(double radio){
        
        double volumen = (4/3) * (Math.PI * Math.pow(radio, 3));
        return volumen + "cm3";
    }
}
