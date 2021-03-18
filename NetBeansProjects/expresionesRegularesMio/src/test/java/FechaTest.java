/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.ejemplos.Fecha;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Javi
 */
public class FechaTest {
    
    Fecha fecha;
    
    @BeforeEach
    public void setUp() {
        if(fecha == null){
            fecha = new Fecha();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void fechaOkTest() {
         String valor = "11/01/2021";
         boolean resultado = fecha.validar(valor);
         assertTrue(resultado, "La cadena no contiene el patron correspondiente");
     }
     
     @Test
     public void fechaIncorrectoTest() {
         String valor = "32/13/468";
         boolean resultado = fecha.validar(valor);
         assertFalse(resultado, "La cadena no contiene el patron correspondiente");
     }
}
