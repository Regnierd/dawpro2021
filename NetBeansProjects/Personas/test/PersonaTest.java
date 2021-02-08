
import es.iespuertodelacruz.javier.persona.Persona;
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
public class PersonaTest {
    
    Persona persona;
    public PersonaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        if(persona == null){
            persona = new Persona();
        }
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void personaNoNulo() {
        Assertions.assertNotNull(persona, "El objeto persona no es nulo");
    }
    
    @Test
    public void imcTest(){
        persona.setPeso(55);
        persona.setAltura(1.67);
        Assertions.assertTrue(persona.imc() >= 20, "El resultado es el esperado");
    }
    
    @Test
    public void esMayorDeEdadTest(){
        persona.setEdad(15);
        Assertions.assertTrue(persona.esMayorDeEdad() == false, "El resultado es el esperado");
    }
    
    @Test
    public void comprobarSexoTest(){
        persona.setSexo('F');
        Assertions.assertTrue(persona.getSexo() == 'H', "El resultado no es el esperado");
    }
    
    @Test
    public void generarDNITest(){
        
    }
}
