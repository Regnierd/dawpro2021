package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.controlador.ControladorVehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.exceptions.VehiculoException;
import es.iespuertodelacruz.javier.modelo.Fichero;

public class ControladorVehiculoTest extends UtilidadesTest {
    ControladorVehiculo controladorVehiculo;
    Vehiculo vehiculo;
    Vehiculo vehiculo2;
    Fichero fichero;
    String nombreFichero = "Fichero-vehiculos.txt";
    @BeforeEach
    public void setUp(){
        if(controladorVehiculo == null){
            controladorVehiculo = new ControladorVehiculo();
        }
        if(vehiculo == null){
            vehiculo = generarVehiculo("1234AC", "Opel");
            vehiculo2 = generarVehiculo("9786BC", "Astra");
        }
        if(fichero == null){
            fichero = new Fichero();
        }
        try {
            fichero.crear(nombreFichero, "");       
            controladorVehiculo.insertar(vehiculo);
            controladorVehiculo.insertar(vehiculo2);
        } catch (FicheroException e) {
            fail("No deberia de llegara aqui");
        } catch (VehiculoException e) {
            fail("Fallo a la hora de crear un vehiculo");
        }
    }

    @AfterEach
    public void after(){
        try {
            fichero.eliminar(nombreFichero); 
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void validarVehiculoNuloTest(){
        Vehiculo vehiculoNulo = null;
        try {
            controladorVehiculo.validar(vehiculoNulo);
        } catch (VehiculoException e) {
            assertTrue(e.getMessage().contains("Se esta intentando validar un objeto vacio"));
        }
    }

    @Test
    public void validarParametrosNuloTest(){
        Vehiculo vehiculoNuevo = new Vehiculo(null, null);
        try {
            controladorVehiculo.validar(vehiculoNuevo);
        } catch (VehiculoException e) {
            assertTrue(e.getMessage().contains("La marca del vehiculo es nula o vacia"));
            assertTrue(e.getMessage().contains("La matricula del vehiculo es nula o vacia"));           
        }
    }

    @Test
    public void modificarTest(){
        Vehiculo vehiculoNuevo = generarVehiculo("65824", "Toyota");
        try {
            controladorVehiculo.modificar(vehiculo, vehiculoNuevo);
        } catch (FicheroException | VehiculoException e) {
            fail("No deberia de llegar aqui");
        }  
    }

    @Test
    public void listarTest(){
        try {
            controladorVehiculo.listar();
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void listarMatriculaTest(){
        String matricula = "1234AC";
        try {
            Vehiculo vehiculoListado = controladorVehiculo.listar(matricula);
            assertEquals(matricula, vehiculoListado.getMatricula(), "La matricula deberia de ser 1234AC");
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void controlarEliminarExceptionTest(){
        try{
            Vehiculo vehiculoEliminar = new Vehiculo("AAAA", "PPPPP");
            controladorVehiculo.eliminar(vehiculoEliminar);
        }catch(VehiculoException e){
            assertTrue(e.getMessage().contains("El vehiculo indicada NO existe"));
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }      
    }

    @Test
    public void controlarModificarExceptionTest(){
        try{
            Vehiculo vehiculoEliminar = new Vehiculo("AAAA", "PPPPP");
            controladorVehiculo.modificar(vehiculoEliminar, vehiculo);
        }catch(VehiculoException e){
            assertTrue(e.getMessage().contains("El vehiculo indicada NO existe"));
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }      
    }
}
