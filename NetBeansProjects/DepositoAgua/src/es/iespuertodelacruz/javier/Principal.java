package es.iespuertodelacruz.javier;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        float cantidad;
        ArrayList<Deposito> depositos = new ArrayList();
        Deposito deposito = new Deposito();

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
                        crearDepositos(cantidad, deposito, depositos);
                        mostrarDepositos(cantidad, depositos);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Inserta el agua que quieres quitar");
                        cantidad = sn.nextFloat();
                        deposito.quitarAgua(cantidad);
                        mostrarDepositos(cantidad, depositos);
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
    
    /**
     * Funcion para calcular los depositos.
     * @param cantidad
     * @return float
     */
    public static float calcularDepositos(float cantidad) {
        return cantidad / 50;
    }
    
    /**
     * Metodo para crear depositos dependiendo de la cantidad de
     * agua que el usuario pase.
     * @param cantidad
     * @param deposito
     * @param depositos 
     */
    public static void crearDepositos(float cantidad, Deposito deposito, ArrayList depositos) {
        for (float i = 0; i < calcularDepositos(cantidad); i++) {
            cantidad = deposito.agregarAgua(cantidad);
            depositos.add(deposito);
        }
        if(cantidad != 0){
            depositos.add(new Deposito(cantidad));
        }
        
    }
    
    /**
     * Metodo para mostrar los depositos creados.
     * @param cantidad
     * @param depositos 
     */
    public static void mostrarDepositos(float cantidad, ArrayList depositos) {
        for (int i = 0; i < depositos.size(); i++) {
            System.out.println("Deposito " + i + ": " + "capacidad: " +depositos.get(i));
        }
      
    }
}
