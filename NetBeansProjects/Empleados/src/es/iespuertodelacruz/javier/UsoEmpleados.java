
package es.iespuertodelacruz.javier;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class UsoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Empleado listaEmpleado[] = new Empleado[3];
        
//        listaEmpleado[0] = new Empleado("Ana", 45, 2500);
//        listaEmpleado[1] = new Empleado("Antonio", 55, 2000);
//        listaEmpleado[2] = new Empleado("Maria", 25, 2600);

        ArrayList<Empleado> listaEmpleado = new ArrayList();

        listaEmpleado.add(new Empleado("Ana", 45, 2500));
        listaEmpleado.add(new Empleado("Antonio", 55, 2000));
        listaEmpleado.add(new Empleado("Maria", 25, 2600));
        
//        for (Empleado empleado : listaEmpleado) {
//            System.out.println(empleado.dameDatos());
//        }
        
        for (int i = 0; i < listaEmpleado.size(); i++) {
            System.out.println(listaEmpleado.get(i).dameDatos());
        }
        
    }
    
}
