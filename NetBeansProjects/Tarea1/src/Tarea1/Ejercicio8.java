/*
 * 8.- Diseña un programa Java que calcule la suma, resta, multiplicación y división
 * de dos números introducidos por teclado. Incorpora también las funciones que permitan
 * realizar la potencia de un número y la raíz cuadrada del otro. Salida del programa para x=9, y=3: 
 */
package Tarea1;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio8 {
    
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
    static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte el primer numero");
        double c1 = sn.nextInt();
        System.out.println("Inserte el segundo numero");
        double c2 = sn.nextInt();
        System.out.println(sumar(c1, c2));
        System.out.println(restar(c1, c2));
        System.out.println(multiplicar(c1, c2));
        System.out.println(dividir(c1, c2));
        System.out.println(calcularPotencia(c1));
        System.out.println(calcularRaiz(c1));
        return "";
    }
    
    /**
     * Metodo para calcular la suma de dos numeros.
     * @param c1
     * @param c2
     * @return 
     */
    static String sumar(double c1, double c2){
        double resultado = c1 + c2;
        return "La suma es: " + resultado;
    }
    
    /**
     * Metodo para calcular la resta de dos numeros.
     * @param c1
     * @param c2
     * @return 
     */
    static String restar(double c1, double c2){
        double resultado = c1 - c2;
        return "La resta es: " + resultado;
    }
    
    /**
     * Metodo para calcular la multiplicacion de dos numeros.
     * @param c1
     * @param c2
     * @return 
     */
    static String multiplicar(double c1, double c2){
        double resultado = c1 * c2;
        return "La multiplicacion es: " + resultado;
    }
    
    /**
     * Metodo para calcular la division de dos numeros.
     * @param c1
     * @param c2
     * @return 
     */
    static String dividir(double c1, double c2){
        double resultado = c1 / c2;
        return "La division es: " + resultado;
    }
    
    /**
     * Metodo para calcular la potencia de un numero.
     * @param c1
     * @param c2
     * @return 
     */
    static String calcularPotencia(double c1){
        double resultado = c1*c1;
        return "La potencia es: " + resultado;
    }
    
    /**
     * Metodo para calcular la raiz cuadrada de un numero.
     * @param c1
     * @param c2
     * @return 
     */
    static String calcularRaiz(double c1){
        double resultado = Math.sqrt(c1);
        return "La raiz cuadrada es: " + resultado;
    }
    
}
