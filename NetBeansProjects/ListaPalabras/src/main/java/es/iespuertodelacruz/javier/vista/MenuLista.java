
package es.iespuertodelacruz.javier.vista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuLista {
    
    /**
     * Metodo para crear la lista con un menu
     */
    public static void crearLista(ArrayList<String> listaPalabras) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            try {
                System.out.println("¿Quiere insertar una palabra a la lista?\n"
                        + " 1. Si\n"
                        + " 2. No");
                opcion = sn.nextInt();
                sn.skip("\n");
                switch (opcion) {
                    case 1:
                        System.out.println("Inserte una palabra a la lista");
                        String palabra = sn.nextLine();
                        listaPalabras.add(palabra);
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Tiene que poner 1 o 2.");
                }        
            }catch(InputMismatchException ex){
                System.out.println("Error. Numero entero");
            }

        }
    }
}
