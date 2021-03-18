/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import es.iespuertodelacruz.javier.Fichero;
import es.iespuertodelacruz.javier.exception.FicheroException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 *
 * @author Javi
 */
public class FicheroTest {
    
    Fichero fichero;
    String nombreFichero = "nombreFichero.txt";
    
    @BeforeEach
    public void setUp() {
        if(fichero == null){
            fichero = new Fichero();
        }
        try {
            fichero.crear(nombreFichero);
        } catch (FicheroException ex) {
            Assertions.fail("Se ha producido un error creando el fichero");
        }
    }
    
    @AfterEach
    public void tearDown() {
        try {
            fichero.eliminar(nombreFichero);
        } catch (FicheroException ex) {
            Assertions.fail("Se ha producido un error eliminando el fichero");
        }
    }

     @Test
     public void existeTest() throws FicheroException {
         File file = new File(nombreFichero);
         boolean existe = fichero.existe(file);
         Assertions.assertTrue(existe, "El fichero seleccionado no se ha podido"
                 + "crear " + nombreFichero);
     }
}
