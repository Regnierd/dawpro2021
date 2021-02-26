
import es.iespuertodelacruz.javier.instituto.Direccion;
import es.iespuertodelacruz.javier.instituto.Lista;
import es.iespuertodelacruz.javier.instituto.Persona;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ListaTest {
    Lista lista;
    Persona persona;
    Direccion direccion;
    
    public ListaTest() {
        
    }
    
    @BeforeEach
    public void setUp() {
        if(lista == null){
            lista = new Lista();
        }
        if(direccion == null){
            direccion = new Direccion("Media cuesta", 465798, "Los Realejos");                    
        }
        if(persona == null){           
            persona = new Persona("Javier", "Lima Perez", 44444, 24, direccion );
        }
        
        lista.insertar(persona);
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void insertarTest() {
         assertTrue(lista.getPersonas().size() == 1, "El tamanio de la lista no"
                 + " es el esperado, se esperaba 1");
     }
     
     @Test
     public void eliminarTest(){
         lista.eliminar(persona);
         assertTrue(lista.getPersonas().size() == 0, "El tamanio de la lista no"
                 + "es el esperado, se esperaba 0");
     }
     
     @Test
     public void imprimirTest(){
         assertTrue(lista.imprimir().contains("Javier"), "La cadena no contiene el texto esperado");
         assertTrue(lista.imprimir().contains("Lima Perez"), "La cadena no contiene el texto esperado");
         assertTrue(lista.imprimir().contains("44444"), "La cadena no contiene el texto esperado");
         assertTrue(lista.imprimir().contains("24"), "La cadena no contiene el texto esperado");
     }
     
     @Test
     public void contarTest(){
         direccion = new Direccion("La Montaniaa", 465623, "La Montania");
         persona = new Persona("Jonay", "Hernandez Izquierdo", 55555, 23, direccion);
         lista.insertar(persona);
         assertTrue(lista.contar() == 2, "La lista no contiene las personas"
                 + "esperadas, se esperaba 1");
     }
     
     @Test
     public void buscarTest(){
        try {
            lista.buscar(44444);
        } catch (Exception ex) {
           assertTrue(lista.getPersonas().contains("No se encuentra"), "La lista no contiene el dni,"
                 + "se esperaba "+persona.getDni());
        }
       
     }
}
