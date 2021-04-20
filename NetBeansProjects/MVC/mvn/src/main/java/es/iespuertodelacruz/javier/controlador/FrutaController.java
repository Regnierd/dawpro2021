package es.iespuertodelacruz.javier.controlador;

import es.iespuertodelacruz.javier.api.Fruta;
import es.iespuertodelacruz.javier.exception.FrutaException;
import es.iespuertodelacruz.javier.modelo.FrutaModelo;

/**
 * Controlador de la clase Fruta
 */
public class FrutaController {
    FrutaModelo frutaModelo;

    public FrutaController(){
        frutaModelo = new FrutaModelo();
    }

    /**
     * Metodo encargado de realizar la validacion del objeto fruta
     * @param fruta a validar
     * @throws FrutaException con el mensaje descriptivo de lo que sucede
     */
    public void validarFruta(Fruta fruta) throws FrutaException{
        String mensaje = "";

        if(fruta == null){
            mensaje = "Se esta intentando validar un objeto vacio";
            throw new FrutaException(mensaje);
        }
        if(fruta.getIdentificador() == null || fruta.getIdentificador().isEmpty()){
            mensaje = "El identificador de la fruta es nulo o vacio \n";
        }
        if(fruta.getNombre() == null || fruta.getNombre().isEmpty()){
            mensaje += "El nombre de la fruta es nulo o vacio \n";
        }
        if(fruta.getPrecio() <= 0){
            mensaje += "El precio de la fruta es 0 o menor \n";
        }
        if(fruta.getCoste() <= 0){
            mensaje += "El coste de la fruta es 0 o menor \n";
        }
        if(!mensaje.isEmpty()){
            throw new FrutaException(mensaje);
        }
    }

    /**
     * Metodo encargado de insertar
     * @param fruta a insertar
     * @throws FrutaException con mensaje controlado
     */
    public void insertar(Fruta fruta) throws FrutaException{
        validarFruta(fruta);
        if(existe(fruta)){
            throw new FrutaException("La fruta ya existe");          
        }
        frutaModelo.insertar(fruta);
    }

    /**
     * Metodo encargado de eliminar
     * @param fruta a eliminar
     * @throws FrutaException con mensaje controlado
     */
    public void eliminar(Fruta fruta) throws FrutaException{
        if(!existe(fruta)){
            throw new FrutaException("La fruta a eliminar no existe");          
        }
        frutaModelo.eliminar(fruta);
    }

    /**
     * Metodo encargado para eliminar por identificador
     * @param identificador de la fruta
     * @throws FrutaException con mensaje controlado
     */
    public void eliminar(String identificador) throws FrutaException{
        Fruta fruta;
        fruta = buscar(identificador);
        if(fruta == null){
            throw new FrutaException("La fruta a eliminar no existe");
        }
        frutaModelo.eliminar(fruta);
    }

    /**
     * Metodo encargado de buscar por identificador
     * @param identificador para localizar la fruta
     * @return fruta a traves del identificador
     */
    public Fruta buscar(String identificador){
        Fruta fruta = null;
        fruta = frutaModelo.buscar(identificador);
        return fruta;
    }

    /**
     * Metodo encargado de modificar una fruta
     * @param fruta a modificar
     * @throws FrutaException controlado con el error
     */
    public void modificar(Fruta fruta) throws FrutaException{
        Fruta frutaAlmacenada;
        validarFruta(fruta);
        frutaAlmacenada = buscar(fruta.getIdentificador());
        if(frutaAlmacenada == null){
            throw new FrutaException("La fruta no existe");          
        }
        frutaModelo.modificar(fruta);
    }

    /**
     * Funcion encargada de verificar si existe la fruta
     * @param fruta a encontrar
     * @return boolean
     */
    private boolean existe(Fruta fruta){
        boolean encontrada = false;
        Fruta frutaEcontrada;

        frutaEcontrada = buscar(fruta.getIdentificador());
        if(frutaEcontrada != null){
            encontrada = true;
        }
        
        return encontrada;
    }
}
