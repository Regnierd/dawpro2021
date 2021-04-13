package es.iespuertodelacruz.javier.elementos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.iespuertodelacruz.javier.exceptions.ExceptionValidar;



public class Validacion {
    private String patron = "^[0-9]{8}[A-Z]$";
    Pattern pattern;
    Matcher matcher;
    
    /**
     * Funcion que evalua si un dni es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validarDni(String valor) throws ExceptionValidar{
        boolean resultado = false;
        pattern = Pattern.compile(patron);
        matcher = pattern.matcher(valor);
        resultado = matcher.find();
        
        if(!resultado){
            throw new ExceptionValidar("El dni:" +valor+ ", no tiene un formato correcto");
        }
        return resultado;
    }
}
