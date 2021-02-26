
package es.iespuertodelacruz.javier.coleccion;

import es.iespuertodelacruz.javier.coleccion.elementos.Empleado;
import java.util.HashMap;

/**
 *
 * @author Javi
 */
public class PruebasMapas {
    
    HashMap<String, Empleado>hasMap = new HashMap();
    
    /**
     * 
     * @param key
     * @param empleado 
     */
    public void insertar(String key, Empleado empleado){
        hasMap.put(key, empleado);
    }
    
    public void borrar(String key){
        hasMap.remove(key);
    }
    
    public int tamanio(String key){
        return hasMap.size();
    }
    
    public void modificar(String key, Empleado empleado){
        hasMap.put(key, empleado);      
    }
    
    public Empleado buscar(String key){
        return hasMap.get(key);
        
    }
    
    public boolean isEmpy(){
        boolean vacia = false;
        if(hasMap.isEmpty()){
            vacia = true;
        }
        return vacia;
    }
    
    
    public String imprimir(){
        return hasMap.toString();
    }
    
    
}
