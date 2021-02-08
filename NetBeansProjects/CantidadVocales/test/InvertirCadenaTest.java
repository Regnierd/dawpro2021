/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.vocales.InvertirCadena;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javier
 */
public class InvertirCadenaTest {
    
    InvertirCadena invertirCadena;
    public InvertirCadenaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(invertirCadena == null){
            invertirCadena = new InvertirCadena();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
     @Test
     public void invertirCadenaNoNulo() {
         Assertions.assertNull(invertirCadena, "El objeto no es nulo.");
     }
     
     @Test
     public void invertirTest(){
         invertirCadena.setCadena("Hola tu");
         Assertions.assertEquals(invertirCadena.invertir(), invertirCadena.getCadena(), "El resultado no es el esperado.");
     }
}