
package es.iespuertodelacruz.javier.elementos;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Gestion {
    ArrayList<Coche> coches;
    ArrayList<Cliente> clientes;
    
    public Gestion(){
        if(coches == null){
            coches = new ArrayList();
        }
        if(clientes == null){
            clientes = new ArrayList();
        }
    }
    
    public Gestion(ArrayList<Coche> coches, ArrayList<Cliente> clientes){
        this.coches = coches;
        this.clientes = clientes;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * Metodo para insertar coches en la lista de coches
     * @param coche valor que se le pasa al metodo
     */
    public void insertarCoche(Coche coche){
        coches.add(coche);
    }
    
    /**
     * Funcion para buscar un coche en la lista
     * @param matricula valor que se le pasa a la funcion para buscar
     * @return devuelve un coche/null
     */
    public Coche buscarCoche(String matricula){
        Coche cocheEncontrado = null;
        
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);
            if(coche.getMatricula().equals(matricula)){
                cocheEncontrado = coche;
            }
        }
        return cocheEncontrado;
    }
    
    /**
     * Metodo para eliminar coches de la lista
     * @param matricula valor que se le pasa al metodo para eliminar
     */
    public void eliminarCoche(String matricula){
        Coche coche = buscarCoche(matricula);
        if(coche != null){
            coches.remove(coche);
        } 
    }
    
    /**
     * Metodo para insertar clientes en la lista de clientes
     * @param cliente valor que se le pasa al metodo
     */
    public void insertarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    /**
     * Funcion para buscar un cliente en la lista
     * @param matricula valor que se le pasa a la funcion para buscar
     * @return devuelve un cliente/null
     */
    public Cliente  buscarCliente(String dni){
        Cliente clienteEncontrado = null;
        
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if(cliente.getDni().equals(dni)){
                clienteEncontrado = cliente;
            }
        }
        return clienteEncontrado;
    }
    
    /**
     * Metodo para eliminar clientes de la lista
     * @param matricula valor que se le pasa al metodo para eliminar
     */
    public void eliminarCliente(String dni){
        Cliente cliente = buscarCliente(dni);
        if(cliente != null){
            clientes.remove(cliente);
        } 
    }
    
}
