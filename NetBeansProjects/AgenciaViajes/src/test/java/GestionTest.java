/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.elementos.Ciudad;
import es.iespuertodelacruz.javier.elementos.Gestion;
import es.iespuertodelacruz.javier.elementos.Pasajero;
import es.iespuertodelacruz.javier.exceptions.CiudadesException;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.exceptions.PasajerosException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Pasajero pasajero;
    Ciudad ciudad;
    //String nombre, String dni, String destino, Ciudad ciudad
    @BeforeEach
    public void setUp() throws Exception {
        if(gestion == null){
            gestion = new Gestion();
        }
        ciudad = crearCiudad();
        pasajero = crearPasajero();
      
        try {
            gestion.insertar(pasajero);
            gestion.insertar(ciudad);
        } catch (PasajerosException ex) {
            fail("Se ha producido un error insertando el pasajero");
        } catch(CiudadesException ex){
            fail("Se ha producido un error insertando la ciudad");
        }
 
    }
    
    @AfterEach
    public void tearDown() {
        try {
            gestion.eliminar(pasajero);
            gestion.eliminar(ciudad);
        } catch (PasajerosException ex) {
            fail("Se ha producido un error al eliminar el pasajero");
        } catch(CiudadesException ex){
            fail("Se ha producido un error al eliminar la ciudad");
        }
    }

     @Test
     public void existePasajeroTest() {
         assertTrue(gestion.existe(pasajero), "El pasajero no existe en la lista");
     }
     
     @Test
     public void noExistePasajeroTest() throws Exception {
         Pasajero pasajeroNoEncontrado = new Pasajero("Antonio", "11111111A", "Lisboa", ciudad);
         assertFalse(gestion.existe(pasajeroNoEncontrado), "El pasajero existe en la lista");
     }
     
     @Test
     public void existeCiudadTest() {
         assertTrue(gestion.existe(ciudad), "La ciudad no existe en la lista");
     }
     
     @Test
     public void noExisteCiudadTest() {
         Ciudad ciudadNoEncontrada = new Ciudad("Liverpool", "Inglaterra");
         assertFalse(gestion.existe(ciudadNoEncontrada), "La ciudad existe en la lista");
     }
     
     @Test
     public void buscarDestinoTest(){
         String ciudadesDestino = gestion.buscarDestino("00000000A");
         assertTrue("Madrid".equals(ciudadesDestino), 
                 "El resultado no es el esperado, se esperaba Madrid" );
         
     }
     
     @Test
     public void cantidadTest(){
         int contador = gestion.contarPasajerosCiudad(ciudad);
         assertTrue(contador == 1 ,
                 "El resultado no es el esperado, se esperaba 1");
         
     }
     
     @Test
     public void listarTest(){
        String listado = gestion.listar();
        try {
            gestion.almacenarDatos("miFichero.txt");
            assertTrue(listado.contains(pasajero.toString()), "No existe el elemento en la lista");
        } catch (PasajerosException ex) {
            fail("Error al escribir el pasajero en el fichero");
        } catch (FicheroException ex) {
            fail("Error al crear el fichero");
        }        
     }
     
     @Test
     public void dniTest() throws Exception {
         String valor = "12345678A";
         boolean resultado =  pasajero.validar(valor);
         assertTrue(resultado, "La cadena no cumple el patron correspondiente");
        
         
     }
     
     @Test
     public void errorTest() {
        String valor = "43387932";
        boolean resultado;
        try {
            resultado = pasajero.validar(valor);
            assertFalse(resultado, "El resultado no es el esperado, se esperaba "+
                 gestion.getPasajeros().get(0).getDni());
        } catch (Exception ex) {
            assertTrue(ex.getMessage().contains("no tiene un formato correcto"), 
                    "El resultado no es el esperado, se esperaba una excepcion");
        }
        
     }
    
    /**
      * Funcion encargada de generar un pasajero para test
      * @return objeto de tipo pasajero
      */
     private Pasajero crearPasajero() throws Exception{
         return new Pasajero("Pedro", "00000000A", "Madrid", ciudad);  
     }
     
     /**
      * Funcion encargada de generar una ciudad para test
      * @return objeto de tipo ciudad
      */
     private Ciudad crearCiudad(){
         return new Ciudad("Buenos Aires", "Argentina");  
     }
}
