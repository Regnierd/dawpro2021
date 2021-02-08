/**
 * El ejercicio 5 calcula es si el primer numero pasado por teclado es multiplo
 * del segundo numero que se pasa por teclado.
 */
package Tarea1;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio5 {
    
    /**
     * Metodo principal para llamar a otros metodos.
     * En este caso llamamos a pedirDatos().
     * @param args 
     */
    public static void main(String[] args) {
        
        pedirDatos();
        
    }
    
    /**
     * Metodo que se encarga de pedir datos al usuario.
     * @return vacio.
     */
    static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Vamos a calcular si el primer numero pasado es multiplo del segundo numero");
        System.out.println("Inserte el numero 1: ");
        int numero1 = sn.nextInt();
        System.out.println("Inserte el numero 2: ");
        int numero2 = sn.nextInt();;
        System.out.println(mostrarResultado(numero1, numero2));
        return "";
    }
    
    /**
     * Metodo que se encarga de calcular si el numero 1 es multiplo del numero 2.
     * @param numero1
     * @param numero2
     * @return 
     */
    static String mostrarResultado(int numero1, int numero2){
        if (numero2%numero1 == 0){
            return "Es multiplo.";
        }else {
            return "No es multiplo";
        }
    }
}
