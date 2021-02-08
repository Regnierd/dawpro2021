/**
 * Realiza un programa que lea un número entero e indique si es par o impar. 
 * Debes incorporar un control de excepciones a la entrada de datos para prevenir
 * la introducción de un dato que no sea un número entero (InputMismatchException),
 * finalizando el programa con un mensaje de error en caso contrario.
 */
package es.iespuertodelacruz.javier;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author javier
 */
public class supuesto1 {

    /**
     * Funcion principal para llamar a la funcion pedirDatos().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pedirDatos();
    }
    
    /**
     * Funcion para pedir los datos.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es par o impar.");
        try{
            int numero = sn.nextInt();
            System.out.println(calcularPar(numero));
        }catch (InputMismatchException e){
            System.out.println("Error. Introduce un numero entero. " + e.toString());
        }finally{
            System.out.println("Se ha ejecutado todo correctamente.");
        }
        return "";
    }
    
    /**
     * Funcion para calcular si es par o impar
     * @param numero
     * @return 
     */
    public static String calcularPar(int numero){
        if (numero%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        return "";
    }
    
}
