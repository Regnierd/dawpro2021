
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos;

/**
 *
 * @author Javi
 */
public class Terrestres extends Vehiculos{
    private final int RUEDAS;
    public static String expresion = "\\d{4}[A-Z][A-Z][A-Z]";
    
    public Terrestres(int RUEDAS, String matricula, String modelo) {
        super(comprobarMatricula(matricula, expresion), modelo);
        this.RUEDAS = RUEDAS;
    }

    public int getRUEDAS() {
        return RUEDAS;
    }

    
    
    @Override
    public String toString() {
        return "[Ruedas: " + RUEDAS + " Matricula: "+getMatricula() + " Modelo: "+getModelo() + "]";
    }
    
}
