
package es.iespuertodelacruz.javier;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Principal {
    
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        Scanner sn = new Scanner(System.in);
        Gestion gestion = null;
        String marca;
        String modelo;
        String matricula;
        while(!salir){
            Coche coche = null;
            try{
                System.out.println("1. Inserte un coche\n"
                        + "2. Eliminar un coche\n"
                        + "3. Buscar un coche");
                System.out.println("Eliga una opcion");
                opcion = sn.nextInt();
                sn.skip("\n");
                switch(opcion){
                    case 1: 
                        System.out.println("Inserte una marca del coche");
                        marca = sn.nextLine();
                        System.out.println("Inserte un modelo del coche");
                        modelo = sn.nextLine();
                        System.out.println("Inserte una matricula del coche");
                        matricula = sn.nextLine();                      
                        coche = new Coche(marca, modelo, matricula);
                        gestion.insertar(coche);
                        break;
                    case 2:
                        System.out.println("Inserte la matricula para eliminar el coche");
                        matricula = sn.nextLine(); 
                        gestion.eliminar(matricula);
                        break;
                    case 3:
                        System.out.println("Inserte la matricula para buscar el coche");
                        matricula = sn.nextLine(); 
                        gestion.buscar(matricula);
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Inserte un numero entre 1y4");
                }
            }catch(InputMismatchException ex){
                System.out.println("Error. Inserte un entero." + ex.getMessage());
            }
        }
    }

}
