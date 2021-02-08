
import es.iespuertodelacruz.javier.caracteres.CalcularEspacioBlancos;
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
public class CalcularEspacioBlancosTest {
    CalcularEspacioBlancos calcularEspacioBlanco;
    
    public CalcularEspacioBlancosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(calcularEspacioBlanco == null){
            calcularEspacioBlanco  = new  CalcularEspacioBlancos();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void calcularDigitoNoNulo() {
        Assertions.assertNotNull(calcularEspacioBlanco, "El objeto calcularDigito no es nulo");
    }
    
    @Test
    public void calcularDigitoTest(){
        calcularEspacioBlanco.setCadena("Hola me llamo javier23454");
        Assertions.assertEquals(calcularEspacioBlanco.calcular(), 3, "El resultado es el esperado");
    }
}
