/*
 *9.- Diseña un programa Java que solicite un número de 5 dígitos del teclado,
 * separe el número en sus dígitos individuales y los muestre por pantalla.
 * Por ejemplo, si el número es 53123 que muestre: 5 3 1 2 3
 */
package Tarea1;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class Ejercicio9 {
    
    /**
     * Metodo principal para llamar al metodo pedirDatos().
     * @param args 
     */
    public static void main(String[] args){
        
        pedirDatos();
    }
    
    /**
     * Metodo para pedir los datos al usuario y hacer el control de error por
     * si el usuario inserta mal el numero. Tambien se hace la conversion del 
     * numero entero a una cadena.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        int i = 0;
        int number = 0;
        String numberText;
               
        while(number<10000 || number>99999){
             System.out.println("Inserte un numero de 5 digitos.");
             number = sn.nextInt();
        }
        
        numberText = String.valueOf(number); //convertir el entero a cadena.
        separarCadena(i, numberText);
        
        return "";
    }
    
    /**
     * Metodo para separar la cadena con espacios.
     * @param i
     * @param numberText
     * @return 
     */
    public static String separarCadena(int i, String numberText){
        //Hacemos un bucle para recorrer la cadena y asi poder mostrarla con la
        //separacion.
        for(i = 0;i<numberText.length(); i++){
            System.out.print(numberText.substring(i, (i+1)));
            System.out.print(" ");
        }
        return "";
    }
    
}
