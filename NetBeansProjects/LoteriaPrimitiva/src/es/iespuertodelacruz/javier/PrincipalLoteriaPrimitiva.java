
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.exceptions.NumeroException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class PrincipalLoteriaPrimitiva {

    static Scanner sn = new Scanner(System.in);
    static ArrayList<Integer> listaNumeros = new ArrayList();
    public static void main(String[] args) throws NumeroException {
        
        System.out.println("¿Cuantos numeros son los premiados?");
        int numero = sn.nextInt();
        pedirNumerosPremiados(listaNumeros, numero);
        mostrarLista(listaNumeros);
    }
    
    /**
     * Metodo para pedir los numeros premiados
     * @param listaNumeros
     * @param numero
     * @throws NumeroException 
     */
    private static void pedirNumerosPremiados(ArrayList<Integer> listaNumeros, int numero) throws NumeroException{        
        for (int i = 0; i < numero; i++) {
            System.out.print("Introduce el " + (i+1) + "º numero premiado: ");
            int numeroPremiado = sn.nextInt();           
            if(listaNumeros.contains(numeroPremiado)){
                throw new NumeroException("El numero ya existe, no puede repetirse");
            }else{
                listaNumeros.add(numeroPremiado);
            }     
        } 
    }
    
    /**
     * Metodo para mostrar la lista de los numeros
     * @param listaNumeros 
     */
    private static void mostrarLista(ArrayList<Integer> listaNumeros){
        for (int i = 0; i < listaNumeros.size(); i++) {
            Collections.sort(listaNumeros);
            System.out.println("El " + (i+1) + "º numero premiado es: " + listaNumeros.get(i));
        }
    }
}
