
package es.iespuertodelacruz.javier.elementos;

import es.iespuertodelacruz.javier.exceptions.CiudadesException;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.exceptions.PasajerosException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Gestion {
    ArrayList<Pasajero> pasajeros;
    ArrayList<Ciudad> ciudades;
    
    public Gestion(){
        if(pasajeros == null){
            pasajeros = new ArrayList();
        }
        if(ciudades == null){
            ciudades = new ArrayList();
        }
    }

    public Gestion(ArrayList<Pasajero> pasajeros, ArrayList<Ciudad> ciudades) {
        this.pasajeros = pasajeros;
        this.ciudades = ciudades;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    
    /**   
     * Metodo para insertar pasajeros a la lista de pasajeros
     * @param pasajero que se va a insertar    
     * @throws PasajerosException error controlado
     */
    public void insertar(Pasajero pasajero) throws PasajerosException{
        if(!existe(pasajero)){
            pasajeros.add(pasajero);
        }else{
           throw new PasajerosException("El pasajero ya existe con dni: " + 
                   pasajero.getDni() + " ya existe.");
            
        }
        
    }
    
    /**
     * Metodo para insertar ciudades a la lista de ciudades
     * @param ciudad que se va a insertar
     * @throws CiudadesException error controlado
     */
    public void insertar(Ciudad ciudad) throws CiudadesException{
        if(!existe(ciudad)){
            ciudades.add(ciudad);
        }else{
            throw new CiudadesException("La ciudad ya existe");
        }
    }
    
    /**
     * Metodo para eliminar un elemento de la lista
     * @param pasajero a eliminar
     */
    public void eliminar(Pasajero pasajero) throws PasajerosException{
        if(existe(pasajero)){
            pasajeros.remove(pasajero);
        }else{
            throw new PasajerosException("El pasajero, con dni : " + pasajero.getDni()
                    + " no existe en la lista para poder eliminarlo.");
        }
    }
    
    /**
     * Metodo para eliminar un elemento de la lista
     * @param ciudad a eliminar
     */
    public void eliminar(Ciudad ciudad) throws CiudadesException{
        if(existe(ciudad)){
            ciudades.remove(ciudad);
        }else{
            throw new CiudadesException("La ciudad no existe en la lista para poder"
                    + "eliminarlo");
        }
    }
    
    /**
     * Funcion para verificar si existe el pasajero en la lista
     * @param pasajero a buscar
     * @return true si existe, false si no existe en la lista
    */
    public boolean existe(Pasajero pasajero){
        return pasajeros.contains(pasajero);
    }
    
    /**
     * Funcion para verificar si existe el pasajero en la lista
     * @param pasajero a buscar
     * @return true si existe, false si no existe en la lista
    */
    public boolean existe(Ciudad ciudad){
        return ciudades.contains(ciudad);
    }
    
    /**
     * Funcion para buscar el destino de un pasajero en la lista.
     * @param dni del pasajero que buscar
     * @return String
     */
    public String buscarDestino(String dni){
        Pasajero pasajero = null;
        String destino = null;
        for (int i = 0; i < pasajeros.size(); i++) {
            pasajero = pasajeros.get(i);
            if(pasajero.getDni().equals(dni)){ 
                destino += pasajero.getDestino() + ", "; 
            }
        }
        return destino;
    }
    
    /**
     * Funcion para contar los pasajeros que van a una misma ciudad
     * @param ciudad a la que viajan
     * @return int
     */
    public int contarPasajerosCiudad(Ciudad ciudad){      
        int contador = 0;
        for (int i = 0; i < pasajeros.size(); i++) {
            Pasajero pasajero = pasajeros.get(i);
            if(pasajero.getCiudad().equals(ciudad)){
                contador += 1;
            }
        }
        return contador;
    }
    
    /**
     * Funcion para buscar los paises a los que viaja un pasajero
     * @param dni del pasajero
     * @return String
     */
    public String buscarPaises(String dni){

        for (int i = 0; i < pasajeros.size(); i++) {
            Pasajero pasajero = pasajeros.get(i);          
            if(pasajero.getDni().equals(dni)){ 
                String pais = pasajeros.get(i).getPais();
                if(pais)
                 pais += pasajeros.get(i).getPais() + ", "; 
            }
        }
        return pais;
    }
    
    /**
     * Funcion para contar los pasajeros que van a un mismo pais
     * @param pais a la que viajan
     * @return int
     */
    public int contarPasajerosPais(Ciudad pais){
        Pasajero pasajero = null;
        int contador = 0;
        for (int i = 0; i < pasajeros.size(); i++) {
            if(pasajero.getPais().equals(pais)){
                contador += 1;
            }
        }
        return contador;
    }
    
    /**
     * Funcion para mostrar la lista
     * @return String con todos los elementos
     */
    public String listar(){
        return pasajeros.toString();
    }
    
  
    /**
     * Metodo para alamacenar los datos en un fichero
     * @param nombreFichero nombre del fichero
     * @throws PasajerosException error controlado
     * @throws FicheroException error controlado
     */
    public void almacenarDatos(String nombreFichero) throws PasajerosException, FicheroException{
        FileWriter fichero = null;
        try {
            fichero = new FileWriter(nombreFichero);
            fichero.write(listar());
        } catch (Exception e) {
            throw new PasajerosException("", e);
        }finally{
            if(fichero != null){
                try {
                    fichero.close();
                } catch (IOException ex) {
                    throw new FicheroException("", ex);
                }
            }
        }
    }
    
    
}
