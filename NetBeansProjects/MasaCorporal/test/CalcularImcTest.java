
import es.iespuertodelacruz.javier.imc.CalcularImc;
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
public class CalcularImcTest {
    
    CalcularImc calcularImc;
    public CalcularImcTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(calcularImc == null){
            calcularImc = new CalcularImc();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void calcularImcNoNulo() {
        Assertions.assertNotNull(calcularImc, "El objeto calcularImc no es nulo.");
    }
    
    @Test
    public void imcTest(){
        calcularImc.setPeso(55);
        calcularImc.setAltura(1.67);
        Assertions.assertEquals(calcularImc.imc(), calcularImc.getPeso()/ Math.pow(calcularImc.getAltura(), 2), "El resultado es el esperado");
        
    }
    
    @Test
    public void diagnosticoTest(){
        calcularImc.setPeso(50);
        calcularImc.setAltura(1.67);       
        Assertions.assertEquals(calcularImc.imc(), 26, "El resultado no es el esperado.");
    }

    
}
