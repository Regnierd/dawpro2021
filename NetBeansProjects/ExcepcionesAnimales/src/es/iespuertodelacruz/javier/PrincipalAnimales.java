
package es.iespuertodelacruz.javier;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class PrincipalAnimales {

    static Scanner sn = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        ArrayList<Animal> listaAnimales = new ArrayList();
        
        while(!salir){
            System.out.println("1. Insertar animal");
            System.out.println("2. Mostrar animales");
            System.out.println("3. Salir");
            
            try{
                System.out.println("Elige una opcion: ");
                opcion = sn.nextInt();
                sn.skip("\n");
                
                switch(opcion){
                    case 1:
                        for (int i = 0; i < 10; i++) {
                            pedirDatoAnimal(listaAnimales);
                        }
                        break;
                    case 2:
                        mostrarAnimales(listaAnimales);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe ingresar un numero entre 1 y 3");
                }
            }catch(InputMismatchException ex){
                System.out.println("Error. Debe ingresar un numero" + ex.getMessage());
            }
        }
        
    }
    
    private static void pedirDatoAnimal(ArrayList<Animal> listaAnimales){
        boolean chip;         
        System.out.println("Ingrese el nombre de su mascota");
        String nombre = sn.nextLine();
        System.out.println("Ingrese la raza de su mascota");
        String raza = sn.nextLine();
        System.out.println("Ingrese la edad de su mascota");
        int edad = sn.nextInt();
        sn.skip("\n");
        System.out.println("¿Tiene chip su mascota?");
        String opcion = sn.nextLine();
        
        try{
            if("si".equals(opcion)){           
                chip = true;           
                listaAnimales.add(new Animal(nombre, raza, edad, chip));
                System.out.println("Animal agregado correctamente!");
            }else if("no".equals(opcion)){       
                chip = false;        
                listaAnimales.add(new Animal(nombre, raza, edad, chip));
                System.out.println("Animal agregado correctamente!");        
            }else{
                System.out.println("Error. Tiene que poner que si o no");
            }
                
        }catch(Exception ex){
            System.out.println("Animal erroneo" + ex.getMessage());
        }
    }
    
    private static void mostrarAnimales(ArrayList<Animal> listaAnimales){
        for (int i = 0; i < listaAnimales.size(); i++) {
            System.out.println(listaAnimales.get(i));
        }
    }
}
