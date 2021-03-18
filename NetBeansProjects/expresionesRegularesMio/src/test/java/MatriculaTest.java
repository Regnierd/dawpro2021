/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class MatriculaTest {
    
    Matricula matricula;
    
    @BeforeEach
    public void setUp() {
        if(matricula == null){
            matricula = new Matricula();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void matriculaOkTest() {
         String valor = "1234ABN";
         boolean resultado = matricula.validar(valor);
         assertTrue(resultado, "La cadena no cumple con el patron correspondiente");
     }
     
     @Test
     public void matriculaIncorrectoTest() {
         String valor = "1234AB";
         boolean resultado = matricula.validar(valor);
         assertFalse(resultado, "La cadena no cumple con el patron correspondiente");
     }
     
     
}
