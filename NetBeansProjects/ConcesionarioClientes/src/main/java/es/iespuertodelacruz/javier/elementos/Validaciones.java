
package es.iespuertodelacruz.javier.elementos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Validaciones {
    private String dni = "^[0-9]{8}[A-Z]$";
    private String cp = "^[C-c][P-p][0-9]{5}$";
    Pattern pattern;
    Matcher matcher;
    
    /**
     * Funcion que evalua si un dni es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validarDni(String valor) throws Exception{
        boolean resultado = false;
        pattern = Pattern.compile(dni);
        matcher = pattern.matcher(valor);
        resultado =  matcher.find();
        
        if(!resultado){
            throw new Exception("El dni:" +valor+ ", no tiene un formato correcto");
        }
        return resultado;
    }
    
    /**
     * Funcion que evalua si el codigo postal es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validarCp(String valor) throws Exception{
        boolean resultado = false;
        pattern = Pattern.compile(cp);
        matcher = pattern.matcher(valor);
        resultado =  matcher.find();
        
        if(!resultado){
            throw new Exception("El codigo postal:" +valor+ ", no tiene un formato correcto");
        }
        return resultado;
    }
    
    
}
