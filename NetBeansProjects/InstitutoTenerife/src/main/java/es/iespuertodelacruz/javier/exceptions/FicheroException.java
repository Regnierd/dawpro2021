package es.iespuertodelacruz.javier.exceptions;

public class FicheroException extends Exception{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor por defecto 
     * @param mensaje del error
     */
    public FicheroException(String mensaje) {
        super(mensaje);
    }

    /**
     * Constructor con un mensaje y la causa
     * @param mensaje del error
     * @param causa del error
     */
    public FicheroException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
}
