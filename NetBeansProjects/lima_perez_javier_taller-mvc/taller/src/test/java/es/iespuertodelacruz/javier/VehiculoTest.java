package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Vehiculo;

public class VehiculoTest extends UtilidadesTest {
    Vehiculo vehiculo;

    @BeforeEach
    public void setUp(){
        if(vehiculo == null){
            vehiculo = generarVehiculo("7894A", "Opel");
        }
    }

    @Test
    public void generarVehiculoVacioTest(){
        Vehiculo vehiculo = generarVehiculo(null, null);
        assertNotNull( vehiculo, "El objeto vehiculo no se ha generado correctamente");  
        assertTrue(vehiculo.getMatricula().contains("0123ACV"), "Los valores del objeto vehiculo no son los correctos");
        assertTrue(vehiculo.getMarca().contains("Opel"), "Los valores del objeto vehiculo no son los correctos");
    }

    @Test
    public void toStringTest(){
        String cadena = vehiculo.toString();
        assertTrue(cadena.contains("Opel"), "La cadena no contiene la marca Opel");
    }
}
