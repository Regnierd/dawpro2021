
package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.animales.Animal;
import es.iespuertodelacruz.javier.animales.ElementoHistorico;
import es.iespuertodelacruz.javier.animales.Historico;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuHistorico {
   
    public static void subMenu(Animal animal ) {
        Scanner sn = new Scanner(System.in);
        Scanner intsn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        ArrayList<ElementoHistorico> elementoHistoricos = new ArrayList();
        Historico historico = null;
        ElementoHistorico elementoHistorico = new ElementoHistorico();
        while(!salir){
            System.out.println("---------------------------------------------");       
            System.out.println("-- ¿Quiere crear un historial del animal? ---");
            System.out.println("---------------------------------------------");
            System.out.println("--    1. Si                                --");
            System.out.println("--    2. No                                --");
            System.out.println("---------------------------------------------");
            
            try{
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
                
                switch(opcion){
                    case 1:                  
                        historico = new Historico(animal);      
                        System.out.println("Hitorico creado!");
                        elementoHistoricos.add(elementoHistorico);                       
                        historico.getElementosHistoricos().add(elementoHistorico);
                        System.out.println(historico.toString());
                        break;
                    case 2:                            
                        salir = true;                            
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe de inserte un numero");
            }
        }
    }
}
