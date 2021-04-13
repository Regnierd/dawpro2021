package es.iespuertodelacruz.javier;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iespuertodelacruz.javier.exceptions.PlantasException;

public class GestionFloristeriaTest {
    GestionFloristeria gestionFloristeria;
    Planta planta;
    

    @BeforeEach
    public void setUp(){
        if(gestionFloristeria == null){
            gestionFloristeria = new GestionFloristeria();
        }
        try {
            planta = crearPlanta();
            gestionFloristeria.insertar(planta);
        } catch (PlantasException e) {
            fail("Ha habido un error al insertar la planta");
        }
    }

    @Test
    public void buscarIdTest(){
        try{
            String idBuscada = planta.getId();
            gestionFloristeria.buscar(idBuscada);
            assertTrue(gestionFloristeria.plantas.containsKey(idBuscada),
                "La planta con la id " + idBuscada + " deberia de encontrarse");
        }catch(PlantasException e){
            fail("No deberia de llegar aqui");
        }
        
    }

    @Test
    public void buscarPlantaTest(){
        try {
            Planta plantaEncontrada = gestionFloristeria.buscar(planta);
            assertTrue(plantaEncontrada.equals(planta), "encontrada deberia de ser la planta creada");
        } catch (PlantasException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void numeroArticuloTest(){
        int articulos = gestionFloristeria.numeroArticulo(planta);
        assertTrue(articulos == planta.getArticulos(), "Deberia de ser 10 articulos");
    }

    @Test
    public void mostrarTest(){
        
        String resultado = gestionFloristeria.mostrar(planta.getId());
        assertTrue(resultado.contains("A001"), "Deberia de contener la planta creada"); 
    }

    @Test
    public void eliminarTest(){
        gestionFloristeria.eliminar(planta.getId());
        assertEquals(0, gestionFloristeria.getPlantas().size(), "Deberia de estar vacia la lista");
    }

    @Test
    public void exceptionInsertarTest(){
        try {
            gestionFloristeria.insertar(planta);
        } catch (PlantasException e) {
            assertTrue(e.getMessage().contains("No se puede insertar la planta, porque ya existe en la lista"));
        }
    }


    @Test
    public void exceptionBuscarPlantaTest(){
        Planta plantaNueva = new Planta("A003", "Rosa", 17, 10, 15);
        try {
            gestionFloristeria.buscar(plantaNueva);
        } catch (PlantasException e) {
            assertTrue(e.getMessage().contains("La planta no existe en la lista"));
        }
    }

    @Test
    public void exceptionBuscarTest(){
        try {
            gestionFloristeria.buscar("A002");
        } catch (PlantasException e) {
            assertTrue(e.getMessage().contains("La planta no existe"));
        }
    }

    @Test
    public void generarExceptionTest(){
        Exception plantaException = new PlantasException("Mensaje de error", new Exception());
        assertTrue(plantaException.getMessage().contains("Mensaje de error"), "No genera el mensaje esperado");
    }

    private Planta crearPlanta(){
        return new Planta("A001", "Amapola", 15, 7, 10);
    }


}
