/*
 * 2.- Elabora un programa que solicite la medida en pies y realice la conversión a
 * pulgadas, cm y metros. Ten en cuenta que un pie tiene 12 pulgadas y una pulgada equivale a 2.54 cm.    
 */
package Tarea2;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio2 {
    
    /**
     * Metodo principal para llamar al metodo pedirDatos().
     * @param args 
     */
    public static void main(String[] args){
        System.out.println("Vamos a convertir de pies a pulgadas, cm y metros");
        pedirDatos();
    }
    
    /**
     * Metodo para pedir los datos al usuario.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte la medida en pies");
        double pies = sn.nextDouble();
        System.out.println(calcularPulgadas(pies));
        
        return "";
    }
    
    /**
     * Metodo para calcular las pulgadas que nos dio el usuario en pies.
     * @param pies
     * @return 
     */
    public static String calcularPulgadas(double pies){
        double pulgadas = pies*12;
        System.out.println(calcularCm(pulgadas));
        return pulgadas + " pulgadas";
    }
    
    /**
     * Metodo para calcular los centimentros que nos dio el usuario en pies.
     * @param pulgadas
     * @return 
     */
    public static String calcularCm(double pulgadas){
        double centimetros = pulgadas * 2.54;
        System.out.println(calcularMetros(centimetros));
        return centimetros + "cm";
    }
    
    /**
     * Metodo para calcular los metros que nos dio el usuario en pies.
     * @param centimetros
     * @return 
     */
    public static String calcularMetros(double centimetros){
        double metros = centimetros / 100;
        return metros + "m";
    }
}
