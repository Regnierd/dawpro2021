package es.iespuertodelacruz.javier;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.controlador.ConversorController;
import es.iespuertodelacruz.javier.modelo.ConversorModelo;

public class ConversorControllerTest {
    
    ConversorController conversorController;
    ConversorModelo conversorModelo;
    @BeforeEach
    public void setUp(){
        if(conversorController == null){
            conversorController = new ConversorController();
        }
        if(conversorModelo == null){
            conversorModelo = new ConversorModelo();
        }
    }

    @Test
    public void obtenerCodigosDivisa(){
        ArrayList<String> codigosDivisasControlador = conversorController.obtenerCodigosDivisa();
        ArrayList<String> codigoDivisaModelo = conversorModelo.obtenerCodigosDivisa();

        assertEquals(codigosDivisasControlador, codigoDivisaModelo);
    }

    @Test
    public void convertirTest(){
        double resultadoControlador = conversorController.convertir("EUR", "JPY", 20);
        double resultadoModelo = conversorModelo.convertir("EUR", "JPY", 20);

        assertEquals(resultadoControlador, resultadoModelo);
    }
}
