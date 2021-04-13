package es.iespuertodelacruz.javier.exceptions;

public class ExceptionPersona extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor con un mensaje
     * @param mensaje del error
     */
    public ExceptionPersona(String mensaje) {
        super(mensaje);
    }
    
    /**
     * Constructor con un mensaje y la causa
     * @param mensaje del error
     * @param causa del error
     */
    public ExceptionPersona(String mensaje, Exception causa){
        super(mensaje, causa);
    }
    
}
