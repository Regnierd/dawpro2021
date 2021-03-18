
package es.iespuertodelacruz.javier.ejemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Fecha {
    private String patron = "^([0-2][0-9]|3[0-1])(/|-)(0[1-9]|1[0-2])(/|-)(\\d{4})$";
    
    Pattern pattern;
    Matcher matcher;

    /**
     * Funcion que evalua si una matricula cumple el patron 0000XXX o
     * @param valor a evaluar
     * @return true/false en funcion de si es correcto o no
     */
    public boolean validar(String valor) {
        boolean resultado = false;
        this.pattern = Pattern.compile(patron);
        this.matcher = pattern.matcher(valor);
        resultado = matcher.find();
        return resultado;
    }
}
