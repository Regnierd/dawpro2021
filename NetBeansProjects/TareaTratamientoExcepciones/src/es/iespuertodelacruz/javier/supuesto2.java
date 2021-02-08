/**
 * Realiza un programa que lea un mes y un anio en formato numerico e indique el
 * numero de dias de ese mes. Para realizar este ejercicio hay que tener en cuenta
 * que un anio es bisiesto si es divisible por cuatro, excepto cuando es divisible por 100, 
 * a no ser que sea divisible por 400. Se tendra en cuenta la prevencion, mediante excepciones,
 * de posibles errores aritmeticos en los calculos matematicos (ArithmeticException), 
 * en cuyo caso el programa finalizara con un mensaje de error.
 */
package es.iespuertodelacruz.javier;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author javier
 */
public class supuesto2 {
    
    /**
     * Funcion principal para llamar a la funcion pedirDatos().
     * @param args 
     */
    public static void main(String[] args){
        
        pedirDatos();
    }
    
    /**
     * Funcion para pedir datos controlado por dos excepiones.
     * @return 
     */
    public static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        
        try{
            System.out.println("Inserte un mes en formato numerico.");
            int mes = sn.nextInt();
            System.out.println("Inserte un anio en formato numerico.");
            int anio = sn.nextInt();
            System.out.println(calcularDias(mes, anio)); 
        }catch(ArithmeticException e){
            System.out.println("Error." + e.getMessage());
        }catch(InputMismatchException ex){
            System.out.println("Error. Inserte un numero entero." + ex.toString());
        }
        
        return "";
    }
    
    /**
     * Funcion para calcular los dias del mes pasado por teclado.
     * @param mes
     * @param anio
     * @return 
     */
    public static String calcularDias(int mes, int anio){
        int dias = 0;
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                if((anio%4 == 0) && ((anio%100 != 0) || (anio%400 == 0))){
                    System.out.println("El anio es bisiesto");
                    dias = 29;
                }else{
                    System.out.println("El anio no es bisiesto");
                    dias = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                System.out.println("Inserte correctamente el mes en formato numerico y que este entre 1-12.");
        }
        return "Tiene " + dias + " el mes " + mes + " en el anio " + anio;
    }
}
