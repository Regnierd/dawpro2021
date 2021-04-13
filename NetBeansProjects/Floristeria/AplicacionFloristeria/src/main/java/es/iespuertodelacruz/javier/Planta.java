package es.iespuertodelacruz.javier;

import java.util.Objects;

public class Planta {
    String id;
    String nombre;
    int tamanio;
    float precioBase;
    float precioFinal;
    int articulos;
    final int GANANCIA = 15; 

    /**
     * Constructor de la planta
     * @param id de la planta
     * @param nombre de la planta
     * @param tamanio de la planta
     * @param precioBase de la planta
     * @param precioFinal de la planta
     * @param articulos de la planta
     */
    public Planta(String id, String nombre, int tamanio, float precioBase, int articulos) {
        this.id = id;
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.precioBase = precioBase;
        this.precioFinal = getPrecioBase()+(GANANCIA/100)*getPrecioBase();
        this.articulos = articulos;
    }

    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public float getPrecioBase() {
        return this.precioBase;
    }

    public float getPrecioFinal() {
        return this.precioFinal;
    }

    public int getArticulos() {
        return this.articulos;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Planta)) {
            return false;
        }
        Planta planta = (Planta) o;
        return Objects.equals(id, planta.id) && Objects.equals(nombre, planta.nombre) 
            && tamanio == planta.tamanio && precioBase == planta.precioBase && precioFinal
             == planta.precioFinal && articulos == planta.articulos;
    }

    @Override
    public String toString() {
        return getId() + ", " + getNombre() + ", " + getTamanio() + ", " + getPrecioBase() 
            + ", " + getPrecioFinal() + ", " + getArticulos();
             
    }

}
