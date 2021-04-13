package es.iespuertodelacruz.javier.exceptions;

public class ExceptionNota extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor con un mensaje del error
     * @param mensaje del error
     */
    public ExceptionNota(String mensaje){
        super(mensaje);
    }

    /**
     * Constructor con el mensaje y la causa del error
     * @param mensaje del error
     * @param causa del error
     */
    public ExceptionNota(String mensaje, Exception causa){
        super(mensaje, causa);
    }
}
