package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import javax.xml.namespace.QName;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class EjercicioArraysTest{
    
    EjercicioArrays ejercicioArrays = new EjercicioArrays();
    int numeroAlumnos = 40;
    ArrayList<Float> control;
    ArrayList<Float> practicas;
    ArrayList<Float> calificaciones;

    @BeforeEach
    public void setUp(){
        if(control == null){
            control = new ArrayList<>();
        }
        if(practicas == null){
            practicas = new ArrayList<>();
        }
        if(calificaciones == null){
            calificaciones = new ArrayList<>();
        }

        control = crearListaControl();
        EjercicioArrays.crearListaAlumnos();
        EjercicioArrays.crearNotasPracticas();
    }
    
    @Test
    public void comprobarGenerarAleatoriosTest(){
        assertEquals(40, crearListaControl().size());
    }

    @Test
    public void indiceMinimoTest(){
        float indiceMinimo = EjercicioArrays.indiceMinimo(control);
        float notaMinima = control.get((int) indiceMinimo);
        float indiceMinimoControl = control.indexOf(notaMinima);
        assertEquals(indiceMinimo, indiceMinimoControl, "Deberian de ser el mismo indice");
    }

    @Test
    public void indiceMaximoTest(){
        float indiceMaximo = EjercicioArrays.indiceMaximo(control);
        float notaMaxima = control.get((int) indiceMaximo);
        float indiceMaximoControl = control.indexOf(notaMaxima);
        assertEquals(indiceMaximo, indiceMaximoControl, "Deberian de ser el mismo indice");
    }

    @Test
    public void listaClaseTest(){
        assertEquals(40, EjercicioArrays.crearListaAlumnos().size());
    }

    @Test
    public void crearNotasPracticasTest(){
        assertEquals(40, EjercicioArrays.crearNotasPracticas().size());
    }

    @Test
    public void listarAprobadosTest(){
        ArrayList<Float> notas = new ArrayList<>();
        notas.add(1f);
        notas.add(5f);
        notas.add(9f);
        notas.add(3f);
        EjercicioArrays.listarAprobados(notas);
        assertEquals(0, EjercicioArrays.aprobados.get(0), "Deberia de tener el valor 0");     
    }

    @Test
    public void listarSuspendidosTest(){
        ArrayList<Float> notas = new ArrayList<>();
        notas.add(1f);
        notas.add(5f);
        notas.add(9f);
        notas.add(3f);
        EjercicioArrays.listarSuspendidos(notas);
        assertEquals(0, EjercicioArrays.suspensos.get(1), "Deberia de tener el valor 0");     
    }

    @Test
    public void vectoresTest(){ 
        control = new ArrayList<>();           
        control.add(5f);
        practicas.add(4f);
        calificaciones = EjercicioArrays.vectores(control, practicas);
        assertEquals(4.5f, calificaciones.get(0), "La media deberia de ser 4.5");
        
    }

    @Test
    public void insertarNuevaCalificacionPosicionCuatroTest(){
        EjercicioArrays.insertarNuevaCalificacionPosicionCuatro(calificaciones);
        assertEquals(6, calificaciones.get(3));
    }

    @Test
    public void resumenAprobadosTest(){
        ArrayList<Float> listaAprobados = new ArrayList<>();
        listaAprobados.add(0f);
        listaAprobados.add(1f);
        listaAprobados.add(2f);
        listaAprobados.add(0f);
        calificaciones = EjercicioArrays.resumenAprobados(listaAprobados);
        assertEquals(1, calificaciones.get(0));
    }

    @Test
    public void resumenSuspendidosTest(){
        ArrayList<Float> listaSuspendidos = new ArrayList<>();
        listaSuspendidos.add(1f);
        listaSuspendidos.add(0f);
        listaSuspendidos.add(2f);
        listaSuspendidos.add(0f);
        calificaciones = EjercicioArrays.resumenSuspendidos(listaSuspendidos);
        assertEquals(1, calificaciones.get(0));
    }
    
    @Test
    public void mainTest(){
        String[] args = null;
        ejercicioArrays.main(args);
        assertNotNull(ejercicioArrays);

    }

    @Test 
    public void estadisticasTest(){       
        control = new ArrayList<>();           
        control.add(5f);
        control.add(3f);
        control.add(4f);
        control.add(5f);
        practicas.add(6f);
        practicas.add(8f);
        practicas.add(4f);
        practicas.add(2f);
        calificaciones = EjercicioArrays.vectores(control, practicas);
        String tramo = ejercicioArrays.estadisticas(calificaciones, control);
        System.out.println(tramo);
        assertTrue(tramo.contains("50"));

    }
    /**
     * Metodo que genera un numero aleatorio y lo agrega a la lista control
     */
    private ArrayList<Float> crearListaControl(){
        control = new ArrayList<>();
        for(int i=0; i < numeroAlumnos; i++){      
            double numeroAleatorio = Math.random()*11;     
            control.add((float)numeroAleatorio);
        }
        return control;
    }

    

}
