

import es.iespuertodelacruz.javier.caracteres.CalcularDigitos;
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
public class CalcularDigitosTest {
    CalcularDigitos calcularDigito;
    
    public CalcularDigitosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(calcularDigito == null){
            calcularDigito = new CalcularDigitos();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void calcularDigitoNoNulo() {
        Assertions.assertNotNull(calcularDigito, "El objeto calcularDigito no es nulo");
    }
    
    @Test
    public void calcularDigitoTest(){
        calcularDigito.setCadena("Hola me llamo javier23454");
        Assertions.assertEquals(calcularDigito.calcular(), 5, "El resultado es el esperado");
    }
}
