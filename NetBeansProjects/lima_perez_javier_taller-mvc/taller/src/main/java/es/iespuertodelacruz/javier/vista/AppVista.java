package es.iespuertodelacruz.javier.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.controlador.ControladorVehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.exceptions.VehiculoException;

public class AppVista {
    static ControladorVehiculo controladorVehiculo;
    
    public static void main( String[] args ){
        if(controladorVehiculo == null){
            controladorVehiculo = new ControladorVehiculo();
        }
        
        menu();
        
    }

    public static void menu(){   
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        Vehiculo vehiculo;
        while (!salir) {
            System.out.println("1. Insetar un vehiculo.");
            System.out.println("2. Eliminar un vehiculo.");
            System.out.println("3. Modificar un vehiculo. ");
            System.out.println("4. Buscar un vehiculo. ");
            System.out.println("5. Listar todos los vehiculos ");
            System.out.println("6. Listar el vehiculo por una matricula");
            System.out.println("7. Salir.");
            vehiculo = null;
            try {
                System.out.println("Eliga una opcion");
                opcion = sn.nextInt();                            
                switch (opcion) {
                    case 1:    
                        vehiculo = pedirDatos(sn);                
                        try {
                            controladorVehiculo.insertar(vehiculo);
                        } catch (FicheroException | VehiculoException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:    
                        vehiculo = pedirDatos(sn);
                        try {
                            controladorVehiculo.eliminar(vehiculo);
                        } catch (VehiculoException | FicheroException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        Vehiculo vehiculoNuevo;
                        vehiculo = pedirDatos(sn);
                        vehiculoNuevo = pedirDatos(sn);                                 
                        try {
                            controladorVehiculo.modificar(vehiculo, vehiculoNuevo);
                        } catch (VehiculoException | FicheroException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 4:
                        try {
                            vehiculo = pedirDatos(sn);
                            controladorVehiculo.buscar(vehiculo.getMatricula());
                        } catch (FicheroException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        try {
                            vehiculo = pedirDatos(sn);
                            controladorVehiculo.listar();
                        } catch (FicheroException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        try {
                            vehiculo = pedirDatos(sn);
                            controladorVehiculo.listar(vehiculo.getMatricula());
                        } catch (FicheroException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe de elegir una de las opciones del 1-7");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe de insertar un numero entero" + e.getMessage());
            }
        }
    }
    /**
     * Funcion que pide los datos al usuario
     * @return Vehiculo
     */
    public static Vehiculo pedirDatos(Scanner sn){

        System.out.println("Inserte la matricula del vehiculo: ");
        String matricula = sn.next();
        System.out.println("Inserte la marca del vehiculo: ");
        String marca = sn.next();
        Vehiculo vehiculo = new Vehiculo(matricula, marca);
        
        return vehiculo;
    }
}
