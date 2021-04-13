package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.excepcion.FrutaException;

public class GestionArrayListTest {
    GestionArrayList gestionArrayList;
    Fruta fruta;

    @BeforeEach
    public void setUp(){
        if(gestionArrayList == null){
            gestionArrayList = new GestionArrayList();
        }

        fruta = crearFruta();
        gestionArrayList.insertar(fruta);

    }

    @Test
    public void eliminarTest(){
        try {
            gestionArrayList.eliminar(fruta);
            assertTrue(gestionArrayList.frutas.isEmpty(), "La lista deberia de estar vacia");
        } catch (FrutaException e) {
            fail("Nunca deberia de llegar aqui");
        }
    }

    @Test
    public void controlarExceptionEliminarTest(){
        try{
            gestionArrayList.eliminar(fruta);
            gestionArrayList.eliminar(fruta);
        }catch(FrutaException e){
            assertTrue(e.getMessage().contains("La lista se encuentra vacia"));
        }
    }

    @Test
    public void controlarExceptionsTest(){
        Exception frutaException = new FrutaException("Mensaje de error", new Exception());
        assertTrue(frutaException.getMessage().contains("Mensaje de error"), "No genera el mensaje esperado");
    }

    /**
     * Funcion que crea una fruta
     * @return una fruta
     */
    private Fruta crearFruta(){
        return new Fruta("Verde", 2);
    }

}
