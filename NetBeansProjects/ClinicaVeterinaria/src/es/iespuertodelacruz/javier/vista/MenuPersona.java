
package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.clientes.Fisica;
import es.iespuertodelacruz.javier.clientes.Juridica;
import es.iespuertodelacruz.javier.clientes.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuPersona {
    static Scanner sn = new Scanner(System.in);
    static Scanner intsn = new Scanner(System.in);
    private static ArrayList<Persona> personas;
    public static void subMenu() {
        
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("-----------------------------------------");       
            System.out.println("-- ¿Es una persona Fisica o Juridica? ---");
            System.out.println("-----------------------------------------");
            System.out.println("--    1. Fisica                        --");
            System.out.println("--    2. Juridica                      --");
            System.out.println("--    3. Salir                         --");
            System.out.println("-----------------------------------------");
            
            try{
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
                String datos[];              
                int telefonoPersona;
                switch(opcion){
                    case 1:         
                        datos = pedirDatos();
                        System.out.println("Ingrese el DNI");
                        String dni = sn.nextLine();
                        if(datos[0] != "" || datos[1] != "" || Integer.parseInt(datos[2]) != 0){
                            Fisica fisica = new Fisica(dni, datos[0], datos[1], Integer.parseInt(datos[2]));
                            getPersonas().add(fisica);
                            System.out.println("Registrado correctamente");
                            System.out.println(fisica.toString());
                            MenuAnimal.subMenu(fisica);
                        }else{
                            System.err.println("Error al registrar al cliente");                           
                        }
                        break;
                    case 2: 
                        datos = pedirDatos();
                        System.out.println("Ingrese su CIF");
                        String cifJuridica = sn.nextLine();      
                        if(datos[0] != "" || datos[1] != "" || Integer.parseInt(datos[2]) != 0){
                            Juridica juridica = new Juridica(cifJuridica, datos[0], datos[1], Integer.parseInt(datos[2]));
                            getPersonas().add(juridica);
                            System.out.println("Registrado correctamente");
                            System.out.println(juridica.toString());
                            MenuAnimal.subMenu(juridica);           
                        }else{
                            System.err.println("Error al registrar al cliente");
                        }
                                                           
                        break;
                    case 3:
                        salir = true; 
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            }catch(InputMismatchException e){
                System.out.println("Introduce un numero");
            }
        }
    }
    
    /**
     * Metodo para pedir datos al usuario
     * @return String[]
     */
    public static String[] pedirDatos(){
        String resultado[] = new String [3];
        try{
            System.out.println("Ingrese su email");
            resultado[0] = sn.nextLine();           
            System.out.println("Ingrese su direccion");
            resultado[1] = sn.nextLine();
            System.out.println("Ingrese su telefono");
            resultado[2] = sn.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Dato incorrecto");
        }       
        return resultado;
    }
    
    /**
     * Metodo para mostrar todas las personas
     * @param personas 
     */
    public static void listarClientes(ArrayList personas){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
    
    /**
     * Funcion para crear el array list
     * @return 
     */
    public static ArrayList<Persona> getPersonas(){
        if(personas == null){
            personas = new ArrayList();
        }
        return personas;
    }
}
