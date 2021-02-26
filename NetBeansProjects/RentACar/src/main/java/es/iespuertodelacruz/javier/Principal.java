
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.exceptions.DatosException;
import java.util.InputMismatchException;
import java.util.*;

/**
 *
 * @author Javi
 */
public class Principal {
    
    static Scanner sn = new Scanner(System.in);   
    public static void main(String[] args) throws DatosException {
        boolean salir = false;
        int opcion;
        String matricula;
        Vehiculo vehiculo = null;
        while(!salir){
            System.out.println("1. Crear vehiculo\n"
                    + "2. Modificar vehiculo\n"
                    + "3. Eliminar vehiculo\n"
                    + "4. Listar todos los vehiculos\n"
                    + "5. Salir");
            System.out.println("¿Que accion desea realizar?");
            opcion = sn.nextInt();
            sn.skip("\n");
            String datos[];
            
            try{
                switch(opcion){
                    case 1:
                        datos =  pedirDatos();
                        vehiculo = new Vehiculo(datos[0], datos[1], datos[2], datos[3], Integer.parseInt(datos[4]));
                        vehiculo.addVehiculo(vehiculo);
                        System.out.println("El vehiculo se ha agregado correctamente");
                        System.out.println(vehiculo.toString());
                        break;
                    case 2:
                        System.out.println("Inserte la matricula para modificar el vehiculo");
                        matricula = sn.nextLine();
                        if(vehiculo.modificar(matricula)){
                            System.out.println("El vehiculo se ha modificado correctamente");
                            System.out.println(vehiculo.toString());
                        }                                               
                        break;
                    case 3:
                        System.out.println("Inserte la matricula para eliminar el vehiculo");
                        matricula = sn.nextLine();
                        if(vehiculo.eliminar(matricula)){
                            System.out.println("El vehiculo se ha eliminado correctamente");
                        }else{
                            System.out.println("El vehiculo no existe");
                        }
                        break;
                    case 4:
                        vehiculo.listar();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Inserte un numero entre el 1 y 5");
                        
                }
            }catch(InputMismatchException ex){
                throw new DatosException("Inserte un numero entero" + ex.getMessage());
            }
        }
    }
    
    /**
     * Metodo para pedir datos al usuario
     * @return String[]
     * @throws Exception 
     */
    public static String[] pedirDatos() throws DatosException{
        String[] datos = new String[5];
        try{
            System.out.println("Inserte la matricula del vehiculo");
            datos[0] = sn.nextLine();
            System.out.println("Inserte la marca del vehiculo");
            datos[1] = sn.nextLine();
            System.out.println("Inserte el modelo del vehiculo");
            datos[2] = sn.nextLine();
            System.out.println("Inserte el color del vehiculo");
            datos[3] = sn.nextLine();
            System.out.println("Inserte la capacidad de litros del tanque del vehiculo");
            datos[4] = sn.nextLine();                   
        }catch(InputMismatchException ex){
            throw new DatosException("Error. Datos incorrectos" + ex.getMessage());
        }
        return datos;
    }
    
    /**
     * Metodo para modificar los datos de un vehiculo menos la matricula
     * @return String[]
     * @throws Exception 
     */
    public static String[] modificarDatos() throws DatosException{
        String[] datos = new String[5];
        try{           
            System.out.println("Inserte la marca del vehiculo");
            datos[0] = sn.nextLine();
            System.out.println("Inserte el modelo del vehiculo");
            datos[1] = sn.nextLine();
            System.out.println("Inserte el color del vehiculo");
            datos[2] = sn.nextLine();
            System.out.println("Inserte la capacidad de litros del tanque del vehiculo");
            datos[3] = sn.nextLine();                   
        }catch(InputMismatchException ex){
            throw new DatosException("Error. Datos incorrectos" + ex.getMessage());
        }
        return datos;
    }
}
