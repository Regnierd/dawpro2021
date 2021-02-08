
package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.animales.Animal;
import es.iespuertodelacruz.javier.clientes.Persona;
import static es.iespuertodelacruz.javier.vista.MenuPersona.sn;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class MenuAnimal {
    static ArrayList<Animal> animales = new ArrayList();
    
    public static void subMenu(Persona persona) {
        Scanner sn = new Scanner(System.in);
        Scanner intsn = new Scanner(System.in);
        boolean salir = false;
        int opcion;       
        
        
        while(!salir) {
            System.out.println("-------------------------------------");       
            System.out.println("-- ¿Desea registrar a su mascota? ---");
            System.out.println("--    1. Si                        --");
            System.out.println("--    2. No                        --");
            System.out.println("-------------------------------------");
            
            try{
                System.out.print("Opción: ");
                opcion = intsn.nextInt();
                String datos[];
         
                switch(opcion){
                    case 1:
                        datos = pedirDatos();
                        if(datos[0] != "" || datos[1] != "" || Integer.parseInt(datos[2]) != 0){
                            Animal animal = new Animal(datos[0], datos[1], Integer.parseInt(datos[2]), persona);
                            animales.add(animal);
                            System.out.println("Su animal ha sido registrado correctamente!");
                            System.out.println(animal.toString());
                            MenuHistorico.subMenu(animal);
                        }else{
                             System.err.println("Error al registrar al animal");
                        }
                        
                        break;
                    case 2:                                   
                        salir = true;     
                        persona.setAnimales(animales);
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 2");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe de inserte un numero");
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
            System.out.println("Ingrese el tipo de animal");
            resultado[0] = sn.nextLine();
            System.out.println("Ingrese el nombre de su mascota");
            resultado[1] = sn.nextLine();
            System.out.println("Ingrese la edad de animal");
            resultado[2] = sn.nextLine();
        }catch(InputMismatchException e){
            System.out.println("Dato incorrecto");
        }
        
        return resultado;
    }
}
