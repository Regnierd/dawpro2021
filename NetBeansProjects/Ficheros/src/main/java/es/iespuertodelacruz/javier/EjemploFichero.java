
package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.exception.FicheroException;

/**
 *
 * @author Javi
 */
public class EjemploFichero {
    public static void main(String[] args) throws FicheroException {
        Fichero fichero = null;
        fichero.crear("prueba");
    }
}
