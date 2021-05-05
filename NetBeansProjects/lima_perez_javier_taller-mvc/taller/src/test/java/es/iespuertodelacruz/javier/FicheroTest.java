package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.modelo.Fichero;

public class FicheroTest extends UtilidadesTest{
    Fichero fichero;
    String nombreFichero = "Fichero-vehiculos.txt";
    Vehiculo vehiculo;
    Vehiculo vehiculo2;
    
    @BeforeEach
    public void setUp(){
        if(fichero == null){
            fichero = new Fichero();
        }
        if(vehiculo == null){
            vehiculo = generarVehiculo("1234", "Opel");
            vehiculo2 = generarVehiculo("7894", "Corsa");
        }
        try {
            fichero.crear(nombreFichero, "");
            fichero.insertar(vehiculo);
            fichero.insertar(vehiculo2);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @AfterEach
    public void after(){
        try {
            fichero.eliminar(vehiculo);
            fichero.eliminar(nombreFichero);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void insertarTest(){
        Vehiculo vehiculo3;
        try {       
            vehiculo3 = generarVehiculo("4658", "Astra");
            fichero.insertar(vehiculo3);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void modificarTest(){
        Vehiculo vehiculo4;
        vehiculo4 = generarVehiculo("3254", "Toyota");
        try {
            fichero.modificar(vehiculo2, vehiculo4);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void leerFicheroTest(){
        String texto = null;
        try {
            texto = fichero.leer(nombreFichero);
            boolean validar = texto.contains("7894");
            assertTrue(validar, "El programa no lee correctamente el fichero");
        } catch (Exception e) {
            fail("Se ha producido un error en el test leer fichero");
        }
    }
    
    @Test
    public void noEsDirectorioTest(){
        boolean directorio = fichero.esDirectorio(nombreFichero);
        assertFalse(directorio, "No funciona correctamente dado que es un fichero");
    }

    @Test
    public void esDirectorioTest(){
        String nombreDirectorio = "src";
        boolean directorio = fichero.esDirectorio(nombreDirectorio);
        assertTrue(directorio, "No funciona correctamente dado que es un directorio");
    }

    

}
