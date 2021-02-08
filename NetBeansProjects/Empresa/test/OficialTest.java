/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.empleados.Oficial;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Javi
 */
public class OficialTest {
    
    Oficial oficial;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(oficial == null){
            oficial = new Oficial();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

   
     @Test
     public void oficialTest() {
         Assertions.assertFalse("El campo nombre no es vacio", oficial.getNombre() != null);
     }
}
