/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.empleados.Directivo;
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
public class DirectivoTest {
    
    Directivo directivo;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(directivo == null){
            directivo = new Directivo("Pedro");
        }
    }
    
    @AfterEach
    public void tearDown() {
    }
  
     @Test
     public void directivoToString() {
         String mensajeEsperado = "Directivo:Pedro";
         
         Assertions.assertTrue("El metodo toString no funcion correctamente",
                 mensajeEsperado.equalsIgnoreCase(directivo.toString()));
     }
}
