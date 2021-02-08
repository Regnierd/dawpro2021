
package es.iespuertodelacruz.javier.clientes;

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Fisica extends Persona{
    private final String DNI;
    public static String expresionEmail = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,4})+$";
    private String expresionNIF = "^\\d{8}[a-zA-Z]{1}$";
    private static String expresionTelefono = "[0-9]{9}";
    
    public Fisica(String DNI, String email, String direccion, int telefono) {
        super(comprobarEmail(email, expresionEmail), direccion, comprobarTelefono(telefono, expresionTelefono));
        this.DNI = comprobarDNI(DNI, expresionNIF);
    }

    public String getDNI() {
        return DNI;
    }
    
    @Override
    public String toString() {
        return "Fisica{" + "DNI=" + DNI + " Email= "+ getEmail()+ " Direccion= " 
                + getDireccion()+ " Telefono= " + getTelefono()+'}';
    }

    /**
     * Funcion para comprobar el CIF de la persona juridica
     * @param DNI
     * @param expresionDNI
     * @return DNI
     */
    public String comprobarDNI(String DNI, String expresionDNI) {
        Pattern pattern = Pattern.compile(expresionDNI);
        Matcher matcher = pattern.matcher(DNI);

        if (!matcher.matches()) {
            DNI = "";
            throw new InputMismatchException("Error en el DNI");
        }

        return DNI;
    }
    
    
    
}
