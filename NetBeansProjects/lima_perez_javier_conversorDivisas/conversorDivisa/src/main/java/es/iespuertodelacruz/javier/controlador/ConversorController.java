package es.iespuertodelacruz.javier.controlador;


import java.util.ArrayList;

import es.iespuertodelacruz.javier.modelo.ConversorModelo;

public class ConversorController {
    ConversorModelo conversorModelo;

    public ConversorController(){
        conversorModelo = new ConversorModelo();
    }

    /**
     * Funcion encargada de cambiar la divisa a euros
     * @param codigoDivisaOrigen de la divisa origen
     * @param codigoDivisaDestino de la divisa a cambiar
     * @param importe que tengo actualmente
     * @return double
     */
    public double convertir(String codigoDivisaOrigen, String codigoDivisaDestino, double importe){
        return conversorModelo.convertir(codigoDivisaOrigen, codigoDivisaDestino, importe);
    }

    /**
     * Funcion encargada de obtener todos los codigos de la divisa
     * @return ArrayList<String>
     */
    public ArrayList<String> obtenerCodigosDivisa(){
        return conversorModelo.obtenerCodigosDivisa();
    }
}
