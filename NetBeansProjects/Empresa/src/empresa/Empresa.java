
package empresa;

import es.iespuertodelacruz.javier.empleados.Oficial;
import es.iespuertodelacruz.javier.empleados.Tecnico;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Empresa {
    
    public static void main (String [] args){
        Scanner sn = new Scanner(System.in);
        Tecnico tecnico = new Tecnico("Pedro");
        System.out.println(tecnico.toString());
        Oficial oficial = new Oficial("Pepe");
        System.out.println(oficial.toString());
    }
}
