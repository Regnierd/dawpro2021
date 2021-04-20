package es.iespuertodelacruz.javier;

import es.iespuertodelacruz.javier.api.Fruta;

public class UtilidadesTest {
    

    public Fruta generarfruta(String identificador, String nombre, float precio, float coste) {
        Fruta fruta = null;
        if (identificador != null && nombre != null && precio > 0 && coste > 0) {
            fruta = new Fruta(identificador, nombre, precio, coste);
        } else {
            fruta = new Fruta();
            fruta.setIdentificador("aa221");
            fruta.setNombre("naranja");
            fruta.setPrecio(1.5f);
            fruta.setCoste(0.90f);
        }
        return fruta;
    }
}
