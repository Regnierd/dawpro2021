
import es.iespuertodelacruz.javier.caracteres.CalcularLetras;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author javier
 */
public class CalcularLetrasTest {
    CalcularLetras calcularLetra;
    
    public CalcularLetrasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(calcularLetra == null){
            calcularLetra = new CalcularLetras();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void calcularLetraNoNulo() {
        Assertions.assertNotNull(calcularLetra, "El objeto calcularLetra no es nulo.");
    }
    
    @Test
    public void calcularLetraTest(){
        calcularLetra.setCadena("Hola me llamo javier23454");
        Assertions.assertEquals(calcularLetra.calcular(), 17, "El resultado es el esperado");
    }
}
