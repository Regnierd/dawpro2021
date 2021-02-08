/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasTest;

import es.iespuertodelacruz.javier.cuentas.Cuenta;
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
public class cuentaTest {
    Cuenta cuenta;
    public cuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
       if(cuenta == null){
           cuenta = new Cuenta();
       }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void cantidadTest() {
        cuenta.setCantidad(5.0);
        cuenta.ingresar(-10.0);
        Assertions.assertEquals(cuenta.getCantidad(), 5D,"El valor no es el esperado");
    }
}
