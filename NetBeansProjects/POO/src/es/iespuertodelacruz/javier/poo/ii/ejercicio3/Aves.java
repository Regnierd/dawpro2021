
package es.iespuertodelacruz.javier.poo.ii.ejercicio3;

/**
 *
 * @author Javi
 */
public abstract class Aves extends Mascota{
     private String pico;
     private boolean vuela;

    public Aves(String pico, boolean vuela, String nombre, int edad, Estado estado, String fechaNacimiento) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        if(getEstado() == Estado.Muerto){
            setVuela(false);
        }else{
            this.vuela = vuela;
        }     
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        if(getEstado() == Estado.Muerto){
            setVuela(false);
        }
        this.vuela = vuela;
    }
     
    public abstract String volar(); 
}
