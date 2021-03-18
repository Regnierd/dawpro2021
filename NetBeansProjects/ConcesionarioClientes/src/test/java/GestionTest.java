/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.elementos.Cliente;
import es.iespuertodelacruz.javier.elementos.Coche;
import es.iespuertodelacruz.javier.elementos.Direccion;
import es.iespuertodelacruz.javier.elementos.Gestion;
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
    Cliente cliente;
    Direccion direccion;
    
    @BeforeEach
    public void setUp() throws Exception {
        if(gestion == null){
            gestion = new Gestion();
        }
        if(coche == null){
            coche = new Coche("9874LKJ", "Opel", "Zafira");
        }
        if(direccion == null){
            direccion = new Direccion(15, "Calle Madrid", "CP38410", "Los Realejos");
        }
        if(cliente == null){
            cliente = new Cliente("Javier", "Lima Perez", "43387932L", 24, coche, direccion);
        }
        gestion.insertarCoche(coche);
        gestion.insertarCliente(cliente);
    }
    
    @AfterEach
    public void tearDown() {
    }

    
     @Test
     public void insertarCocheTest() {
         assertTrue(gestion.getCoches().size() == 1, "El tamanio de la lista no"
                 + " es el esperado, se esperaba 1");
     }
     
     @Test
     public void buscarCocheTest(){
         Coche cocheEncontrado = gestion.buscarCoche("9874LKJ");
         assertTrue(cocheEncontrado.equals(coche), "El resultado no es el esperado,"
                 + "se esperaba " + gestion.getCoches().get(0));
     }
     
     @Test
     public void eliminarCocheTest() {
         gestion.eliminarCoche("9874LKJ");
         assertTrue(gestion.getCoches().size() == 0, "El tamanio de la lista no"
                 + " es el esperado, se esperaba 0");
     }
     
     @Test
     public void insertarClienteTest() {
         assertTrue(gestion.getClientes().size() == 1, "El tamanio de la lista no"
                 + " es el esperado, se esperaba 1");
     }
     
     @Test
     public void buscarClienteTest(){
         Cliente clienteEncontrado = gestion.buscarCliente("43387932L");
         assertTrue(clienteEncontrado.equals(cliente), "El resultado no es el esperado,"
                 + "se esperaba " + gestion.getClientes().get(0));
     }
     
     @Test
     public void eliminarClienteTest() {
         gestion.eliminarCliente("43387932L");
         assertTrue(gestion.getClientes().size() == 0, "El tamanio de la lista no"
                 + " es el esperado, se esperaba 0");
     }
     
     @Test
     public void dniOkTest() throws Exception{
         String valor = "43387932L";
         boolean resultado = cliente.validarDni(valor);
         assertTrue(resultado, "La cadena no cumple con el patron correspondiente");
     }
     
     @Test
     public void dniIncorrectoTest(){
        String valor = "43387932";
        boolean resultado;
        try {
            resultado = cliente.validarDni(valor);
            assertFalse(resultado, "El resultado no es el esperado, se esperaba "+
                 gestion.getClientes().get(0).getDni());
        } catch (Exception ex) {
            assertTrue(ex.getMessage().contains("no tiene un formato correcto"), 
                    "El resultado no es el esperado, se esperaba una excepcion");
        }
         
     }
     
     @Test
     public void cpOkTest() throws Exception{
         String valor = "CP38410";
         boolean resultado = direccion.validarCp(valor);
         assertTrue(resultado, "La cadena no cumple con el patron correspondiente");
     }
     
     @Test
     public void cpIncorrectoTest(){
        String valor = "C38410";
        boolean resultado;
        try {
            resultado = direccion.validarCp(valor);
            assertFalse(resultado, "El resultado no es el esperado, se esperaba "+
                 gestion.getClientes().get(0).getDireccion().getCP());
        } catch (Exception ex) {
            assertTrue(ex.getMessage().contains("no tiene un formato correcto"), 
                    "El resultado no es el esperado, se esperaba una excepcion");
        }
         
     }
     
}
