
package es.iespuertodelacruz.javier;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Javi
 */
public class ListaNumero {
    
    static ArrayList<Integer> listaNumeros = new ArrayList();
    public static void main(String[] args) {
        numerosAleatorios();
        
        System.out.print("Lista: ");
        mostrarLista(listaNumeros);
        System.out.println("\n---------------");
        
        System.out.print("Numeros pares: ");
        mostrarPares(listaNumeros);
        System.out.println("\n---------------");
        
        System.out.print("Lista: ");       
        mostrarLista(listaNumeros);
        System.out.print("\nNumeros de las posiciones pares: ");
        mostrarPosicionPares(listaNumeros);
        
        System.out.println("\n---------------");
        
        System.out.print("Lista: ");
        mostrarLista(listaNumeros);
        System.out.print("\nNumeros de las posiciones impares: ");
        mostrarPosicionImpares(listaNumeros);
                
        
    }
    
    /**
     * Metodo para agregar a la lista numeros aleatorios del 1 al 100
     */
    public static void numerosAleatorios(){
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int aleatorio = rnd.nextInt(100)+1;
            listaNumeros.add(aleatorio);
        }
    }
    
    /**
     * Metodo para mostrar los numeros pares de la lista
     * @param listaNumeros 
     */
    private static void mostrarPares(ArrayList<Integer> listaNumeros){
        for (int i = 0; i < listaNumeros.size(); i++) {
            if(listaNumeros.get(i)%2 == 0){
                System.out.print(listaNumeros.get(i) + " ");
            }
        }
    }
    
    /**
     * Metodo para mostrar los numeros de las posiciones pares
     * @param listaNumeros 
     */
    private static void mostrarPosicionPares(ArrayList<Integer> listaNumeros){
        for (int i = 0; i < listaNumeros.size(); i+=2) {
            System.out.print(listaNumeros.get(i) + " ");
        }
    }
    
    /**
     * Metodo para mostrar los numeros de las posiciones impares
     * @param listaNumeros 
     */
    private static void mostrarPosicionImpares(ArrayList<Integer> listaNumeros){
        for (int i = 1; i < listaNumeros.size(); i+=2) {
            System.out.print(listaNumeros.get(i) + " ");
        }
    }
    
    /**
     * Metodo para mostrar la lista
     * @param listaNumeros 
     */
    private static void mostrarLista(ArrayList<Integer> listaNumeros){
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.print(listaNumeros.get(i) + " ");
        }
    }
    
}
