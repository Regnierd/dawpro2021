package es.iespuertodelacruz.javier.elementos;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.exceptions.AlumnoException;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class GestionHashMapTest {
    GestionHashMap gestion;
    String nombreFichero = "nombreFichero.txt";
    Fichero fichero;
    
    @BeforeEach
    public void setUp(){
        if(fichero == null){
            fichero = new Fichero();
        }
        if(gestion == null){
            gestion = new GestionHashMap();    
        }

        try {
            //fichero.eliminar(nombreFichero);
            gestion.insertar(crearAlumnoTest());
        } catch (AlumnoException e) {
            fail("Se ha producido un error al iniciarlizar el test");
        } catch (Exception e) {
            fail("Se ha producido un error");
        } 
    }

    @Test
    public void insertarTestAlumno(){
        assertEquals(1, gestion.alumnos.size());

    }

    @Test
    public void insertarErrorTestAlumno(){
        try {
            gestion.insertar(crearAlumnoTest());
        } catch (AlumnoException e) {
            assertTrue(e.getMessage().contains("El alumno ya se encuentra en la lista"));
        }
    }

    @Test
    public void eliminarTestAlumno(){
        gestion.eliminar(1);
        assertEquals(0, gestion.alumnos.size(), "No se ha eliminado correctamente");;
    }

    @Test
    public void mostrarAlumnoTest(){
        assertTrue(gestion.mostrarLista().contains("test"), "La lista no contiene el alumno correcto");
    }
 
    @Test
    public void volcarFicheroTest(){
        try {
            gestion.volcarFichero(nombreFichero);
            String contenido = fichero.leer(nombreFichero);
            assertTrue(contenido.contains("tests, 1"), "El fichero no contiene dicho alumno");
        } catch (FicheroException e) {
            fail("Error guardando el fichero de test");
        }
    }

    /**
     * Funcion para crear un alumno
     * @return un alumno
     */
    private Alumno crearAlumnoTest(){
        return new Alumno("test", "tests", 1);

    }

}
