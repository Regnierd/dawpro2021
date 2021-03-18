
import es.iespuertodelacruz.javier.ejemplos.Ip;
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
public class IpTest {
    
    Ip ip;
    
    @BeforeEach
    public void setUp() {
        if(ip == null){
            ip = new Ip();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }


     @Test
     public void ipOkTest() {
         String valor = "172.168.5.5";
         boolean resultado = ip.validar(valor);
         assertTrue(resultado, "La cadena no contiene el patron correctamente");
     }
     
     @Test
     public void ipIncorrectaTest() {
         String valor = "955.255.255.255";
         boolean resultado = ip.validar(valor);
         assertFalse(resultado, "La cadena no contiene el patron correctamente");
     }
}
