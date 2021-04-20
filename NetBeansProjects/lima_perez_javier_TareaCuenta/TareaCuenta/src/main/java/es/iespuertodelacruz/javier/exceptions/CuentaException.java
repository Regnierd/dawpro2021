package es.iespuertodelacruz.javier.exceptions;

public class CuentaException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Construcor con un mensaje del error
     * @param mensaje del error
     */
    public CuentaException(String mensaje){
        super(mensaje);
    }

    /**
     * Constructor con el mensaje y la causa del error
     * @param mensaje del error
     * @param causa del error
     */
    public CuentaException(String mensaje, Exception causa){
        super(mensaje, causa);
    }
    
}
