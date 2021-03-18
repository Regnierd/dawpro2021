
package es.iespuertodelacruz.javier.ejemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class CodigoPostal {
    private  String patron  = "^[C-c][P-p][0-9]{5}$";
    Pattern pattern;
    Matcher matcher;
    
    /**
     * Funcion que evalua si un dni es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validar(String valor){
        boolean resultado = false;
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(valor);
        resultado =  matcher.find();
       
        return resultado;
    }
    
    
}
