package es.iespuertodelacruz.javier.controlador;


import java.util.ArrayList;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;
import es.iespuertodelacruz.javier.exceptions.VehiculoException;
import es.iespuertodelacruz.javier.modelo.ModeloVehiculo;

public class ControladorVehiculo {   
    ModeloVehiculo modeloVehiculo;
    private static final String EL_VEHICULO_INDICADO_NO_EXISTE = "El vehiculo indicada NO existe";
    public ControladorVehiculo() {
        modeloVehiculo = new ModeloVehiculo();
    }

    /**
     * Metodo encargado de validar un vehiculo
     * @param vehiculo a validar
     * @throws VehiculoException con un mensaje controlado
     */
    public void validar(Vehiculo vehiculo) throws VehiculoException{
        String mensaje = "";
        if(vehiculo == null){
            mensaje = "Se esta intentando validar un objeto vacio";
            throw new VehiculoException(mensaje);
        }
        if(vehiculo.getMatricula() == null || vehiculo.getMatricula().isEmpty()){
            mensaje += "La matricula del vehiculo es nula o vacia";
        }
        if(vehiculo.getMarca() == null || vehiculo.getMarca().isEmpty()){
            mensaje += "La marca del vehiculo es nula o vacia";
        }
        if(!mensaje.isEmpty()){
            throw new VehiculoException(mensaje);
        }
    }
    /**
     * Metodo encargado de insertar un vehiculo del fichero
     * @param matricula a insertar
     * @throws FicheroException con un mensaje controlado
     * @throws VehiculoException con un mensaje controlado
     */
    public void insertar(Vehiculo vehiculo) throws FicheroException, VehiculoException{
        validar(vehiculo);
        if (!existe(vehiculo)) {
            modeloVehiculo.insertar(vehiculo);
        }
    }

    /**
     * Metodo encargado de eliminar un vehiculo del fichero
     * @param vehiculo a eliminar
     * @throws VehiculoException con un mensaje controlado
     * @throws FicheroException con un mensaje controlado
     */
    public void eliminar(Vehiculo vehiculo) throws VehiculoException, FicheroException{
        validar(vehiculo);
        if(!existe(vehiculo)){
            throw new VehiculoException(EL_VEHICULO_INDICADO_NO_EXISTE);
        }
        modeloVehiculo.eliminar(vehiculo);
        
    }

    /**
     * Funcion que determina si existe un elemento
     * @param matricula a buscar
     * @return true si existe, false si no existe
     * @throws FicheroException con un mensaje controlado
     */
    public boolean existe(Vehiculo vehiculo) throws FicheroException {
        boolean encontrada = false;
        Vehiculo vehiculoEncontrado;

        vehiculoEncontrado = buscar(vehiculo.getMatricula());
        if(vehiculoEncontrado != null){
            encontrada = true;
        }
        
        return encontrada;
    }

    /**
     * Funcion encargada de buscar un vehiculo por su matricula
     * @param matricula a buscar
     * @return Vehiculo
     * @throws FicheroException con un mensaje controlado
     */
    public Vehiculo buscar(String matricula) throws FicheroException {
        Vehiculo vehiculo = null;
        vehiculo = modeloVehiculo.buscar(matricula);
        return vehiculo;
    }

    /**
    * Metodo encargado de realizar la modificacion de una fruta
    * @param fruta a modficar
    * @throws FrutaException controlada en caso de error
    * @throws FicheroException
    */
    public void modificar(Vehiculo vehiculoAlmacenado, Vehiculo vehiculo) throws VehiculoException, FicheroException {   
        validar(vehiculo);
        if(!existe(vehiculoAlmacenado)){
            throw new VehiculoException(EL_VEHICULO_INDICADO_NO_EXISTE);
        }
        modeloVehiculo.modificar(vehiculoAlmacenado, vehiculo);
    }

    /**
     * Funcion encargada de listar todos los vehiculos del fichero
     * @return arrayList
     * @throws FicheroException con un mensaje controlado
     */
    public ArrayList<Vehiculo> listar() throws FicheroException{
        return modeloVehiculo.listar();
    }

    /**
     * Funcion encargada de mostrar un vehiculo sabiendo su matricula
     * @param matricula del vehiculo a listar
     * @return Vehiculo
     * @throws FicheroException con un mensaje controlado
     */
    public Vehiculo listar(String matricula) throws FicheroException{
        return modeloVehiculo.listar(matricula);
    }



}
