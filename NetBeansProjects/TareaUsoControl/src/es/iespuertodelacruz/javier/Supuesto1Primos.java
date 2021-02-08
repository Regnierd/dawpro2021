/**
 * Escribe un programa que lea un número entero y lo descomponga en factores primos. 
 * Debe incorporarse control de excepciones sobre las operaciones aritméticas (ArithmeticException).
 */
package es.iespuertodelacruz.javier;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author javier
 */
public class Supuesto1Primos {

    /**
     * Funcion principal para llamar al metodo pedirDatos.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pedirDatos();
        
        
    }
    
    /**
     * Funcion para pedir datos al usuario.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte un numero para descomponerlo en factores primos.");
        
        int numero = sn.nextInt();
        System.out.print(calcularPrimos(numero));
        return "";
    }
    
    /**
     * Funcion para factorizar los primos del numero ingresado por el usuario.
     * @param numero
     * @return 
     */
    public static String calcularPrimos(int numero){
        int primo = 2;
        try{
            if(numero == 1){
                System.out.println("1 = 1");//Si numero es 1 el resultado es 1
            } else if(numero <= 0){
                System.out.println("No se puede factorizar un numero menor que 0 o el 0.");
            }else{
                System.out.print(numero + " = ");
                while (numero != primo){
                    if (numero%primo == 0){
                        numero = numero / primo;
                        System.out.print(primo + " x ");
                    }else {
                        primo++;
                    }
                }
                System.out.println(primo); //Añade el ultimo numero primo porque sale del bucle sin visualizarlo.
            }
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            System.out.println("Se ha ejecutado todo correctamente.");
        }
        return "";
    }
}
