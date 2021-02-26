/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.coleccion.PruebasMapas;
import es.iespuertodelacruz.javier.coleccion.elementos.Empleado;
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
public class PruebaMapTest {
    
    PruebasMapas pruebasMapas;
    String clave = "145";
    Empleado empleado = new Empleado("Juan");
    @BeforeEach
    public void setUp() {
        
        if(pruebasMapas == null){
            pruebasMapas = new PruebasMapas();
        }
        pruebasMapas.insertar(clave, empleado);
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    @Test
    public void listaNoVaciaTest(){
        Assertions.assertFalse(pruebasMapas.isEmpy(), "El hashMap no contiene elementos");
    }
    
     @Test
     public void insertarTest() {
         boolean condicion = false;
         Empleado empleadoBuscar;
         empleadoBuscar = pruebasMapas.buscar(clave);
         
         if(empleadoBuscar.equals(empleado)){
             condicion = true;
         }
         
         Assertions.assertTrue(condicion, "El elemento no se ha agregado correctamente");
         
     }
     
    @Test
    public void eliminarTest(){
        pruebasMapas.borrar(clave);
        Assertions.assertTrue(pruebasMapas.isEmpy(), "Existen elementos en la lista");
    }
}
