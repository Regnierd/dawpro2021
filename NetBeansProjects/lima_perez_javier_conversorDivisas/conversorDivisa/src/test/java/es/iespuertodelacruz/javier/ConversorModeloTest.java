package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.exceptions.ConversorException;
import es.iespuertodelacruz.javier.modelo.ConversorModelo;

public class ConversorModeloTest {
     ConversorModelo conversorModelo;
     
     @BeforeEach
     public void setUp(){
         if(conversorModelo == null){
             conversorModelo = new ConversorModelo();
         }
     }

    @Test
    public void insertarTest(){
        conversorModelo.insertar("PLN", 0.22);
        assertEquals(0.22, conversorModelo.obtenerDivisa("PLN"));
    }

    @Test
    public void eliminarTest(){
        conversorModelo.eliminar("EUR");
        assertFalse(conversorModelo.existe("EUR"), "La divisa EUR no deberia de existir");
    }

    @Test
    public void obtenerListaTest(){
        String lista = conversorModelo.obtenerLista();
        assertTrue(lista.contains("EUR"), "La lista deberia de contener la divisa EUR");
    }

    @Test
    public void obtenerCodigosDivisaTest(){
        ArrayList<String> listaCodigos = conversorModelo.obtenerCodigosDivisa();
        assertTrue(listaCodigos.contains("JPY"), "La lista deberia de tener 4 elementos");
    }

    @Test
    public void convertirTest(){
        double resultado = conversorModelo.convertir("EUR", "JPY", 20);
        assertEquals(2697.2000000000003, resultado);
    }

    @Test
    public void validarParametrosTest(){        
        try {
            conversorModelo.validar("", "", 0);
        } catch (ConversorException e) {
            assertTrue(e.getMessage().contains("El codigo de divisa de origen esta vacio"));
            assertTrue(e.getMessage().contains("El codigo de divisa de destino esta vacio"));
            assertTrue(e.getMessage().contains("El importe es menor o igual a 0"));
        }
    }

    @Test
    public void generarExceptionTest(){
        Exception conversorException= new ConversorException("Mensaje de error", new Exception());
        assertTrue(conversorException.getMessage().contains("Mensaje de error"), "No genera el mensaje esperado");
    }
}
