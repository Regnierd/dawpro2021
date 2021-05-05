package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.controlador.ControladorVehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.exceptions.VehiculoException;
import es.iespuertodelacruz.javier.modelo.Fichero;
import es.iespuertodelacruz.javier.vista.AppVista;

public class AppVistaTest extends UtilidadesTest{
    String[] args = null;
    private ByteArrayInputStream testIn;
    AppVista appVista;
    Vehiculo vehiculo;
    Fichero fichero;
    String nombreFichero = "Fichero-vehiculos.txt";
    ControladorVehiculo controladorVehiculo;

    @BeforeEach
    public void setUp(){
        if(appVista == null){
            appVista = new AppVista();
        }
        if(fichero == null){
            fichero = new Fichero();
        }
        if(controladorVehiculo == null){
            controladorVehiculo = new ControladorVehiculo();
        }      
        try {
            fichero.crear(nombreFichero, "");            
        }catch (FicheroException e) {
            fail("No deberia de llegar aqui" + e.getMessage());
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
    public void insertarTest(){
        args = null;
        testIn = new ByteArrayInputStream("1 4567ASD Corsa 7".getBytes());
        System.setIn(testIn);
        try{
            appVista.main(args);
        }catch(Exception e){
            fail("Se ha producido un error a la hora de insertar el vehiculo. " + e.getMessage());
        }
    }

    @Test
    public void eliminarTest(){
        vehiculo = null;
        args = null;
        try {
            vehiculo = generarVehiculo("1234ABC", "Opel");
            controladorVehiculo.insertar(vehiculo);   
        } catch (FicheroException | VehiculoException e) {
            fail("No deberia de llegar aqui" +e.getMessage());
        }

        testIn = new ByteArrayInputStream("2 1234ABC Opel 7".getBytes());
        System.setIn(testIn);

        try{
            appVista.main(args);
        }catch(Exception e){
            fail("Se ha producido un error a la hora de eliminar el vehiculo. " + e.getMessage());
        }
    }

    @Test
    public void modificarTest(){
        vehiculo = null;
        args = null;
        try {
            vehiculo = generarVehiculo("7894POG", "Astra");
            controladorVehiculo.insertar(vehiculo);   
        } catch (FicheroException | VehiculoException e) {
            fail("No deberia de llegar aqui" +e.getMessage());
        }

        testIn = new ByteArrayInputStream("3 7894POG Astra 6548MNH Corsa 7".getBytes());
        System.setIn(testIn);

        try{
            appVista.main(args);
        }catch(Exception e){
            fail("Se ha producido un error a la hora de modificar el vehiculo. " + e.getMessage());
        }
    }

    @Test
    public void buscarTest(){
        vehiculo = null;
        args = null;
        try {
            vehiculo = generarVehiculo("7894POG", "Astra");
            controladorVehiculo.insertar(vehiculo);   
        } catch (FicheroException | VehiculoException e) {
            fail("No deberia de llegar aqui" +e.getMessage());
        }

        testIn = new ByteArrayInputStream("4 7894POG Astra 7".getBytes());
        System.setIn(testIn);

        try{
            appVista.main(args);
        }catch(Exception e){
            fail("Se ha producido un error a la hora de buscar el vehiculo. " + e.getMessage());
        }
    }

    
    @Test
    public void listarTest(){
        vehiculo = null;
        args = null;
        try {
            vehiculo = generarVehiculo("7894POG", "Astra");
            controladorVehiculo.insertar(vehiculo);   
        } catch (FicheroException | VehiculoException e) {
            fail("No deberia de llegar aqui" +e.getMessage());
        }

        testIn = new ByteArrayInputStream("5 7894POG Astra 7".getBytes());
        System.setIn(testIn);

        try{
            appVista.main(args);
        }catch(Exception e){
            fail("Se ha producido un error a la hora de listar el vehiculo. " + e.getMessage());
        }
    }

    @Test
    public void listarMatriculaTest(){
        vehiculo = null;
        args = null;
        try {
            vehiculo = generarVehiculo("7894POG", "Astra");
            controladorVehiculo.insertar(vehiculo);   
        } catch (FicheroException | VehiculoException e) {
            fail("No deberia de llegar aqui" +e.getMessage());
        }

        testIn = new ByteArrayInputStream("6 7894POG Astra 7".getBytes());
        System.setIn(testIn);

        try{
            appVista.main(args);
        }catch(Exception e){
            fail("Se ha producido un error a la hora de listar el vehiculo. " + e.getMessage());
        }
    }


    
}
