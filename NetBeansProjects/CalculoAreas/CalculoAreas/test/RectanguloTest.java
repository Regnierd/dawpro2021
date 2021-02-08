
import es.iespuertolacruz.javier.figuras.Rectangulo;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javier
 */
public class RectanguloTest {
    Rectangulo rectangulo;
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        if(rectangulo == null){
            rectangulo = new Rectangulo();
        }
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void rectanguloNoNulo() {
        Assert.assertNotNull("El objeto rectangulo es nulo", rectangulo);
    }
    
    @Test
    public void areaTest(){
        Assert.assertEquals("El area obtenida no es la esperada ", 0, rectangulo.area());
    }
    
    @Test
    public void areaValorInicializadoTest(){
        rectangulo.setBase(3);
        rectangulo.setAltura(2);
        Assert.assertTrue("El area es la esperada", rectangulo.area() == 6);
        
    }
}
