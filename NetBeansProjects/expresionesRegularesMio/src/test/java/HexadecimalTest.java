/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.ejemplos.Hexadecimal;
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
public class HexadecimalTest {
    
    Hexadecimal hexadecimal;
    
    @BeforeEach
    public void setUp() {
        if(hexadecimal == null) {
            hexadecimal = new Hexadecimal();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void hexadecimalOkTest() {
         String valor = "0F";
         boolean resultado = hexadecimal.validar(valor);
         assertTrue(resultado, "La cadena no contiene el patron correspondiente");
     }
     
     @Test
     public void hexadecimalIncorrectoTest() {
         String valor = "19987FGG";
         boolean resultado = hexadecimal.validar(valor);
         assertFalse(resultado, "La cadena no contiene el patron correspondiente");
     }
     
     @Test
     public void hexadecimalIncorrecto1Test() {
         String valor = "HHH";
         boolean resultado = hexadecimal.validar(valor);
         assertFalse(resultado, "La cadena no contiene el patron correspondiente");
     }
}
