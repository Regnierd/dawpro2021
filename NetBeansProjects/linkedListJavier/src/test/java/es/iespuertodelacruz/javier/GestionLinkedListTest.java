package es.iespuertodelacruz.javier;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import es.iespuertodelacruz.javier.excepcion.FrutaException;

public class GestionLinkedListTest {
    GestionLinkedList gestionLinkedList;
    Fruta fruta;
    Fruta fruta2;

    @BeforeEach
    public void setUp() {
        if (gestionLinkedList == null) {
            gestionLinkedList = new GestionLinkedList();
        }

        fruta = crearPrimeraFruta();
        fruta2 = crearUltimaFruta();
        gestionLinkedList.insertarPrimera(fruta);
        gestionLinkedList.insertarUltimo(fruta2);
    }


    @Test
    public void eliminarPrimeroTest() {
        try {
            gestionLinkedList.eliminarPrimero();          
        } catch (FrutaException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void eliminarUltimoTest() {
        try {
            gestionLinkedList.eliminarUltimo();
        } catch (FrutaException e) {
            fail("No deberia de llegar aqui");
        }
    }

    @Test
    public void controlarExcetionEliminarUltimo(){
        try {
            gestionLinkedList.eliminarUltimo();
            gestionLinkedList.eliminarUltimo();
            gestionLinkedList.eliminarUltimo();
        } catch (FrutaException e) {
            assertTrue(e.getMessage().contains("La lista se encuentra vacia"));
        }
    }

    @Test
    public void controlarExcetionEliminarPrimero(){
        try {
            gestionLinkedList.eliminarPrimero();
            gestionLinkedList.eliminarPrimero();
            gestionLinkedList.eliminarPrimero();
        } catch (FrutaException e) {
            assertTrue(e.getMessage().contains("La lista se encuentra vacia"));
        }
    }

    private Fruta crearPrimeraFruta(){
        return new Fruta("Verde", 2);
    }

    private Fruta crearUltimaFruta(){
        return new Fruta("Roja", 3);
    }
}
