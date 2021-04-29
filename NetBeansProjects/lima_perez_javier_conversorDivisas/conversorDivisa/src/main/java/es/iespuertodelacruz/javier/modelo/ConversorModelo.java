package es.iespuertodelacruz.javier.modelo;

import java.util.ArrayList;
import java.util.HashMap;

import es.iespuertodelacruz.javier.exceptions.ConversorException;


public class ConversorModelo {
    HashMap<String, Double> tablaConversion = new HashMap<>();

    public ConversorModelo(){
        insertar("EUR", 1.0);
        insertar("USD", 1.180);
        insertar("JPY", 134.86);
        insertar("BGN", 1.958);
    }
    /**
     * Metodo encargado de insertar en la lista una divisa
     * @param codigo de la divisa
     * @param tipoCambio de la divisa
     */
    public void insertar(String codigo, Double tipoCambio){
        tablaConversion.put(codigo, tipoCambio);
    }

    /**
     * Metodo encargado de eliminar de la lista una divisa
     * @param codigo a eliminar
     */
    public void eliminar(String codigo){
        tablaConversion.remove(codigo);
    }

    /**
     * Funcion encargado de comproboar si existe una divisa
     * @param codigo de la divisa
     * @return true si existe, false si no existe
     */
    public boolean existe(String codigo){
        boolean encontrada; 
        encontrada = tablaConversion.containsKey(codigo);      
        return encontrada;
    }

    /**
     * Funcion encargado de mostrar toda la lista
     * @return String
     */
    public String obtenerLista(){
        return tablaConversion.toString();
    }
    /**
     * Funcion encargada de devolver la divisa por su codigo
     * @param codigoDivisa a obtener
     * @return double
     */
    public double obtenerDivisa(String codigoDivisa){
        return tablaConversion.get(codigoDivisa);
    }

    /**
     * Funcion encargada de cambiar la divisa a euros
     * @param codigoDivisaOrigen de la divisa origen
     * @param codigoDivisaDestino de la divisa a cambiar
     * @param importe que tengo actualmente
     * @return double
     */
    public double convertir(String codigoDivisaOrigen, String codigoDivisaDestino, double importe){
        double moneda = importe / obtenerDivisa(codigoDivisaOrigen); //Primero convierto a euros
        return moneda * obtenerDivisa(codigoDivisaDestino);
    }

    /**
     * Funcion encargada de obtener todos los codigos de la divisa
     * @return ArrayList<String>
     */
    public ArrayList<String> obtenerCodigosDivisa(){
        ArrayList<String> codigos = new ArrayList<>();
        for (String elemento : tablaConversion.keySet()) {
            codigos.add(elemento);    
        }      
        return codigos;
    }

    /**
     * Metodo encargado de validar los paramentros pasados
     * @param codigoDivisaOrigen a validar
     * @param codigoDivisaDestino a validar
     * @param importe a validar
     * @throws ConversorException con el mensaje descriptivo de lo que sucede
     */
    public void validar(String codigoDivisaOrigen, String codigoDivisaDestino, double importe) throws ConversorException{
        String mensaje = "";

        if(codigoDivisaOrigen.isEmpty()){
            mensaje += "El codigo de divisa de origen esta vacio";
        }
        if(codigoDivisaDestino.isEmpty()){
            mensaje += "El codigo de divisa de destino esta vacio";
        }
        if(importe <= 0){
            mensaje += "El importe es menor o igual a 0";
        }

        if(!mensaje.isEmpty()){
            throw new ConversorException(mensaje);
        }
    } 
    
}
