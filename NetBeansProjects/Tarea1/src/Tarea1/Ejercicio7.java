/*
 *  7.- Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), 
 *   suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
 *   C1x + C2 = 0
 */
package Tarea1;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Ejercicio7 {
    
    /**
     * Metodo principal para llamar a otros metodos.
     * En este caso llamamos a pedirDatos().
     * @param args 
     */
    public static void main(String[] args){
    
        pedirDatos();
      
    }
    
    /**
     * Metodo que se encarga de pedir datos al usuario.
     * @return vacio
     */
    static String pedirDatos(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte el primer numero que correspondera con C1");
        float c1 = sn.nextInt();
        System.out.println("Inserte el segundo numero que correspondera con C2");
        float c2 = sn.nextInt();
        System.out.println(calcularEcuacion(c1, c2));
        return "";
    }
    
    /**
     * Metodo para calcular la ecuacion de grado 1.
     * @param c1
     * @param c2
     * @return x
     */
    static float calcularEcuacion(float c1, float c2){
        float x = 0;
        if (c1==0){
            System.out.println("No se puede dividir entre 0.");
        }else{
            x = (-c2)/c1;
             
        }
        return x;
    }
}
