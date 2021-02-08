
import es.iespuertolacruz.javier.figuras.Circulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javier
 */
public class CirculoTest {
    
    Circulo circulo;
    public CirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        if(circulo == null){
            circulo = new Circulo();
        }
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void areaTest() {
        circulo.setRadio(1);
        Assert.assertTrue("El resultado no es el esperado", circulo.area() == Math.PI);
    }
     
    @Test
    public void circuloNoNulo() {
        Assert.assertNotNull("El objeto cuadrado es nulo", circulo);
    }
}
