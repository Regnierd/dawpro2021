package identificadores;

import java.util.Scanner;
/*
*Programa para la creacion de un menu
*/

/**
 *
 * @author javier
 */
public class Identificadores {

    /**
     * Metodo main, que tiene la creación del menu.
     * @param args 
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        
        while(!salir){
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            
            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Tiene que seleccionar una opcion entre el 1 y 4.");
            } 
        } 
    }
    
}
