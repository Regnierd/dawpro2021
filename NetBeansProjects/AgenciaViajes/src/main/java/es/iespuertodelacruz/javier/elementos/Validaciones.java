
package es.iespuertodelacruz.javier.elementos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Validaciones {
    
    private String patron = "^[0-9]{8}[A-Z]$";
    Pattern pattern;
    Matcher matcher;
    
    /**
     * Funcion que evalua si un dni es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validar(String valor) throws Exception{
        boolean resultado = false;
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(valor);
        resultado =  matcher.find();
        
        if(!resultado){
            throw new Exception("El dni:" +valor+ ", no tiene un formato correcto");
        }
        return resultado;
    }
}
