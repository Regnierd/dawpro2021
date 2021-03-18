
package es.iespuertodelacruz.javier.elementos;

/**
 *
 * @author Javi
 */
public class Coche extends Vehiculo{
    
    private String matricula;

    public Coche(String matricula, String marca, String modelo) {
        super(marca, modelo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    
}
