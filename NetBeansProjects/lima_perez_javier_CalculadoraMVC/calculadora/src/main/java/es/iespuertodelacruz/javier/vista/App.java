package es.iespuertodelacruz.javier.vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import es.iespuertodelacruz.javier.api.Operacion;
import es.iespuertodelacruz.javier.controlador.OperacionController;
import es.iespuertodelacruz.javier.exception.OperacionException;

public class App {
    static OperacionController operacionController;
    static Scanner sn = new Scanner(System.in);
    public static void main( String[] args ) throws OperacionException{
        if(operacionController == null){
            operacionController = new OperacionController();
        }
        menu();
    }

    private static void menu() throws OperacionException{
        
        
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        Operacion operacion;
        double resultado = 0;
        while (!salir) {
 
            System.out.println("1. Sumar");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            operacion = null;
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:                
                        operacion = obtenerResultado('+');    
                        resultado = operacionController.sumar(operacion);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        operacion = obtenerResultado('-');    
                        resultado = operacionController.restar(operacion);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        operacion = obtenerResultado('*');    
                        resultado = operacionController.multiplicar(operacion);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        operacion = obtenerResultado('/');    
                        resultado = operacionController.multiplicar(operacion);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    public static Operacion obtenerResultado(char operando){
        System.out.println("Introduzca el valor 1");
        double numero1 = sn.nextDouble();
        System.out.println("Introduzca el valor 2");
        double numero2 = sn.nextDouble();
        Operacion operacion = new Operacion(numero1, numero2, operando);
        return operacion;
    }
}
