/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static es.iespuertodelacruz.javier.Principal.pedirDatos;
import es.iespuertodelacruz.javier.Vehiculo;
import es.iespuertodelacruz.javier.exceptions.DatosException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class VehiculoTest{
    
    static ArrayList<Vehiculo> vehiculos;
    Vehiculo vehiculo;

    public VehiculoTest() throws DatosException {
        this.vehiculo = new Vehiculo("4567FHM", "Opel", "Zafira", "Gris", 30);
    }
    
    @BeforeEach
    public void setUp() throws DatosException{   
        if(vehiculos == null){
            vehiculos = new ArrayList();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void addVehiculoExceptionTest() {         
       try {          
           Vehiculo vehiculo2 = new Vehiculo("4567FHM", "Opel", "Zafira", "Gris", 30);  
           Vehiculo.addVehiculo(vehiculo);
           Vehiculo.addVehiculo(vehiculo2);           
       } catch (Exception ex) {
           Assertions.assertTrue(ex.getMessage().contains("ya existe"), 
                   "La exception no se esta lanzando correctamente: " 
                           + ex.getMessage());
       }

    }
    
    @Test
    public void addVehiculoTest() throws Exception {               
       Vehiculo vehiculo2 = new Vehiculo("4567OIM", "Opel", "Zafira", "Gris", 30);   
       Vehiculo.addVehiculo(vehiculo2);   
       Assertions.assertTrue(vehiculos.contains(vehiculo2), "El vehiculo no se ha"
               + " agregado correctamente");
    }
    
    @Test
    public void eliminarTest() throws Exception {          
       Vehiculo.eliminar("4567FHM");
       Assertions.assertFalse(vehiculos.contains(vehiculo), "El vehiculo no se "
               + "ha eliminado correctamente ");
    }
    
}
