
package es.iespuertodelacruz.javier.elementos;

/**
 *
 * @author Javi
 */
public class Direccion extends Validaciones{
    
    private int numero;
    private String calle;
    private String cp;
    private String Provincia;

    public Direccion(int numero, String calle, String cp, String Provincia) throws Exception {
        this.numero = numero;
        this.calle = calle;
        validarCp(cp);
        this.cp = cp;
        this.Provincia = Provincia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCP() {
        return cp;
    }

    public void setCP(String cp) {
        this.cp = cp;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "numero=" + numero + ", calle=" + calle + ", cp=" + cp + ", Provincia=" + Provincia + '}';
    }
    
    
}
