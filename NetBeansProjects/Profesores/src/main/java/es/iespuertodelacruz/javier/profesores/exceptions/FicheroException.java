
package es.iespuertodelacruz.javier.profesores.exceptions;

/**
 *
 * @author Javi
 */
public class FicheroException extends Exception{

    /**
     * Constructor por defecto 
     * @param mensaje de error
     */
    public FicheroException(String mensaje) {
        super(mensaje);
    }

    /**
     * Constructor con mensaje y causa
     * @param mensaje de error
     * @param causa del error
     */
    public FicheroException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
    
}
