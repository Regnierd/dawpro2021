
package es.iespuertodelacruz.javier.coleccion;

import java.util.LinkedList;

/**
 *
 * @author Javi
 */
public class PruebaLinkedList {
    
    
    LinkedList<String> personas = new LinkedList();
    
    
    
    public void insertar(String persona){
        personas.add(persona);
    }
    
    public void borrar(String persona){
        personas.remove(persona);
    }
    
    public boolean buscar(String persona){
        boolean existe = false;
        if(personas.size() == 0){
            System.out.println("Lista vacia");
        }else if(personas.contains(persona)){
            existe = true;
        }
        return existe;
               
    }
    
    /**
     * Funcion para devolver 
     * @return 
     */
    public int contar(){
        int contador = 0;
        if(personas.size() == 0){
            System.out.println("Lista vacia");
        }else{
            contador = personas.size();
        }
        return contador;
    }
    
    /**
     * Funcion para devolver el primer elemento 
     * @return String
     */
    public String primerElemento(){
        String primero = "";
        if(personas.size() == 0){
            System.out.println("Lista vacia");
        }else{
            primero = personas.getFirst();
        }
        return primero;
    }
    
    /**
     * Funcion para devovler el ultimo elemento
     * @return String
     */
    public String ultimoElemento(){
        String ultimo = "";
        if(personas.size() == 0){
            System.out.println("Lista vacia");
        }else{
            ultimo = personas.getLast();
        }
        return ultimo;
    }
    
    /**
     * Metodo para eliminar el primer elemento
     */
     public void borrarPrimerElemento(){      
        if(personas.size() == 0){
            System.out.println("Lista vacia");
        }else{
            personas.removeFirst();
        }
        
    }
     
     /**
     * Metodo para eliminar el primer elemento
     */
     public void borrarUltimoElemento(){      
        if(personas.size() == 0){
            System.out.println("Lista vacia");
        }else{
            personas.removeLast();
        }
        
    }

    @Override
    public String toString() {
        return "PruebaLinkedList{" + "personas=" + personas + '}';
    }
    
    
    
}
