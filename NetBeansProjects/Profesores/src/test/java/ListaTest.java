

import es.iespuertodelacruz.javier.profesores.Gestion;
import es.iespuertodelacruz.javier.profesores.Profesor;
import es.iespuertodelacruz.javier.profesores.exceptions.FicheroException;
import es.iespuertodelacruz.javier.profesores.exceptions.ProfesorException;
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
public class ListaTest {
    
    Gestion gestion;
    Profesor profesor;
    
    @BeforeEach
    public void setUp() {
        if(gestion == null){
            gestion = new Gestion();
        }
        profesor = crearProfesor();
        try {
            gestion.insertar(profesor);
        } catch (ProfesorException ex) {
            fail("Se ha producido un error insertando el profesor");
        }
    }
    
    @AfterEach
    public void tearDown() {
        try {
            gestion.eliminar(profesor);
        } catch (ProfesorException ex) {
            fail("Se ha producido un error al eliminar el profesor");
        }
    }

     @Test
     public void existeTest() {
         assertTrue(gestion.existe(profesor), "El profesor no existe en la lista");
     }
     
     @Test
     public void listarTest(){
        String listado = gestion.listar();
        try {
            gestion.almacenarDatos("miFichero.txt");
            assertTrue(listado.contains(profesor.toString()), "No existe el elemento en la lista");
        } catch (ProfesorException ex) {
            fail("Error al escribir el profesor en el fichero");
        } catch (FicheroException ex) {
            fail("Error al crear el fichero");
        }        
     }
     
     
     /**
      * Funcion encargada de generar un profesor para test
      * @return objeto de tipo profesor
      */
     private Profesor crearProfesor(){
         return new Profesor("Pedro", "Perez", "12345678N");  
     }
}
