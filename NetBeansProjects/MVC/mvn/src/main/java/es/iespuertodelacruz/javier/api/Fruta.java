package es.iespuertodelacruz.javier.api;


/**
 * Clase fruta de la aplicacion
 */
public class Fruta {
    String nombre;
    String identificador;
    float precio;
    float coste;

    public Fruta(){

    }
    /**
     * Constructor con todas las propiedades de la fruta
     * @param nombre de la fruta
     * @param identificador de la fruta
     * @param precio de la fruta
     * @param coste de la fruta
     */
    public Fruta(String nombre, String identificador, float precio, float coste) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.precio = precio;
        this.coste = coste;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCoste() {
        return this.coste;
    }

    public void setCoste(float coste) {
        this.coste = coste;
    }

    /**
     * Funcion encargado para devolver el beneficio de la fruta
     * @return float
     */
    public float beneficio(){
        return precio - coste;
    }


}

