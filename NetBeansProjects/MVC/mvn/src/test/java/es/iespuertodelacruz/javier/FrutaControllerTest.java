package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Fruta;
import es.iespuertodelacruz.javier.controlador.FrutaController;
import es.iespuertodelacruz.javier.exception.FrutaException;

public class FrutaControllerTest extends UtilidadesTest{
    
    FrutaController frutaController;
    Fruta fruta;

    @BeforeEach
    public void setUp(){
        if(frutaController == null){
            frutaController = new FrutaController();
        }
        if(fruta == null){
            fruta = new Fruta("Platano", "A003", 3, 4);
        }
    }

    @Test
    public void validarFrutaNulaTest(){
        Fruta frutaNula = null;
        try {
            frutaController.validarFruta(frutaNula);
        } catch (FrutaException e) {
            assertTrue(e.getMessage().contains("Se esta intentando validar un objeto vacio"));
        }

    }

    @Test
    public void validarParametrosTest(){
        Fruta frutaNueva = new Fruta(null, null, 0, 0);
        try {
            frutaController.validarFruta(frutaNueva);
        } catch (FrutaException e) {
            assertTrue(e.getMessage().contains("El identificador de la fruta es nulo o vacio"));
            assertTrue(e.getMessage().contains("El nombre de la fruta es nulo o vacio"));
            assertTrue(e.getMessage().contains("El precio de la fruta es 0 o menor"));
            assertTrue(e.getMessage().contains("El coste de la fruta es 0 o menor"));
        }
    }

    
}
