package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.elementos.Alumno;
import es.iespuertodelacruz.javier.elementos.Aula;
import es.iespuertodelacruz.javier.elementos.Gestion;
import es.iespuertodelacruz.javier.elementos.Nota;
import es.iespuertodelacruz.javier.elementos.Persona;
import es.iespuertodelacruz.javier.elementos.Profesor;
import es.iespuertodelacruz.javier.elementos.Validacion;
import es.iespuertodelacruz.javier.exceptions.ExceptionAula;
//import es.iespuertodelacruz.javier.exceptions.ExceptionNota;
import es.iespuertodelacruz.javier.exceptions.ExceptionPersona;
import es.iespuertodelacruz.javier.exceptions.ExceptionValidar;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class GestionTest {
    Gestion gestion;
    Alumno alumno;
    Profesor profesor;
    Aula aula;
    Nota nota;
    Validacion validacion;
    String nombreFicheroNotas = "TodasLasNotas.txt";
    
    @BeforeEach
    public void setUp() throws ExceptionPersona{
        if(gestion == null){
            gestion = new Gestion();
        }      
        if(validacion == null){
            validacion = new Validacion();
        }
        try{
            alumno = crearAlumno();
            aula = crearAula();
            profesor = crearProfesor();
            nota = crearNota();
            gestion.insertar(alumno);
            gestion.insertar(aula);
            gestion.insertar(profesor);
            gestion.insertarAulaProfesor(profesor, aula);
            gestion.insertarNotaAlumno(alumno, nota);
        
        }catch(ExceptionPersona e){
            fail("Se ha producido un error al insertar la persona");
        }catch(ExceptionAula e){
            fail("Se ha producido un error al insertar el aula");
        }catch(Exception e){
            fail("Ha ocurrido un error inesperado" + e.getMessage());
        }
     
    }

    @AfterEach
    public void after(){

    }

    @Test
    public void controlarExceptionInsertarAlumnoTest() throws Exception{
        try {
            ArrayList<Nota> notas = new ArrayList<>();
            alumno = new Alumno("Pedro", "Perez Gonzalez", "45678963L", notas);
            gestion.insertar(alumno);
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("ya existe"));
        }
    }

    @Test
    public void controlarExceptionInsertarProfesorTest() throws Exception{
        try {
            ArrayList<Aula> aulas = new ArrayList<>();
            profesor = new Profesor("Juan", "Gonzalez Hernandez", "00000000A", aulas);
            gestion.insertar(profesor);
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("ya existe"));
        }
    }

    @Test
    public void controlarExceptionInsertarAulaTest() throws Exception{
        try {
            HashMap<String, Alumno> alumnos = new HashMap<>();
            aula = new Aula(2, 104, alumnos);
            gestion.insertar(aula);
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("ya existe"));
        }
    }

    @Test
    public void controlarExceptionInsertarAulaProfesorTest() throws ExceptionAula{
        try {                
            gestion.insertarAulaProfesor(profesor, aula);
        } catch (ExceptionAula e) {
            assertTrue(e.getMessage().contains("ya esta asignada al profesor"));
        }
    }

    @Test
    public void controlarExceptionInsertarNotaAlumnoTest() throws Exception{
        try {
            gestion.insertarNotaAlumno(alumno, nota);
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("ya esta asignada al alumno"));
        }
    }


    @Test
    public void existeAlumnoTest(){
        assertTrue(gestion.existe(alumno), "El alumno no existe en la lista");
    }


    @Test
    public void noExisteAlumnoTest(){
        ArrayList<Nota> notas = new ArrayList<>();
        Alumno alumnoNuevo;
        try {
            alumnoNuevo = new Alumno("Jonay", "Hernandez Izquierdo", "11111111B", notas);
            assertFalse(gestion.existe(alumnoNuevo), "El alumno existe en la lista");
        } catch (Exception e) {
            fail("Ha habido un error al comprobar el alumno");
        }
        
    }

    @Test
    public void existeProfesorTest(){
        assertTrue(gestion.existe(profesor), "El profesor no existe en la lista");
    }


    @Test
    public void noExisteProfesorTest(){
        ArrayList<Aula> aulas = new ArrayList<>();
        Profesor profesorNuevo;
        try {
            profesorNuevo = new Profesor("Jhony", "Perez Perez", "22222222B", aulas);
            assertFalse(gestion.existe(profesorNuevo), "El alumno existe en la lista");
        } catch (Exception e) {
            fail("Ha habido un error al comprobar el profesor");
        }
        
    }
    @Test
    public void existeAulaTest(){
        assertTrue(gestion.existe(aula), "El aula no existe en la lista");
    }

    @Test
    public void noExisteAulaTest(){
        HashMap<String, Alumno> alumnos = new HashMap<>();
        Aula aulaNueva = new Aula(2, 105, alumnos);
        assertFalse(gestion.existe(aulaNueva), "El aula existe en la lista");
    }

    @Test
    public void existeNotaAlumnoTest(){
        assertTrue(gestion.existe(alumno, nota), "La nota no existe en la lista de notas del alumno");
     
    }

    @Test
    public void noExisteNotaAlumnoTest(){
        Nota notaNueva = new Nota("Programacion", 7);
        assertFalse(gestion.existe(alumno, notaNueva), "La nota existe en la lista de notas del alumno");
    }

    @Test
    public void existeAulaProfesorTest(){
        assertTrue(gestion.existe(profesor, aula), "El aula no existe en la lista de aulas del profesor");
   
    }

    @Test
    public void noExisteAulaProfesorTest(){
        HashMap<String, Alumno> alumnos = new HashMap<>();
        Aula aulaNueva = new Aula(3, 106, alumnos);
        assertFalse(gestion.existe(profesor, aulaNueva), "La nota existe en la lista de notas del alumno");
    }


    @Test
    public void insertarAulaProfesorTest(){             
        boolean aulaAsignada = profesor.getAulas().contains(aula);
        assertTrue(aulaAsignada, "El profesor no esta asignado a esa aula");

    }

    @Test
    public void insertarNotaAlumnoTest(){
        boolean notaAsignada = alumno.getNotas().contains(nota);
        assertTrue(notaAsignada, "La nota no esta asignada al alumno");
 
    }

    @Test
    public void crearPersona() throws Exception{
        Persona persona1 = new Persona("Javier", "Lima Perez", "66666666N");
        Persona persona2 = new Persona("Jonay", "Hernandez Izquierdo", "77777777O");
        assertNotEquals(persona1, persona2);
    }

    @Test
    public void dniErrorTest(){
        String valor = "555666";
        boolean resultado;
        try {
            resultado = validacion.validarDni(valor);
            assertFalse(resultado, "La cadena no cumple con el patron correspondido");
        } catch (ExceptionValidar e) {
            assertTrue(e.getMessage().contains("no tiene un formato correcto"));
        }
        
    }

    @Test
    public void obtenerDatosGestionTest(){
        HashMap<String, Alumno> getAlumnosNuevos = gestion.getAlumnos();
        HashMap<String, Profesor> getProfesoresNuevos = gestion.getProfesores();
        ArrayList<Aula> aulasNuevas = gestion.getAulas();
        assertTrue(getAlumnosNuevos.containsKey("45678963L"), "El alumno no existe en la lista");
        assertTrue(getProfesoresNuevos.containsKey("00000000A"), "El profesor no existe en la lista");
        assertTrue(aulasNuevas.contains(aula), "El profesor no existe en la lista");     
    }
    
    @Test
    public void obtenerDatosPersonaTest() throws Exception{
        Persona persona = new Persona("Javier", "Lima Perez", "66666666N");
        String nombre = persona.getNombre();
        String apellidos = persona.getApellidos();
        assertEquals(nombre, persona.getNombre());
        assertEquals(apellidos, persona.getApellidos());
    }

    @Test
    public void obtenerDatosAulaTest(){
        int piso = aula.getPiso();
        int numero = aula.getNumero();
        HashMap<String, Alumno> getAlumnosNuevos = aula.getAlumnos();
        assertEquals(piso, aula.getPiso());
        assertEquals(numero, aula.getNumero());
        assertFalse(getAlumnosNuevos.containsKey("45678963L"));
    }

    @Test
    public void obtenerDatosNotaTest(){
        String nombre = nota.getNombre();
        int calificacion = nota.getCalificacion();
        assertEquals(nombre, nota.getNombre());
        assertEquals(calificacion, nota.getCalificacion());
    }

    @Test
    public void cambiarDatoPersonaTest() throws Exception{
        Persona persona = new Persona("Javier", "Lima Perez", "66666666N");
        String nombreNuevo = "Jhony";
        String apellidosNuevo = "Gonzalez Perez";
        persona.setNombre(nombreNuevo);
        persona.setApellidos(apellidosNuevo);
        assertEquals(persona.getNombre(), nombreNuevo);
        assertEquals(persona.getApellidos(), apellidosNuevo);
    }

    @Test
    public void cambiarDatoAulaTest(){
        int pisoNuevo = 1;
        int numeroNuevo = 109;
        aula.setPiso(pisoNuevo);
        aula.setNumero(numeroNuevo);
        assertEquals(aula.getPiso(), pisoNuevo);
        assertEquals(aula.getNumero(), numeroNuevo);
    }

    @Test
    public void cambiarDatoNotaTest(){
        String nombreNuevo = "Programacion";
        int calificacionNueva = 8;
        nota.setNombre(nombreNuevo);
        nota.setCalificacion(calificacionNueva);
        assertEquals(nota.getNombre(), nombreNuevo);
        assertEquals(nota.getCalificacion(), calificacionNueva);
    }

    @Test
    public void listarNotasTest(){
        crearFicheroSinDni();
        File file = new File("TodasLasNotas.txt");
        assertTrue(gestion.validarFichero(file), "El fichero no existe");

    }

    @Test
    public void listarNotasPersonaTest(){
        crearFicheroConDni();
        String nombre = alumno.getNombre()+"_"+alumno.getApellidos()+".txt";
        File file = new File(nombre);
        assertTrue(gestion.validarFichero(file));
    }

    @Test
    public void listadoNotasMateriaTest(){
        ArrayList<Nota> notas = gestion.listadoNotasMateria();
        assertTrue(notas.contains(nota), "Error. Deberia de contener la nota 8");
    }
    
    @Test
    public void controlarExceptionVolcarNotas(){
        String ficheroNuevo = "";
        try {
            gestion.volcarNotas(ficheroNuevo);
        } catch (FicheroException e) {
            assertTrue(e.getMessage().contains("Ha habido un error al volcar el alumno"),
             "El fichero no deberia de existir");
        }//MAGIA POTAGIA
    }

    @Test
    public void controlarExceptionVolcarNotasPersona(){
        String dni = "44444444F";
        try {
            gestion.volcarNotasPersona(dni);
        } catch (FicheroException | IOException | ExceptionPersona e) {
            assertTrue(e.getMessage().contains("El alumno con dni:"), 
            "El alumno no deberia de existir");
        }
    }

    private Alumno crearAlumno() throws Exception{
        ArrayList<Nota> notas = new ArrayList<>();
        return new Alumno("Pedro", "Perez Gonzalez", "45678963L", notas);
    }

    private Profesor crearProfesor() throws Exception{
        ArrayList<Aula> aulas = new ArrayList<>();
        return new Profesor("Juan", "Gonzalez Hernandez", "00000000A", aulas);
    }

    private Aula crearAula(){
        HashMap<String, Alumno> alumnos = new HashMap<>();
        return new Aula(2, 104, alumnos);
    }
    
    private Nota crearNota(){
        return new Nota("Lenguaje de Marcas", 5);
    }

    private void crearFicheroSinDni(){
        try{
            gestion.volcarNotas(nombreFicheroNotas);
        }catch(Exception e){
            fail("Se ha producido un error en la escritura del fichero");
        }
    }

    private void crearFicheroConDni(){
        String dni = "45678963L";
        try{
            gestion.volcarNotasPersona(dni);
        }catch(Exception e){
            fail("Se ha producido un error en la escritura del fichero");
        }
    }
}
