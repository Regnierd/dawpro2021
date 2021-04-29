package es.iespuertodelacruz.javier.vista;

import es.iespuertodelacruz.javier.controlador.ConversorController;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class AppConversor {
    static ConversorController conversorController;
    static Scanner snInt = new Scanner(System.in);
    static Scanner snString = new Scanner(System.in);

    public AppConversor(){
        conversorController = new ConversorController();
    }

    public static void main(String[] args){
        conversorController = new ConversorController();
        boolean salir = false;
        int opcion = 0;
        
        while(!salir){
            System.out.println(mostrarMenu()); 
            try{
                opcion = snInt.nextInt();
                switch(opcion){                  
                    case 1:
                        pedirDatos();
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("Tiene que elegir una de las opciones que se muestran por pantalla. (1-2)");
                }             
            }catch(InputMismatchException e){
                System.out.println("Debe de insertar un numero en el importe o seleccionar la divisa por su codigo");
            }
        }
    }

    /**
     * Metodo encargado de mostrar el menu de divisas activas
     * @return String
     */
    public static String mostrarMenuDivisas(){
        String cadena = "";
        ArrayList<String> divisas = conversorController.obtenerCodigosDivisa();
        for (int i = 0; i < divisas.size(); i++) {
            cadena += "· " + divisas.get(i) + "\n";
        }
        return cadena;
    }

    /**
     * Metodo encargado de mostrar el menu principal
     * @return String
     */
    public static String mostrarMenu(){
        return "1 . Hacer una conversion de divisas \n"+ 
                "2. Salir";     
    }

    /**
     * Metodo encargado de pedir datos al usuario
     */
    public static void pedirDatos(){
        System.out.println("Divisas activas: ");
        System.out.println(mostrarMenuDivisas());
        System.out.println("Ingrese el importe: "); 
        double importe = snInt.nextInt();                       
        System.out.println("Eliga la moneda de origen");
        String origen = snString.nextLine();
        System.out.println("Eliga la moneda de destino");
        String destino = snString.nextLine();
        System.out.println(conversorController.convertir(origen, destino, importe));
    }
    

}
