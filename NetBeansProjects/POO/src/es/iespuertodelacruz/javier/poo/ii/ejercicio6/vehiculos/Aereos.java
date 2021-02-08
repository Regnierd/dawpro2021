
package es.iespuertodelacruz.javier.poo.ii.ejercicio6.vehiculos;

/**
 *
 * @author Javi
 */
public class Aereos extends Vehiculos {
    private final int ASIENTOS;
    public static String expresion = "[A-Z]{4}\\d{6}";
    public Aereos(int asientos, String matricula, String modelo) {
        super(comprobarMatricula(matricula, expresion), modelo);
        this.ASIENTOS = asientos;
    }

    public int getASIENTOS() {
        return ASIENTOS;
    }
    
    
    @Override
    public String toString() {
        return "[Asientos: " + ASIENTOS + " Matricula: "+getMatricula() + " Modelo: "+getModelo() + "]";
    }
    
}
