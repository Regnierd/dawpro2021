package es.iespuertodelacruz.javier.elementos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.exceptions.AlumnoException;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class GestionArrayListTest {
    private static final String NOMBRE_FICHERO_TXT = "nombreFichero.txt";
    GestionArrayList gestionArrayList;
    Fichero fichero;

    @BeforeEach
    public void setUp() {
        if (fichero == null) {
            fichero = new Fichero();
        }
        if (gestionArrayList == null) {
            gestionArrayList = new GestionArrayList();
        }
        
        try {
            //fichero.eliminar(NOMBRE_FICHERO_TXT);
            gestionArrayList.insertar(crearAlumnoTest());
        } catch (AlumnoException e) {
            fail("Se ha producido un error al insertar el alumno");
        } catch (Exception e) {
            fail("Se ha producido un error en la inicializacion del test");
        } 
    }

    @Test
    public void insertarTestAlumno(){
        assertEquals(1, gestionArrayList.alumnos.size(), "No se ha insertado correctamente el alumno" );
    }

    @Test
    public void insertarTestErrorAlumno(){
        try {
            gestionArrayList.insertar(crearAlumnoTest());
        } catch (AlumnoException e) {
            assertTrue(e.getMessage().contains("ya se encuentra en la lista")); 
        }
    }

    @Test
    public void eliminarAlumnoTest(){
        gestionArrayList.eliminar(1);
        assertTrue(gestionArrayList.alumnos.isEmpty(), "No se ha eliminado correctamente");
    }

        @Test
    public void mostrarAlumnoTest(){
        assertTrue(gestionArrayList.mostrarLista().contains("test"), "La lista no contiene el alumno correcto");
    }

    @Test
    public void volcarAficheroTest() {
        try {
            gestionArrayList.volcarAfichero(NOMBRE_FICHERO_TXT);
            String contenido = fichero.leer(NOMBRE_FICHERO_TXT);
            assertTrue(contenido.contains("test, test"), "El fichero no contiene el alumno");
        } catch (FicheroException e) {
            fail("Error guardando el fichero de test");
        }
    }

    private Alumno crearAlumnoTest() {
        return new Alumno("test", "test", 1);
    }
}
