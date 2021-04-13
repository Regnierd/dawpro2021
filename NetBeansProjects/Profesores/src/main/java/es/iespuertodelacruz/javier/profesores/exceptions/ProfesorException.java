
package es.iespuertodelacruz.javier.profesores.exceptions;

/**
 *
 * @author Javi
 */
public class ProfesorException extends Exception{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructor por defecto
     * @param mensaje de error
     */
    public ProfesorException(String mensaje) {
        super(mensaje);
    }

    /**
     * Constructor con mensaje y causa
     * @param mensaje de error
     * @param causa del error
     */
    public ProfesorException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
    
    
}
