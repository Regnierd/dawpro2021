/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertolacruz.jpexposito.elementos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javier
 */
public class ListaTest {
    
    Gestion lista;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if (lista == null) {
            lista = new Gestion();
        }
        lista.insertar(generarPersona());
    }
    
    @AfterEach
    public void tearDown() {
    }


    @Test
    public void insertarTest() { 
        assertTrue(lista.getListaPersonas().size() == 1, "El numero de elementos es"
                + " incorrectos, se esperaba 1");
    }
    
    @Test
    public void eliminarTest() { 
        lista.eliminar(generarPersona());
        assertTrue(lista.getListaPersonas().isEmpty(), "El numero de elementos es"
                + " incorrectos, se esperaba 0");
    }
    
    @Test
    public void contarTest() { 
        assertTrue(lista.contar() == 1, "El numero de elementos es"
                + " incorrectos, se esperaba 1");
    }
    
    
    private Persona generarPersona() {
        Direccion direccion = new Direccion("la calle", 1, "S/C de Tenerife");
        Persona persona = new Persona("Juan", "Hdez", 111111, 20, direccion);
        return persona;
    }
}
