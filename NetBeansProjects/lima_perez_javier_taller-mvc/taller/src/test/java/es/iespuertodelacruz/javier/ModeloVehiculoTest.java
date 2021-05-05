package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.modelo.Fichero;
import es.iespuertodelacruz.javier.modelo.ModeloVehiculo;

public class ModeloVehiculoTest extends UtilidadesTest{
    ModeloVehiculo modeloVehiculo;
    Vehiculo vehiculo;
    Fichero fichero;
    String nombreFichero = "Fichero-vehiculos.txt";

    @BeforeEach
    public void setUp(){
        if(modeloVehiculo == null){
            modeloVehiculo = new ModeloVehiculo();
        }
        if(vehiculo == null){
            vehiculo = generarVehiculo("1234AC", "Opel");
            
        }
        if(fichero == null){
            fichero = new Fichero();
        }
        try {
            fichero.crear(nombreFichero, "");
            modeloVehiculo.insertar(vehiculo);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
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
        try {
            modeloVehiculo.insertar(vehiculo);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void eliminarTest(){
        try {
            modeloVehiculo.eliminar(vehiculo);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void modificarTest(){
        Vehiculo vehiculoNuevo = generarVehiculo("9786BC", "Astra");
        try {
            modeloVehiculo.modificar(vehiculo, vehiculoNuevo);
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void listarTest(){
        try {
            modeloVehiculo.listar();
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void listarMatriculaTest(){
        String matricula = "1234AC";
        try {
            Vehiculo vehiculoListado = modeloVehiculo.listar(matricula);
            assertEquals(matricula, vehiculoListado.getMatricula(), "La matricula deberia de ser 1234AC");
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void buscarTest(){
        String matricula = "1234AC";
        try {
            Vehiculo vehiculoEncontrado = modeloVehiculo.buscar(matricula);
            assertEquals(matricula, vehiculoEncontrado.getMatricula(), "El vehiculo deberia de tener la matricula 1234AC");
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

}
