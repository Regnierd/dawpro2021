package es.iespuertodelacruz.javier.exception;

public class FicheroException extends Exception{

    private static final long serialVersionUID = 5485179389441196328L;
    

    public FicheroException(String mensaje) {
        super(mensaje);
    }

    public FicheroException(String mensaje, Exception causa) {
        super(mensaje, causa);
    }
    
    


}
