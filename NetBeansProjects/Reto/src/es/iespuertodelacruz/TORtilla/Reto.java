/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.TORtilla;

import es.iespuertodelacruz.TORtilla.Ejercicios.Ejercicio1;
import es.iespuertodelacruz.TORtilla.Ejercicios.Ejercicio2;
import es.iespuertodelacruz.TORtilla.Ejercicios.Ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class Reto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Descomponer");
            System.out.println("2. Orden inverso de palabra");
            System.out.println("3. Frase en orden inverso");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Ejercicio1 ejercicio1 = new Ejercicio1();
                        System.out.println("Introduce un numero para sacar sus factores: ");
                        int numero = sn.nextInt();
                        ejercicio1.calcularPrimos(numero);
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        System.out.println("Introduce una palabra para invertir el orden de las letras: ");
                        String palabra = sn.nextLine();
                        Ejercicio2 ejercicio2 = new Ejercicio2(palabra);  
                        ejercicio2.invertir();
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        System.out.print("Introduce una frase para invertirla: ");
                        String frase = sn.nextLine();
                        Ejercicio3 ejercicio3 = new Ejercicio3(frase);
                        ejercicio3.invertirFrase();
                        break;
                    case 4:
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
}
    

