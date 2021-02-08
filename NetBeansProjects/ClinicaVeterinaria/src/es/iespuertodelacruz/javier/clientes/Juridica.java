
package es.iespuertodelacruz.javier.clientes;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Juridica extends Persona{
    private final String CIF;
    public static String expresionEmail = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+$";
    private String expresionCIF = "^[a-zA-Z]{1}\\d{7}[a-zA-Z0-9]{1}$";
    private static String expresionTelefono = "[0-9]{9}";
    
    public Juridica(String CIF, String email, String direccion, int telefono) {
        super(comprobarEmail(email, expresionEmail), direccion, comprobarTelefono(telefono, expresionTelefono));
        this.CIF = comprobarCIF(CIF, expresionCIF);
    }

    public String getCIF() {
        return CIF;
    }


    @Override
    public String toString() {
        return "Juridica{" + "CIF=" + CIF + " Email= "+ getEmail()+ " Direccion= " 
                + getDireccion()+ " Telefono= " + getTelefono()+ '}';
    }
    
    /**
     * Funcion para comprobar el CIF de la persona juridica
     * @param CIF
     * @param expresionCIF
     * @return CIF
     */
    public String comprobarCIF(String CIF, String expresionCIF) {
        Pattern pattern = Pattern.compile(expresionCIF);
        Matcher matcher = pattern.matcher(CIF);

        if (!matcher.matches()) {
            CIF = "Error en el CIF";
        }

        return CIF;
    }
    
    
    
}
