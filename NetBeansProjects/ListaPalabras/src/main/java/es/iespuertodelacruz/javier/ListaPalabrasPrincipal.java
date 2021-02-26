package es.iespuertodelacruz.javier;

import static es.iespuertodelacruz.javier.vista.MenuLista.crearLista;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class ListaPalabrasPrincipal {

    static ArrayList<String> listaPalabras = new ArrayList();
    static Scanner sn = new Scanner(System.in);
    static ArrayList<String> listaInvertida = new ArrayList();
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        String palabra;
        while (!salir) {

            try {
                System.out.println("\n1. Crear lista.\n"
                        + "2. Mostrar numero de palabras en la lista.\n"
                        + "3. Mostrar numero de veces que aparece una palabra en la lista.\n"
                        + "4. Eliminar una palabra de la lista. \n"
                        + "5. Crear una lista inversa. \n"
                        + "6. Eliminar palabras repetidas de la lista\n"
                        + "7. Salir.\n");
                System.out.println("Elige una opcion: ");
                opcion = sn.nextInt();
                sn.skip("\n");
                switch(opcion){
                    case 1:
                        crearLista(listaPalabras);
                        mostrarLista();
                        break;
                    case 2:
                        System.out.println("El numero de palabras que contiene la lista es de: "+numerosPalabras());
                        break;
                    case 3:                       
                        System.out.println("Digame la palabra a buscar: ");
                        palabra = sn.nextLine();                       
                        mostrarResultado(palabra);
                        break;
                    case 4:
                        System.out.println("Digame la palabra a eliminar: ");
                        palabra = sn.nextLine();
                        eliminarRepetidas(palabra);
                        mostrarLista();
                        break;
                    case 5:
                        mostrarLista();
                        invertirLista(listaPalabras);
                        System.out.println("\n--------------------");
                        mostrarListaInvertida(listaInvertida);
                        break;
                    case 6:
                        eliminarPalabrasRepetidas();
                        mostrarLista();
                        break;
                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe de introducir un numero entre el 1 y 7.");
                }
            }catch(InputMismatchException ex){
                System.out.println("Error. Debe insertar un numero entero");
            }
            
        }
    }  
    
    
    /**
     * Funcion para calcular cuantas palabras hay en la lista
     * @return entero
     */
    public static int numerosPalabras(){
        int contador = 0;
        if(listaPalabras.size() > 0){
            for (int i = 0; i < listaPalabras.size(); i++) {
                contador += 1;
            }
        }else{
            return contador;
        }    
        return contador;
    }
    
    /**
     * Funcion para contar las palabras repetidas en la lista dada por parametro
     * @return entero
     */
    public static int palabrasRepetidas(String palabra){
        int repetidas = 0;
        if(listaPalabras.size() > 0){
            for (int i = 0; i < listaPalabras.size(); i++) {          
                if(listaPalabras.get(i).equals(palabra)){
                    repetidas += 1;
                }
            }     
        }else {
            return repetidas;
        }            
        return repetidas;
    }
    
    /**
     * Metodo para mostrar cuantas veces esta repetida una palabra pasada por paramentro
     * @param palabra 
     */
    public static void mostrarResultado(String palabra){
        if(palabrasRepetidas(palabra) == 1){
            System.out.println("La palabra " + palabra + " esta repetida "+palabrasRepetidas(palabra)+ " vez");
        }else if(palabrasRepetidas(palabra) > 1){
            System.out.println("La palabra " + palabra + " esta repetida "+palabrasRepetidas(palabra)+ " veces");
        }else{
            System.out.println("La palabra " + palabra + " no aparece en la lista");
        }
    }
    
    /**
     * Metodo para eliminar una palabra de la lista si la contiene
     * @param palabra 
     */
    public static void eliminarRepetidas(String palabra){
        if(listaPalabras.size() > 0){
            if(listaPalabras.contains(palabra)){
                listaPalabras.remove(palabra);
            }else{
                System.out.println("La palabra no existe");
            }
        }else{
            System.out.println("No hay palabras dentro de la lista");
        }
        
    }
    
    /**
     * Metodo para crear una lista invertida y la muestra
     * @param listaPalabras 
     */
    public static void invertirLista(ArrayList<String> listaPalabras){       
        for (int i = listaPalabras.size()-1; i >= 0; i--) {
            listaInvertida.add(listaPalabras.get(i));
           
        }
    }
    
    /**
     * Metodo para eliminar palabras repetidas de la lista
     */
    public static void eliminarPalabrasRepetidas(){
        String palabra;
        for (int i = 0; i < listaPalabras.size(); i++) {
            palabra = listaPalabras.get(i);
            for (int j = 0; j < listaPalabras.size(); j++) {
                if(listaPalabras.get(i).equals(palabra)){
                    listaPalabras.remove(j);
                }
            }           
        }
    }
    
    /**
     * Metodo para mostrar la lista
     */
    public static void mostrarLista(){
        for (int i = 0; i < listaPalabras.size(); i++) {
            System.out.print(listaPalabras.get(i) + " ");
        }
    }
    
    public static void mostrarListaInvertida(ArrayList<String> listaInvertirda){
        for (int i = 0; i < listaInvertirda.size(); i++) {
            System.out.print(listaInvertirda.get(i) + " ");
        }
    }
    
}