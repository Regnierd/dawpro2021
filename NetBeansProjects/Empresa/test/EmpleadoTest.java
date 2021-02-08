/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.empleados.Empleado;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Javi
 */
public class EmpleadoTest {
    Empleado empleado;
    public EmpleadoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(empleado == null){
            empleado = new Empleado("Juan");
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void empleadoNoNulo() {
         Assertions.assertNotNull(empleado, "La variable empleado se ha inicializado correctamente");
     }
     
     @Test
     public void empleadoToString(){
         String mensajeEsperado = "Empleado:Juan";
         Assertions.assertTrue("El metodo toString no funcion correctamente"
                 , mensajeEsperado.equalsIgnoreCase(empleado.toString()));
         
     }
}
