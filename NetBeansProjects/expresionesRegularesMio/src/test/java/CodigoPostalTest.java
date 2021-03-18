
import es.iespuertodelacruz.javier.ejemplos.CodigoPostal;
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
public class CodigoPostalTest {

    CodigoPostal codigoPostal;
    @BeforeEach
    public void setUp() {
        if(codigoPostal == null){
            codigoPostal = new CodigoPostal();                  
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void codigoPostalTest() {
         String valor = "CP38410";
         boolean resultado = codigoPostal.validar(valor);
         assertTrue(resultado, "La cadena no cumple el patron correspondiente");
     }
     
     @Test
     public void errorCodigoPostalTest() {
         String valor = "C38410";
         boolean resultado = codigoPostal.validar(valor);
         assertFalse(resultado, "La cadena no cumple el patron correspondiente");
     }
     
     @Test
     public void errorTamnioIncorrectoTest() {
         String valor = "C38410c345";
         boolean resultado = codigoPostal.validar(valor);
         assertFalse(resultado, "La cadena no cumple el patron correspondiente");
     }
}
