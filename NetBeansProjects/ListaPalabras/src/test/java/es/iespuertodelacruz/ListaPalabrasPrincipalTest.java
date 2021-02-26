
package es.iespuertodelacruz;

import es.iespuertodelacruz.javier.ListaPalabrasPrincipal;
import es.iespuertodelacruz.javier.vista.MenuLista;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Javi
 */
public class ListaPalabrasPrincipalTest {
   
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void crearListaTest() { 
        ArrayList<String> listaNueva = new ArrayList();
        MenuLista.crearLista(listaNueva);
        
        Assertions.assertTrue(listaNueva.size()>0,"La lista se ha creado correctamente");
        
     }
     
     @Test
     public void contarPalabrasTest(){
         ArrayList<String> arrayLista = new ArrayList<>();
         arrayLista.add("adios");
         arrayLista.add("hola");
         int numero = ListaPalabrasPrincipal.numerosPalabras();
         assertTrue(numero == 2, "La lista tiene un numero incorrecto");
     }
}
