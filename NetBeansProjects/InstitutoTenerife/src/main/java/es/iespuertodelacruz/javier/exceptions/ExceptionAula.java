package es.iespuertodelacruz.javier.exceptions;

public class ExceptionAula extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor con un mensaje
     * @param mensaje del error
     */
    public ExceptionAula(String mensaje){
        super(mensaje);
    }

    /**
     * Constructor con un mensaje y la causa del error
     * @param mensaje del error
     * @param causa del error
     */
    public ExceptionAula(String mensaje, Exception causa){
        super(mensaje, causa);
    }
}
