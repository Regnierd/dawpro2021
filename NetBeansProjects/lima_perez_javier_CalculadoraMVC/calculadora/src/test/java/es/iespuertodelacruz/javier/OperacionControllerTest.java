package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Operacion;
import es.iespuertodelacruz.javier.controlador.OperacionController;
import es.iespuertodelacruz.javier.exception.OperacionException;

public class OperacionControllerTest extends UtilidadesTest {
   
    Operacion operacion;
    OperacionController operacionController;
    double resultadoEsperado = 0.0;
 
    @BeforeEach
    public void sepUp() {
       if (operacion == null) {
          operacion = generarOperacion(numero1, numero2, operando);
       }
       if (operacionController == null) {
          operacionController = new OperacionController();
       }
       try {
          operacionController.validar(operacion);
       } catch (OperacionException e) {
         fail("Se ha producido un error realizando la validacion del objeto operacion");
       }
       
    }
 
 
    @Test 
    public void validarNullTest() {
       operacion = null;
       try {
          operacionController.validar(operacion);
       } catch (Exception e) {
         assertTrue(e.getMessage().contains("null"), "El mensaje no contiene la cadena esperada");
       }
    }
 
    @Test 
    public void validarSinValororesTest() {
       operacion.setNumero1(-1);
       operacion.setNumero2(-1);
       operacion.setOperando(' ');
 
       try {
          operacionController.validar(operacion);
       } catch (Exception e) {
         assertTrue(e.getMessage().contains("numero"), "El mensaje no contiene la cadena esperada");
         assertTrue(e.getMessage().contains("operador"), "El mensaje no contiene la cadena esperada");
       }
    }
 
    @Test
    public void verificarOperacionErrorTest() {
       try {        
          operacionController.operaciones(operacion, '-');
       } catch (Exception e) {
          assertTrue(e.getMessage().contains("incorrecta"), "El mensaje no contiene la cadena esperada");
 
       }
    }
 
    @Test
    public void sumaTest(){
       resultadoEsperado = 2.0;
       double resultado = 0.0;
       try {
          resultado = operacionController.sumar(operacion);
          assertEquals(resultadoEsperado, resultado, "No se ha obtenido el resultado esperado");
 
       } catch (Exception e) {
          fail("Se ha producido un error no esperado en la operacion");
       }
    }
    
    @Test
    public void restaTest(){
       operacion.setOperando('-');
       resultadoEsperado = 0.0;
       double resultado = 0.0;
       try {
          resultado = operacionController.restar(operacion);
          assertEquals(resultadoEsperado, resultado, "No se ha obtenido el resultado esperado");
 
       } catch (Exception e) {
          fail("Se ha producido un error no esperado en la operacion");
       }
    }
 
    @Test
    public void multiplicacionTest(){
       operacion.setOperando('*');
       resultadoEsperado = 1.0;
       double resultado = 0.0;
       try {
          resultado = operacionController.multiplicar(operacion);
          assertEquals(resultadoEsperado, resultado, "No se ha obtenido el resultado esperado");
 
       } catch (Exception e) {
          fail("Se ha producido un error no esperado en la operacion");
       }
    }
 
    @Test
    public void divisionTest() {
       operacion.setOperando('/');
       resultadoEsperado = 1.0;
       double resultado = 0.0;
       try {
          resultado = operacionController.dividir(operacion);
          assertEquals(resultadoEsperado, resultado, "No se ha obtenido el resultado esperado");
 
       } catch (Exception e) {
          fail("Se ha producido un error no esperado en la operacion");
       }
    }
    @Test
    public void divisionCeroTest() {
       operacion.setOperando('/');
       operacion.setNumero2(0.0);
       resultadoEsperado = 0.0;
       double resultado = 0.0;
       try {
          resultado = operacionController.dividir(operacion);
       } catch (Exception e) {
          assertTrue(e.getMessage().contains("por 0"), "No se ha obtenido el mensaje esperado");
       }
    }
}