
package es.iespuertodelacruz.javier;


import es.iespuertodelacruz.javier.clientes.Persona;
import es.iespuertodelacruz.javier.vista.MenuPersona;
import static es.iespuertodelacruz.javier.vista.MenuPersona.getPersonas;
import static es.iespuertodelacruz.javier.vista.MenuPersona.listarClientes;
import es.iespuertodelacruz.javier.vista.MenuPersonal;
import static es.iespuertodelacruz.javier.vista.MenuPersonal.getPersonal;
import static es.iespuertodelacruz.javier.vista.MenuPersonal.listarPersonal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Clinica {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Scanner intsn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
            
            System.out.println("-------------------------------------");
            System.out.println("-- ¡Bienvenidos a nuestra clinica! --");
            System.out.println("-------------------------------------");
            System.out.println("-- ¿Qué operación desea realizar? ---");
            System.out.println("--    1. Registrar un cliente      --");
            System.out.println("--    2. Registrar un empleado     --");
            System.out.println("--    3. Ver todos los clientes    --");
            System.out.println("--    4. Ver todos los empleados   --");
            System.out.println("--    5. Salir                     --");
            System.out.println("-------------------------------------");
            
            try{
                
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
 
                switch(opcion){
                    case 1:                        
                        MenuPersona.subMenu();
                        break;
                    case 2:
                        MenuPersonal.subMenu();
                    case 3:
                        if(getPersonas().isEmpty()){
                            System.out.println("Tienes que registrar a una o varias personas "
                                    + "para poder ver los clientes");
                        }else{
                            listarClientes(getPersonas());
                        }   
                        break;
                    case 4:
                        if(getPersonal().isEmpty()){
                            System.out.println("Tienes que registrar a un personal "
                                    + "para poder ver a los empleados");
                        }else{
                            listarPersonal(getPersonal());
                        }
                        break;
                    case 5: 
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numero del 1 al 3");
                }
            }catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.nextLine();
            }
        }
    }
    
}
