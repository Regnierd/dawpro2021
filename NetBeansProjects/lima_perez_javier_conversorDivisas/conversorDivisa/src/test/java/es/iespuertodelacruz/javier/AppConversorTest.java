package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.controlador.ConversorController;
import es.iespuertodelacruz.javier.vista.AppConversor;

public class AppConversorTest {
    ConversorController conversorController;
    AppConversor appConversor;
    @BeforeEach
    public void setUp(){
        if(conversorController == null){
            conversorController = new ConversorController();
        }
        if(appConversor == null){
            appConversor = new AppConversor();
        }
    }
    
    @Test
    public void mostrarMenuDivisasTest(){
        String cadena = appConversor.mostrarMenuDivisas();
        assertTrue(cadena.contains("EUR"), "La cadena deberia de contener el codigo EUR");
    } 

    @Test
    public void mostrarMenu(){
        String cadenaMenu = appConversor.mostrarMenu();
        assertTrue(cadenaMenu.contains("Salir"), "La cadena deberia de contener la palabra Salir");
    }

}
