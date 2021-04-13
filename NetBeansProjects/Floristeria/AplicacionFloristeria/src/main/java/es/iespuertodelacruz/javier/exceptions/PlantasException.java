package es.iespuertodelacruz.javier.exceptions;

public class PlantasException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la excepcion con un mensaje del error
     * @param mensaje del error
     */
    public PlantasException(String mensaje){
        super(mensaje);
    }

    /**
     * Constructor de la excepcion con el mensaje y la causa del error
     * @param mensaje del error
     * @param causa del error
     */
    public PlantasException(String mensaje, Exception causa){
        super(mensaje, causa);
    }
    
}
