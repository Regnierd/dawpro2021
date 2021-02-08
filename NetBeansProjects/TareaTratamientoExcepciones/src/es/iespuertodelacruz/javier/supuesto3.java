/**
 * Escribe un programa que solicite a un usuario su nombre y edad. 
 * Debe mostrarse cuantos anios tendra dentro de una decada y clasificarle,
 * mediante un mensaje al usuario, según su edad en A[0-25], B[26-50], C[51-...] (Ver leyendas).
 */
package es.iespuertodelacruz.javier;
import java.util.InputMismatchException;
import java.util.Scanner;
        
/**
 *
 * @author javier
 */
public class supuesto3 {
    
    /**
     * Funcion principal donde se llama a la funcion pedirDatos.
     * @param args 
     */
    public static void main(String[] args){
        
        pedirDatos();
    }
    
    /**
     * Funcion para pedir datos al usuario controlado por excepciones.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        try{
            System.out.println("Introduce su nombre.");
            String nombre = sn.next();
            System.out.println("Introduce su edad.");
            int edad = sn.nextInt();
            System.out.println(calcularEdad(nombre, edad));
        }catch(InputMismatchException e){
            System.out.println("Error. Introduce un numero entero. " + e.toString());
        }catch(ArithmeticException e){
            System.out.println("Error." + e.getMessage());
        }
        
        return "";
    }
    
    /**
     * Funcion para calcular la edad dentro de una decada y clasificarle.
     * @param nombre
     * @param edad
     * @return 
     */
    public static String calcularEdad(String nombre, int edad){
        edad += 10;
        
        if(edad<=25){
            System.out.println(nombre + ": Clasificado en: A[0-25] - Tendra: " + edad + " anios.");
        }else if(edad>=26 || edad<=50){
            System.out.println(nombre + ": Clasificado en: B[26-50] - Tendra: " + edad + " anios.");
        }else if(edad>=51 || edad<= 75){
            System.out.println(nombre + ": Clasificado en: C[51-75] - Tendra: " + edad + " anios.");
        }else if(edad>=76 || edad<=100){
            System.out.println(nombre + ": Clasificado en: D[76-100] - Tendra: " + edad + " anios.");
        }else{
            System.out.println(nombre + ": Clasificado en: E[100-...] - Tendra: " + edad + " anios. ¡Qué suerte!");
        }
        return "";
    }
}
