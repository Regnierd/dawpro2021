package es.iespuertodelacruz.javier.exceptions;

public class AlumnoException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructor de la excepcion con un mensaje
     * @param mensaje del error
     */
    public AlumnoException(String mensaje){
        super(mensaje);
    }

    /**
     * Constructor con un mensaje y la causa de la excepcion
     * @param mensaje del error
     * @param causa del error
     */
    public AlumnoException(String mensaje, Exception causa){
        super(mensaje, causa);
    }

}
