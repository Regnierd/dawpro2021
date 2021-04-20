package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.exceptions.CuentaException;

public class PrincipalTest {
    Cuenta cuenta;
    Principal principal = new Principal();

    @BeforeEach
    public void setUp(){
        if(cuenta == null){
            cuenta = new Cuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        }

    }

    @Test
    public void gestionCuentaTest(){
        try {
            Principal.gestionCuenta(cuenta);
            assertEquals(895, cuenta.getSaldo(), "El saldo deberia de ser 895");
        } catch (CuentaException e) {
            fail("No deberia de llegar aqui");
        }
          
    }

    @Test
    public void controlarExceptionGestionCuentaTest(){
        Cuenta cuentaNueva = new Cuenta();      
        try {
            Principal.gestionCuenta(cuentaNueva);
        } catch (CuentaException e) {
            assertTrue(e.getMessage().contains("Error a la hora de gestionar la cuenta"));
        }
    }

    @Test
    public void mainTest(){
        String[] args = null;
        try {
            principal.main(args);
            assertNotNull(principal);
        } catch (CuentaException e) {
            fail("No deberia de llegar aqui");
        }
        
    }
}