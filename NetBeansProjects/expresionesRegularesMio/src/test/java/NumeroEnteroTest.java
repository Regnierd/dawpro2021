/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.ejemplos.NumeroEntero;
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
public class NumeroEnteroTest {
    
    NumeroEntero numeroEntero;
    
    @BeforeEach
    public void setUp() {
        if(numeroEntero == null){
            numeroEntero = new NumeroEntero();
        }
        
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void numeroEnteroOkTest() {
         String valor = "45";
         boolean resultado = numeroEntero.validar(valor);
         assertTrue(resultado, "La cadena no contiene el patron correspondiente");
     }
     
     @Test
     public void numeroEnteroIncorrectoTest() {
         String valor = "45";
         boolean resultado = numeroEntero.validar(valor);
         assertTrue(resultado, "La cadena no contiene el patron correspondiente");
     }
}
