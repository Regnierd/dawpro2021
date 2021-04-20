package es.iespuertodelacruz.javier.exception;

public class FicheroException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor con el mensaje del error.
     * @param mensaje del error
     */
    public FicheroException(String mensaje){
        super(mensaje);
    }

    /**
     * Construcor con el mensaje y la causa del error
     * @param mensaje del error
     * @param causa del error
     */
    public FicheroException(String mensaje, Exception causa){
        super(mensaje, causa);
    }
    
}
