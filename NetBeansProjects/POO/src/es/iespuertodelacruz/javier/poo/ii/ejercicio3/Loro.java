
package es.iespuertodelacruz.javier.poo.ii.ejercicio3;

/**
 *
 * @author Javi
 */
public class Loro extends Aves {
    private String origen;
    private boolean habla;
    

    public Loro(String origen, boolean habla, String pico, boolean vuela, String nombre, int edad, Estado estado, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, estado, fechaNacimiento);
        this.origen = origen;
        if(getEstado() == Estado.Muerto){
            setHabla(false);
        }else{
            this.habla = habla;
        }
       
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        if(getEstado() == Estado.Muerto){
            setHabla(false);
        }
        this.habla = habla;
    }

    @Override
    public String volar() {               
        if(isVuela() == false){
            return "El loro no puede volar porque esta muerto por desgracia el pobre...";
        }
        return "El loro esta volando";
    }

    @Override
    public String mostrar() {
        return "Nombre: " + getNombre() + " Edad: " + getEdad() + " Estado: " + getEstado() + " Fecha de nacimiento: " + getFechaNacimiento()
                +" Origen: " + this.origen + " Habla: " + this.habla + " Pico: " + getPico() + " Vuela: " + isVuela();
    }

    @Override
    public String hablar() {
        if(isHabla()==false){
            return "El loro no puede hablar porque esta muerto por desgracia el pobre...";
        }
        return "El loro esta hablando";
    }
    
}
