
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public abstract class Vehiculos {
    private final String matricula;
    private final String modelo;

    public Vehiculos(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }
    
    public abstract String toString();
    
    /**
     * Funcion para comprobar la matricula de los vehiculos.
     * @param matricula
     * @param expresion
     * @return 
     */
    public static String comprobarMatricula(String matricula, String expresion) {
        Pattern pattern = Pattern.compile(expresion);
        Matcher matcher = pattern.matcher(matricula);

        if (!matcher.matches()) {
            matricula = "Error en la matricula";
        }

        return matricula;
    }
}
