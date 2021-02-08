
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos;

/**
 *
 * @author Javi
 */
public class Acuaticos extends Vehiculos{  
    private final double ESLORA;
    public static String expresion = "[A-Z]{3,10}";
    public Acuaticos(double ESLORA, String matricula, String modelo) {
        super(comprobarMatricula(matricula, expresion), modelo);
        this.ESLORA = ESLORA;
    }

    public double getESLORA() {
        return ESLORA;
    }

    
    @Override
    public String toString() {
        return "[Eslora: " + ESLORA + " Matricula: " + getMatricula() + " Modelo: " + getModelo() + "]";
    }
    
}
