
package es.iespuertodelacruz.javier.coleccion;

import es.iespuertodelacruz.javier.coleccion.elementos.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Javi
 */
public class PruebaHashSet {
    
    private Set<Cliente> clientesBanco;
    Cliente cliente;
    public PruebaHashSet() {
        this.clientesBanco =  new HashSet();
    }

    public PruebaHashSet(Set<Cliente> clientesBanco) {
        this.clientesBanco =  clientesBanco;
    }
    
    public Set<Cliente> getClientesBanco() {
        return clientesBanco;
    }
    
    
    /**
     * Metodo para insertar un cliente en la lista set
     * @param cliente Objeto de tipo cliente
     */
    public void insertar(Cliente cliente){
        clientesBanco.add(cliente);
    }
    
    public void eliminar(Cliente cliente){
        clientesBanco.remove(cliente);
    }
    
    public void modificar(String cuenta, String nombre){
        for (int i = 0; i < clientesBanco.size(); i++) {
            
        }
    }
    
    
    @Override
    public String toString(){
        return  clientesBanco.toString();
    }
}
