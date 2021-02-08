
package es.iespuertodelacruz.javier.formas;

/**
 *
 * @author Javi
 */
public abstract class Forma {
    String color;
    double punto;
    String nombre;
    
    //Constructores
    public Forma() {
    }

    public Forma(String color, double punto, String nombre) {
        this.color = color;
        this.punto = punto;
        this.nombre = nombre;
    }
    
    //Getter/Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPunto() {
        return punto;
    }

    public void setPunto(double punto) {
        this.punto = punto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Funcion para imprimir los datos de la forma.
     * @return 
     */
    public abstract String imprimir();
    
 // Funcion que no sabia para que se pedia.
//    public void obtener(){
//        
//    }
    
    /**
     * Funcion para cambiar el color de la forma.
     * @param colorNuevo 
     * @return String
     */
    public String cambiarColor(String colorNuevo){
        this.color = colorNuevo;
        return this.color;
    }
    
}
