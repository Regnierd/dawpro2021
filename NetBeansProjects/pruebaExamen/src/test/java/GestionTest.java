/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.elementos.Gestion;
import es.iespuertodelacruz.javier.elementos.Persona;
import es.iespuertodelacruz.javier.elementos.Validaciones;
import java.util.ArrayList;
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
    Persona persona;
   
    
    @BeforeEach
    public void setUp() throws Exception {
        if(gestion == null){
            gestion = new Gestion();
        }
        if(persona == null){
            persona = new Persona("43387932L", "javier", 24);
        }
        gestion.insertar(persona);
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void insertarTest() {
         assertTrue(gestion.getPersonas().size() == 1, "El tamanio de la lista no es "
                 + "el esperado, se esperaba 1");
     }
     
     @Test
     public void eliminarTest() {
         gestion.eliminar("43387932L");
         assertTrue(gestion.getPersonas().size() == 0, "El tamanio de la lista no es "
                 + "el esperado, se esperaba 0");
     }
     
     @Test
     public void buscarTest() {
         Persona personaEncontrada = gestion.buscar("43387932L");
         assertTrue(personaEncontrada.equals(persona), "El resultado no es el"
                 + "esperado, se esperaba " + gestion.getPersonas().get(0));
     }
     
     @Test
     public void dniOkTest() throws Exception {
         String valor = "43387932L";
         boolean resultado = persona.validar(valor);
         assertTrue(resultado, "La cadena no cumple con el patron correspondiente");
         
     }
     
     @Test
     public void dniIncorrectoTest(){
        String valor = "43387932";
        boolean resultado;
        try {
            resultado = persona.validar(valor);
            assertFalse(resultado, "El resultado no es el esperado, se esperaba "+
                 gestion.getPersonas().get(0).getDni());
        } catch (Exception ex) {
            assertTrue(ex.getMessage().contains("no tiene un formato correcto"), 
                    "El resultado no es el esperado, se esperaba una excepcion");
        }
         
     }
     
     @Test
     public void buscar1Test() {
         ArrayList<Persona> personasEncontradas = gestion.buscar1("43387932L");
         assertTrue(personasEncontradas.get(0).equals(persona), "El resultado no es el"
                 + "esperado, se esperaba " + gestion.getPersonas().get(0));
     }
     
     
     
}
