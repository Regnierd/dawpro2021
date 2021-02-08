
package es.iespuertodelacruz.javier;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class PrincipallistaInvertida {

    static ArrayList<String> listaSinInvertir = new ArrayList();
    static ArrayList<String> listaInvertida = new ArrayList();
    public static void main(String[] args) {
        
        listaSinInvertir.add("Di");
        listaSinInvertir.add("buen");
        listaSinInvertir.add("dia");
        listaSinInvertir.add("a");
        listaSinInvertir.add("papa");
        
        System.out.println("Lista sin invertir: ");
        mostrarSinInvertir(listaSinInvertir);
        System.out.println("\nLista invertida: ");
        invertirLista(listaSinInvertir);
        mostrarInvertida(listaInvertida);
        
    }
    
    /**
     * Metodo para mostrar la lista sin invertir
     * @param listaSinInvertir 
     */
    private static void mostrarSinInvertir(ArrayList<String> listaSinInvertir){
        for (int i = 0; i < listaSinInvertir.size(); i++) {
            System.out.print(listaSinInvertir.get(i)+ " ");
        }
    }
    
    /**
     * Metodo para invertir la lista y agregarla a una nueva lista
     * @param listaSinInvertir 
     */
    private static void invertirLista(ArrayList<String> listaSinInvertir){
        for (int i = listaSinInvertir.size()-1; i >= 0; i--) {
            listaInvertida.add(listaSinInvertir.get(i));          
        }
    }
    
    /**
     * Metodo para mostrar la lista invertida
     * @param listaInvertida 
     */
    private static void mostrarInvertida(ArrayList<String> listaInvertida){
        for (int i = 0; i < listaInvertida.size(); i++) {
            System.out.print(listaInvertida.get(i) + " ");
        }
    }
    
}
