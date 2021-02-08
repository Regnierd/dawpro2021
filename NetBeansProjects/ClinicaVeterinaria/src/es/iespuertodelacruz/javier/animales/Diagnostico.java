
package es.iespuertodelacruz.javier.animales;

import es.iespuertodelacruz.javier.empleados.Personal;
import es.iespuertodelacruz.javier.pagos.Factura;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Diagnostico {
    private String fecha;
    private String descripcion;
    private Factura factura;
    private Animal animal;
    private Personal personal;
    public String expresionFecha = "^\\d{2}\\/\\d{2}\\/\\d{4}$";
    
    public Diagnostico(String fecha, String descripcion, Personal personal, Animal animal){       
        if(descripcion == ""){
            System.err.println("Error. La descripcion no puede ir vacia");
        }else{
            this.fecha = comprobarFecha(fecha, expresionFecha);
            this.descripcion = descripcion;
            this.personal = personal;
            this.animal = animal;
        }      
    }
    
    public Diagnostico(String fecha, String descripcion, Factura factura, Animal animal) {
        if(descripcion == ""){
            System.err.println("Error. La descripcion no puede ir vacia");
        }else{
            this.fecha = comprobarFecha(fecha, expresionFecha);
            this.descripcion = descripcion;
            this.factura = factura;
            this.animal = animal;
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = comprobarFecha(fecha, expresionFecha);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion == ""){
            System.err.println("Error. La descripcion no puede ir vacia");
        }else{
            this.descripcion = descripcion;
        }
        
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "fecha=" + fecha + ", descripcion=" + descripcion
                + ", factura=" + factura + ", animal=" + animal + " personal: " 
                + personal+'}';
    }
    
    /**
     * Funcion para comprobar la fecha
     * @param fecha
     * @param expresionFecha
     * @return String
     */
    public String comprobarFecha(String fecha, String expresionFecha){
        Pattern pattern = Pattern.compile(expresionFecha);
        Matcher matcher = pattern.matcher(fecha);

        if (!matcher.matches()) {
            fecha = "Error en la matricula";
        }

        return fecha;
    }
    
}
