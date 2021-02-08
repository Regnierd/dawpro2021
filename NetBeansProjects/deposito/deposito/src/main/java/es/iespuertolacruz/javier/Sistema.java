package es.iespuertolacruz.javier;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Sistema {
    
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
        float cantidad;
        Deposito deposito = null;
        
        while (!salir) {
 
            System.out.println("1. Añadir  Agua");
            System.out.println("2. Extraer Agua");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Selecciona una opcion");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        System.out.println("Inserta el agua que quieres agregar.");
                        cantidad = sn.nextFloat();
                        deposito.agregarAgua(cantidad);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Inserta el agua que quieres quitar");
                        cantidad = sn.nextFloat();
                        deposito.quitarAgua(cantidad);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
}
