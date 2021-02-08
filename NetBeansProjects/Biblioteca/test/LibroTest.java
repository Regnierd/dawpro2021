
import es.iespuertodelacruz.javier.libros.Libro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;



/**
 *
 * @author javier
 */
public class LibroTest {
    Libro libro;
    
    public LibroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(libro == null){
            libro = new Libro();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void libroNoNulo() {
        Assertions.assertNotNull(libro, "El objeto libro no es nulo.");
    }
    
    @Test
    public void prestarTest() {    
        libro.setEjemplares(10);
        libro.setPrestados(5);
        Assertions.assertTrue(libro.prestar() == libro.devolver(), "El resultado no es el esperado");
        
    }
    
    @Test
    public void devolverTest() {      
        libro.setEjemplares(10);
        libro.setPrestados(5);
        Assertions.assertTrue(libro.devolver() == libro.prestar(), "El resultado no es el esperado");
        
    }
}
