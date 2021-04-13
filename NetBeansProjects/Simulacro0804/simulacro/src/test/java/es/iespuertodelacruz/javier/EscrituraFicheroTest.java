package es.iespuertodelacruz.javier;




import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.elementos.EscrituraFichero;
import es.iespuertodelacruz.javier.elementos.LecturaFichero;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class EscrituraFicheroTest {
   
    EscrituraFichero escrituraFichero;
    LecturaFichero lecturaFichero;
    String nombreFichero = "pruebaFichero.txt";

    @BeforeEach
    public void setUp(){
        if(escrituraFichero == null){
            escrituraFichero = new EscrituraFichero();
        }
        if(lecturaFichero == null){
            lecturaFichero = new LecturaFichero();
        }
    }

    @Test
    public void volcarFicheroTest(){
        try {
            escrituraFichero.volcarFichero(nombreFichero);
            String contenido = lecturaFichero.leer(nombreFichero);
            assertTrue(contenido.contains("Uno"), "El fichero no contiene el valor Uno");
        } catch (FicheroException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void mostrarListaTest(){
        assertTrue(escrituraFichero.mostrarLista().contains("Uno"), "La lista no contiene Uno");
    }

    
}
