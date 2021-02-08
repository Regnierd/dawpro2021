package es.iespuertodelacruz.javier;

/**
 *
 * @author javier
 */
public class Tarea3Byte {
   
    /**
     * Funcion principal
     * Programa Java para demostrar el tipo de datos de byte.
     */
    public static void main(String args[]) 
    {
        byte numero = 126;
 
        // byte tiene un valor de 8 bits
        System.out.println(numero);
        
        numero++;
        System.out.println(numero);
         
        // Se desborda aquí porque
        // el byte puede contener valores de -128 a 127
        numero++;
        System.out.println(numero);
         
        // bucle dentro del rango
        numero++;
        System.out.println(numero);
        
        
    }   
    /**
     * Se a cambiado la variable a por numero, para que sea mas descriptivo.
     */
}

