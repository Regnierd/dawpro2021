
package es.iespuertodelacruz.javier.elementos;

import java.util.Objects;

/**
 *
 * @author Javi
 */
public class Ciudad {
    private String ciudad;
    private String pais;

    /**
     * Constructor por defecto
     */
    public Ciudad() {
    }
    
    /**
     * Constructor con todos los paramentros
     * @param ciudad al que pertenece
     * @param pais al que pertenece
     */
    public Ciudad(String ciudad, String pais) {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paises{" + "ciudad=" + ciudad + ", pais=" + pais + '}' + "\n";
    }
    
    
    
    
}
