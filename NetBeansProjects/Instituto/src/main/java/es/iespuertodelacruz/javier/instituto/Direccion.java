
package es.iespuertodelacruz.javier.instituto;

/**
 *
 * @author Javi
 */
public class Direccion {
    
    private String calle;
    private int cp;
    private String provincia;

    public Direccion(String calle, int cp, String provincia) {
        this.calle = calle;
        this.cp = cp;
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", cp=" + cp + ", provincia=" + provincia + '}';
    }
    
    
}
