
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.excepciones.EdadException;
import es.iespuertodelacruz.javier.excepciones.NombreException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javi
 */
public class PrincipalGato {

    static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Gato> listaGatos = new ArrayList();
        
        for (int i = 0; i < 5; i++) {
            pedirDatosGatos(listaGatos);
        }
        
        for (int i = 0; i < listaGatos.size(); i++) {
            listaGatos.get(i).imprimir();
        }
        
    }
    
    private static void pedirDatosGatos(ArrayList<Gato> listaGatos){
        
        System.out.println("Introduce el nombre del gato");
        String nombre = sn.nextLine();
        System.out.println("Introduce la edad del gato");
        int edad = sn.nextInt();
        sn.skip("\n");
        try {
            listaGatos.add(new Gato(nombre, edad));
        } catch (NombreException ne) {
            System.out.println("Error. " + ne.getMessage());
        } catch (EdadException ee) {
            System.out.println("Error. " + ee.getMessage());
        } 
        
    }
    
}
