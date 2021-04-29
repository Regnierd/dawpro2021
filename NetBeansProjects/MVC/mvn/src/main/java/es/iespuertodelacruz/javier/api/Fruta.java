package es.iespuertodelacruz.javier.api;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Clase fruta de la aplicacion
 */
public class Fruta {
    String nombre;
    String identificador;
    float precio;
    float coste;
    private static final String DELIMITADOR = ",";

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

    /**
    * Constructo que recibe una cadena de text
    * @param cadena con la informacion
    */
   public Fruta(String cadena) {
    ArrayList<Object> elementos = new ArrayList<>();
    StringTokenizer tokenizer = new StringTokenizer(cadena, DELIMITADOR);
    while (tokenizer.hasMoreElements()) {
       elementos.add(tokenizer.nextToken());
    }
    this.identificador = (String) elementos.get(0);
    this.nombre = (String) elementos.get(1);
    this.precio = Float.parseFloat((String)elementos.get(2));
    this.coste = Float.parseFloat((String)elementos.get(3));
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


    @Override
   public String toString() {
      return getIdentificador() + DELIMITADOR + getNombre() + DELIMITADOR + getPrecio() + DELIMITADOR + getCoste();
   }


}

