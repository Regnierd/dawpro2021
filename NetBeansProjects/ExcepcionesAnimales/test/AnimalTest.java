/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.Animal;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Javi
 */
public class AnimalTest {
    
    public AnimalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void nombreAnimalTest() {
        try{
            Animal animal = new Animal("", "raza", 2, false);
        }catch(Exception ex){
            Assertions.assertTrue(ex.getMessage().contains("El nombre "));
        } 
    }
    
    @Test
    public void razaAnimalTest() {
        try{
            Animal animal = new Animal("lylu", "", 4, true);
        }catch(Exception ex){
            Assertions.assertTrue(ex.getMessage().contains("La raza "));
        } 
    }
    
    @Test
    public void edadAnimalTest() {
        try{
            Animal animal = new Animal("lylu", "perro", 0, true);
        }catch(Exception ex){
            Assertions.assertTrue(ex.getMessage().contains("La edad "));
        } 
    }
    
    
}
