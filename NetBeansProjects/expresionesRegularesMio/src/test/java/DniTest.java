
import es.iespuertodelacruz.javier.ejemplos.Dni;
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
public class DniTest {
    Dni dni;

    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(dni == null){
            dni = new Dni();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void dniTest() {
         String valor = "12345678A";
         boolean resultado = dni.validar(valor);
         assertTrue(resultado, "La cadena no cumple el patron correspondiente");
     }
     
     @Test
     public void errorTest() {
         String valor = "12345678";
         boolean resultado = dni.validar(valor);
         assertFalse(resultado, "La cadena no cumple el patron correspondiente");
     }
}
