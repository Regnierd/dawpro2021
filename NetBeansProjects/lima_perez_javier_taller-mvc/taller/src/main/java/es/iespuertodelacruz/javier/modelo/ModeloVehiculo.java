package es.iespuertodelacruz.javier.modelo;

import java.util.ArrayList;

import es.iespuertodelacruz.javier.api.Vehiculo;
import es.iespuertodelacruz.javier.exceptions.FicheroException;

public class ModeloVehiculo {
    Fichero fichero;

    public ModeloVehiculo(){
        fichero = new Fichero();
    }

    /**
     * Metodo encargado de insertar en una lista un vehiculo llamando a fichero
     * @param vehiculo a insertar
     * @throws FicheroException con un mensaje controlado
     */
    public void insertar(Vehiculo vehiculo) throws FicheroException{
        fichero.insertar(vehiculo);
    }

    /**
     * Metodo encargado de eliminar en la lista un vehiculo llamando a fichero
     * @param vehiculo a eliminar
     * @throws FicheroException con un mensaje controlado
     */
    public void eliminar(Vehiculo vehiculo) throws FicheroException{
        fichero.eliminar(vehiculo);
    }

    /**
    * Funcion que busca un vehiculo a traves de la matricula
    * @param matricula del vehiculo
    * @return Vehiculo con la matricula especificada
    * @throws FicheroException con un mensaje controlado
    */
    public Vehiculo buscar(String matricula) throws FicheroException {
        Vehiculo vehiculo = null;
        ArrayList<Vehiculo> listado;
        listado = fichero.obtenerListado();
        int i = 0;
        while(i < listado.size() && vehiculo == null) {
            if (matricula.equals(listado.get(i).getMatricula())) {
                vehiculo = listado.get(i);
            }
            i++;
        }
        return vehiculo;
    }

    /**
     * Metodo encargado de modificar un vehiculo en el fichero
     * @param vehiculoAlmacenado en la lista
     * @param vehiculo a modificar
     * @throws FicheroException con un mensaje controlado
     */
    public void modificar(Vehiculo vehiculoAlmacenado, Vehiculo vehiculo) throws FicheroException {
        fichero.modificar(vehiculoAlmacenado, vehiculo);
    }

    /**
     * Funcion encargada de listar todos los vehiculos del fichero
     * @return arrayList
     * @throws FicheroException con un mensaje controlado
     */
    public ArrayList<Vehiculo> listar() throws FicheroException{
        return fichero.obtenerListado();
    }

    /**
     * Funcion encargada de mostrar un vehiculo sabiendo su matricula
     * @param matricula del vehiculo a listar
     * @return Vehiculo
     * @throws FicheroException con un mensaje controlador
     */
    public Vehiculo listar(String matricula) throws FicheroException{
        ArrayList<Vehiculo> vehiculos = fichero.obtenerListado();
        Vehiculo vehiculoEncontrado = null;
        int i = 0;
        while(i < vehiculos.size() && vehiculoEncontrado == null){
            if(matricula.equals(vehiculos.get(i).getMatricula())){
                vehiculoEncontrado = vehiculos.get(i);
            }
            i++;
        }       
        return vehiculoEncontrado;
    }

}
