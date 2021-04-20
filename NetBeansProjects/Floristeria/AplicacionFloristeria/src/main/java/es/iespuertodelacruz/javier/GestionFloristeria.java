package es.iespuertodelacruz.javier;

import java.util.HashMap;

import es.iespuertodelacruz.javier.exceptions.PlantasException;

public class GestionFloristeria {
    HashMap<String, Planta> plantas;

    public GestionFloristeria(){
        plantas = new HashMap<>();
    }

    public HashMap<String,Planta> getPlantas() {
        return this.plantas;
    }

    
    /**
     * Metodo para insertar una planta a la coleccion de plantas
     * @param planta
     * @throws PlantasException
     */
    public void insertar(Planta planta) throws PlantasException{
        if(!existe(planta)){
            plantas.put(planta.getId(), planta);
        }else{
            throw new PlantasException("No se puede insertar la planta, porque ya existe en la lista");
        }
       
    }

    /**
     * Funcion que devuelve una planta por la id
     * @param id de la planta
     * @return Planta
     * @throws PlantasException
     */
    public Planta buscar(String id) throws PlantasException{
        Planta planta = plantas.get(id);
        if(planta == null){
            throw new PlantasException("La planta no existe con ese id " + id);
        }

        return planta;
  
    }

    /**
     * Funcion que devuelve una planta
     * @param planta a buscar
     * @return Planta
     * @throws PlantasException
     */
    public Planta buscar(Planta planta) throws PlantasException{
        Planta plantaEncontrada = null;
        for (Planta plantaEncontradas : plantas.values()) {
            if(plantaEncontradas.equals(planta)){
                plantaEncontrada = planta;
            }else{
                throw new PlantasException("La planta no existe en la lista");
            }
        }  
        return plantaEncontrada;
    }

    /**
     * Funcion para contar el numero de una planta 
     * @param planta
     * @return int
     * @throws PlantasException
     */
    public int numeroArticulo(Planta planta) throws PlantasException{    
        if(!existe(planta)){
            throw new PlantasException("La planta no existe");
        }else{
            return planta.getArticulos();    
        }
        
        
    }

    /**
     * Metodo para eliminar una planta
     * @param id de la planta
     */
    public void eliminar(String id){
        plantas.remove(id);
    }

    /**
     * Funcion para verificar si existe una planta
     * @param planta que verificar
     * @return true si existe, false si no existe
     */
    public boolean existe(Planta planta){
        return plantas.containsKey(planta.getId());
    }

    public String mostrar(String id){
        String datosPlanta = "";
        for(Planta planta : plantas.values()){
            if(planta.getId().equals(id)){
                datosPlanta = planta.toString();
            }          
        }
        return datosPlanta;
    }
}
