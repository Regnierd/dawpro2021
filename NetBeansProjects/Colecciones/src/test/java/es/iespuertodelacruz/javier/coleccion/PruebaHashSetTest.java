
package es.iespuertodelacruz.javier.coleccion;

import es.iespuertodelacruz.javier.coleccion.elementos.Cliente;
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
public class PruebaHashSetTest {
    
    PruebaHashSet pruebaHashSet;
    Cliente cliente1;
    
    @BeforeEach
    public void setUp() {
        if(pruebaHashSet == null){
            pruebaHashSet = new PruebaHashSet();
        }
        if(cliente1 == null){
            cliente1 = new Cliente("juan", "0001", 2000);
        }
        pruebaHashSet.insertar(cliente1);
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void insertarTest() {
         assertTrue(pruebaHashSet.getClientesBanco().size() == 1, "El tamanio del Set no es el correcto, se esperaba 1");
     }
     
     @Test
     public void eliminarTest() {
         pruebaHashSet.eliminar(cliente1);
         assertTrue(pruebaHashSet.getClientesBanco().size() == 0, "El tamanio del Set no es el correcto, se esperaba 1");
     }
     
     @Test
     public void imprimirTest(){
         assertTrue(pruebaHashSet.toString().contains("juan"), "La cadena no contiene el texto esperado");
         assertTrue(pruebaHashSet.toString().contains("0001"), "La cadena no contiene el texto esperado");
         assertTrue(pruebaHashSet.toString().contains("2000"), "La cadena no contiene el texto esperado");
     }
     
     @Test
     public void modificarTest(){
         pruebaHashSet.modificar("0001", "Pedro");
         assertTrue(pruebaHashSet.toString().contains("Pedro"), "La cadena no contiene el texto esperado");
         assertTrue(pruebaHashSet.toString().contains("0001"), "La cadena no contiene el texto esperado");
     }
     
     
     
}
