/**
 * La clase coche con su constructor y sus metodos.
 */
package es.iespuertodelacruz.javier;

/**
 *
 * @author javier
 */
public class Coche {
    boolean frenoDeManoPuesto;
    boolean encendido;
    int posicion;
    String nombre;
    
    /**
     * Constructor vacio.
     */
    public Coche() {
        
    }
    
    
    /**
     * Construcor de la clase coche.
     * @param nombre 
     */
    public Coche(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
        this.frenoDeManoPuesto = true;
        this.encendido = false;
    }
    
    //Getter/setters
    public boolean isFrenoDeManoPuesto() {
        return frenoDeManoPuesto;
    }

    public void setFrenoDeManoPuesto(boolean frenoDeManoPuesto) {
        this.frenoDeManoPuesto = frenoDeManoPuesto;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    
    /**
     * Metodo para arrancar el coche,
     * y si ya esta arrancado lo comunicaremos.
     * @return 
     */
    public String arrancar(){
        if(this.encendido == true){
            return "El coche ya estaba encendido.";
        }else {
            this.encendido = true;
            return "Ok. El coche se ha arrancado.";
        }
    }
    
    /**
     * Metodo para apagar el coche, 
     * y si ya esta apagado lo comunicaremos.
     * @return 
     */
    public String apagar(){
        if(this.encendido == false){
            return "El coche ya estaba apagado";
        }else{
            this.encendido = false;
            return "Ok. El coche se ha apagado.";
        }
        
    }
    
    /**
     * Metodo para subir el freno del coche,
     * y si ya esta subido lo comunicaremos.
     * @return 
     */
    public String subirFrenoDeMano(){
        if(this.frenoDeManoPuesto == false){
            this.frenoDeManoPuesto = true;
            return "Ok. El freno de mano se ha subido.";
        }else{
            return "El freno de mano ya estaba subido.";
        }
        
    }
    
    /**
     * Metodo para bajar el freno del coche,
     * y si ya esta bajado lo comunicaremos.
     * @return 
     */
    public String bajarFrenoDeMano(){
        if(this.frenoDeManoPuesto == true){
            this.frenoDeManoPuesto = false;
            return "Ok. El freno de mano se ha bajado.";
        }else{
            return "El freno de mano ya estaba bajado.";
        }
            
        
    }
    
    /**
     * Metodo para mover a la izquierda el coche, dependiendo de su estado.
     * @param pos
     * @return 
     */
    public String moverIzquierda(int pos){
        //while(this.posicion >= 0){}
        
        if(this.encendido == true && this.frenoDeManoPuesto == false){
            int nuevaPosicion = pos;
            return "Ok. Se ha movido a la izquierda " + nuevaPosicion + " metros.";
        }else if(this.encendido == false){
            return "El coche esta apagado. Primero tiene que arrancarlo";
        }else if(this.encendido == true && this.frenoDeManoPuesto == true){
            this.encendido = false;
            return "El coche no se puede mover porque el freno de mano esta puesto.";
        }
        return "";
    }
    
    /**
     * Metodo para mover a la derecha el coche, dependiendo de su estado.
     * @param pos
     * @return 
     */
    public String moverDerecha(int pos){
        if(this.encendido == true && this.frenoDeManoPuesto == false){
            this.posicion = pos;
            int nuevaPosicion = this.posicion;
            return "Ok. Se ha movido a la derecha " + nuevaPosicion + " metros.";
        }else if(this.encendido == false){
            return "El coche esta apagado. Primero tiene que arrancarlo";
        }else if(this.encendido == true && this.frenoDeManoPuesto == true){
            this.encendido = false;
            return "El coche no se puede mover porque el freno de mano esta puesto.";
        }
        return "";
    }
    
    /**
     * Metodo para mostrar los datos del coche.
     * @return 
     */
    public String datosCoche(){
        return this.nombre + " || Freno puesto: " + this.frenoDeManoPuesto + " || Posicion: " + this.posicion;
    }
            
}
