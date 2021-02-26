package es.iespuertodelacruz.javier.coleccion;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Javi
 */
public class PruebaLinkedListTest {
    
    PruebaLinkedList prueba;
    
    @BeforeEach
    public void setUp() {
        if(prueba == null){
            prueba = new PruebaLinkedList();
        }
        prueba.insertar("pedro");
        prueba.insertar("jonay");
        prueba.insertar("ruben");
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void insertarTest() {               
        Assertions.assertTrue(prueba.personas.contains("pedro"), "Error. No se ha introducido correctamente");
    }
    
    @Test
    public void borrarTest() {             
        prueba.borrar("pedro");
        Assertions.assertTrue(!prueba.personas.contains("pedro"), "Error. No se ha borrado correctamente");
    }
    
    @Test
    public void buscarTest() {                     
        Assertions.assertTrue(prueba.buscar("pedro"), "Error. No se ha encontrado correctamente");
    }
    
    @Test
    public void contarTest() {              
        prueba.contar();
        Assertions.assertTrue(prueba.personas.size() > 0, "Error. La lista esta vacia");
    }
    
    @Test
    public void mostrarTest() {       
        System.out.println(prueba.toString());
        Assertions.assertTrue(prueba.personas.contains("pedro"), "Error. No se ha mostrado correctamente");
    }
    
    @Test
    public void primerElementoTest() {       
        Assertions.assertTrue(prueba.primerElemento() == "pedro", "Error. No se encuentra el elemto correcto");
    }
    
    @Test
    public void ultimoElementoTest() {       
        Assertions.assertTrue(prueba.ultimoElemento() == "ruben", "Error. No se encuentra el elemto correcto");
    }
    
    @Test
    public void borrarPrimerElementoTest() {       
        prueba.borrarPrimerElemento();
        Assertions.assertFalse(prueba.personas.getFirst().equals("pedro"), "Error. No se encuentra el elemento correcto");
    }
    
    @Test
    public void borrarUltimoElementoTest() {       
        prueba.borrarUltimoElemento();
        Assertions.assertFalse(prueba.personas.getLast().equals("ruben"), "Error. No se encuentra el elemento correcto");
    }
    
    
}
