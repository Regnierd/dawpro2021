
import es.iespuertodelacruz.javier.vocales.CalcularVocales;
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
public class CalcularVocalesTest{
    CalcularVocales calcularVocal;
    public CalcularVocalesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(calcularVocal == null){
            calcularVocal = new CalcularVocales();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void calcularVocalNoNulo() {
        Assertions.assertNotNull(calcularVocal, "El objeto no es nulo.");
    }

    @Test
    public void calcularTest(){        
        Assertions.assertEquals(calcularVocal.calcular("Hola tu"), 3, "El resultado es el esperado.");
    }
}
