
package es.iespuertodelacruz.javier;

import java.util.ArrayList;

/**
 *
 * @author Javi
 */
public class Gestion {
    
    ArrayList<Coche> coches;
    Coche coche;
    
    public Gestion(){
        this.coches = new ArrayList();
    }
    
    public Gestion(ArrayList<Coche> coches){
        this.coches = coches;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }
    
    /**
     * Metodo para insertar coches a la lista 
     * @param coche 
     */
    public void insertar(Coche coche){
        coches.add(coche);
    }
    
    /**
     * Metodo para eliminar de la lista pasandole la matricula
     * @param matricula 
     */
    public void eliminar(String matricula){
        for (int i = 0; i < coches.size(); i++) {
            if(coches.get(i).equals(matricula)){
                coches.remove(coches.get(i));
            }
        }
    }
    
    /**
     * Metodo para buscar un coche pasandole la matricula
     * @param matricula
     * @return 
     */
    public Coche buscar(String matricula){
        Coche cocheEncontrado = null;
        for (int i = 0; i < coches.size(); i++) {
            Coche coche = coches.get(i);
            if(coche.getMatricula().equals(matricula)){
                cocheEncontrado = coche;
            }
        }
        return cocheEncontrado;
    }
}
