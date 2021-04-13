package es.iespuertodelacruz.javier.elementos;

import java.io.File;


public class Fichero {

    /**
     * Funcion que verifica si el fichero existo 
     * @param fichero
     * @return true si existe, false si no existe
     */
    public boolean validarFichero(File fichero) {
        return fichero.exists();
    }

}
