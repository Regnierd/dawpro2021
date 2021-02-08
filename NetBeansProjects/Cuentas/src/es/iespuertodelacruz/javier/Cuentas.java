/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.cuentas.Cuenta;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author javier
 */
public class Cuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        try{
            while(!salir){
                System.out.println("1. Crear cuenta con cantidad");
                System.out.println("2. Crear cuenta sin cantidad");
                System.out.println("Ingrese una opcion: ");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("Has seleccionado crear cuenta con cantidad");
                        System.out.println("Ingrese el nombre del titular: ");
                        String titular = sn.next();
                        System.out.println("Ingrese la cantidad de la cuenta: ");
                        double cantidad = sn.nextDouble();
                        Cuenta cuenta1 = new Cuenta(titular, cantidad);
                        System.out.println(cuenta1.toString());
                        System.out.println("Ingrese la cantidad que vaya a ingresar: ");
                        double ingreso = sn.nextDouble();
                        cuenta1.ingresar(ingreso);
                        System.out.println(cuenta1.toString());
                        System.out.println("Retirar la cantidad que vaya a retirar: ");
                        double retirada = sn.nextDouble();
                        cuenta1.retirar(retirada);
                        System.out.println(cuenta1.toString());
                        break;
                    case 2:
                        System.out.println("Crear cuenta sin cantidad");
                        System.out.println("Ingrese el nombre del titular: ");
                        String titular1 = sn.next();                       
                        Cuenta cuenta2 = new Cuenta(titular1);
                        System.out.println(cuenta2.toString());
                        System.out.println("Ingrese la cantidad que vaya a ingresar: ");
                        double ingreso2 = sn.nextDouble();
                        cuenta2.ingresar(ingreso2);
                        System.out.println(cuenta2.toString());
                        System.out.println("Retirar la cantidad que vaya a retirar: ");
                        double retirada2 = sn.nextDouble();
                        cuenta2.retirar(retirada2);
                        System.out.println(cuenta2.toString());
                        break;                       
                    case 3:
                        salir = true;
                        break;
                        
                    default:
                        System.out.println("Eliga una opcion correcta");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Ingrese un numero entero para elegir una opcion del menu");
        }

    }
    
}
