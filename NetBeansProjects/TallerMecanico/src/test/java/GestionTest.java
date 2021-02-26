/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.Coche;
import es.iespuertodelacruz.javier.Gestion;
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
public class GestionTest {
    Gestion gestion;
    Coche coche;
    public GestionTest() {
    }

    @BeforeEach
    public void setUp() {
        if(gestion == null){
            gestion = new Gestion();
        }
        if(coche == null){
            coche = new Coche("Opel", "Zafira", "4567FGH");
        }
        gestion.insertar(coche);
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void insertarTest() {
        assertTrue(gestion.getCoches().size() == 1, "El tamanio de la lista no es"
                + "el esperado, se esperaba 1");
    }
    
    @Test
    public void eliminarTest() {
        gestion.eliminar("4567FGH");
        assertTrue(gestion.getCoches().contains(coche), "El tamanio de la lista no es"
                + "el esperado, se esperaba 0");
    }
    
    @Test 
    public void buscarTest(){      
        System.out.println(gestion.getCoches());
        Coche cocheEncontrado = gestion.buscar("4567FGH");
        assertTrue(cocheEncontrado.equals(coche), 
                "El resultado no es el esperado, se esperaba " + gestion.getCoches().get(0));
    }
    
    
}
