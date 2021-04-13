package es.iespuertodelacruz.javier;

import java.util.ArrayList;

import es.iespuertodelacruz.javier.excepcion.FrutaException;

public class GestionArrayList {
    private static final String LA_LISTA_SE_ENCUENTRA_VACIA = "La lista se encuentra vacia";
    ArrayList<Fruta> frutas;

    public GestionArrayList() {
        frutas = new ArrayList<>();
    }

    

    /**
     * Metodo que permite insertar al principio de la lista
     * @param fruta a insertar
     */
    public void insertar(Fruta fruta) {
        frutas.add(fruta);
    }

     /**
     * Metodo que permite eliminar al final de la lista
     * @param fruta a eliminar
     * @throws FrutaException controlada
     */
    public void eliminar(Fruta fruta) throws FrutaException {
        if (frutas.isEmpty()) {
            throw new FrutaException(LA_LISTA_SE_ENCUENTRA_VACIA);
        }else{
            frutas.remove(fruta);
        }
        
    }

}
