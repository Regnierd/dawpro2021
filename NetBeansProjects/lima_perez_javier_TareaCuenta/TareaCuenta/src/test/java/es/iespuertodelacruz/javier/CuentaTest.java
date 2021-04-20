package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.exceptions.CuentaException;

public class CuentaTest {
   Cuenta cuenta;

    @BeforeEach
    public void setUp(){
        if(cuenta == null){
            cuenta = new Cuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        }
    }

    @Test
    public void asignarNombreTest(){       
        cuenta.asignarNombre("Pedro Gonzalez");
        assertEquals("Pedro Gonzalez", cuenta.obtenerNombre(), "El nombre deberia ser Pedro Gonzalez");
    }

    @Test
    public void estado(){
        double saldoActual = cuenta.estado();
        assertEquals(cuenta.getSaldo(), saldoActual, "El saldo tiene que ser " + cuenta.getSaldo());
    }

    @Test
    public void ingresarTest(){
        try {
            cuenta.ingresar(400);
            assertEquals(2900, cuenta.getSaldo(), "El saldo actual seria de ser 2900");
        } catch (CuentaException e) {
           fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void retirarTest(){
        try {
            cuenta.retirar(400);
            assertEquals(2100, cuenta.getSaldo(), "El saldo actual seria de ser 2100");
        } catch (CuentaException e) {
            fail("No deberia de llegar aqui");
        }

    }

    @Test 
    public void controlarExceptionIngresarTest(){
        try {
            cuenta.ingresar(-400);
        } catch (CuentaException e) {
            assertTrue(e.getMessage().contains("No se puede ingresar una cantidad negativa"));
        }
    }

    @Test
    public void controlarExceptionRetirarNegativoTest(){
        try {
            cuenta.retirar(-100);
        } catch (CuentaException e) {
            assertTrue(e.getMessage().contains("No se puede retirar una cantidad negativa"));
        }
    }

    @Test
    public void controlarExceptionRetirarSinSaldoTest(){
        Cuenta cuentaSinSaldo = new Cuenta();
        try {
            cuentaSinSaldo.retirar(50);
        } catch (CuentaException e) {
            assertTrue(e.getMessage().contains("No hay suficiente saldo"));
        }
    }

    @Test
    public void obtenerCuentaTest(){
        String cuentaUsuario = cuenta.obtenerCuenta();
        assertEquals(cuentaUsuario, cuenta.getNumero(), "El numero de la cuenta deberia de ser:" + 
            "1000-2365-85-1230456789 ");
    }

    @Test
    public void comprobarSetterTest(){
        cuenta.setTipoInteres(15);
        cuenta.setSaldo(3000);
        cuenta.setNumero("2500-2300-20-1230456789");
        assertEquals(15, cuenta.getTipoInteres(), "El tipo de interes deberia de ser 15");
        assertEquals(3000, cuenta.getSaldo(), "El saldo deberia de ser de 3000");
        assertEquals("2500-2300-20-1230456789", cuenta.getNumero(), "El numero de la cuenta "+
            "deberia de ser 2500-2300-20-1230456789");
    }

    @Test
    public void generarExceptionTest(){
        Exception cuentaException= new CuentaException("Mensaje de error", new Exception());
        assertTrue(cuentaException.getMessage().contains("Mensaje de error"), "No genera el mensaje esperado");
    }
}
