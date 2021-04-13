
package es.iespuertodelacruz.javier.exceptions;

/**
 *
 * @author Javi
 */
public class CiudadesException extends Exception{

    /**
     * Constructor por defecto
     * @param mensaje del error
     */
    public CiudadesException(String mensaje) {
        super(mensaje);
    }

    /**
     * Constructor con un mensaje y la causa
     * @param mensaje del error
     * @param causa del error
     */
    public CiudadesException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
    
}
