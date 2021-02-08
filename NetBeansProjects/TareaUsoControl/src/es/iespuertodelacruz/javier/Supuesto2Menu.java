/**
 * Escribe un programa que muestre un menú de 5 opciones diferentes (números enteros del 1 al 5; 
 * incluyendo la opción 5 'salir del programa') y permita al usuario seleccionar la opción elegida
 * hasta que pulse SALIR. La gestión del menú sólo debe indicar en cada caso la opción elegida
 * (por ejemplo: 1. Sumar, 2. Restar, 3. Multiplicar 4. Dividir y 5. Salir) y mensaje de error en caso de opción equivocada.
 * Debe incorporarse control de excepciones sobre la entrada de datos (InputMismatchException).
 */
package es.iespuertodelacruz.javier;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author javier
 */
public class Supuesto2Menu {
    
    /**
     * Funcion principal donde llamaremos al metodo mostrarMenu().
     * @param args 
     */
    public static void main(String[] args){
        
        mostrarMenu();
    }
    
    /**
     * Metodo para mostrar el menu.
     * @return 
     */
    public static String mostrarMenu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        double numero1;
        double numero2;
        
        try{
            while(!salir){
                System.out.println("------------------");
                System.out.println("Eliga una opcion: ");
                System.out.println("1. sumar");
                System.out.println("2. restar");
                System.out.println("3. multiplicar");
                System.out.println("4. dividir");
                System.out.println("5. salir");
                System.out.println("------------------");
                System.out.print("Opcion: ");
                int opcion = sn.nextInt();
            
                switch(opcion){
                    case 1: 
                        System.out.println(" - Ha elegido la opcion sumar, inserte dos numeos para realizar la operacion: -");
                        System.out.print("Numero 1: ");
                        numero1 = sn.nextInt();
                        System.out.print("Numero 2: ");
                        numero2 = sn.nextInt();
                        System.out.println(sumar(numero1, numero2) + "\n");
                        break;
                    case 2:
                        System.out.println(" - Ha elegido la opcion restar, inserte dos numeos para realizar la operacion: -");
                        System.out.print("Numero 1: ");
                        numero1 = sn.nextInt();                   
                        System.out.print("Numero 2: ");
                        numero2 = sn.nextInt();
                        System.out.println(restar(numero1, numero2) + "\n");
                        break;
                    case 3:
                        System.out.println(" - Ha elegido la opcion multiplicar, inserte dos numeos para realizar la operacion: -");
                        System.out.print("Numero 1: ");
                        numero1 = sn.nextInt();                    
                        System.out.print("Numero 2: ");
                        numero2 = sn.nextInt();
                        System.out.println(multiplicar(numero1, numero2) + "\n");
                        break;
                    case 4:
                        System.out.println(" - Ha elegido la opcion dividir, inserte dos numeos para realizar la operacion: -");
                        System.out.print("Numero 1: ");
                        numero1 = sn.nextInt();                   
                        System.out.print("Numero 2: ");
                        numero2 = sn.nextInt();
                        System.out.println(dividir(numero1, numero2) + "\n");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa.");
                        salir = true;
                        break;
                }
            
            }
        }catch(InputMismatchException e){
            //Mostraremos el error si el usuario introduce una letra o una cadena de texto.
            System.out.println("Error, Se espera un numero entero. Tipo de error: " + e.toString());
        }finally{
            System.out.println("Se ha ejecutado todo correctamente.");
        }
        return "";
    }
    
    /**
     * Metodo para calcular la suma de dos numeros.
     * @param numero1
     * @param numero2
     * @return 
     */
    public static String sumar(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return "La suma es: " + numero1 + " + " + numero2 + " = "+ resultado;
    }
    
    /**
     * Metodo para calcular la resta de dos numeros.
     * @param numero1
     * @param numero2
     * @return 
     */
    static String restar(double numero1, double numero2){
        double resultado = numero1 - numero2;
        return "La resta es: " + numero1 + " - " + numero2 + " = "+ resultado;
    }
    
    /**
     * Metodo para calcular la multiplicacion de dos numeros.
     * @param numero1
     * @param numero2
     * @return 
     */
    static String multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return "La multiplicacion es: " + numero1 + " * " + numero2 + " = "+ resultado;
    }
    
    /**
     * Metodo para calcular la division de dos numeros.
     * @param numero1
     * @param numero2
     * @return 
     */
    static String dividir(double numero1, double numero2){
        double resultado = numero1 / numero2;
        return "La division es: " + numero1 + " / " + numero2 + " = "+ resultado;
    }
    
}
