
package es.iespuertodelacruz.javier.elementos;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Pasajero extends Ciudad{
    
    private String patron = "^[0-9]{8}[A-Z]$";
    Pattern pattern;
    Matcher matcher;
    
    private String nombre;
    private String dni;
    private String destino;
    private Ciudad ciudad;
    
    /**
     * Constructor por defecto
     */
    public Pasajero() {
    }
    
    /**
     * Constructor con todos los paramentros
     * @param nombre del pasajero
     * @param dni del pasajero
     * @param destino del pasajero
     */
    public Pasajero(String nombre, String dni, String destino, Ciudad ciudad) throws Exception {
        this.nombre = nombre;
        validar(dni);
        this.dni = dni;
        this.destino = destino;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
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
        final Pasajero other = (Pasajero) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pasajero{" + ", nombre=" + nombre + ", dni=" + dni + ", destino=" + destino + ", ciudad=" + ciudad + '}';
    }

    
    
    /**
     * Funcion que evalua si un dni es valido
     * @param valor a evaluar
     * @return true/false si esta correcto o no.
     */
    public boolean validar(String valor) throws Exception{
        boolean resultado = false;
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(valor);
        resultado =  matcher.find();
        
        if(!resultado){
            throw new Exception("El dni:" +valor+ ", no tiene un formato correcto");
        }
        return resultado;
    }
    
    
    
    
    
    
}
