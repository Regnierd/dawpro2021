package es.iespuertodelacruz.javier.exceptions;

public class ConversorException extends Exception {

    /**
     * Constructor con un mensaje
     * @param mensaje del error
     */
    public ConversorException(String mensaje){
        super(mensaje);
    }

    /**
     * Constructor con un mensaje y la causa del error
     * @param mensaje del error
     * @param causa del error
     */
    public ConversorException(String mensaje, Exception causa){
        super(mensaje, causa);
    }
}
